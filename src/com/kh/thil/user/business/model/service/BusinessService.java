package com.kh.thil.user.business.model.service;

import static com.kh.thil.common.JDBCTemplate.*;

import java.sql.Connection;

import com.kh.thil.user.business.model.dao.BusinessDao;
import com.kh.thil.user.business.model.vo.Business;

public class BusinessService {

	public int bsChange(Business bsChangeInsert, String uno, String category) {
		Connection con = getConnection();
		BusinessDao bs = new BusinessDao();
		
		int result = bs.bsChange(con, bsChangeInsert);
		
		if(result > 0) {
			int result2 = bs.bsChange2(con, uno);
			if (result2 > 0) {
				int result3 = bs.bsChange3(con, category);
				if(result3 > 0) {
					commit(con);
				}else {
					rollback(con);
				}
			}else {
				rollback(con);
			}
			commit(con);
		}else {
			rollback(con);
		}
		
		
		close(con);
		
		
		return result;
	
	}

	public Business updateBsModify(Business bsChangeInsert, String bno) {
		Connection con = getConnection();
		Business changedBsInfo = null;
		BusinessDao bs = new BusinessDao();
		
		int result = bs.updateBsModify(con, bsChangeInsert, bno);
		
		if(result > 0) {
			changedBsInfo = bs.changedBsInfo(con, bsChangeInsert, bno);
			if(changedBsInfo != null) {
				commit(con);
			}else {
				rollback(con);
			}
		}else {
			rollback(con);
		}
		
		close(con);
		
		return changedBsInfo;
	}

}
