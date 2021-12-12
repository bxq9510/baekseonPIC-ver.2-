package com.bsy.Service;

import java.util.List;

import com.bsy.VO.AttachVO;
import com.bsy.VO.PageVO;
import com.bsy.VO.PicVO;

public interface IF_PicService {
	public void insert(PicVO picvo) throws Exception;
	public int piccnt() throws Exception;
	public List<PicVO> picList(PageVO pagevo) throws Exception;
	public PicVO selectOne(int no) throws Exception;
	public void updateView(int no) throws Exception;
	public List<AttachVO> selectAllAttach(String cat) throws Exception;
	public List<String> selectAttach(int no) throws Exception;
	public int attachcnt() throws Exception;
}
