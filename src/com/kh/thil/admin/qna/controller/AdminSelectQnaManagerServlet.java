package com.kh.thil.admin.qna.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.qna.model.service.AdminQnaService;
import com.kh.thil.admin.qna.model.vo.AdminQna;
import com.kh.thil.common.PageInfo;



@WebServlet("/adminQnaManage.ad")
public class AdminSelectQnaManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminSelectQnaManagerServlet() {
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
		
		AdminQnaService as = new AdminQnaService();
		
		int listCount = as.getListQnaCount();
		
		maxPage = (int)((double) listCount / limit + 0.9);

		startPage = (((int)((double) currentPage / limit + 0.9)) - 1) * 10 + 1;
		
		endPage = startPage + 10 -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
		
		ArrayList<AdminQna> list = as.selectListQnaWithPaging(pi);
		
		String path ="";
		if (list != null) {
			path = "views/admin/pages/adminQnaManage.jsp";
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		
		} else {
			path = "views/admin/adcommon/errorPage.jsp";
			request.setAttribute("message", "문의 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request,  response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
