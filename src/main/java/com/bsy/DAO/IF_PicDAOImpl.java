package com.bsy.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsy.VO.AttachVO;
import com.bsy.VO.PageVO;
import com.bsy.VO.PicVO;

@Repository
public class IF_PicDAOImpl implements IF_PicDAO {
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery ="com.bsy.DAO.IF_PicDAO";
	@Override
	public void insert(PicVO picvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", picvo);
	}

	@Override
	public int piccnt() throws Exception {
		return sqlSession.selectOne(mapperquery+".piccnt");
	}

	@Override
	public List<PicVO> selectAll(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery+".selectall", pagevo);
	}

	@Override
	public PicVO selectOne(int no) throws Exception {
		return sqlSession.selectOne(mapperquery+".selectone", no);
	}

	@Override
	public void updateView(int no) throws Exception {
		sqlSession.update(mapperquery+".updateView", no);
	}

	@Override
	public int getSeq() throws Exception {
		return sqlSession.selectOne(mapperquery+".getseq");
	}
	
	@Override
	public void insertattach(AttachVO attachvo) throws Exception {
		sqlSession.insert(mapperquery + ".insertattach", attachvo);
	}

	@Override
	public List<String> selectAttach(int no) throws Exception {
		return sqlSession.selectList(mapperquery + ".selectattach", no);
	}

	@Override
	public List<AttachVO> selectAllAttach(String cat) throws Exception {
		return sqlSession.selectList(mapperquery + ".selectallattach", cat);
	}

	@Override
	public int attachcnt() throws Exception {
		return sqlSession.selectOne(mapperquery+".attachcnt");
	}
	@Override
	public List<PicVO> selectAllPic(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery+".selectallpic", pagevo);
	}

	@Override
	public List<AttachVO> selectAdminAttach(PageVO pagevo) throws Exception {
		return sqlSession.selectList(mapperquery + ".selectadminattach", pagevo);
	}

}
