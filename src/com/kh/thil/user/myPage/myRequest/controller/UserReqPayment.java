package com.kh.thil.user.myPage.myRequest.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.thil.user.myPage.myRequest.model.service.UserReqPaymentService;
import com.kh.thil.user.myPage.myRequest.model.vo.UserPayment;

@WebServlet("/UserReqPayment.user")
public class UserReqPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserReqPayment() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rnoOne = request.getParameter("rnoOne");
		int queue = Integer.parseInt(request.getParameter("queue"));
		
		if(queue == 0) {
			ArrayList<UserPayment> payInfo = new UserReqPaymentService().reqPayInfo(rnoOne);
			
			response.setContentType("application/json; charset=UTF-8");
			new Gson().toJson(payInfo, response.getWriter());

		} else if (queue == 1) {
			String payBank = request.getParameter("payBank");
			String payAct = request.getParameter("payAct");
			String userName = request.getParameter("userName");
			String payEmail = request.getParameter("payEmail");
			String payCReceipts = request.getParameter("payCReceipts");
			
			UserPayment updatePaymentInfo = new UserPayment();
			updatePaymentInfo.setPayBank(payBank);
			updatePaymentInfo.setPayAct(payAct);
			updatePaymentInfo.setUserName(userName);
			updatePaymentInfo.setPayEmail(payEmail);
			updatePaymentInfo.setPayCReceipts(payCReceipts);
			
			UserPayment changedPayment = new UserReqPaymentService().updatePayment(updatePaymentInfo, rnoOne);
		
		} else if (queue == 3) {
			System.out.println(queue);
			ArrayList<UserPayment> payInfo = new UserReqPaymentService().reqPayInfo(rnoOne);
			
			response.setContentType("application/json; charset=UTF-8");
			new Gson().toJson(payInfo, response.getWriter());
		}

		
//		UserPayment changedPayment = new UserReqPaymentService().updatePayment(updatePaymentInfo);
	
//		ArrayList<UserPayment> payInfo = new UserReqPaymentService().
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
