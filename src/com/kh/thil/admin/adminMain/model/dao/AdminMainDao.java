package com.kh.thil.admin.adminMain.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.admin.adminMain.model.vo.AdminMain;

public class AdminMainDao {
	private Properties prop = new Properties();

	public AdminMainDao() {
		String fileName = AdminMainDao.class.getResource("/sql/admin/admin-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int tableReqListCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;
		
		String query = prop.getProperty("tableReqListCount");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return listCount;
	}

	public ArrayList<AdminMain> tableReqListMain(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminMain> listReq = null;
		
		String query = prop.getProperty("tableReqListMain");
		
		try {
			pstmt = con.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			listReq = new ArrayList<AdminMain>();
			
			while(rset.next()) {
				AdminMain am = new AdminMain();
				am.setRno(rset.getString("RNO"));
				am.setProName(rset.getString("PRO_NAME"));
				am.setReqBuildEnd(rset.getString("REQ_BUILDDATE"));
				am.setPaySend(rset.getString("PAY_SEND"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return listReq;
	}

}
