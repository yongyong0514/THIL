package com.kh.thil.user.portfolio.model.service;

import static com.kh.thil.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

import com.kh.thil.user.portfolio.model.dao.PortfolioDao;
import com.kh.thil.user.portfolio.model.vo.Portfolio;

public class PortfolioService {

	public ArrayList<Portfolio> selectPortfoiloList(String bno) {
		Connection con = getConnection();
		
		ArrayList<Portfolio> list = new PortfolioDao().selectPortfolioList(con, bno);
		
		return list;
	}

	public int insertPortfolio(Map<String, Object> requestData) {
		// TODO Auto-generated method stub
		return 0;
	}

}
