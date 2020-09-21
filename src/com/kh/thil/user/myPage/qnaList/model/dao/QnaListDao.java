package com.kh.thil.user.myPage.qnaList.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import com.kh.thil.common.PageInfo;

import com.kh.thil.user.qnaPage.model.vo.Qna;



public class QnaListDao {
	private Properties prop = new Properties();
	
	public QnaListDao() {
		String fileName = QnaListDao.class.getResource("/sql/user/myPage/qnaList/qnaList-query.properties")
				.getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int qnaListCount(Connection con, String uno, HttpServletRequest request) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = prop.getProperty("qnaListCount");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, uno);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt(1);
				}
			System.out.println("listC: " + listCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return listCount;
	}


	public ArrayList<Qna> qnaListWithPaging(Connection con, PageInfo pi, String uno, HttpServletRequest request) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Qna> list = null;
		String query = prop.getProperty("qnaListWithPaging");
		try {
			pstmt = con.prepareStatement(query);
			int startRow = (pi.getCurrentPage() -1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() -1;
			
			pstmt.setString(1, uno);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			list = new ArrayList<Qna>();
			while(rset.next()) {
				Qna qn = new Qna();
				qn.setUno(rset.getString("UNO"));
				qn.setQno(rset.getString("QNO"));
				qn.setQkno(rset.getString("QKNO"));
				qn.setRno(rset.getString("RNO"));
				qn.setQnaNote(rset.getString("QNA_NOTE"));
				qn.setQnaAns(rset.getString("QNA_ANS"));
				qn.setQnaDate(rset.getDate("QNA_DATE"));
				qn.setQnaAnsDate(rset.getDate("QNA_ANSDATE"));
				qn.setQnaAnsYn(rset.getString("QNA_ANSYN"));
				qn.setQnaStatus(rset.getString("QNA_STATUS"));
				
				list.add(qn);
			};
		
			System.out.println("listDAO:"+list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

}
