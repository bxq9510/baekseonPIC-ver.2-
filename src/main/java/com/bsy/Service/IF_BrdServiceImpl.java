package com.bsy.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bsy.DAO.IF_BrdDAO;
import com.bsy.VO.BrdVO;
import com.bsy.VO.PageVO;

@Service
public class IF_BrdServiceImpl implements IF_BrdService {
	@Inject
	private IF_BrdDAO brddao;
	@Override
	public void insert(BrdVO brdvo) throws Exception {
		brddao.insert(brdvo);
	}
	@Override
	public int brdcnt() throws Exception {
		return brddao.brdcnt();
	}
	@Override
	public List<BrdVO> brdList(PageVO pagevo) throws Exception {
		return brddao.selectAll(pagevo);
	}
	@Override
	public BrdVO selectOne(int no) throws Exception {
		return brddao.selectOne(no);
	}
	@Override
	public void updateView(int no) throws Exception {
		brddao.updateView(no);
	}

}
