package com.kh.thil.user.review.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.thil.common.MyFileRenamePolicy;
import com.kh.thil.user.review.model.vo.Files;
import com.kh.thil.user.review.model.vo.Review;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class reviewInsertServlet
 */
@WebServlet("/reviewInsert.rv")
public class reviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reviewInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize = 1024 * 1024 * 10;
			
			String root = request.getSession().getServletContext().getRealPath("/");
			
			System.out.println(root);
			
			String filePath = root + "resources/upLoadFiles/review/";
			
			MultipartRequest multiRequest = new MultipartRequest(request, filePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			ArrayList<String> saveFiles = new ArrayList<>();
			
			ArrayList<String> originFiles = new ArrayList<>();
			
			Enumeration<String> files = multiRequest.getFileNames();
			
			while(files.hasMoreElements()) {
				String name = files.nextElement();
				
				System.out.println("name : " + name);
				
				saveFiles.add(multiRequest.getFilesystemName(name));
				originFiles.add(multiRequest.getOriginalFileName(name));
			}
			System.out.println("fileSystem name : " + saveFiles);
			System.out.println("originFiles name : " + originFiles);
			
			String multipleuser= multiRequest.getParameter("userId");
			String multiplesangho = multiRequest.getParameter("sangho");
			String multiplesigong = multiRequest.getParameter("sigong");
			String multipleaddress = multiRequest.getParameter("gsaddress");
			String multiplemoney = multiRequest.getParameter("gmoney");
			int multiplerating = Integer.parseInt(multiRequest.getParameter("prating"));
			String multitext = multiRequest.getParameter("tx");
			
			
			Review review = new Review();
			review.setNickName(multipleuser);
			review.setBsTitle(multiplesangho);
			review.setCatName(multiplesigong);
			review.setReqAdd(multipleaddress);
			review.setPayPrice(multiplemoney);
			review.setRevPoint(multiplerating);
			review.setRevNote(multitext);
			
			ArrayList<Files> fileList = new ArrayList<Files>();
			for(int i = originFiles.size() -1; i >= 0; i--) {
				Files fe = new Files();
				fe.setFileRoute(filePath);
				fe.setOriginName(originFiles.get(i));
				fe.setChangeName(saveFiles.get(i));
				fe.setFileLevel("0");
				
				fileList.add(fe);
			}
			System.out.println("업르드 사진 확인 : " + fileList);
			
			Map<String, Object> requestData = new HashMap<String, Object>();
			requestData.put("review", review);
			requestData.put("fileList", fileList);
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
