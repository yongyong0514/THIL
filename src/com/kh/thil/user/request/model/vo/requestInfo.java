package com.kh.thil.user.request.model.vo;

import java.sql.Date;

public class requestInfo {
	private String rno;//의뢰코드
	private String uno;//회원코드
	private String bno;//사업자코드
	private String cno;//업종코드
	private String pno;//진행코드
	private String payNo;//결제코드
	private String reqName;//의뢰인 이름
	private String reqPhone;//의뢰인연락처
	private String reqAdd;//의뢰주소
	private Date reqDate;//의뢰일
	private String hopeDate;//시공희망일
	private String buildDate;//실제시공일
	private String reqNote;//메모
	private String reqStatus;//의뢰상태
	private int reqPrice;//예상견적가
	private String reqArea;//공간상황
	private String reqElv;//엘레베이터
	private String reqHelp;//요청사항
	private String revNo;//리뷰코드
}
