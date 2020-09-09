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
}
