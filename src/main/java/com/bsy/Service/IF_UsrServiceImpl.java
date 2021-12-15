package com.bsy.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bsy.DAO.IF_UsrDAO;
import com.bsy.VO.PageVO;
import com.bsy.VO.UsrVO;

@Service
public class IF_UsrServiceImpl implements IF_UsrService {
	@Inject
	private IF_UsrDAO usrdao = null;
	@Override
	public void insert(UsrVO usrvo) throws Exception {
		usrdao.insertUsr(usrvo);
	}
	@Override
	public UsrVO selectOne(String id) throws Exception {
		return usrdao.selectOne(id);
	}
	@Override
	public int usrcnt() throws Exception {
		return usrdao.usrcnt();
	}
	@Override
	public List<UsrVO> selectAll(PageVO pagevo) throws Exception {
		return usrdao.selectAll(pagevo);
	}

}
