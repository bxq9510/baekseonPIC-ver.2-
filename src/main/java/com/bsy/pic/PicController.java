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
public class PicController {
	@Inject
	private IF_BrdService brdService = null;
	@Inject
	private IF_ComService comService = null;
	@Inject
	private IF_PicService picService = null;
	@Inject
	private FileDataUtil fileDataUtil;
	
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
	public String picList(@ModelAttribute PageVO pagevo, Locale locale, Model model) throws Exception{		
		if(pagevo.getPage() == null) {
			pagevo.setPage(1);
		}
		pagevo.setPerPageNum(9);
		pagevo.setTotalCount(picService.attachcnt());
		model.addAttribute("piclist", picService.selectAllAttach(pagevo.getCat()));                                   
		model.addAttribute("pagevo", pagevo);
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
	public String brdView(@RequestParam("no") int no, Locale locale, Model model) throws Exception{
		brdService.updateView(no);
		model.addAttribute("brd", brdService.selectOne(no));
		model.addAttribute("comlist", comService.selectAll(no));
		return "brd/brdView";	
	}
	@RequestMapping(value = "/picView", method = RequestMethod.GET)
	public String picView(@RequestParam("no") int no, Locale locale, Model model) throws Exception{
		picService.updateView(no);
		model.addAttribute("pic", picService.selectOne(no));
		model.addAttribute("piclist", picService.selectAttach(no));
		model.addAttribute("comlist", comService.selectAllPic(no));
		return "pic/picView";
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
		return "redirect:/picList?cat="+picvo.getCat();
	}
	@RequestMapping(value = "/after_inputBrd", method = RequestMethod.GET)
	public String inputBrd(Model model, Locale locale) throws Exception{
		return "after/after_inputBrd";
	}
	@RequestMapping(value = "/brdSave", method = RequestMethod.POST)
	public String brdSave(BrdVO brdvo, Locale locale, Model model) throws Exception{
		brdService.insert(brdvo);
		return "redirect:/brdList?cat="+brdvo.getCat();
	}
	@RequestMapping(value = "/admin_Boa", method = RequestMethod.GET)
	public String admin_Board(Locale locale, Model model) throws Exception{
		PageVO pagepic = new PageVO();
		if(pagepic.getPage() == null) {
			pagepic.setPage(1);
		}
		pagepic.setPerPageNum(5);
		pagepic.setTotalCount(picService.piccnt());
		model.addAttribute("piclist", picService.selectAllPic(pagepic));
		model.addAttribute("pagepic", pagepic);
		model.addAttribute("attachlist", picService.selectAdminAttach(pagepic));
		
		PageVO pagebrd = new PageVO();
		if(pagebrd.getPage() == null) {
			pagebrd.setPage(1);
		}
		pagebrd.setPerPageNum(5);
		pagebrd.setTotalCount(brdService.brdcnt());
		model.addAttribute("brdlist", brdService.selectAllBrd(pagebrd));
		model.addAttribute("pagebrd", pagebrd);
		return "usr/admin_Pic";
	}
	@RequestMapping(value = "/admin_Board", method = RequestMethod.GET)
	public String admin_pic(@ModelAttribute PageVO pagepic, Locale locale, Model model) throws Exception{
		if(pagepic.getPage() == null) {
			pagepic.setPage(1);
		}
		pagepic.setPerPageNum(5);
		pagepic.setTotalCount(picService.piccnt());
		model.addAttribute("piclist", picService.selectAllPic(pagepic));
		model.addAttribute("pagepic", pagepic);
		model.addAttribute("attachlist", picService.selectAdminAttach(pagepic));

		PageVO pagebrd = new PageVO();
		if(pagebrd.getPage() == null) {
			pagebrd.setPage(1);
		}
		pagebrd.setPerPageNum(5);
		pagebrd.setTotalCount(brdService.brdcnt());
		model.addAttribute("brdlist", brdService.selectAllBrd(pagebrd));
		model.addAttribute("pagebrd", pagebrd);
		return "brd/admin_Pic";
	}
	@RequestMapping(value = "/admin_brd", method = RequestMethod.GET)
	public String admin_brd(@ModelAttribute PageVO pagebrd, Locale locale, Model model) throws Exception{
		PageVO pagepic = new PageVO();
		if(pagepic.getPage() == null) {
			pagepic.setPage(1);
		}
		pagepic.setPerPageNum(5);
		pagepic.setTotalCount(picService.piccnt());
		model.addAttribute("piclist", picService.selectAllPic(pagepic));
		model.addAttribute("pagepic", pagepic);
		model.addAttribute("attachlist", picService.selectAdminAttach(pagepic));
		
		if(pagebrd.getPage() == null) {
			pagebrd.setPage(1);
		}
		pagebrd.setPerPageNum(5);
		pagebrd.setTotalCount(brdService.brdcnt());
		model.addAttribute("brdlist", brdService.selectAllBrd(pagebrd));
		model.addAttribute("pagebrd", pagebrd);
		return "brd/admin_Pic";
	}
}