package com.kh.thil.user.myPage.myRequest.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.user.myPage.myRequest.model.vo.UserPayment;

public class UserReqPaymentDao {
	Properties prop = new Properties();
	
	public UserReqPaymentDao() {
		String fileName = UserReqPaymentDao.class.getResource("/sql/user/myPage/myRequest/myRequest-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public ArrayList<UserPayment> reqPayInfo(Connection con, String rnoOne) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<UserPayment> payInfo = null;
		
		String query = prop.getProperty("reqPayInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, rnoOne);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	}

}
