package com.bsy.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsy.VO.ComVO;
@Repository
public class IF_ComDAOImpl implements IF_ComDAO {
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery ="com.bsy.DAO.IF_ComDAO";
	
	@Override
	public void insert(ComVO comvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", comvo);
	}
	@Override
	public List<ComVO> selectAll(int no) throws Exception {
		return sqlSession.selectList(mapperquery+".selectall", no);
	}
	@Override
	public void insertPic(ComVO comvo) throws Exception {
		sqlSession.insert(mapperquery+".insertpic", comvo);
	}
	@Override
	public List<ComVO> selectAllPic(int no) throws Exception {
		return sqlSession.selectList(mapperquery+".selectallpic", no);
	}

}
