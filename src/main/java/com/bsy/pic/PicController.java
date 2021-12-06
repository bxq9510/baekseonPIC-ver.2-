package com.bsy.pic;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PicController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainForm(Locale locale, Model model) throws Exception{
		return "/mainForm";		
	}
	// 메인화면 이동
	@RequestMapping(value = "/mainForm", method = RequestMethod.GET)
	public String main(Locale locale, Model model) throws Exception{
		return "/mainForm";		
	}
	@RequestMapping(value = "/picList", method = RequestMethod.GET)
	public String picList(@RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		return "pic/picList";		
	}
	@RequestMapping(value = "/picInput", method = RequestMethod.GET)
	public String picInput(Locale locale, Model model) throws Exception{
		return "pic/picInput";		
	}
	@RequestMapping(value = "/brdList", method = RequestMethod.GET)
	public String brdList(@RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		return "brd/brdList";		
	}
}
