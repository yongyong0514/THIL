package com.kh.thil.user.woori.model.vo;

public class Town implements java.io.Serializable{
	private String bno;
	private String bsTitle;
	private String bsAdd;
	private String catName;
	private String pPrice;
	private String pNote;
	private String PStatus;
	
	public Town() {}

	public Town(String bno, String bsTitle, String bsAdd, String catName, String pPrice, String pNote, String pStatus) {
		super();
		this.bno = bno;
		this.bsTitle = bsTitle;
		this.bsAdd = bsAdd;
		this.catName = catName;
		this.pPrice = pPrice;
		this.pNote = pNote;
		PStatus = pStatus;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getBsTitle() {
		return bsTitle;
	}

	public void setBsTitle(String bsTitle) {
		this.bsTitle = bsTitle;
	}

	public String getBsAdd() {
		return bsAdd;
	}

	public void setBsAdd(String bsAdd) {
		this.bsAdd = bsAdd;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpNote() {
		return pNote;
	}

	public void setpNote(String pNote) {
		this.pNote = pNote;
	}

	public String getPStatus() {
		return PStatus;
	}

	public void setPStatus(String pStatus) {
		PStatus = pStatus;
	}

	@Override
	public String toString() {
		return "Town [bno=" + bno + ", bsTitle=" + bsTitle + ", bsAdd=" + bsAdd + ", catName=" + catName + ", pPrice="
				+ pPrice + ", pNote=" + pNote + ", PStatus=" + PStatus + "]";
	}
	
	
}