package com.kh.thil.user.myPage.myRequest.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.common.PageInfo;
import com.kh.thil.user.myPage.myRequest.model.dao.UserRequestDao;
import com.kh.thil.user.myPage.myRequest.model.vo.UserRequest;

public class UserRequestService {

	public int userListReqCount() {
		Connection con = getConnection();
		
		int listCount = new UserRequestDao().userListReqCount(con);
		
		close(con);
		
		return listCount;
	}

	public ArrayList<UserRequest> userListReqWithPaging(PageInfo pi) {
		Connection con = getConnection();
		
		ArrayList<UserRequest> list = new UserRequestDao().userListReqWithPaging(con, pi);
		
		close(con);
		
		return list;
	}

}
