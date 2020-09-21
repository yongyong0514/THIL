package com.kh.thil.user.request.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.thil.user.request.model.service.requestService;
import com.kh.thil.user.request.model.vo.RequestDobae;
import com.kh.thil.user.request.model.vo.requestInfo;

/**
 * Servlet implementation class insertOptionSecondServlet
 */
@WebServlet("/insertSecond.is")
public class insertOptionSecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertOptionSecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDobae list = (RequestDobae) session.getAttribute("list");
		ArrayList<requestInfo> list1 = null;
		list1 = new ArrayList<requestInfo>();
		
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String hopeDate = startDate +"$" + endDate;
		int price = Integer.parseInt(request.getParameter("price"));
		String addNum = request.getParameter("addNum");
		String add = request.getParameter("add");
		String addFull = request.getParameter("addFull");
		String addExtra = request.getParameter("addExtra");
		String address = addNum + add + addFull + addExtra;
		String reqName = request.getParameter("name");
		String reqPhone = request.getParameter("phone");
		String reqArea = request.getParameter("rstatus");
		String reqElv= request.getParameter("elstatus");
		String reqHelp = request.getParameter("note");
		
		requestInfo ri = new requestInfo();
		ri.setHopeDate(hopeDate);
		ri.setReqPrice(price);
		ri.setReqAdd(address);
		ri.setReqName(reqName);
		ri.setReqPhone(reqPhone);
		ri.setReqArea(reqArea);
		ri.setReqElv(reqElv);
		ri.setReqHelp(reqHelp);
		
		list1.add(ri);
		
		String path="";
		if(list !=null && list1 != null) {
			path = "views/user/request/step3.jsp";
			HttpSession session1 = request.getSession();
			session1.setAttribute("list1", list1);
			session.setAttribute("list", list);
			
			response.sendRedirect(path);
		} else {
			path = "views/user/common/errorPage.jsp";
			request.setAttribute("message", "옵션전달실패");
			request.getRequestDispatcher(path).forward(request, response);
		}
		//int result = new requestService().
	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
