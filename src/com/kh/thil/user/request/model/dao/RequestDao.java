package com.kh.thil.user.request.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import static com.kh.thil.common.JDBCTemplate.close;

import com.kh.thil.user.request.model.vo.dobaeResult;

public class RequestDao {
	private Properties prop = new Properties();
	public RequestDao() {
		String fileName = RequestDao.class.getResource("/sql/user/request/request-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int insertDobae(Connection con, dobaeResult dr) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertDobae");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,dr.getPart());
			pstmt.setInt(2, dr.getBroom());
			pstmt.setInt(3, dr.getRoom());
			pstmt.setString(4, dr.getWall());
			pstmt.setString(5, dr.getCeil());
			pstmt.setString(6, dr.getMolding());
			pstmt.setString(7, dr.getBalco());
			pstmt.setString(8, dr.getHopeDate());
			pstmt.setInt(9, dr.getPrice());
			pstmt.setString(10, dr.getAddress());
			pstmt.setString(11, dr.getReqName());
			pstmt.setString(12, dr.getReqPhone());
			pstmt.setString(13, dr.getReqArea());
			pstmt.setString(14, dr.getReqElv());
			pstmt.setString(15, dr.getReqHelp());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
}
