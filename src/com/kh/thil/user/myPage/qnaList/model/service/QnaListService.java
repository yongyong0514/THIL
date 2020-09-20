package com.kh.thil.user.myPage.qnaList.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.kh.thil.common.PageInfo;
import com.kh.thil.user.myPage.myRequest.model.dao.UserRequestDao;
import com.kh.thil.user.myPage.myRequest.model.vo.UserRequest;
import com.kh.thil.user.myPage.qnaList.model.dao.QnaListDao;
import com.kh.thil.user.qnaPage.model.vo.Qna;
import com.kh.thil.user.review.model.dao.ReviewDao;

public class QnaListService {

	public int qnaListBoardCount(String uno, HttpServletRequest request) {
		Connection con = getConnection();

		int listCount = new QnaListDao().qnaListCount(con, uno, request);

		close(con);

		return listCount;
	}

	public ArrayList<Qna> QnaListWithPaging(PageInfo pi, String uno, HttpServletRequest request) {
		Connection con = getConnection();

		ArrayList<Qna> list = new QnaListDao().qnaListWithPaging(con, pi, uno, request);

		close(con);

		return list;
	}

}
