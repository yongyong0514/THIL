package com.kh.thil.user.myPage.myBsRequest.model.vo;

public class UserBsReqUpdate {
	private String rno;
	private String reqBuildDate;
	private String payPrice;
	
	public UserBsReqUpdate() {}

	public UserBsReqUpdate(String rno, String reqBuildDate, String payPrice) {
		super();
		this.rno = rno;
		this.reqBuildDate = reqBuildDate;
		this.payPrice = payPrice;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getReqBuildDate() {
		return reqBuildDate;
	}

	public void setReqBuildDate(String reqBuildDate) {
		this.reqBuildDate = reqBuildDate;
	}

	public String getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

	@Override
	public String toString() {
		return "UserBsReqUpdate [rno=" + rno + ", reqBuildDate=" + reqBuildDate + ", payPrice=" + payPrice + "]";
	}
	
}
