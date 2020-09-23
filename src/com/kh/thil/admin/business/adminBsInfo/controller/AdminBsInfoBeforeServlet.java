package com.kh.thil.admin.business.adminBsInfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.thil.admin.business.adminBsInfo.model.service.AdminBsInfoService;
import com.kh.thil.admin.business.adminBsInfo.model.vo.AdminBsInfo;

@WebServlet("/AdminBsInfoBeforeServlet.ad")
public class AdminBsInfoBeforeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminBsInfoBeforeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bnoOne = request.getParameter("num");
		
		ArrayList<AdminBsInfo> bsInfo = new AdminBsInfoService().selectBsInfo(bnoOne);
		
		String path = "";
		
		path = "views/admin/pages/adminBs/adminBsInfo/adminBsInfo.jsp";
		
		request.setAttribute("bsInfo", bsInfo);
		
		request.getRequestDispatcher(path).forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
