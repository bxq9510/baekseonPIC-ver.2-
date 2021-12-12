package com.bsy.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bsy.DAO.IF_PicDAO;
import com.bsy.VO.AttachVO;
import com.bsy.VO.PageVO;
import com.bsy.VO.PicVO;

@Service
public class IF_PicServiceImpl implements IF_PicService {
	@Inject
	private IF_PicDAO picdao;
	@Override
	public void insert(PicVO picvo) throws Exception {
		int nowNO = picdao.getSeq();
		picvo.setNo(nowNO);
		AttachVO attachvo = new AttachVO();
		attachvo.setPic_no(nowNO);
		attachvo.setCat(picvo.getCat());
		picdao.insert(picvo);
		String[] files = picvo.getFiles();
		if(files == null) {return;}
		for(String fileName : files) {
			attachvo.setFilename(fileName);
			picdao.insertattach(attachvo);
		}
	}

	@Override
	public int piccnt() throws Exception {
		return picdao.piccnt();
	}

	@Override
	public List<PicVO> picList(PageVO pagevo) throws Exception {
		return picdao.selectAll(pagevo);
	}

	@Override
	public PicVO selectOne(int no) throws Exception {
		return picdao.selectOne(no);
	}

	@Override
	public void updateView(int no) throws Exception {
		picdao.updateView(no);
	}

	@Override
	public List<AttachVO> selectAllAttach(String cat) throws Exception {
		return picdao.selectAllAttach(cat);
	}

	@Override
	public int attachcnt() throws Exception {
		return picdao.attachcnt();
	}

	@Override
	public List<String> selectAttach(int no) throws Exception {
		return picdao.selectAttach(no);
	}

}
