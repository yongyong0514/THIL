package com.kh.thil.user.myPage.myRequest.model.service;

import static com.kh.thil.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.user.myPage.myRequest.model.dao.UserRequestDetailDao;
import com.kh.thil.user.myPage.myRequest.model.vo.UserRequestDetail;

public class UserRequestDetailService {

	public ArrayList<UserRequestDetail> UserSelectReqDetail(String num) {
		Connection con = getConnection();
		
		ArrayList<UserRequestDetail> list = new UserRequestDetailDao().UserSelectReqDetail(con, num);
		
		close(con);
		
		return list;
	}

}
