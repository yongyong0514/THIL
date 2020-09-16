package com.kh.thil.user.woori.model.dao;


import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
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
	public ArrayList<HashMap<String, Object>> townSelectList(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<HashMap<String, Object>> list = null;
	
		
		String query = prop.getProperty("townSelectlist");
		
		try {
			stmt = con.createStatement();
			
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<HashMap<String, Object>>();
			
			while(rset.next()) {
				HashMap<String, Object> hmap = new HashMap<String, Object>();
				hmap.put("bsTitle",rset.getString("BS_TITLE"));
				hmap.put("bsAdd",rset.getString("BS_ADD"));
				hmap.put("catName", rset.getString("CAT_NAME"));
				hmap.put("pPrice", rset.getString("PORT_PRICE"));
				hmap.put("pNote", rset.getString("PORT_NOTE"));
				hmap.put("pStatus", rset.getString("PORT_STATUS"));
				
				
				list.add(hmap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rset);
		}
		return list;
	
	}

}

