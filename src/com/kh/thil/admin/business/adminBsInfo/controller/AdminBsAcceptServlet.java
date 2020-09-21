package com.kh.thil.admin.business.adminBsInfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.business.adminBsInfo.model.service.AdminBsInfoService;

@WebServlet("/AdminrBsAcceptServlet.ad")
public class AdminBsAcceptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminBsAcceptServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bno = request.getParameter("bnoOne");
		
		int result1 = new AdminBsInfoService().updateBsAccept(bno);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
