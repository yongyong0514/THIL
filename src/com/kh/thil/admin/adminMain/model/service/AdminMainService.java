package com.kh.thil.admin.adminMain.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.admin.adminMain.model.dao.AdminMainDao;
import com.kh.thil.admin.adminMain.model.vo.AdminMain;

public class AdminMainService {

	public int tableReqListCount() {
		Connection con = getConnection();
		
		int listCount = new AdminMainDao().tableReqListCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<AdminMain> tableReqListMain() {
		Connection con = getConnection();
		
		ArrayList<AdminMain> listReq = new AdminMainDao().tableReqListMain(con);
		
		close(con);
		
		return listReq;
	}

}
