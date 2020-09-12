package com.kh.thil.user.myPage.myRequest.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.user.myPage.myRequest.model.vo.UserRequestDetail;

import static com.kh.thil.common.JDBCTemplate.*;

public class UserRequestDetailDao {
	private Properties prop = new Properties();
	
	public UserRequestDetailDao() {
		
		String fileName = UserRequestDao.class.getResource("/sql/user/myPage/myRequest/myRequest-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<UserRequestDetail> UserSelectReqDetail(Connection con, String num) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<UserRequestDetail> list = null;
		
		String query = prop.getProperty("userListReqDetail");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, num);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<UserRequestDetail>();
			
			while(rset.next()) {
				UserRequestDetail urd = new UserRequestDetail();
				urd.setUserId(rset.getString("USER_ID"));
				urd.setUserName(rset.getString("USER_NAME"));
				urd.setUserPhone(rset.getString("USER_PHONE"));
				
				urd.setPayPrice(rset.getInt("PAY_PRICE"));
				urd.setPayFee(rset.getInt("PAY_FEE"));
				urd.setPayType(rset.getString("PAY_TYPE"));
				urd.setPayDate(rset.getDate("PAY_DATE"));
				
				urd.setBsNum(rset.getString("BS_NUM"));
				urd.setBsTitle(rset.getString("BS_TITLE"));
				urd.setCatName(rset.getString("CAT_NAME"));
				urd.setBsName(rset.getString("BS_NAME"));
				urd.setBsPhone(rset.getString("BS_PHONE"));
				urd.setBsAdd(rset.getString("BS_ADD"));
				urd.setBsBank(rset.getString("BS_BANK"));
				urd.setBsAct(rset.getString("BS_ACT"));
				
				urd.setReqHope(rset.getString("REQ_HOPE"));
				String reqHope = rset.getString("REQ_HOPE");
				String[] reqHopeArray = reqHope.split("$");				
				urd.setReqDateStart(reqHopeArray[0]);
				urd.setReqDateEnd(reqHopeArray[1]);
				
				urd.setReqPrice(rset.getInt("REQ_PRICE"));
				urd.setReqAdd(rset.getString("REQ_ADD"));
				urd.setReqName(rset.getString("REQ_NAME"));
				urd.setReqPhone(rset.getString("REQ_PHONE"));
				urd.setReqArea(rset.getString("REQ_AREA"));
				urd.setReqElv(rset.getString("REQ_ELV"));
				urd.setReqHelp(rset.getString("REQ_HELP"));
				
				urd.setReqNote(rset.getString("REQ_NOTE"));
				
				urd.setProName(rset.getString("PRO_NAME"));
				
				list.add(urd);
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
