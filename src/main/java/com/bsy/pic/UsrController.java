package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bsy.Service.IF_UsrService;
import com.bsy.VO.UsrVO;

@Controller
public class UsrController {
	
	@Inject
	private IF_UsrService usrService = null;
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) throws Exception{		
		return "login/signUp";		
	}
	@RequestMapping(value = "/addUsr", method = RequestMethod.POST)
	public String addUsr(UsrVO usrvo, Locale locale, Model model) throws Exception{		
		usrService.insert(usrvo);
		return "login/logIn";		
	}
}
