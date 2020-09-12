package com.kh.thil.user.myPage.myRequest.model.vo;

import java.sql.Date;

public class UserRequestDetail {
	//고객&결제 정보
	private String userId;
	private String userName;
	private String userPhone;
	
	private int payPrice;
	private int payFee;
	private String payType;
	private Date payDate;
	
	//사업자 정보
	private String bsNum;
	private String bsTitle;
	private String catName;
	private String bsName;
	private String bsPhone;
	private String bsAdd;
	private String bsBank;
	private String bsAct;
	
	//의뢰 정보
	private String reqHope;
	private int reqPrice;
	private String reqAdd;
	private String reqName;
	private String reqPhone;
	private String reqPhoto;
	private String reqArea;
	private String reqElv;
	private String reqHelp;
	
	//메모
	private String reqNote;
	
	//시공 시작일 시공 종료일 = reqHope 에서 분리해서 값 지정
	private String reqDateStart;
	private String reqDateEnd;
	
	//계약서?
	private String reqFile;
	
	//진행상황
	private String proName;
	
	public UserRequestDetail() {}

	public UserRequestDetail(String userId, String userName, String userPhone, int payPrice, int payFee, String payType,
			Date payDate, String bsNum, String bsTitle, String catName, String bsName, String bsPhone, String bsAdd,
			String bsBank, String bsAct, String reqHope, int reqPrice, String reqAdd, String reqName, String reqPhone,
			String reqPhoto, String reqArea, String reqElv, String reqHelp, String reqNote, String reqDateStart,
			String reqDateEnd, String reqFile, String proName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.payPrice = payPrice;
		this.payFee = payFee;
		this.payType = payType;
		this.payDate = payDate;
		this.bsNum = bsNum;
		this.bsTitle = bsTitle;
		this.catName = catName;
		this.bsName = bsName;
		this.bsPhone = bsPhone;
		this.bsAdd = bsAdd;
		this.bsBank = bsBank;
		this.bsAct = bsAct;
		this.reqHope = reqHope;
		this.reqPrice = reqPrice;
		this.reqAdd = reqAdd;
		this.reqName = reqName;
		this.reqPhone = reqPhone;
		this.reqPhoto = reqPhoto;
		this.reqArea = reqArea;
		this.reqElv = reqElv;
		this.reqHelp = reqHelp;
		this.reqNote = reqNote;
		this.reqDateStart = reqDateStart;
		this.reqDateEnd = reqDateEnd;
		this.reqFile = reqFile;
		this.proName = proName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}

	public int getPayFee() {
		return payFee;
	}

	public void setPayFee(int payFee) {
		this.payFee = payFee;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getBsNum() {
		return bsNum;
	}

	public void setBsNum(String bsNum) {
		this.bsNum = bsNum;
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

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public String getBsPhone() {
		return bsPhone;
	}

	public void setBsPhone(String bsPhone) {
		this.bsPhone = bsPhone;
	}

	public String getBsAdd() {
		return bsAdd;
	}

	public void setBsAdd(String bsAdd) {
		this.bsAdd = bsAdd;
	}

	public String getBsBank() {
		return bsBank;
	}

	public void setBsBank(String bsBank) {
		this.bsBank = bsBank;
	}

	public String getBsAct() {
		return bsAct;
	}

	public void setBsAct(String bsAct) {
		this.bsAct = bsAct;
	}

	public String getReqHope() {
		return reqHope;
	}

	public void setReqHope(String reqHope) {
		this.reqHope = reqHope;
	}

	public int getReqPrice() {
		return reqPrice;
	}

	public void setReqPrice(int reqPrice) {
		this.reqPrice = reqPrice;
	}

	public String getReqAdd() {
		return reqAdd;
	}

	public void setReqAdd(String reqAdd) {
		this.reqAdd = reqAdd;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public String getReqPhone() {
		return reqPhone;
	}

	public void setReqPhone(String reqPhone) {
		this.reqPhone = reqPhone;
	}

	public String getReqPhoto() {
		return reqPhoto;
	}

	public void setReqPhoto(String reqPhoto) {
		this.reqPhoto = reqPhoto;
	}

	public String getReqArea() {
		return reqArea;
	}

	public void setReqArea(String reqArea) {
		this.reqArea = reqArea;
	}

	public String getReqElv() {
		return reqElv;
	}

	public void setReqElv(String reqElv) {
		this.reqElv = reqElv;
	}

	public String getReqHelp() {
		return reqHelp;
	}

	public void setReqHelp(String reqHelp) {
		this.reqHelp = reqHelp;
	}

	public String getReqNote() {
		return reqNote;
	}

	public void setReqNote(String reqNote) {
		this.reqNote = reqNote;
	}

	public String getReqDateStart() {
		return reqDateStart;
	}

	public void setReqDateStart(String reqDateStart) {
		this.reqDateStart = reqDateStart;
	}

	public String getReqDateEnd() {
		return reqDateEnd;
	}

	public void setReqDateEnd(String reqDateEnd) {
		this.reqDateEnd = reqDateEnd;
	}

	public String getReqFile() {
		return reqFile;
	}

	public void setReqFile(String reqFile) {
		this.reqFile = reqFile;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	@Override
	public String toString() {
		return "UserRequestDetail [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", payPrice=" + payPrice + ", payFee=" + payFee + ", payType=" + payType + ", payDate=" + payDate
				+ ", bsNum=" + bsNum + ", bsTitle=" + bsTitle + ", catName=" + catName + ", bsName=" + bsName
				+ ", bsPhone=" + bsPhone + ", bsAdd=" + bsAdd + ", bsBank=" + bsBank + ", bsAct=" + bsAct + ", reqHope="
				+ reqHope + ", reqPrice=" + reqPrice + ", reqAdd=" + reqAdd + ", reqName=" + reqName + ", reqPhone="
				+ reqPhone + ", reqPhoto=" + reqPhoto + ", reqArea=" + reqArea + ", reqElv=" + reqElv + ", reqHelp="
				+ reqHelp + ", reqNote=" + reqNote + ", reqDateStart=" + reqDateStart + ", reqDateEnd=" + reqDateEnd
				+ ", reqFile=" + reqFile + ", proName=" + proName + "]";
	}

}
