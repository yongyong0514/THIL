package com.kh.thil.admin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.model.service.AdminService;
import com.kh.thil.common.PageInfo;
import com.kh.thil.pay.model.vo.Pay;

/**
 * Servlet implementation class AdminSelectPayManagerServlet
 */
@WebServlet("/adminPayManage.ad")
public class AdminSelectPayManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminSelectPayManagerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		currentPage = 1;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		limit = 10;
		
		AdminService as = new AdminService();
		
		int listCount = as.getListPayCount();
		
		maxPage = ((int) ((double) listCount / limit + 0.9));
		
		startPage = (((int) ((double) currentPage /limit +0.9)) -1) * 10 + 1;
		
		endPage = startPage + 10 - 1;
		
		if (maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
		
		ArrayList<Pay> list = as.selectListPayWithPaging(pi);
		
		String path = "";
		if (list != null) {
			path ="views/admin/payManage.jsp";
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		
		} else {
			path = "views/adcommon/errorPage.jsp";
			request.setAttribute("message", "결제 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
