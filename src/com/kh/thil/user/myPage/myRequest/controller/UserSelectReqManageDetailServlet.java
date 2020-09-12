package com.kh.thil.user.myPage.myRequest.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.user.myPage.myRequest.model.service.UserRequestDetailService;
import com.kh.thil.user.myPage.myRequest.model.vo.UserRequestDetail;

@WebServlet("/UserSelectReqDetailOne.user")
public class UserSelectReqManageDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserSelectReqManageDetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String num = request.getParameter("num");
		
		ArrayList<UserRequestDetail> list = new UserRequestDetailService().UserSelectReqDetail(num);
	
		String path = "";
		
		if(list != null) {
			path = "views/user/myPage/myRequest/myRequestDetail.jsp";
			request.setAttribute("list", list);
		} else {
			path = "views/user/common/errorPage.jsp";
			request.setAttribute("message", "상세 의뢰 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
