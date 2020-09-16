package com.kh.thil.user.review.model.service;

import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.thil.user.review.model.dao.reviewDao;
import com.kh.thil.user.review.model.vo.ReviewInfo;

public class reviewService {
	

	public ReviewInfo reviewInfo(String rno) {
		Connection con = getConnection();
		
		reviewDao rd = new reviewDao();
		
		ReviewInfo reviewMember = rd.reviewMember(con, rno);
		
		return reviewMember;
	}

}
