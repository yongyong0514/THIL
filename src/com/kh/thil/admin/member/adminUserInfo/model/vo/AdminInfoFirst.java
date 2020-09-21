package com.kh.thil.admin.member.adminUserInfo.model.vo;

import java.sql.Date;

public class AdminInfoFirst {
	private String rno;
	private String proName;
	private String catName;
	private String reqBuildStart;
	private String reqBuildEnd;
	private int payPrice;

	private String qno;
	private String qkName;
	private Date qnaDate;
	private String qnaAnsYn;
	
	public AdminInfoFirst() {}

	public AdminInfoFirst(String rno, String proName, String catName, String reqBuildStart, String reqBuildEnd,
			int payPrice, String qno, String qkName, Date qnaDate, String qnaAnsYn) {
		super();
		this.rno = rno;
		this.proName = proName;
		this.catName = catName;
		this.reqBuildStart = reqBuildStart;
		this.reqBuildEnd = reqBuildEnd;
		this.payPrice = payPrice;
		this.qno = qno;
		this.qkName = qkName;
		this.qnaDate = qnaDate;
		this.qnaAnsYn = qnaAnsYn;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getReqBuildStart() {
		return reqBuildStart;
	}

	public void setReqBuildStart(String reqBuildStart) {
		this.reqBuildStart = reqBuildStart;
	}

	public String getReqBuildEnd() {
		return reqBuildEnd;
	}

	public void setReqBuildEnd(String reqBuildEnd) {
		this.reqBuildEnd = reqBuildEnd;
	}

	public int getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}

	public String getQno() {
		return qno;
	}

	public void setQno(String qno) {
		this.qno = qno;
	}

	public String getQkName() {
		return qkName;
	}

	public void setQkName(String qkName) {
		this.qkName = qkName;
	}

	public Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public String getQnaAnsYn() {
		return qnaAnsYn;
	}

	public void setQnaAnsYn(String qnaAnsYn) {
		this.qnaAnsYn = qnaAnsYn;
	}

	@Override
	public String toString() {
		return "AdminInfoFirst [rno=" + rno + ", proName=" + proName + ", catName=" + catName + ", reqBuildStart="
				+ reqBuildStart + ", reqBuildEnd=" + reqBuildEnd + ", payPrice=" + payPrice + ", qno=" + qno
				+ ", qkName=" + qkName + ", qnaAnsYn=" + qnaAnsYn + "]";
	}

}
