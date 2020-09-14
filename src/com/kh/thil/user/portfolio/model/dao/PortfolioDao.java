package com.kh.thil.user.portfolio.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import static com.kh.thil.common.JDBCTemplate.*;

import com.kh.thil.user.business.model.vo.Business;
import com.kh.thil.user.login.model.vo.Login;
import com.kh.thil.user.portfolio.model.vo.Files;
import com.kh.thil.user.portfolio.model.vo.Portfolio;

public class PortfolioDao {
	private Properties prop = new java.util.Properties();
	
	public PortfolioDao() {
		String fileName = PortfolioDao.class.getResource("/sql/user/portfolio/port-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Portfolio> selectPortfolioList(Connection con, String bno) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Portfolio> list = null;
	
		
		String query = prop.getProperty("selectList");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bno);
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Portfolio>();
			
			while(rset.next()) {
				Portfolio p = new Portfolio();
				p.setCatName(rset.getString("CAT_NAME"));
				p.setPortNote(rset.getString("PORT_NOTE"));
				p.setDate(rset.getDate("PORT_DATE"));
				
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		return list;
	}

	public int insertPortfolioContent(Connection con, Portfolio portfolio) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertPortfolio");
		
		return 0;
	}

	public String selectCurrval(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertPortfolio(Connection con, Files fi) {
		// TODO Auto-generated method stub
		return 0;
	}

}
