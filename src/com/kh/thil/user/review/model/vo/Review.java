package com.kh.thil.user.review.model.vo;

import java.sql.Date;

public class Review {
	
	private String revno;
	private String rno;
	private String revNote;
	private Date revDate;
	private int revPoint;
	private String revStatus;
	private String nickName;
	private String bsTitle;
	private String catName;
	private String reqAdd;
	private String payPrice;
	
	public Review () {}

	public String getRevno() {
		return revno;
	}

	public void setRevno(String revno) {
		this.revno = revno;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getRevNote() {
		return revNote;
	}

	public void setRevNote(String revNote) {
		this.revNote = revNote;
	}

	public Date getRevDate() {
		return revDate;
	}

	public void setRevDate(Date revDate) {
		this.revDate = revDate;
	}

	public int getRevPoint() {
		return revPoint;
	}

	public void setRevPoint(int revPoint) {
		this.revPoint = revPoint;
	}

	public String getRevStatus() {
		return revStatus;
	}

	public void setRevStatus(String revStatus) {
		this.revStatus = revStatus;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	public String getReqAdd() {
		return reqAdd;
	}

	public void setReqAdd(String reqAdd) {
		this.reqAdd = reqAdd;
	}

	public String getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

	public Review(String revno, String rno, String revNote, Date revDate, int revPoint, String revStatus,
			String nickName, String bsTitle, String catName, String reqAdd, String payPrice) {
		super();
		this.revno = revno;
		this.rno = rno;
		this.revNote = revNote;
		this.revDate = revDate;
		this.revPoint = revPoint;
		this.revStatus = revStatus;
		this.nickName = nickName;
		this.bsTitle = bsTitle;
		this.catName = catName;
		this.reqAdd = reqAdd;
		this.payPrice = payPrice;
	}

	@Override
	public String toString() {
		return "Review [revno=" + revno + ", rno=" + rno + ", revNote=" + revNote + ", revDate=" + revDate
				+ ", revPoint=" + revPoint + ", revStatus=" + revStatus + ", nickName=" + nickName + ", bsTitle="
				+ bsTitle + ", catName=" + catName + ", reqAdd=" + reqAdd + ", payPrice=" + payPrice + "]";
	}
	
	

}
