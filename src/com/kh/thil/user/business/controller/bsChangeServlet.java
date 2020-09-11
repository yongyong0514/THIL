package com.kh.thil.user.business.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.thil.user.business.model.service.BusinessService;
import com.kh.thil.user.business.model.vo.Business;
import com.kh.thil.user.login.model.vo.Login;

/**
 * Servlet implementation class bsChangeServlet
 */
@WebServlet("/bsChange.me")
public class bsChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bsChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] irr = request.getParameterValues("category"); 
		String bsNum = request.getParameter("bsNum");
		String bsDate =request.getParameter("bsDate");
		String bsYear =request.getParameter("bsYear");
		String bsTitle = request.getParameter("bsTitle");
		String bsCorp = request.getParameter("bsCorp");
		String bsName = request.getParameter("bsName");
		String bsPhone = request.getParameter("bsPhone");
		String bsAs = request.getParameter("bsAs");
		int bsDepo = Integer.parseInt(request.getParameter("bsDeposit"));
		String bsBank = request.getParameter("bsBank");
		String bsAct = request.getParameter("bsAct");
		
		Business bsChangeInsert = new Business();
		bsChangeInsert.setBsNum(bsNum);
		// 수정예정bsChangeInsert.setBsDate(bsDate);
		bsChangeInsert.setBsYear(bsYear);
		bsChangeInsert.setBsTitle(bsTitle);
		bsChangeInsert.setBsCorp(bsCorp);
		bsChangeInsert.setBsName(bsName);
		bsChangeInsert.setBsPhone(bsPhone);
		bsChangeInsert.setBsAs(bsAs);
		bsChangeInsert.setBsDepo(bsDepo);
		bsChangeInsert.setBsBank(bsBank);
		bsChangeInsert.setBsAct(bsAct);
		
		int result = new BusinessService().bsChange(bsChangeInsert);
		HttpSession session= request.getSession();
		Login info=(Login)session.getAttribute("loginUser"); 
		String uno = info.getUno();
		
		

		String category= "";
		if(irr != null) {
			for(int i = 0; i < irr.length; i++) {
				if(i == 0) {
					category += irr[i];
				} else {
					category += ", " + irr[i];
				}
			}
		}
		System.out.println("category :" + category);
		System.out.println("bsNum: " + bsNum);
		System.out.println("bsYear" + bsYear);
		System.out.println("uno" + uno);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
