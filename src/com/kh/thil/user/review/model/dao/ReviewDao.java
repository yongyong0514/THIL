package com.kh.thil.user.review.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import static com.kh.thil.common.JDBCTemplate.*;

import com.kh.thil.user.review.model.vo.Files;
import com.kh.thil.user.review.model.vo.Review;
import com.kh.thil.user.review.model.vo.ReviewInfo;

public class ReviewDao {

	private Properties prop = new Properties();
	
	public ReviewDao() {
		String fileName = ReviewDao.class.getResource("/sql/user/review/review-query.properties").getPath();
	
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
	
	public int insertReviewContent(Connection con, Review review) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertReview");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, review.getRno());
			pstmt.setString(2, review.getRevNote());
			pstmt.setInt(3, review.getRevPoint());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	public String selectCurrval(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		
		String revno = null;
		
		String query = prop.getProperty("selectCurrval");
		
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				//시퀀스의 현재값을 가지고 온다.
				revno = rset.getString("CURRVAL");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		
		return revno;
	}

	public int insertReview(Connection con, Files fi) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertFile");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, fi.getFiletype());
			pstmt.setString(2, fi.getOriginName());
			pstmt.setString(3, fi.getChangeName());
			pstmt.setString(4, fi.getFileRoute());
			pstmt.setString(5, fi.getFileLevel());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	public ArrayList<HashMap<String, Object>> mainReviewList() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getListcount(Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

}
