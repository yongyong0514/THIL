package com.kh.thil.user.myPage.myBsRequest.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.thil.user.myPage.myBsRequest.model.dao.UserBsReqCancelDao;

public class UserBsReqCancelService {

	public int insertReqCancelProT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new UserBsReqCancelDao().insertReqCancelProT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int updateReqCancelRT(String rnoOne, String reqNote) {
		Connection con = getConnection();
		
		int result = new UserBsReqCancelDao().updateReqCancelRT(con, rnoOne, reqNote);
		
		close(con);
		
		return result;
	}


}
