package com.kh.thil.admin.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.admin.model.dao.AdminDao;
import com.kh.thil.admin.model.vo.Admin;
import com.kh.thil.business.model.vo.Business;
import com.kh.thil.common.PageInfo;
import com.kh.thil.member.model.vo.Member;
import com.kh.thil.pay.model.vo.Pay;
import com.kh.thil.qna.model.vo.Qna;
import com.kh.thil.request.model.vo.Request;

public class AdminService {

	public Admin loginCheck(Admin requestAdmin) {
		Connection con = getConnection();
		
		Admin loginAdmin = new AdminDao().loginCheck(con, requestAdmin);
		
		close(con);
		
		return loginAdmin;
	}

	public ArrayList<Member> selectUserManage() {
		Connection con = getConnection();
		
		ArrayList<Member> list = new AdminDao().selectUserManage(con);
		
		close(con);
		
		return list;
	}

	public ArrayList<Business> selectBsManage() {
		Connection con = getConnection();
		
		ArrayList<Business> list = new AdminDao().selectBsManage(con);
		
		close(con);
		
		return list;
	}

	public int getListUserCount() {
		Connection con = getConnection();
		
		int listCount = new AdminDao().getListUserCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<Member> selectListUserWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<Member> list = new AdminDao().selectListUserWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

	public int getListBsCount() {
		Connection con = getConnection();
		
		int listCount = new AdminDao().getListBsCount(con);
		
		close(con);
		
		return listCount;
	}
	
	public ArrayList<Business> selectListBsWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<Business> list = new AdminDao().selectListBsWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

	public int getListQnaCount() {
		Connection con = getConnection();
		
		int listCount = new AdminDao().getListQnaCount(con);
		
		close(con);
		
		return listCount;
	}


	public ArrayList<Qna> selectListQnaWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<Qna> list = new AdminDao().selectListQnaWithPaging(con, pi);
		
		close(con);
		
		return list;
	}
	

	public int getListReqCount() {
		Connection con = getConnection();
		
		int listCount = new AdminDao().getListReqCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<Request> selectListReqWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<Request> list = new AdminDao().selectListReqWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

	public int getListPayCount() {
		Connection con = getConnection();
		
		int listCount = new AdminDao().getListPayCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<Pay> selectListPayWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<Pay> list = new AdminDao().selectListPayWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

}
