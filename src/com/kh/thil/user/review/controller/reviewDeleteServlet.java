package com.kh.thil.user.review.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.user.review.model.service.ReviewService;
import com.kh.thil.user.review.model.vo.Review;

/**
 * Servlet implementation class reviewDeleteServlet
 */
@WebServlet("/reviewDelete.rd")
public class reviewDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reviewDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿 호출됨");
		String num = request.getParameter("num");
		System.out.println("num" + num);
		//RE 번호 (리뷰번호) 받아서 글을 지워준다
		//이부분 파일 지우는거 구현해야함.. 변한 이름을 먼저 조회해서 파일을 날리고 쿼리문 작성해야할듯.
		int del = new ReviewService().deleteReview(num);
		
		System.out.println("del이 있나?" + del);
		
		String path = "";
		if(del > 0) {
			path = "views/user/common/success.jsp";
			request.setAttribute("message", "리뷰 삭제 성공");
			 
		}else {
			path = "views/user/common/errorPage.jsp";
			request.setAttribute("message", "리뷰 삭제 실패");
			
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
