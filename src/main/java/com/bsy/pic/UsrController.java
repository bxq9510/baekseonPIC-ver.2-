package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsy.Service.IF_UsrService;
import com.bsy.VO.PageVO;
import com.bsy.VO.UsrVO;

@Controller
public class UsrController {
	
	@Inject
	private IF_UsrService usrService = null;
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Locale locale, Model model) throws Exception{
		return "login/signUp";		
	}
	@RequestMapping(value = "/signUp_main", method = RequestMethod.POST)
	public String signUp_main(UsrVO usrvo, Locale locale, Model model) throws Exception{	
		model.addAttribute("usrvo", usrvo);
		return "login/signUp";		
	}
	@RequestMapping(value = "/addUsr", method = RequestMethod.POST)
	public String addUsr(UsrVO usrvo, Locale locale, Model model) throws Exception{		
		usrService.insert(usrvo);
		return "login/logIn";		
	}
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public String myPage(@RequestParam("id") String id, Locale locale, Model model) throws Exception{	
		model.addAttribute("usr", usrService.selectOne(id));
		return "usr/myPage";		
	}
	@RequestMapping(value = "/admin_Usr", method = RequestMethod.GET)
	public String admin_Usr(@ModelAttribute PageVO pageusr, Locale locale, Model model) throws Exception{
		if(pageusr.getPage() == null) {
			pageusr.setPage(1);
		}
		pageusr.setPerPageNum(10);
		pageusr.setTotalCount(usrService.usrcnt());
		model.addAttribute("usrlist", usrService.selectAll(pageusr));
		model.addAttribute("pageusr", pageusr);
		return "usr/admin_Usr";
	}
}
