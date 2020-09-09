package com.kh.thil.admin.request.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.admin.request.model.service.AdminRequestService;
import com.kh.thil.admin.request.model.vo.AdminRequest;
import com.kh.thil.common.PageInfo;

@WebServlet("/adminReqManage.ad")
public class AdminSelectReqManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminSelectReqManageServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;

		currentPage = 1;

		if (request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}

		limit = 10;

		AdminRequestService as = new AdminRequestService();

		int listCount = as.getListReqCount();

		maxPage = ((int) ((double) listCount / limit + 0.9));

		startPage = (((int) ((double) currentPage / limit + 0.9)) - 1) * 10 + 1;

		endPage = startPage + 10 - 1;

		if (maxPage < endPage) {
			endPage = maxPage;
		}

		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);

		ArrayList<AdminRequest> list = as.selectListReqWithPaging(pi);

		String path = "";
		if (list != null) {
			path = "views/admin/pages/adminReqManage.jsp";
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);

		} else {
			path = "views/admin/adcommon/errorPage.jsp";
			request.setAttribute("message", "의뢰 조회 실패!");
		}

		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
