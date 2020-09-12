package com.kh.thil.user.myPage.memberModify.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.thil.user.login.model.vo.Login;
import com.kh.thil.user.myPage.memberModify.model.vo.Modify;

public class ModifyDao {
	
private Properties prop = new Properties();
	
	public ModifyDao() {
		String fileName =ModifyDao.class.getResource("/sql/user/myPage/memberModify/modify-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int modifyMemberInformation(Connection con, Modify modifyMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		
	
		String query = prop.getProperty("updateMember");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, modifyMember.getUserPwd());
			pstmt.setString(2, modifyMember.getUserNick());
			pstmt.setString(3, modifyMember.getUserPhone());
			pstmt.setString(4, modifyMember.getUserBank());
			pstmt.setString(5, modifyMember.getUserAct());
			pstmt.setString(6, modifyMember.getUno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public Modify selectChangedMemberInformation(Connection con, Modify modifyMember) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Modify changeMemberInformation = null;
		
		String query = prop.getProperty("selectChangedInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, modifyMember.getUno());
	
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				changeMemberInformation = new Modify();
				changeMemberInformation.setUno(rset.getString("UNO"));
				changeMemberInformation.setUserId(rset.getString("USER_ID"));
				changeMemberInformation.setUserPwd(rset.getString("USER_PWD"));
				changeMemberInformation.setUserNick(rset.getString("USER_NICK"));
				changeMemberInformation.setUserName(rset.getString("USER_NAME"));
				changeMemberInformation.setUserPhone(rset.getString("USER_PHONE"));
				changeMemberInformation.setUserBank(rset.getString("USER_BANK"));
				changeMemberInformation.setUserAct(rset.getString("USER_ACT"));
				changeMemberInformation.setUserDate(rset.getDate("USER_DATE"));
				changeMemberInformation.setUserStatus(rset.getString("USER_STATUS"));
				changeMemberInformation.setBno(rset.getString("BNO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(pstmt);
			close(rset);
		}
		
		
		return changeMemberInformation;
	}


}
