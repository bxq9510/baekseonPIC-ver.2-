package com.bsy.Service;

import com.bsy.VO.UsrVO;

public interface IF_UsrService {
	public void insert(UsrVO usrvo) throws Exception;
	public UsrVO selectOne(String id) throws Exception;
}
