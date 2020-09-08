package com.kh.thil.pay.model.vo;

import java.sql.Date;

public class Pay {
	private String payno;
	private String rno;
	private String uno;
	private String bno;
	private int payPrice;
	private int payFee;
	private String payType;
	private Date payDate;
	private String payStatus;
	private String paySend;
	
	public Pay() {}

	public Pay(String payno, String rno, String uno, String bno, int payPrice, int payFee, String payType, Date payDate,
			String payStatus, String paySend) {
		super();
		this.payno = payno;
		this.rno = rno;
		this.uno = uno;
		this.bno = bno;
		this.payPrice = payPrice;
		this.payFee = payFee;
		this.payType = payType;
		this.payDate = payDate;
		this.payStatus = payStatus;
		this.paySend = paySend;
	}

	public String getPayno() {
		return payno;
	}

	public void setPayno(String payno) {
		this.payno = payno;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
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

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPaySend() {
		return paySend;
	}

	public void setPaySend(String paySend) {
		this.paySend = paySend;
	}

	@Override
	public String toString() {
		return "Pay [payno=" + payno + ", rno=" + rno + ", uno=" + uno + ", bno=" + bno + ", payPrice=" + payPrice
				+ ", payFee=" + payFee + ", payType=" + payType + ", payDate=" + payDate + ", payStatus=" + payStatus
				+ ", paySend=" + paySend + "]";
	}

}
