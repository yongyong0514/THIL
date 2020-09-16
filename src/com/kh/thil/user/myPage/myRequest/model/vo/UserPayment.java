package com.kh.thil.user.myPage.myRequest.model.vo;

import java.sql.Date;

public class UserPayment {
	private String payNo;
	private String bsName;
	private String bsTitle;
	private String catName;
	private Date reqBuildStart;
	private Date reqBuildEnd;
	private int payPrice;
	private String payType;
	private String userBank;
	private String userAct;
	private String userName;
	private String payCReceipts;
	private String payDate;
	private String payEmail;
	
	public UserPayment() {}

	public UserPayment(String payNo, String bsName, String bsTitle, String catName, Date reqBuildStart,
			Date reqBuildEnd, int payPrice, String payType, String userBank, String userAct, String userName,
			String payCReceipts, String payDate, String payEmail) {
		super();
		this.payNo = payNo;
		this.bsName = bsName;
		this.bsTitle = bsTitle;
		this.catName = catName;
		this.reqBuildStart = reqBuildStart;
		this.reqBuildEnd = reqBuildEnd;
		this.payPrice = payPrice;
		this.payType = payType;
		this.userBank = userBank;
		this.userAct = userAct;
		this.userName = userName;
		this.payCReceipts = payCReceipts;
		this.payDate = payDate;
		this.payEmail = payEmail;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public String getBsTitle() {
		return bsTitle;
	}

	public void setBsTitle(String bsTitle) {
		this.bsTitle = bsTitle;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Date getReqBuildStart() {
		return reqBuildStart;
	}

	public void setReqBuildStart(Date reqBuildStart) {
		this.reqBuildStart = reqBuildStart;
	}

	public Date getReqBuildEnd() {
		return reqBuildEnd;
	}

	public void setReqBuildEnd(Date reqBuildEnd) {
		this.reqBuildEnd = reqBuildEnd;
	}

	public int getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getUserBank() {
		return userBank;
	}

	public void setUserBank(String userBank) {
		this.userBank = userBank;
	}

	public String getUserAct() {
		return userAct;
	}

	public void setUserAct(String userAct) {
		this.userAct = userAct;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPayCReceipts() {
		return payCReceipts;
	}

	public void setPayCReceipts(String payCReceipts) {
		this.payCReceipts = payCReceipts;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayEmail() {
		return payEmail;
	}

	public void setPayEmail(String payEmail) {
		this.payEmail = payEmail;
	}

	@Override
	public String toString() {
		return "UserReqPayment [payNo=" + payNo + ", bsName=" + bsName + ", bsTitle=" + bsTitle + ", catName=" + catName
				+ ", reqBuildStart=" + reqBuildStart + ", reqBuildEnd=" + reqBuildEnd + ", payPrice=" + payPrice
				+ ", payType=" + payType + ", userBank=" + userBank + ", userAct=" + userAct + ", userName=" + userName
				+ ", payCReceipts=" + payCReceipts + ", payDate=" + payDate + ", payEmail=" + payEmail + "]";
	}

}
