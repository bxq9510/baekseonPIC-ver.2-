package com.bsy.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsy.VO.PageVO;
import com.bsy.VO.UsrVO;
@Repository
public class IF_UsrDAOImpl implements IF_UsrDAO{
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery ="com.bsy.DAO.IF_UsrDAO";
	@Override
	public void insertUsr(UsrVO usrvo) throws Exception {
		sqlSession.insert(mapperquery + ".insert", usrvo);
	}
	@Override
	public UsrVO selectOne(String id) throws Exception {
		return sqlSession.selectOne(mapperquery + ".selectOne", id);
	}
	@Override
	public int usrcnt() throws Exception {
		return sqlSession.selectOne(mapperquery + ".usrcnt");
	}
	@Override
	public List<UsrVO> selectAll(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery + ".selectall", pagevo);
	}
}
