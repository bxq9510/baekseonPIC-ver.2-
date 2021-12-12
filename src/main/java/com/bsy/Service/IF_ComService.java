package com.bsy.Service;

import java.util.List;

import com.bsy.VO.ComVO;

public interface IF_ComService {
	public void insert(ComVO comvo) throws Exception;
	public List<ComVO> selectAll(int no) throws Exception;
	public void insertPic(ComVO comvo) throws Exception;
	public List<ComVO> selectAllPic(int no) throws Exception;
}
