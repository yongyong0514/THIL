package com.kh.thil.user.request.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.user.request.model.vo.Request;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Servlet implementation class InsertRequestOptionServlet
 */
@WebServlet("/insertRequest")
public class InsertRequestOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertRequestOptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String part = request.getParameter("part");
			String broom = request.getParameter("broom");
			String room = request.getParameter("room");
			int size = Integer.parseInt(request.getParameter("size"));
			String wall = request.getParameter("wall");
			String ceil = request.getParameter("ceil");
			String molding = request.getParameter("molding");
			String balco = request.getParameter("balco");
			
			ArrayList<Request> list = new ArrayList<Request>();
			
			list.add(part);
			String path = "";
			if(list != null) {
				response.sendRedirect(request.getContextPath() + "/selectList.bo");
			} else {
				path = "views/common/errorPage.jsp";
				
				request.setAttribute("message", "게시판 작성 실패");
				request.getRequestDispatcher(path).forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
