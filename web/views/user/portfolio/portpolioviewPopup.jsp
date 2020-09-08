<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
	  width:800px;
      height:500px;
      margin-left:auto;
      margin-right:auto;
      margin-top:50px;
	}
	.title{
		background:#EBEFF2;
		color:012E41;
	}
	.portPhoto{
		
	
	}
	.portArea{
		border-style:solid;
		border-color: gray;
		border-width:10px;
	
	}
	.bold{
		font-weight:bold;
	}

</style>
</head>
<body>
	<div class="outer">
		
		<div class="title">
			<h3 align="center">닉네임님의 리뷰</h3>
		</div>
		<div class="portPhoto">
			<img src="../../resources/image/river1.PNG">
			파일첨부에어리어
			<!-- 카로우셀 쓸수도있음. -->
		</div>
		<div class="portArea">
			<p>닉네임님 x <span style="color:orange; font-weight:bold">윤창이의황금망치</span></p>
			<p class="bold">경기도 남양주시</p>
			<p class="bold">창호 시공</p>
			<p class="bold">1,000만원</p>
			<p>무더운 날씨에도 늘 현장에서 맡은 분야에 자부심을 느끼며 일해주시는 기술자님들께 다시한번 감사의 말씀무더운 날씨에도 늘 현장에서 맡은 분야에 자부심을 느끼며 일해주시는 기술자님들께 다시한번 감사의 말씀</p>
		</div>
	</div>
</body>
</html>