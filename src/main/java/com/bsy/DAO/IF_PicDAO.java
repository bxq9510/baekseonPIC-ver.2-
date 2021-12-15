package com.bsy.DAO;

import java.util.List;

import com.bsy.VO.AttachVO;
import com.bsy.VO.PageVO;
import com.bsy.VO.PicVO;

public interface IF_PicDAO {
	public void insert(PicVO picvo) throws Exception;
	public int piccnt() throws Exception;
	public List<PicVO> selectAll(PageVO pagevo) throws Exception;
	public PicVO selectOne(int no) throws Exception;
	public void updateView(int no) throws Exception;
	public int getSeq() throws Exception;
	public void insertattach(AttachVO attachvo) throws Exception;
	public List<String> selectAttach(int no) throws Exception;
	public List<AttachVO> selectAllAttach(String cat) throws Exception;
	public int attachcnt() throws Exception;
	public List<PicVO> selectAllPic(PageVO pagevo) throws Exception;
	public List<AttachVO> selectAdminAttach(PageVO pagevo) throws Exception;
}
