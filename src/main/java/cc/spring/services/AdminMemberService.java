package cc.spring.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.spring.dto.MemberDTO;
import cc.spring.repositories.AdminMemberDAO;
import cc.spring.repositories.BusinessMemberDAO;
import cc.spring.repositories.ClientMemberDAO;

@Service
public class AdminMemberService {
	@Autowired
	private AdminMemberDAO aDAO;
	
	@Autowired
	private BusinessMemberDAO bDAO;
	
	@Autowired
	private ClientMemberDAO cDAO;
	
	public boolean login(String id, String pw) {
		return aDAO.login(id, pw);
	}
	
	public MemberDTO selectAdminMemberInfo(String id, String pw) {
		return aDAO.selectAdminMemberInfo(id, pw);
	}
	
	public List<MemberDTO> selectAllBusinessMember() {
		return bDAO.selectAllBusinessMember();
	}
	
	public List<MemberDTO> selectAllClientMember() {
		return cDAO.selectAllClientMember();
	}
	
	public Map<String, Integer> selectMealCount() {
		Map<String, Integer> mealCountMap = new HashMap<String, Integer>();
		mealCountMap.put("mealSuccessTotal", aDAO.selectFailMeal());
		mealCountMap.put("mealFailTotal", aDAO.selectSuccessMeal());
		return mealCountMap;
	}	
	
	public int selectSuccessBasket() {
		return aDAO.selectSuccessBasket();
	}
	
	public int selectFailBasket() {
		return aDAO.selectFailBasket();
	}
}
