package com.bsy.DAO;

import org.springframework.stereotype.Repository;

import com.bsy.VO.UsrVO;
@Repository
public interface IF_UsrDAO {
	public void insertUsr(UsrVO usrvo) throws Exception;
	public UsrVO selectOne(String id) throws Exception;
}
