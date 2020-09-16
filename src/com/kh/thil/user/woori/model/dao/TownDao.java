package com.kh.thil.user.woori.model.dao;


import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.user.woori.model.vo.Town;
public class TownDao {
	private Properties prop = new java.util.Properties();
	
	public TownDao() {
		String fileName = TownDao.class.getResource("/sql/user/woori/townSelectList.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<Town> townSelectList(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Town> list = null;
	
		
		String query = prop.getProperty("townSelectlist");
		
		try {
			pstmt = con.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Town>();
			
			while(rset.next()) {
				Town t = new Town();
				t.setBsTitle(rset.getString("BS_TITLE"));
				t.setBsAdd(rset.getString("BS_ADD"));
				t.setCatName(rset.getString("CAT_NAME"));
				t.setpPrice(rset.getString("PORT_PRICE"));
				t.setpNote(rset.getString("PORT_NOTE"));
				t.setPStatus(rset.getString("PORT_STATUS"));
				
				
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		return list;
	
	}

}

