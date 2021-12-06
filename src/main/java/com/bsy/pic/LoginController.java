package com.bsy.pic;

import java.io.PrintWriter;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bsy.Service.IF_UsrService;
import com.bsy.VO.UsrVO;

@Controller
public class LoginController {
	@Inject
	private IF_UsrService usrService = null;
	
	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String logIn(Locale locale, Model model) throws Exception{
		return "login/logIn";		
	}
	@RequestMapping(value = "/logOut", method = RequestMethod.GET)
	public String logOut(HttpServletRequest request, Locale locale, Model model) throws Exception{
		HttpSession session = request.getSession();
		session.invalidate(); // 모든 세션값을 지운다.		
		return "redirect:/";		
	}
//	@RequestMapping(value = "/afterLogin", method = RequestMethod.GET)
//	public String afterLogin(Locale locale, Model model) throws Exception{
//		return "/login_mainForm";		
//	}
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(UsrVO usrvo, HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) throws Exception{
		String tagetUrl = "";
		UsrVO tempUsrvo = usrService.selectOne(usrvo.getId());
		if(tempUsrvo == null) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('Incorrect your ID');</script>");
			out.flush();
			tagetUrl= "login/logIn";
		}else {
			if(tempUsrvo.getPw().equals(usrvo.getPw())) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('Wellcome!');</script>");
				out.flush();
				HttpSession session = request.getSession();
				session.setAttribute("usrName", tempUsrvo.getName());
				session.setAttribute("usrId", tempUsrvo.getId());
				session.setAttribute("usrDay", tempUsrvo.getDay());
				tagetUrl= "/login_mainForm";
			}else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('Incorrect password');</script>");
				out.flush();
				tagetUrl= "login/logIn";
			}
		}
		return tagetUrl;
	}
}
