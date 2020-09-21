package com.kh.thil.user.request.model.service;

import java.sql.Connection;
import static com.kh.thil.common.JDBCTemplate.*;

import com.kh.thil.user.request.model.dao.RequestDao;
import com.kh.thil.user.request.model.vo.dobaeResult;

public class requestService {

	public int insertDobae(dobaeResult dr) {
		Connection con = getConnection();
		
		int result = new RequestDao().insertDobae(con, dr);
		
		if(result>0) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		return result;
	}
}
