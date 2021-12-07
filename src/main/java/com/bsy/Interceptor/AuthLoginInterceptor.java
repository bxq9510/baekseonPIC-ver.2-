package com.bsy.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();	// 세션id가져오기
		Object obj = session.getAttribute("usrId");  // 세션에서  userid를 가져옴.
		// 관리자와 일반사용자를 구분할 수  있다. 
		if(obj == null) {  // 로그인 안 한사람.. 클라이언트의 세션id로 세션값을 가져 올 때 아무것도 없는 경우
			//로그인이 안되어 있기 때문에 로그인으로 컨트롤러를 돌려 버린다.
			response.sendRedirect(request.getContextPath()+"/logIn");
			return false;  // 원래 호출한 컨트롤러 인터셉트 하여 다른 컨트롤러로 호출, 그러니 원래 호출한 컨틀롤러 요청하지 마라.
		}
		return true ;// 로그인한 사람이므로 원래의 컨트롤러로 진행해라.
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
