package com.bsy.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bsy.DAO.IF_ComDAO;
import com.bsy.VO.ComVO;

@Service
public class IF_ComServiceImpl implements IF_ComService {
	@Inject
	private IF_ComDAO comdao;

	@Override
	public void insert(ComVO comvo) throws Exception {
		comdao.insert(comvo);
	}
	@Override
	public List<ComVO> selectAll(int no) throws Exception {
		return comdao.selectAll(no);
	}
	@Override
	public void insertPic(ComVO comvo) throws Exception {
		comdao.insertPic(comvo);
	}
	@Override
	public List<ComVO> selectAllPic(int no) throws Exception {
		return comdao.selectAllPic(no);
	}
}
