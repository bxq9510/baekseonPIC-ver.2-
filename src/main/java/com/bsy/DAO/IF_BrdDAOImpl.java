package com.bsy.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsy.VO.BrdVO;
import com.bsy.VO.PageVO;

@Repository
public class IF_BrdDAOImpl implements IF_BrdDAO {
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery ="com.bsy.DAO.IF_BrdDAO";
	@Override
	public void insert(BrdVO brdvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", brdvo);
	}
	@Override
	public int brdcnt() throws Exception {
		return sqlSession.selectOne(mapperquery+".brdcnt");
	}
	@Override
	public List<BrdVO> selectAll(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery+".selectall", pagevo);
	}
	@Override
	public BrdVO selectOne(int no) throws Exception {
		return sqlSession.selectOne(mapperquery+".selectone", no);
	}
	@Override
	public void updateView(int no) throws Exception {
		sqlSession.update(mapperquery+".updateView", no);
	}
	@Override
	public List<BrdVO> selectAllBrd(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery+".selectallbrd", pagevo);
	}

}
