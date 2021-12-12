package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsy.Service.IF_BrdService;
import com.bsy.Service.IF_ComService;
import com.bsy.VO.PageVO;

@Controller
public class BforeController {
	@Inject
	private IF_BrdService brdService = null;
	@Inject
	private IF_ComService comService = null;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainForm(Locale locale, Model model) throws Exception{
		return "/main";		
	}
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainSin(Locale locale, Model model) throws Exception{
		return "/main";		
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
	@RequestMapping(value = "/brdList", method = RequestMethod.GET)
	public String brdList(@ModelAttribute PageVO pagevo, Locale locale, Model model) throws Exception {
		if(pagevo.getPage() == null) {
			pagevo.setPage(1);
		}
		pagevo.setPerPageNum(10);
		pagevo.setTotalCount(brdService.brdcnt());
		model.addAttribute("brdlist", brdService.brdList(pagevo));
		model.addAttribute("pagevo", pagevo);
		return "brd/brdList";		
	}
	@RequestMapping(value = "/brdView", method = RequestMethod.GET)
	public String brdView(@RequestParam("no") int no, @RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		brdService.updateView(no);
		model.addAttribute("brd", brdService.selectOne(no));
		model.addAttribute("cat", cat);
		model.addAttribute("comlist", comService.selectAll(no));
		return "brd/brdView";	
	}
}