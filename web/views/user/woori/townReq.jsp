<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${ pageContext.request.contextPath }" scope="application"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer {
		width:1000px;
		height:1200px;
		background:lightgray;
		font-weight:bold; 
      	margin-left:auto;
     	margin-right:auto;
      	margin-top:50px;
	}
	.bsNav {
		width:950px;
		height:1100px;
		background:white;
		margin:0 auto;
	}
	.title {
		width:950px;
		height:50px;
		background:#012E40;
      	color:white;
      	text-align:center;
		float:left;
	}

	.bsinfoarea {
		width:900px;
		hegith:290px;
		margin:0 auto;
		overflow:hidden;
	}
	.bsPhoto, #bsphoto {
		width:450px;
		hegith:290px;
		float:left;
	}
	#bsphoto {
		width:400px;
		hegith:290px;
	}
	.bsinfo {
		width:450px;
		height:290px;
		padding-top:auto;
		float:left;
		position: relative;
		bottom:30px;
	}
	#reqbtn {
		width:350px;
		height:60px;
		font-size:20px;
		background:orangered;
		color:white;
		border-radius: 5px;
		border: 2px solid orangered;
	}
	.bsinfo-Note {
		width:900px;
		height:200px;
	}
	.bsinfo-port {
		width:900px;
		height:200px;
	}
	.user-rivew {
		width:900px;
		height:200px;
	}
</style>
</head>
<body>
	<div class="outer">
		<div class="title" >
			<h3>도배 의뢰</h3>
		</div>
		<input type="button" id="close">
		
		<div class="bsNav">
		<form class="bsinfoarea">
		<div class="bsPhoto">
			<img src="<%=request.getContextPath()%>/resources/images/pic.PNG" id="bsphoto">
		</div>
		<div class="bsinfo">
			<p style="color:orangered; font-size:30px;">도배의 용기</p>
			<p>
				<span>경력</span>
				<span>A/S</span>
				<span>별점/평점</span>
			</p>
			<p>
				<span>대표 : </span><span>국윤기</span>
			</p>
			<p>
				<span>전화 : </span><span>010-1111-2345</span>
			</p>
			<p>
				<span>주소 : </span><span>서울시 동작구 사당동 1007-20</span>
			</p>
			<input type=button id="reqbtn" name="의뢰하기" value="의뢰 하기">
		</div>
		</form>
		<h3>홈 리모델링 전문가 소개</h3>
		<div class="bsinfo-Note">
			
			<p>
				<span>고객을 먼저 생각하는 디자인 회사로 고객 특성에 맞는 인테리어를 세심한 시공품질로 제공합니다.
          			    공간들이 더욱 아름답고 가치있도록 실용성이 녹아든 공간을 디자인합니다.</span>
			</p>
		</div>
		<h3>포트폴리오</h3>
		<div class="bsinfo-port">
			
		</div>
		<h3>고객 리뷰</h3>
		<div class="user-rivew">
			
			<div class="user-rivew-note"></div>
		</div>
		</div>
	</div>
</body>
</html>