<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
	font-family: "NanumGothic";
	font-weight: bolder;
	}
	.sidebar{
	width: 200px;
	height: 1123px;
	}
	.sidebutton{
		width:200px;
		height:100px;
		font-size:25px;
		font-weight:bold;
		background:#EBEFF2;
	}

	.sidebutton:hover{
	background: #012E41;
	color: white;
	
	}
	
	#btn_group2 button{ 
	border:0;
	outline:0;
	font-size:20px;
	font-weight:bold;
	color:white;
	border-radius:15px;
	 }
	
	 
	 .logout:hover{
	 	background: #012E41;
		color: white;
	 }
	 
	.logout{
		margin-top:400px;
		margin-left:20px;
		width:150px;
		height:80px;
		background:#BFAE56;
		border-ladius:5px;
	}
</style>
</head>
<body>
	<div class="sidebar">
		<div id="btn_group">
			<button class="sidebutton" onclick="location.href='businessPort.jsp'">나의 시공</button>
			<button class="sidebutton" onclick="location.href='myReview.jsp'">문의 내역</button>
			<button class="sidebutton" onclick="location.href='#'">리뷰 관리</button>
			<button class="sidebutton" onclick="location.href='#'">정보 수정</button>
			<button class="sidebutton" onclick="location.href='#'">사업자</button>
			<button class="sidebutton" onclick="location.href='#'">포트폴리오관리</button>
		</div>
		<div id="btn_group2">
			<button class="logout" onclick="#">로그아웃</button>	
		</div>
	</div>
</body>
</html>