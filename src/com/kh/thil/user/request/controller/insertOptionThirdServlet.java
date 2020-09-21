package com.kh.thil.user.request.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.thil.user.request.model.service.requestService;
import com.kh.thil.user.request.model.vo.RequestDobae;
import com.kh.thil.user.request.model.vo.dobaeResult;
import com.kh.thil.user.request.model.vo.requestInfo;

/**
 * Servlet implementation class insertOptionThirdServlet
 */
@WebServlet("/insertThird.it")
public class insertOptionThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertOptionThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HttpSession session1 = request.getSession();
		RequestDobae list = (RequestDobae) session.getAttribute("list");
		requestInfo  list1 = (requestInfo)session1.getAttribute("list1");
		
		
		String part = list.getPart();
		int broom =  list.getBroom();
		int room =  list.getRoom();
		int size = list.getSize();
		String wall = list.getWall();
		String ceil = list.getCeil();
		String molding = list.getMolding();
		String balco = list.getBalco();
		
		
		String hopeDate = list1.getHopeDate();
		int price = list1.getReqPrice();
		String address = list1.getReqAdd();
		String reqName =list1.getReqName();
		String reqPhone = list1.getReqPhone();
		String reqArea = list1.getReqArea();
		String reqElv= list1.getReqElv();
		String reqHelp = list1.getReqHelp();
		
		dobaeResult dr = new dobaeResult();
		dr.setPart(part);
		dr.setBroom(broom);
		dr.setRoom(room);
		dr.setSize(size);
		dr.setWall(wall);
		dr.setCeil(ceil);
		dr.setMolding(molding);
		dr.setBalco(balco);
		dr.setHopeDate(hopeDate);
		dr.setPrice(price);
		dr.setAddress(address);
		dr.setReqName(reqName);
		dr.setReqPhone(reqPhone);
		dr.setReqArea(reqArea);
		dr.setReqElv(reqElv);
		dr.setReqHelp(reqHelp);
		
		int result = new requestService().insertDobae(dr);
		
		String path = "";
		if(result > 0) {
			response.sendRedirect(request.getContextPath() + "/insertRequest.ir");
		} else {
			path = "views/common/errorPage.jsp";
			
			request.setAttribute("message", "의뢰신청 실패");
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
