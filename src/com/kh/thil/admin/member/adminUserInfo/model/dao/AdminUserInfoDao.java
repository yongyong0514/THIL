package com.kh.thil.admin.member.adminUserInfo.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.admin.adminMain.model.vo.AdminMain;
import com.kh.thil.admin.member.adminUserInfo.model.vo.AdminInfoFirst;
import com.kh.thil.admin.member.adminUserInfo.model.vo.AdminUserInfo;
import com.kh.thil.user.login.model.vo.Login;
import com.kh.thil.user.myPage.memberModify.model.dao.ModifyDao;

public class AdminUserInfoDao {
		private Properties prop = new Properties();
	
	public AdminUserInfoDao() {
		String fileName =ModifyDao.class.getResource("/sql/admin/admin-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public int updateInfo(Connection con, AdminUserInfo aui) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, aui.getUserNick());
			pstmt.setString(2, aui.getUserName());
			pstmt.setString(3, aui.getUserPhone());
			pstmt.setString(4, aui.getBno());
			pstmt.setString(5, aui.getUno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}



	public AdminUserInfo selectUpdateInfo(Connection con, AdminUserInfo aui) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		AdminUserInfo updateInfoOne = null;
		
		String query = prop.getProperty("selectUpdateInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, aui.getUno());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				updateInfoOne = new AdminUserInfo();
				updateInfoOne.setUno(rset.getString("UNO"));
				updateInfoOne.setUserId(rset.getString("USER_ID"));
				updateInfoOne.setUserNick(rset.getString("USER_NICK"));
				updateInfoOne.setUserName(rset.getString("USER_NAME"));
				updateInfoOne.setUserPhone(rset.getString("USER_PHONE"));
				updateInfoOne.setUserDate(rset.getDate("USER_DATE"));
				updateInfoOne.setBno(rset.getString("BNO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return updateInfoOne;
	}



	public ArrayList<AdminUserInfo> selectUserInfo(Connection con, String unoOne) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminUserInfo> userInfo = null;
		
		String query = prop.getProperty("selectUserInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, unoOne);
			
			rset = pstmt.executeQuery();
			
			userInfo = new ArrayList<AdminUserInfo>();
			
			if(rset.next()) {
				AdminUserInfo aui = new AdminUserInfo();
				aui.setUno(rset.getString("UNO"));
				aui.setUserId(rset.getString("USER_ID"));
				aui.setUserNick(rset.getString("USER_NICK"));
				aui.setUserName(rset.getString("USER_NAME"));
				aui.setUserPhone(rset.getString("USER_PHONE"));
				aui.setUserDate(rset.getDate("USER_DATE"));
				aui.setBno(rset.getString("BNO"));
			
				userInfo.add(aui);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return userInfo;
	}



	public ArrayList<AdminInfoFirst> tableUserReq(Connection con, String uno) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminInfoFirst> listReq = null;
		
		String query = prop.getProperty("tableUserReq");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, uno);
			
			rset = pstmt.executeQuery();
			
			listReq = new ArrayList<AdminInfoFirst>();
			
			while(rset.next()) {
				AdminInfoFirst aif = new AdminInfoFirst();
				aif.setRno(rset.getString("RNO"));
				aif.setProName(rset.getString("PRO_NAME"));
				aif.setCatName(rset.getString("CAT_NAME"));
				aif.setReqBuildStart(rset.getString("REQ_BUILDSTART"));
				aif.setReqBuildEnd(rset.getString("REQ_BUILDEND"));
				aif.setPayPrice(rset.getInt("PAY_PRICE"));
				
				listReq.add(aif);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return listReq;
	}



	public ArrayList<AdminInfoFirst> tableUserQna(Connection con, String uno) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminInfoFirst> listQna = null;
		
		String query = prop.getProperty("tableUserQna");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, uno);
			
			rset = pstmt.executeQuery();
			
			listQna = new ArrayList<AdminInfoFirst>();
			
			while(rset.next()) {
				AdminInfoFirst aif = new AdminInfoFirst();
				aif.setQno(rset.getString("QNO"));
				aif.setQkName(rset.getString("QK_NAME"));
				aif.setQnaDate(rset.getDate("QNA_DATE"));
				aif.setQnaAnsYn(rset.getString("QNA_ANSYN"));
				
				listQna.add(aif);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return listQna;
	}
}
