package com.kh.thil.user.portfolio.model.vo;

import java.sql.Date;

public class Files {
	
	private String fno;
	private String filetype;
	private String originName;
	private String changeName;
	private String fileRoute;
	private Date date;
	private String fileLevel;
	private String fileStatus;
	
	public Files() {}
	public String getFno() {
		return fno;
	}
	public void setFno(String fno) {
		this.fno = fno;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getFileRoute() {
		return fileRoute;
	}
	public void setFileRoute(String fileRoute) {
		this.fileRoute = fileRoute;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFileLevel() {
		return fileLevel;
	}
	public void setFileLevel(String fileLevel) {
		this.fileLevel = fileLevel;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public Files(String fno, String filetype, String originName, String changeName, String fileRoute, Date date,
			String fileLevel, String fileStatus) {
		super();
		this.fno = fno;
		this.filetype = filetype;
		this.originName = originName;
		this.changeName = changeName;
		this.fileRoute = fileRoute;
		this.date = date;
		this.fileLevel = fileLevel;
		this.fileStatus = fileStatus;
	}
	@Override
	public String toString() {
		return "File [fno=" + fno + ", filetype=" + filetype + ", originName=" + originName + ", changeName="
				+ changeName + ", fileRoute=" + fileRoute + ", date=" + date + ", fileLevel=" + fileLevel
				+ ", fileStatus=" + fileStatus + "]";
	}
	
	
}
