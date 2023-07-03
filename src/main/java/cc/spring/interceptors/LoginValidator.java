package cc.spring.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginValidator implements HandlerInterceptor{
	
	@Autowired
	private HttpSession session;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		Integer code = (Integer)session.getAttribute("code");
		if(code!=null) {
			return true;
		}else {
			response.sendRedirect("/clientMember/login_form");
			return false;
		}
		
	}

}
