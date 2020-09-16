package com.kh.thil.user.myPage.myRequest.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.user.myPage.myRequest.model.dao.UserReqPaymentDao;
import com.kh.thil.user.myPage.myRequest.model.vo.UserPayment;

public class UserReqPaymentService {

	public ArrayList<UserPayment> reqPayInfo(String rnoOne) {
		Connection con = getConnection();
		ArrayList<UserPayment> payInfo = new UserReqPaymentDao().reqPayInfo(con, rnoOne);
		
		close(con);
		
		return payInfo;
	}

}
