<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.inner {
	display: flex;
	margin:auto;
	}
	.userInfo{
		width:1200px;
		height:200px;
	}
	.bsInfo{
		width:200px;
		height:200px;
	}
	#member{
		float:left;
		width:140px;
		height:135px;
		margin-left:50px;
		margin-top:30px;
		
	}
	#nameSt{
		font-size:35px;
		font-weight:bold;
	
	}
	.badak{
	width:1200px;
	height:25px;
	margin:auto;
	background:#012E41;
	}
	
</style>
</head>
<body>
	<div class="inner">
	<div class="userInfo">
		<p>
		<img id="member" src="../../resources/image/member.png"/>
		</p>
		<br>
		<br>
		<label>&nbsp;&nbsp;&nbsp;<span id="nameSt">김진호 님</span></label>
		<br>
		<br>
		<label>&nbsp;&nbsp;&nbsp;programmer7771@gmail.com </label> <!--이부분에 로그인 이메일정보 들어감  -->
	</div>
	</div>
	<div class="badak"></div>
</body>
</html>