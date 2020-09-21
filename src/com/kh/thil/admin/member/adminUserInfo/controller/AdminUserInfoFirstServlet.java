package com.kh.thil.admin.member.adminUserInfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.member.adminUserInfo.model.service.AdminUserInfoService;
import com.kh.thil.admin.member.adminUserInfo.model.vo.AdminInfoFirst;

@WebServlet("/AdminUserInfoFirstServlet.ad")
public class AdminUserInfoFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminUserInfoFirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uno = request.getParameter("num");
		
		
		ArrayList<AdminInfoFirst> listReq = new AdminUserInfoService().tableUserReq(uno);
		
		ArrayList<AdminInfoFirst> listQna = new AdminUserInfoService().tableUserQna(uno);
		
		String path ="";
		
		path = "views/admin/pages/adminUser/adminUserInfo/adminUserInfo.jsp";
		
		request.setAttribute("listReq", listReq);
		
		request.setAttribute("listQna", listQna);
		
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
