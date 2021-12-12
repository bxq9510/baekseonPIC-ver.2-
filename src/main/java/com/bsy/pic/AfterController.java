package com.bsy.pic;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bsy.Service.IF_BrdService;
import com.bsy.Service.IF_ComService;
import com.bsy.Service.IF_PicService;
import com.bsy.VO.BrdVO;
import com.bsy.VO.PageVO;
import com.bsy.VO.PicVO;
import com.bsy.util.FileDataUtil;

@Controller
public class AfterController {

	@Inject
	private IF_BrdService brdService = null;
	@Inject
	private IF_ComService comService = null;
	@Inject
	private IF_PicService picService = null;
	@Inject
	private FileDataUtil fileDataUtil;
	
	@RequestMapping(value = "/after_mainForm", method = RequestMethod.GET)
	public String after_mainForm(Locale locale, Model model) throws Exception{
		return "/after_mainForm";		
	}
	@RequestMapping(value = "/after_picList", method = RequestMethod.GET)
	public String picList(@ModelAttribute PageVO pagevo, Locale locale, Model model) throws Exception{		
		if(pagevo.getPage() == null) {
			pagevo.setPage(1);
		}
		pagevo.setPerPageNum(9);
		pagevo.setTotalCount(picService.attachcnt());
		model.addAttribute("piclist", picService.selectAllAttach(pagevo.getCat()));                                   
		model.addAttribute("pagevo", pagevo);
		return "after/after_picList";		
	}
	@RequestMapping(value = "/after_inputPic", method = RequestMethod.GET)
	public String inputPic(Locale locale, Model model) throws Exception{
		return "after/after_inputPic";		
	}
	@RequestMapping(value = "/picSave", method = RequestMethod.POST)
	public String picSave(PicVO picvo, MultipartFile file, Locale locale, Model model) throws Exception{
		if(file.getOriginalFilename() == "") {
			System.out.println("첨부파일 없는 경우");
			picService.insert(picvo);
		}else {
			System.out.println("첨부파일이 있는 경우");
			String[] files = fileDataUtil.fileUpload(file);
			picvo.setFiles(files);
			picService.insert(picvo);
		}
		return "redirect:/after_picList?cat="+picvo.getCat();
	}
	@RequestMapping(value = "/after_picView", method = RequestMethod.GET)
	public String after_picView(@RequestParam("no") int no, Locale locale, Model model) throws Exception{
		picService.updateView(no);
		model.addAttribute("pic", picService.selectOne(no));
		model.addAttribute("piclist", picService.selectAttach(no));
		model.addAttribute("comlist", comService.selectAllPic(no));
		return "after/after_picView";		
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
	@RequestMapping(value = "/after_inputBrd", method = RequestMethod.GET)
	public String inputBrd(Model model, Locale locale) throws Exception{
		return "after/after_inputBrd";
	}
	@RequestMapping(value = "/brdSave", method = RequestMethod.POST)
	public String brdSave(BrdVO brdvo, Locale locale, Model model) throws Exception{
		brdService.insert(brdvo);
		return "redirect:/after_brdList?cat="+brdvo.getCat();
	}
	@RequestMapping(value = "/after_brdView", method = RequestMethod.GET)
	public String after_brdView(@RequestParam("no") int no, Locale locale, Model model) throws Exception{
		brdService.updateView(no);
		model.addAttribute("brd", brdService.selectOne(no));
		model.addAttribute("comlist", comService.selectAll(no));
		return "after/after_brdView";		
	}
}
