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
	
	#title{
		background:#012E40;
		color:white;
	}
	#middletext, #information, #portphoto{
		background:#012E40;
		color:white;
		margin:10px
	}
	input{
		height:20px;
	}
	.solid {
		border-style: solid;
		color: gray;
		border-radius: 10px;

	}

	#collum{
		margin:auto;
	}
	textarea{
		resize:none;
		max-width: 90%;
		margin-left:40px;
	}
	#saveman{
		background:#F2784B;
		color:white;	
		font-size:30px;
		text-align:center;
		font-weight:bold;
		padding:15px;
		margin-top:20px;
		margin-bottom:20px;
	}
</style>
</head>
<body>
	<div class="outer">
	<form id="reviewBoard"  action="#" method="#">
		<div id="title">
			<h3 align="center">포트폴리오 작성</h3>
		</div>
		<div id="mainframe" class="solid">
			<div id=information> 
				<h3 align="center">포트폴리오 옵션</h3>
			</div>
			<table id=collum>
				<tr>
					<td>상호명</td>
					<td><input type="text" maxlength="13" size="15" name="sangho" id="sangho" readonly></td>
					<td>&nbsp;&nbsp;시공 업종</td>
					<td><input type="text" maxlength="13" size="15" name="sigong" id="sigong" readonly></td>
				</tr>
				<tr>
					<td>의뢰 주소</td>
					<td><input type="text" maxlength="13" size="15" name="gsaddress" id="gsaddress" readonly></td>
					<td>&nbsp;&nbsp;견적가</td>
					<td><input type="text" maxlength="13" size="15" name="gmoney" id="gmoney" ></td>
				</tr>
			</table>
			<br>
			<br>
			<div id = "middletext">
				<h3 align="center">포트폴리오 본문</h3>
			</div>
			<textarea cols="100" rows="20" placeholder="포트폴리오를  300자 이내로 입력해주세요"></textarea>
			<div id= "portphoto">
				<h3 align="center"> 사진 첨부 </h3>
			</div>
			<div>
				<p>뭐 첨부하는 에리어 이거 어케구현하지</p>
			</div>	
			<div id="save">
            	저장
         	</div>
		</div>
	</form>
	</div>
</body>
</html>