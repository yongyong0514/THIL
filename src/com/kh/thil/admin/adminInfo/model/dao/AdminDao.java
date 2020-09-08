package com.kh.thil.admin.model.dao;

import static com.kh.thil.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.thil.admin.model.vo.Admin;
import com.kh.thil.business.model.vo.Business;
import com.kh.thil.common.PageInfo;
import com.kh.thil.member.model.vo.Member;
import com.kh.thil.pay.model.vo.Pay;
import com.kh.thil.qna.model.vo.Qna;
import com.kh.thil.request.model.vo.Request;


public class AdminDao {
	private Properties prop = new Properties();

	public AdminDao() {
		String fileName = AdminDao.class.getResource("/sql/admin/admin-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Admin loginCheck(Connection con, Admin requestAdmin) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Admin loginAdmin = null;

		String query = prop.getProperty("loginSelect");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, requestAdmin.getAdminId());
			pstmt.setString(2, requestAdmin.getAdminPwd());

			rset = pstmt.executeQuery();

			if (rset.next()) {
				loginAdmin = new Admin();

				loginAdmin.setAno(rset.getString("ANO"));
				loginAdmin.setAdminId(rset.getString("ADMIN_ID"));
				loginAdmin.setAdminPwd(rset.getString("ADMIN_PWD"));
				loginAdmin.setAdminName(rset.getString("ADMIN_NAME"));
				loginAdmin.setEnrollDate(rset.getDate("ENROLL_DATE"));
				loginAdmin.setStatus(rset.getString("STATUS"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return loginAdmin;
	}

	public ArrayList<Member> selectUserManage(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null;

		String query = prop.getProperty("selectUserList");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			list = new ArrayList<Member>();

			while (rset.next()) {
				Member am = new Member();
				am.setUno(rset.getString("UNO"));
				am.setUserId(rset.getString("USER_ID"));
				am.setUserNick(rset.getString("USER_NICK"));
				am.setUserName(rset.getString("USER_NAME"));
				am.setUserPhone(rset.getString("USER_PHONE"));
				am.setUserBank(rset.getString("USER_BANK"));
				am.setUserAct(rset.getString("USER_ACT"));
				am.setUserDate(rset.getDate("USER_DATE"));
				am.setUserStatus(rset.getString("USER_STATUS"));
				am.setBno(rset.getString("BNO"));				

				list.add(am);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}

		return list;
	}

	public ArrayList<Business> selectBsManage(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Business> list = null;

		String query = prop.getProperty("selectBsList");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			list = new ArrayList<Business>();

			while (rset.next()) {
				Business bs = new Business();
				bs.setBno(rset.getString("BNO"));
				bs.setBsNum(rset.getString("BS_NUM"));
				bs.setBsTitle(rset.getString("BS_TITLE"));
				bs.setBsName(rset.getString("BS_NAME"));
				bs.setBsPhone(rset.getString("BS_PHONE"));
				bs.setBsBank(rset.getString("BS_BANK"));
				bs.setBsAct(rset.getString("BS_ACT"));
				bs.setBsDate(rset.getDate("BS_DATE"));
				bs.setBsStatus(rset.getString("BS_STATUS"));
				bs.setBsMember(rset.getString("BS_MEMBER"));

				list.add(bs);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}

		return list;
	}

	public int getListUserCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;

		String query = prop.getProperty("listUserCount");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}

		return listCount;

	}

	public ArrayList<Member> selectListUserWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = null;

		String query = prop.getProperty("selectListUserWithPaging");

		try {
			pstmt = con.prepareStatement(query);

			int startRow = (pi.getCurrentPage() - 1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() - 1;

			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			list = new ArrayList<Member>();

			while (rset.next()) {
				Member am = new Member();
				am.setUno(rset.getString("UNO"));
				am.setUserId(rset.getString("USER_ID"));
				am.setUserNick(rset.getString("USER_NICK"));
				am.setUserName(rset.getString("USER_NAME"));
				am.setUserPhone(rset.getString("USER_PHONE"));
				am.setUserBank(rset.getString("USER_BANK"));
				am.setUserAct(rset.getString("USER_ACT"));
				am.setUserDate(rset.getDate("USER_DATE"));
				am.setUserStatus(rset.getString("USER_STATUS"));
				am.setBno(rset.getString("BNO"));				

				list.add(am);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		return list;
	}

	public int getListBsCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;

		String query = prop.getProperty("listBsCount");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}

		return listCount;
	}

	public ArrayList<Business> selectListBsWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Business> list = null;

		String query = prop.getProperty("selectListBsWithPaging");

		try {
			pstmt = con.prepareStatement(query);

			int startRow = (pi.getCurrentPage() - 1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() - 1;

			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			list = new ArrayList<Business>();

			while (rset.next()) {
				Business bs = new Business();
				bs.setBno(rset.getString("BNO"));
				bs.setBsNum(rset.getString("BS_NUM"));
				bs.setBsTitle(rset.getString("BS_TITLE"));
				bs.setBsName(rset.getString("BS_NAME"));
				bs.setBsPhone(rset.getString("BS_PHONE"));
				bs.setBsBank(rset.getString("BS_BANK"));
				bs.setBsAct(rset.getString("BS_ACT"));
				bs.setBsDate(rset.getDate("BS_DATE"));
				bs.setBsStatus(rset.getString("BS_STATUS"));
				bs.setBsMember(rset.getString("BS_MEMBER"));

				list.add(bs);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		return list;
	}


	public int getListQnaCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;
		
		String query = prop.getProperty("listQnaCount");
		
		try {
			stmt = con.createStatement();
			
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return listCount;
	}
	
	
	public ArrayList<Qna> selectListQnaWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Qna> list = null;
		
		String query = prop.getProperty("selectListQnaWithPaging");
		
		try {
			pstmt = con.prepareStatement(query);
			
			int startRow = (pi.getCurrentPage() -1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Qna>();
			
			while (rset.next()) {
				Qna qa = new Qna();
				qa.setUno(rset.getString("UNO"));
				qa.setQno(rset.getString("QNO"));
				qa.setQkName(rset.getString("QK_NAME"));
				qa.setRno(rset.getString("RNO"));
				qa.setQnaNote(rset.getString("QNA_NOTE"));
				qa.setQnaAns(rset.getString("QNA_ANS"));
				qa.setQnaDate(rset.getDate("QNA_DATE"));
				qa.setQnaAnsDate(rset.getDate("QNA_ANSDATE"));
				qa.setQnaAnsYn(rset.getString("QNA_ANSYN"));
				qa.setQnaStatus(rset.getString("QNA_STATUS"));
				
				list.add(qa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}
	
	
	public int getListReqCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;

		String query = prop.getProperty("listReqCount");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);

		}
		
		return listCount;
	}

	public ArrayList<Request> selectListReqWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Request> list = null;
		
		String query = prop.getProperty("selectListReqWithPaging");
		
		try {
			pstmt = con.prepareStatement(query);
			
			int startRow = (pi.getCurrentPage() -1) * pi.getLimit() + 1;
			int endRow = startRow + pi.getLimit() - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2,  endRow);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Request>();
			
			while(rset.next()) {
				Request req = new Request();
				req.setRno(rset.getString("RNO"));
				req.setProName(rset.getString("PRO_NAME"));
				req.setCatName(rset.getString("CAT_NAME"));
				req.setReqName(rset.getString("USER_ID"));
				req.setReqPhone(rset.getString("REQ_NAME"));
				req.setReqPhone(rset.getString("REQ_PHONE"));
				req.setBsTitle(rset.getString("BS_TITLE"));
				req.setBsNum(rset.getString("BS_NUM"));
				req.setPayPrice(rset.getInt("PAY_PRICE"));
				req.setReqDate(rset.getDate("REQ_DATE"));
				
				list.add(req);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

	public int getListPayCount(Connection con) {
		Statement stmt = null;
		int listCount = 0;
		ResultSet rset = null;
		
		String query = prop.getProperty("listPayCount");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		
		return listCount;
	}

	public ArrayList<Pay> selectListPayWithPaging(Connection con, PageInfo pi) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Pay> list = null;
		
		String query = prop.getProperty("selectListPayWithPaging");
		
		try {
			pstmt = con.prepareStatement(query);
			
			int startRow = (pi.getCurrentPage() - 1) * pi.getLimit() - 1;
			int endRow = startRow + pi.getLimit() - 1;
			
			pstmt.setInt(1,  startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery(query);
			
			list = new ArrayList<Pay>();
			
			while(rset.next()) {
				Pay pa = new Pay();
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
