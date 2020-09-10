package com.kh.thil.user.login.model.dao;



import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.thil.user.login.model.vo.Login;




public class LoginDao {
	private Properties prop = new Properties();
	
	public LoginDao() {
		String fileName = LoginDao.class.getResource("/sql/user/login/login-query.properties").getPath();
	
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}


	public Login loginCheck(Connection con, Login requestMember) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Login loginUser = null;
		
		String query = prop.getProperty("loginCheck");
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, requestMember.getUserId());
			pstmt.setString(2, requestMember.getUserPwd());
			
			rset = pstmt.executeQuery();
		
			if(rset.next()){
				loginUser = new Login();
				
				loginUser.setUno(rset.getString("UNO"));
				loginUser.setUserId(rset.getString("USER_ID"));
				loginUser.setUserPwd(rset.getString("USER_PWD"));
				loginUser.setUserNick(rset.getString("USER_NICK"));
				loginUser.setUserName(rset.getString("USER_NAME"));
				loginUser.setUserPhone(rset.getString("USER_PHONE"));
				loginUser.setUserBank(rset.getString("USER_BANK"));
				loginUser.setUserAct(rset.getString("USER_ACT"));
				loginUser.setUserDate(rset.getDate("USER_DATE"));
				loginUser.setUserStatus(rset.getString("USER_STATUS"));
				loginUser.setBno(rset.getString("BNO"));
			}
			
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return loginUser;
	}


	public int joinMember(Connection con, Login newLogin) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("joinMember");
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, newLogin.getUserId());
			pstmt.setString(2, newLogin.getUserPwd());
			pstmt.setString(3, newLogin.getUserNick());
			pstmt.setString(4, newLogin.getUserName());
			pstmt.setString(5, newLogin.getUserPhone());
			
			
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			
		}
		
		return result;
	}


	public int selectLoginCountBy(Connection con, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		
		String query = prop.getProperty("selectLoginCount");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return result;
	}

}
