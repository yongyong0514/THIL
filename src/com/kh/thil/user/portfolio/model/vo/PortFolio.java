package com.kh.thil.user.portfolio.model.vo;

import java.sql.Date;

public class PortFolio {
	
	private String pfno;
	private String bno;
	private int portPrice;
	private String portNote;
	private Date date;
	private String portStatus;
	
	
	public PortFolio(String pfno, String bno, int portPrice, String portNote, Date date, String portStatus) {
		super();
		this.pfno = pfno;
		this.bno = bno;
		this.portPrice = portPrice;
		this.portNote = portNote;
		this.date = date;
		this.portStatus = portStatus;
	}


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


	@Override
	public String toString() {
		return "PortFolio [pfno=" + pfno + ", bno=" + bno + ", portPrice=" + portPrice + ", portNote=" + portNote
				+ ", date=" + date + ", portStatus=" + portStatus + "]";
	}
	
	
	
	
}
