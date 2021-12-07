package com.bsy.pic;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AfterController {
	// 메인화면 이동
	@RequestMapping(value = "/after_mainForm", method = RequestMethod.GET)
	public String after_mainForm(Locale locale, Model model) throws Exception{
		
		return "/after_mainForm";		
	}
	@RequestMapping(value = "/after_picList", method = RequestMethod.GET)
	public String picList(@RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		return "after/after_picList";		
	}
	@RequestMapping(value = "/inputPic", method = RequestMethod.GET)
	public String inputPic(Locale locale, Model model) throws Exception{
		return "input/inputPic";		
	}
	@RequestMapping(value = "/inputBrd", method = RequestMethod.GET)
	public String inputBrd(Locale locale, Model model) throws Exception{
		return "input/inputBrd";		
	}
	@RequestMapping(value = "/after_brdList", method = RequestMethod.GET)
	public String brdList(@RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		return "after/after_brdList";		
	}
}
