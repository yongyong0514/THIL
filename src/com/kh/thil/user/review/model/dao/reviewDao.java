package com.kh.thil.user.review.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.kh.thil.common.JDBCTemplate.*;

import com.kh.thil.user.review.model.vo.ReviewInfo;

public class reviewDao {

	private Properties prop = new Properties();
	
	public reviewDao() {
		String fileName = reviewDao.class.getResource("/sql/user/review/review-query.properties").getPath();
	
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public ReviewInfo reviewMember(Connection con, String rno) {
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		ReviewInfo reviewMember = null;
		
		String query = prop.getProperty("reviewInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rno);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				reviewMember = new ReviewInfo();
				reviewMember.setRno(rset.getString("RNO"));
				reviewMember.setBno(rset.getString("BNO"));
				reviewMember.setUno(rset.getString("UNO"));
				reviewMember.setUserNick(rset.getString("USER_NICK"));
				reviewMember.setBsTitle(rset.getString("BS_TITLE"));
				reviewMember.setCatName(rset.getString("CAT_NAME"));
				reviewMember.setReqAdd(rset.getString("REQ_ADD"));
				reviewMember.setPayPrice(rset.getString("PAY_PRICE"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
				
				
		return reviewMember;
	}

}
