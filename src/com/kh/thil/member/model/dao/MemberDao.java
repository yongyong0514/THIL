package com.semi.house.member.model.dao;

import static com.semi.house.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.semi.house.member.model.vo.Member;

public class MemberDao {
	private Properties prop = new Properties();
	
	public MemberDao() {
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
	
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}


	public Member loginCheck(Connection con, Member requestMember) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginUser = null;
		
		String query = prop.getProperty("loginSelect");
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, requestMember.getUserId());
			pstmt.setString(2, requestMember.getUserPwd());
			
			rset = pstmt.executeQuery();
		
			if(rset.next()){
				loginUser = new Member();
				
				loginUser.setUno(rset.getString("UNO"));
				loginUser.setUserId(rset.getString("USER_ID"));
				loginUser.setUserPwd(rset.getString("USER_PWD"));
				loginUser.setUserNick(rset.getString("USER_NICK"));
				loginUser.setUserName(rset.getString("USER_NAME"));
				loginUser.setUserPhone(rset.getString("USER_PHONE"));
				loginUser.setUserBank(rset.getString("USER_BANK"));
				loginUser.setUserAct(rset.getString("USER_ACK"));
				loginUser.setUserDate(rset.getDate("USER_DATE"));
				loginUser.setUserStatus(rset.getString("USER_STATUS"));
				loginUser.setBsNum(rset.getString("BS_NUM"));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return loginUser;
	}

/*	public int insertMember(Connection con, Member newMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("signCheck");
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, newMember.getUserId());
			pstmt.setString(2, newMember.getUserPwd());
			pstmt.setString(3, newMember.getUserName());
			pstmt.setString(4, newMember.getGender());
			pstmt.setInt(5, newMember.getAge());
			pstmt.setString(6, newMember.getEmail());
			pstmt.setString(7, newMember.getPhone());
			pstmt.setString(8, newMember.getAddress());
			pstmt.setString(9, newMember.getHobby());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			
		}
	
		return result;
	}*/
	


}
