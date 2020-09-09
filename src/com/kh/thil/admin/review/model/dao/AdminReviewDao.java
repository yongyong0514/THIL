package com.kh.thil.admin.review.model.dao;

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

import com.kh.thil.admin.review.model.vo.AdminReview;
import com.kh.thil.common.PageInfo;

public class AdminReviewDao {
	private Properties prop = new Properties();

	public AdminReviewDao() {
		String fileName = AdminReviewDao.class.getResource("/sql/admin/admin-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getListReviewCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;
		
		String query = prop.getProperty("listReviewCount");
		
		try {
			stmt = con.createStatement();
			
			
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

	public ArrayList<AdminReview> selectListReviewWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminReview> list = null;
		
		String query = prop.getProperty("selectListReviewWithPaging");
		
		try {
			pstmt = con.prepareStatement(query);
			
			int startRow = (pi.getCurrentPage() -1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() -1;
			
			pstmt.setInt(1,  startRow);
			pstmt.setInt(2,  endRow);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<AdminReview>();
			
			while(rset.next()) {
				AdminReview ar = new AdminReview();
				ar.setRevNo(rset.getString("REVNO"));
				ar.setRno(rset.getString("RNO"));
				ar.setUserId(rset.getString("USER_ID"));
				ar.setUserNick(rset.getString("USER_NICK"));
				ar.setBsTitle(rset.getString("BS_TITLE"));
				ar.setReqAdd(rset.getString("REQ_ADD"));
				ar.setCatName(rset.getString("CAT_NAME"));
				ar.setPayPrice(rset.getInt("PAY_PRICE"));
				ar.setRevPoint(rset.getInt("REV_POINT"));
				ar.setRevNote(rset.getString("REV_NOTE"));
				ar.setFileRoute(rset.getString("FILE_ROUTE"));
				ar.setRevDate(rset.getDate("REV_DATE"));
				
				list.add(ar);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

}

