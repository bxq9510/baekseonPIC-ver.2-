package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bsy.Service.IF_BrdService;
import com.bsy.Service.IF_ComService;
import com.bsy.VO.BrdVO;
import com.bsy.VO.PageVO;

@Controller
public class AfterController {

	@Inject
	private IF_BrdService brdService = null;
	@Inject
	private IF_ComService comService = null;
	
	@RequestMapping(value = "/after_mainForm", method = RequestMethod.GET)
	public String after_mainForm(Locale locale, Model model) throws Exception{
		return "/after_mainForm";		
	}
	@RequestMapping(value = "/after_picList", method = RequestMethod.GET)
	public String picList(@RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		return "after/after_picList";		
	}
	@RequestMapping(value = "/after_brdList", method = RequestMethod.GET)
	public String brdList(@ModelAttribute PageVO pagevo, Locale locale, Model model) throws Exception{
		if(pagevo.getPage() == null) {
			pagevo.setPage(1);
		}
		pagevo.setPerPageNum(10);
		pagevo.setTotalCount(brdService.brdcnt());
		model.addAttribute("brdlist", brdService.brdList(pagevo));
		model.addAttribute("pagevo", pagevo);
		return "after/after_brdList";		
	}
//	@RequestMapping(value = "/after_free", method = RequestMethod.GET)
//	public String after_free(@ModelAttribute PageVO pagevo, final RedirectAttributes redirectAttribute, Locale locale, Model model) throws Exception{
//		pagevo.setCat("free");
//		redirectAttribute.addFlashAttribute(pagevo);
//		return "redirect:/after_brdList";
//	}
	@RequestMapping(value = "/after_inputPic", method = RequestMethod.GET)
	public String inputPic(Locale locale, Model model) throws Exception{
		return "after/after_inputPic";		
	}
	@RequestMapping(value = "/after_inputBrd", method = RequestMethod.GET)
	public String inputBrd(HttpServletRequest request, Model model, Locale locale) throws Exception{
		HttpSession session = request.getSession();
		Object id = session.getAttribute("usrId");
		Object name = session.getAttribute("usrName");
		model.addAttribute("usrid", id);
		model.addAttribute("usrname", name);
		return "after/after_inputBrd";
	}
	@RequestMapping(value = "/brdSave", method = RequestMethod.POST)
	public String brdSave(BrdVO brdvo, final RedirectAttributes redirectAttribute, Locale locale, Model model) throws Exception{
		brdService.insert(brdvo);
		return "redirect:/after_brdList?cat="+brdvo.getCat();
	}
	@RequestMapping(value = "/after_brdView", method = RequestMethod.GET)
	public String after_brdView(@RequestParam("no") int no, @RequestParam("cat") String cat, Locale locale, Model model) throws Exception{
		brdService.updateView(no);
		model.addAttribute("brd", brdService.selectOne(no));
		model.addAttribute("cat", cat);
		model.addAttribute("comlist", comService.selectAll(no));
		return "after/after_brdView";		
	}
}
