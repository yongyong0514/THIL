package com.kh.thil.user.portfolio.model.vo;

import java.sql.Date;

public class Portfolio {
	
	private String pfno;
	private String bno;
	private String cno;
	private String portAdd;
	private int portPrice;
	private String portNote;
	private String bsName;
	private String catName;
	private Date date;
	private String portStatus;
	
	public Portfolio() {}

	public String getPfno() {
		return pfno;
	}

	public void setPfno(String pfno) {
		this.pfno = pfno;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public int getPortPrice() {
		return portPrice;
	}

	public void setPortPrice(int portPrice) {
		this.portPrice = portPrice;
	}

	public String getPortNote() {
		return portNote;
	}

	public void setPortNote(String portNote) {
		this.portNote = portNote;
	}

	public String getBsName() {
		return bsName;
	}

	public void setBsName(String bsName) {
		this.bsName = bsName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPortStatus() {
		return portStatus;
	}

	public void setPortStatus(String portStatus) {
		this.portStatus = portStatus;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getPortAdd() {
		return portAdd;
	}

	public void setPortAdd(String portAdd) {
		this.portAdd = portAdd;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}


	public Portfolio(String pfno, String bno, String cno, String portAdd, int portPrice, String portNote, String bsName,
			String catName, Date date, String portStatus) {
		super();
		this.pfno = pfno;
		this.bno = bno;
		this.cno = cno;
		this.portAdd = portAdd;
		this.portPrice = portPrice;
		this.portNote = portNote;
		this.bsName = bsName;
		this.catName = catName;
		this.date = date;
		this.portStatus = portStatus;
	}

	@Override
	public String toString() {
		return "Portfolio [pfno=" + pfno + ", bno=" + bno + ", cno=" + cno + ", portAdd=" + portAdd + ", portPrice="
				+ portPrice + ", portNote=" + portNote + ", bsName=" + bsName + ", catName=" + catName + ", date="
				+ date + ", portStatus=" + portStatus + "]";
	}

	


	
	
	
	
	
	
	
}
