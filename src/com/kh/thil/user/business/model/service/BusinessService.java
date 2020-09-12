package com.kh.thil.user.business.model.service;

import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.thil.user.business.model.dao.BusinessDao;
import com.kh.thil.user.business.model.vo.Business;

public class BusinessService {

	public int bsChange(Business bsChangeInsert) {
		
		
		Connection con = getConnection();
		
		BusinessDao bs = new BusinessDao();
		
		int result = bs.bsChange(con, bsChangeInsert);
		return result;
	}

	public int bsChange2(String uno) {
		Connection con = getConnection();
		
		BusinessDao bs =new BusinessDao();
		
		int result = bs.bsChange2(con, uno);
		
		return result;
	}

	public int bsChange3(String category) {
		Connection con = getConnection();
		
		BusinessDao bs = new BusinessDao();
		
		int result = bs.bsChange3(con, category);
		
		return result;
	}
	

}
