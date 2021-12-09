package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsy.Service.IF_ComService;
import com.bsy.VO.ComVO;

@Controller
public class ComController {
	@Inject
	private IF_ComService comService = null;
	@RequestMapping(value = "/after_comSave", method = RequestMethod.POST)
	public String after_comSave(ComVO comvo, @RequestParam("no") int no, @RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		comService.insert(comvo);
		return "redirect:/after_brdView?no="+no+"&cat="+cat;
	}
}
