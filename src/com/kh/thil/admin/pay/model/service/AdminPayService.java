package com.kh.thil.admin.pay.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.admin.pay.model.dao.AdminPayDao;
import com.kh.thil.admin.pay.model.vo.AdminPay;
import com.kh.thil.common.PageInfo;

public class AdminPayService {
	public int getListPayCount() {
		Connection con = getConnection();
		
		int listCount = new AdminPayDao().getListPayCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<AdminPay> selectListPayWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<AdminPay> list = new AdminPayDao().selectListPayWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

	public int updatePaySend(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().updatePaySend(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int updatePayCancelPayT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().updatePayCancelPayT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int insertPayCancelPayT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().insertPayCancelPayT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int insertPayCancelProT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().insertPayCancelProT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int updatePayCancelRT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().updatePayCancelRT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int insertReqCancelProT(String rnoOne) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().insertReqCancelProT(con, rnoOne);
		
		close(con);
		
		return result;
	}

	public int updateReqCancelRT(String rnoOne, String reqNote) {
		Connection con = getConnection();
		
		int result = new AdminPayDao().updateReqCancelRT(con, rnoOne, reqNote);
		
		close(con);
		
		return result;
	}

}
