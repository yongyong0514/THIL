package com.kh.thil.admin.business.adminBsInfo.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.admin.business.adminBsInfo.model.vo.AdminBsInfo;
import com.kh.thil.user.myPage.memberModify.model.dao.ModifyDao;

public class AdminBsInfoDao {
	private Properties prop = new Properties();
	
	public AdminBsInfoDao() {
		String fileName =ModifyDao.class.getResource("/sql/admin/admin-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<AdminBsInfo> selectBsInfo(Connection con, String bnoOne) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminBsInfo> bsInfo = null;
		
		String query = prop.getProperty("selectBsInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, bnoOne);
			
			rset = pstmt.executeQuery();
			
			bsInfo = new ArrayList<AdminBsInfo>();
			
			if(rset.next()) {
				AdminBsInfo abi = new AdminBsInfo();
				abi.setUno(rset.getString("UNO"));
				abi.setUserId(rset.getString("USER_ID"));
				abi.setUserNick(rset.getString("USER_NICK"));
				abi.setUserName(rset.getString("USER_NAME"));
				abi.setUserPhone(rset.getString("USER_PHONE"));
				abi.setUserDate(rset.getDate("USER_DATE"));
				
				abi.setBno(rset.getString("BNO"));
				abi.setBsNum(rset.getString("BS_NUM"));
				abi.setBsTitle(rset.getString("BS_TITLE"));
				abi.setBsYear(rset.getString("BS_YEAR"));
				abi.setBsAs(rset.getString("BS_AS"));
				abi.setBsDepo(rset.getInt("BS_DEPO"));
				abi.setBsCorp(rset.getString("BS_CORP"));
				abi.setBsName(rset.getString("BS_NAME"));
				abi.setBsPhone(rset.getString("BS_PHONE"));
				abi.setBsAdd(rset.getString("BS_ADD"));
				abi.setBsBank(rset.getString("BS_BANK"));
				abi.setBsAct(rset.getString("BS_ACT"));
				abi.setBsMember(rset.getString("BS_MEMBER"));
				
				abi.setCatName(rset.getString("CAT_NAME"));
				
				bsInfo.add(abi);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return bsInfo;
	}

	public int updateBsAccept(Connection con, String bno) {
		PreparedStatement pstmt = null;
		int result = 0;	
		
		String query = prop.getProperty("updateBsAccept");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bno);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
}
