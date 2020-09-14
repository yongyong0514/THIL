package com.kh.thil.admin.adminMain.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.adminMain.model.service.AdminMainService;
import com.kh.thil.admin.adminMain.model.vo.AdminMain;
import com.kh.thil.common.PageInfo;

@WebServlet("/tableReqList.ad")
public class AdminTableReqListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminTableReqListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int currentPage;
		int limit;
		
		currentPage = 1;
		
		if(request.getParameter("currentPage") != null ) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		limit = 5;
		
		AdminMainService ams = new AdminMainService();
		
		int listCount = ams.tableReqListCount();
	
		PageInfo piReq = new PageInfo(currentPage, listCount, limit);
		
		ArrayList<AdminMain> listReq = ams.tableReqListMain();
		
		String path = "";
		if(listReq != null) {
			path = "views/admin/pages/adminMainStatus.jsp";
			request.setAttribute("listReq", listReq);
			request.setAttribute("piReq", piReq);
		}
	
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
