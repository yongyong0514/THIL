package com.kh.thil.user.myPage.myRequest.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserReqPayment.user")
public class UserReqPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserReqPayment() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rnoOne = request.getParameter("rnoOne");
		System.out.println("결제모듈 값 전달 확인 : " + rnoOne);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
