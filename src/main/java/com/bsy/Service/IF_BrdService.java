package com.bsy.Service;

import java.util.List;

import com.bsy.VO.BrdVO;
import com.bsy.VO.PageVO;

public interface IF_BrdService {
	public void insert(BrdVO brdvo) throws Exception;
	public int brdcnt() throws Exception;
	public List<BrdVO> brdList(PageVO pagevo) throws Exception;
	public BrdVO selectOne(int no) throws Exception;
	public void updateView(int no) throws Exception;
}
