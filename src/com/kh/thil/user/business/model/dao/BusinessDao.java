package com.kh.thil.user.business.model.dao;
import static com.kh.thil.common.JDBCTemplate.close;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.thil.user.business.model.vo.Business;


public class BusinessDao {

	
	private Properties prop = new Properties();
	
	public BusinessDao() {
		String fileName = BusinessDao.class.getResource("/sql/user/bsMyPage/bsmy-query.properties").getPath();
	
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public int bsChange(Connection con, Business bsChangeInsert) {
		PreparedStatement pstmt = null;
		int result =0;
		
		String query = prop.getProperty("insertBschange");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bsChangeInsert.getBsNum());
			pstmt.setString(2, bsChangeInsert.getBsNumDate());
			pstmt.setString(3, bsChangeInsert.getBsTitle());
			pstmt.setString(4, bsChangeInsert.getBsAdd());
			pstmt.setString(5, bsChangeInsert.getBsName());
			pstmt.setString(6, bsChangeInsert.getBsPhone());
			pstmt.setString(7, bsChangeInsert.getBsBank());
			pstmt.setString(8, bsChangeInsert.getBsAct());
			pstmt.setString(9, bsChangeInsert.getBsYear());
			pstmt.setString(10, bsChangeInsert.getBsCorp());
			pstmt.setString(11, bsChangeInsert.getBsAs());
			pstmt.setInt(12, bsChangeInsert.getBsDepo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	public int bsChange2(Connection con, String uno) {
		PreparedStatement pstmt = null;
		int result =0;
		
		String query = prop.getProperty("insertBschange2");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, uno);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}
	public int bsChange3(Connection con, String category) {
		// TODO Auto-generated method stub
		return 0;
	}

}
