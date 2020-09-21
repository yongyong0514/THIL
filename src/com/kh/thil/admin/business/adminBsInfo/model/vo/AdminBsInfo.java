package com.kh.thil.admin.business.adminBsInfo.model.vo;

import java.sql.Date;

public class AdminBsInfo {
	private String uno;
	private String userId;
	private String userNick;
	private String userName;
	private String userPhone;
	private Date userDate;
	
	private String bno;
	private String bsNum;
	private String bsTitle;
	private String bsYear;
	private String bsAs;
	private int bsDepo;
	private String bsCorp;
	private String bsName;
	private String bsPhone;
	private String bsAdd;
	private String bsBank;
	private String bsAct;
	private String bsMember;
	
	private String catName;
	
	public AdminBsInfo() {}

	public AdminBsInfo(String uno, String userId, String userNick, String userName, String userPhone, Date userDate,
			String bno, String bsNum, String bsTitle, String bsYear, String bsAs, int bsDepo, String bsCorp,
			String bsName, String bsPhone, String bsAdd, String bsBank, String bsAct, String bsMember, String catName) {
		super();
		this.uno = uno;
		this.userId = userId;
		this.userNick = userNick;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userDate = userDate;
		this.bno = bno;
		this.bsNum = bsNum;
		this.bsTitle = bsTitle;
		this.bsYear = bsYear;
		this.bsAs = bsAs;
		this.bsDepo = bsDepo;
		this.bsCorp = bsCorp;
		this.bsName = bsName;
		this.bsPhone = bsPhone;
		this.bsAdd = bsAdd;
		this.bsBank = bsBank;
		this.bsAct = bsAct;
		this.bsMember = bsMember;
		this.catName = catName;
	}

	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
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

	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
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

	public String getBsYear() {
		return bsYear;
	}

	public void setBsYear(String bsYear) {
		this.bsYear = bsYear;
	}

	public String getBsAs() {
		return bsAs;
	}

	public void setBsAs(String bsAs) {
		this.bsAs = bsAs;
	}

	public int getBsDepo() {
		return bsDepo;
	}

	public void setBsDepo(int bsDepo) {
		this.bsDepo = bsDepo;
	}

	public String getBsCorp() {
		return bsCorp;
	}

	public void setBsCorp(String bsCorp) {
		this.bsCorp = bsCorp;
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

	public String getBsMember() {
		return bsMember;
	}

	public void setBsMember(String bsMember) {
		this.bsMember = bsMember;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "AdminBsInfo [uno=" + uno + ", userId=" + userId + ", userNick=" + userNick + ", userName=" + userName
				+ ", userPhone=" + userPhone + ", userDate=" + userDate + ", bno=" + bno + ", bsNum=" + bsNum
				+ ", bsTitle=" + bsTitle + ", bsYear=" + bsYear + ", bsAs=" + bsAs + ", bsDepo=" + bsDepo + ", bsCorp="
				+ bsCorp + ", bsName=" + bsName + ", bsPhone=" + bsPhone + ", bsAdd=" + bsAdd + ", bsBank=" + bsBank
				+ ", bsAct=" + bsAct + ", bsMember=" + bsMember + ", catName=" + catName + "]";
	}
	
}
