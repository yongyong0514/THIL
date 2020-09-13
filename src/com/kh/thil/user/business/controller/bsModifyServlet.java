package com.kh.thil.user.business.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.thil.user.login.model.vo.Login;

/**
 * Servlet implementation class bsModifyServlet
 */
@WebServlet("/bsModify.me")
public class bsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bsModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bsNum = request.getParameter("bsNum");
		String bsDate =request.getParameter("bsDate");
		String bsYear =request.getParameter("bsYear");
		String bsTitle = request.getParameter("bsTitle");
		String bsAdd = request.getParameter("bsAdd");
		String bsCorp = request.getParameter("bsCorp");
		String bsName = request.getParameter("bsName");
		String bsPhone = request.getParameter("bsPhone");
		String bsAs = request.getParameter("bsAs");
		int bsDepo = Integer.parseInt(request.getParameter("bsDeposit"));
		String bsBank = request.getParameter("bsBank");
		String bsAct = request.getParameter("bsAct");
		
		String uno = ((Login) request.getSession().getAttribute("bsUser")).getBno();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
