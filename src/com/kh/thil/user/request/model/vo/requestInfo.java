package com.kh.thil.user.request.model.vo;

import java.sql.Date;

public class requestInfo {
	private String rno;//�Ƿ��ڵ�
	private String uno;//ȸ���ڵ�
	private String bno;//������ڵ�
	private String cno;//�����ڵ�
	private String pno;//�����ڵ�
	private String payNo;//�����ڵ�
	private String reqName;//�Ƿ��� �̸�
	private String reqPhone;//�Ƿ��ο���ó
	private String reqAdd;//�Ƿ��ּ�
	private Date reqDate;//�Ƿ���
	private String hopeDate;//�ð������
	private String buildDate;//�����ð���
	private String reqNote;//�޸�
	private String reqStatus;//�Ƿڻ���
	private int reqPrice;//���������
	private String reqArea;//������Ȳ
	private String reqElv;//����������
	private String reqHelp;//��û����
	private String revNo;//�����ڵ�
	
	public requestInfo() {}

	public requestInfo(String rno, String uno, String bno, String cno, String pno, String payNo, String reqName,
			String reqPhone, String reqAdd, Date reqDate, String hopeDate, String buildDate, String reqNote,
			String reqStatus, int reqPrice, String reqArea, String reqElv, String reqHelp, String revNo) {
		super();
		this.rno = rno;
		this.uno = uno;
		this.bno = bno;
		this.cno = cno;
		this.pno = pno;
		this.payNo = payNo;
		this.reqName = reqName;
		this.reqPhone = reqPhone;
		this.reqAdd = reqAdd;
		this.reqDate = reqDate;
		this.hopeDate = hopeDate;
		this.buildDate = buildDate;
		this.reqNote = reqNote;
		this.reqStatus = reqStatus;
		this.reqPrice = reqPrice;
		this.reqArea = reqArea;
		this.reqElv = reqElv;
		this.reqHelp = reqHelp;
		this.revNo = revNo;
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

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
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

	public String getReqAdd() {
		return reqAdd;
	}

	public void setReqAdd(String reqAdd) {
		this.reqAdd = reqAdd;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public String getHopeDate() {
		return hopeDate;
	}

	public void setHopeDate(String hopeDate) {
		this.hopeDate = hopeDate;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getReqNote() {
		return reqNote;
	}

	public void setReqNote(String reqNote) {
		this.reqNote = reqNote;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public int getReqPrice() {
		return reqPrice;
	}

	public void setReqPrice(int reqPrice) {
		this.reqPrice = reqPrice;
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

	public String getRevNo() {
		return revNo;
	}

	public void setRevNo(String revNo) {
		this.revNo = revNo;
	}

	@Override
	public String toString() {
		return "requestInfo [rno=" + rno + ", uno=" + uno + ", bno=" + bno + ", cno=" + cno + ", pno=" + pno
				+ ", payNo=" + payNo + ", reqName=" + reqName + ", reqPhone=" + reqPhone + ", reqAdd=" + reqAdd
				+ ", reqDate=" + reqDate + ", hopeDate=" + hopeDate + ", buildDate=" + buildDate + ", reqNote="
				+ reqNote + ", reqStatus=" + reqStatus + ", reqPrice=" + reqPrice + ", reqArea=" + reqArea + ", reqElv="
				+ reqElv + ", reqHelp=" + reqHelp + ", revNo=" + revNo + "]";
	}
	
	
}
