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

	
}
