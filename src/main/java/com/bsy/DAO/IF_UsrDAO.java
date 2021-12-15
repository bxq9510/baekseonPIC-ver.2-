package com.bsy.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bsy.VO.PageVO;
import com.bsy.VO.UsrVO;
@Repository
public interface IF_UsrDAO {
	public void insertUsr(UsrVO usrvo) throws Exception;
	public UsrVO selectOne(String id) throws Exception;
	public int usrcnt() throws Exception;
	public List<UsrVO> selectAll(PageVO pagevo) throws Exception;
}
