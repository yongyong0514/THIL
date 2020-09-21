package com.kh.thil.admin.business.adminBsInfo.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.commit;
import static com.kh.thil.common.JDBCTemplate.getConnection;
import static com.kh.thil.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.admin.business.adminBsInfo.model.dao.AdminBsInfoDao;
import com.kh.thil.admin.business.adminBsInfo.model.vo.AdminBsInfo;

public class AdminBsInfoService {

	public ArrayList<AdminBsInfo> selectBsInfo(String bnoOne) {
		Connection con = getConnection();
		ArrayList<AdminBsInfo> bsInfo = new AdminBsInfoDao().selectBsInfo(con, bnoOne);
		
		close(con);
		
		return bsInfo;
	}

	public int updateBsAccept(String bno) {
		Connection con = getConnection();
		int result = 0;
		
		result = new AdminBsInfoDao().updateBsAccept(con, bno);
		
		if( result > 0 ) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}


}
