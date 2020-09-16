package com.kh.thil.user.review.model.service;

import static com.kh.thil.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

import com.kh.thil.user.review.model.dao.ReviewDao;
import com.kh.thil.user.review.model.vo.Files;
import com.kh.thil.user.review.model.vo.Review;
import com.kh.thil.user.review.model.vo.ReviewInfo;

public class ReviewService {
	

	public ReviewInfo reviewInfo(String rno) {
		Connection con = getConnection();
		
		ReviewDao rd = new ReviewDao();
		
		ReviewInfo reviewMember = rd.reviewMember(con, rno);
		
		return reviewMember;
	}

	public int insertReview(Map<String, Object> requestData) {
		Connection con = getConnection();
		
		int result = 0;
		
		ReviewDao rd = new ReviewDao();
		Review review = (Review) requestData.get("review");
		ArrayList<Files> fileList = (ArrayList<Files>) requestData.get("fileList");
		
		int result1 = rd.insertReviewContent(con, review);
		
		if(result1 > 0) {
			String revno = rd.selectCurrval(con);
			int result2 =0;
			for(int i = 0; i< fileList.size(); i++) {
				Files fi = fileList.get(i);
				fi.setFiletype(revno);
				result2 += rd.insertReview(con, fi);
			}
			if(result2 == fileList.size()) {
				commit(con);
				result = 1;
			}else {
				rollback(con);
				result = 1;
			}
			
		}
		
		return result;
	}

}
