package com.bsy.Service;

import java.util.List;

import com.bsy.VO.PageVO;
import com.bsy.VO.UsrVO;

public interface IF_UsrService {
	public void insert(UsrVO usrvo) throws Exception;
	public UsrVO selectOne(String id) throws Exception;
	public int usrcnt() throws Exception;
	public List<UsrVO> selectAll(PageVO pagevo) throws Exception;
}
