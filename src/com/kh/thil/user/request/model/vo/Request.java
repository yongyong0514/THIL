package com.kh.thil.user.request.model.vo;

import java.sql.Date;

public class Request implements java.io.Serializable{
	private String rno;//�Ƿ��ڵ�
	private String optNo;//�ɼ��ڵ�
	private int optEaNum;//
	private String optEaVar;
	private String part;
	private String broom;
	private String room;
	private int size;
	private String wall;
	private String ceil;
	private String molding;
	private String balco;
	private String reqName;
	private String reqPhone;
	private String reqAdd;
	private Date reqDate;//�Ƿ���
	private String hopeDate;//�ð������
	private String buildDate;//�����ð���
	private String reqNote;//�޸�
	private String reqStatus;//�Ƿڻ���
	private int reqPrice;//���������
	private String reqArea;//������Ȳ
	private String reqElv;//����������
	private String reqHelp;//��û����
	private String uno;//ȸ���ڵ�
	private String bno;//������ڵ�
	private String cno;//�����ڵ�
	private String pno;//�����ڵ�
	private String payNo;//�����ڵ�

	
	public Request() {}

	public Request(String rno, String optNo, int optEaNum, String optEaVar, String part, String broom, String room,
			int size, String wall, String ceil, String molding, String balco) {
		super();
		this.rno = rno;
		this.optNo = optNo;
		this.optEaNum = optEaNum;
		this.optEaVar = optEaVar;
		this.part = part;
		this.broom = broom;
		this.room = room;
		this.size = size;
		this.wall = wall;
		this.ceil = ceil;
		this.molding = molding;
		this.balco = balco;
	}

	public Request(String rno, String optNo, int optEaNum, String optEaVar, String part, String broom, String room,
			int size, String wall, String ceil, String molding, String balco, String reqName, String reqPhone,
			String reqAdd, Date reqDate, String hopeDate, String buildDate, String reqNote, String reqStatus,
			int reqPrice, String reqArea, String reqElv, String reqHelp, String uno, String bno, String cno, String pno,
			String payNo) {
		super();
		this.rno = rno;
		this.optNo = optNo;
		this.optEaNum = optEaNum;
		this.optEaVar = optEaVar;
		this.part = part;
		this.broom = broom;
		this.room = room;
		this.size = size;
		this.wall = wall;
		this.ceil = ceil;
		this.molding = molding;
		this.balco = balco;
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
		this.uno = uno;
		this.bno = bno;
		this.cno = cno;
		this.pno = pno;
		this.payNo = payNo;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getOptNo() {
		return optNo;
	}

	public void setOptNo(String optNo) {
		this.optNo = optNo;
	}

	public int getOptEaNum() {
		return optEaNum;
	}

	public void setOptEaNum(int optEaNum) {
		this.optEaNum = optEaNum;
	}

	public String getOptEaVar() {
		return optEaVar;
	}

	public void setOptEaVar(String optEaVar) {
		this.optEaVar = optEaVar;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getBroom() {
		return broom;
	}

	public void setBroom(String broom) {
		this.broom = broom;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getCeil() {
		return ceil;
	}

	public void setCeil(String ceil) {
		this.ceil = ceil;
	}

	public String getMolding() {
		return molding;
	}

	public void setMolding(String molding) {
		this.molding = molding;
	}

	public String getBalco() {
		return balco;
	}

	public void setBalco(String balco) {
		this.balco = balco;
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

	@Override
	public String toString() {
		return "Request [rno=" + rno + ", optNo=" + optNo + ", optEaNum=" + optEaNum + ", optEaVar=" + optEaVar
				+ ", part=" + part + ", broom=" + broom + ", room=" + room + ", size=" + size + ", wall=" + wall
				+ ", ceil=" + ceil + ", molding=" + molding + ", balco=" + balco + ", reqName=" + reqName
				+ ", reqPhone=" + reqPhone + ", reqAdd=" + reqAdd + ", reqDate=" + reqDate + ", hopeDate=" + hopeDate
				+ ", buildDate=" + buildDate + ", reqNote=" + reqNote + ", reqStatus=" + reqStatus + ", reqPrice="
				+ reqPrice + ", reqArea=" + reqArea + ", reqElv=" + reqElv + ", reqHelp=" + reqHelp + ", uno=" + uno
				+ ", bno=" + bno + ", cno=" + cno + ", pno=" + pno + ", payNo=" + payNo + "]";
	}
}
