package cc.spring.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import cc.spring.dto.ChatDTO;
import cc.spring.dto.MealDTO;
import cc.spring.provider.ChatGPTProvider;

@Service
public class MealService {
	
	@Autowired
	private ChatGPTProvider GPTprovider;
	
	@Autowired
	private Gson gson;

	@Value("#{${SPECIAL-VALUES}}")
	private Map<Integer, String> specialValues;
	
	// content 까지는 provider에서 가공해서 가져오고 그뒤는 service에서 각자 가공하기
	// 식단 추출 기능
	public List<MealDTO> makeMeal(int dayTime, int special ,String timeStr, int timeArrLength) throws Exception {
		
		String sendMsg = dayTime + "일치" + specialValues.get(special) + " 식단" + timeStr + "만 JSON데이터로 짜줘";
		JsonObject content = GPTprovider.makeMeal(sendMsg);
		System.out.println(sendMsg);
		
		List<MealDTO> result = new ArrayList<>();
		
		// Calendar 데이터를 년,월,일 만 추출
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String mealDate; 
		
		for(int i = 0; i < dayTime; i++) {
			mealDate = format.format(cal.getTime());
			System.out.println(dayTime);

			JsonObject day = content.get("day"+(i+1)).getAsJsonObject();
//			System.out.println("day"+(i+1));
			
			ChatDTO dto = gson.fromJson(day.toString(), ChatDTO.class);
			int breakfastCount = dto.getBreakfast().length;
			int lunchCount = dto.getLunch().length;
			int dinnerCount = dto.getDinner().length;
			
			System.out.println("timeArrLength--> "+timeArrLength);
			for(int x = 0; x < timeArrLength; x++) {
				if(dto.getClass().getDeclaredFields()[x].getName().equals("breakfast") && dto.getBreakfast() != null) {
					for(int j = 0; j < dto.getBreakfast().length; j++) {
						result.add(new MealDTO(0, 0, mealDate, 1001, dto.getBreakfast()[j], breakfastCount));
					}
				}else if(dto.getClass().getDeclaredFields()[x].getName().equals("lunch") && dto.getLunch() != null) {
					for(int j = 0; j < dto.getLunch().length; j++) {
						result.add(new MealDTO(0, 0, mealDate, 1002, dto.getLunch()[j], lunchCount));
					}
				}else if(dto.getClass().getDeclaredFields()[x].getName().equals("dinner") && dto.getDinner() != null) {
					for(int j = 0; j < dto.getDinner().length; j++) {
						result.add(new MealDTO(0, 0, mealDate, 1003, dto.getDinner()[j], dinnerCount));
					}
				}
			}
			cal.add(Calendar.DATE, 1);	
		}
		
		
		return result;

	}

}
