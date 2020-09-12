<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
	#save{
		background:#F2784B;
		color:white;	
		font-size:30px;
		text-align:center;
		font-weight:bold;
		padding:15px;
		margin-top:20px;
		margin-bottom:20px;
	}
	#imgfield{
		margin:auto;
	}

</style>
</head>
<body>
	<div class="outer">
	<form id="reviewBoard" action="#" method="#" encType="multipart/form-data">
		<div id="title">
			<h3 align="center">포트폴리오 작성</h3>
		</div>
		<div id="mainframe" class="solid">
			<div id=information> 
				<h3 align="center">포트폴리오 옵션</h3>
			</div>
			<table id="collum">
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
			<textarea name="porttext" cols="100" rows="20" placeholder="포트폴리오를  150자 이내로 입력해주세요"></textarea>
			<div id= "portphoto">
				<h3 align="center"> 사진 첨부 </h3>
			</div>
			<table id="imgfield">
				<tr>
						<td>
							<div id="contentImgArea1">
								<img id="contentImg1" width="150" height="110">
							</div>
						</td>
						<td>
							<div id="contentImgArea2">
								<img id="contentImg2" width="150" height="110">
							</div>
						</td>
						<td>
							<div id="contentImgArea3">
								<img id="contentImg3" width="150" height="110">
							</div>
						</td>
						<td>
							<div id="contentImgArea4">
								<img id="contentImg3" width="150" height="110">
							</div>
						</td>
			
			</tr>
			</table>
			<div id="fileArea">
				<input type="file" id="thumbnailImg1" name ="thumbnailImg1" onchange="loadImg(this, 1)">;
				<input type="file" id="thumbnailImg2" name ="thumbnailImg2" onchange="loadImg(this, 2)">;
				<input type="file" id="thumbnailImg3" name ="thumbnailImg3" onchange="loadImg(this, 3)">;
				<input type="file" id="thumbnailImg3" name ="thumbnailImg4" onchange="loadImg(this, 4)">;
			</div>	
			<div id="save">
            	저장
         	</div>
		</div>
	</form>
	</div>
	<script>
	
	$(function(){
		$("#fileArea").hide();
		
		$("#contentImgArea1").click(function(){
			$("#thumbnailImg1").click();
		});
		$("#contentImgArea2").click(function(){
			$("#thumbnailImg2").click();
		});
		$("#contentImgArea3").click(function(){
			$("#thumbnailImg3").click();
		});
		$("#contentImgArea4").click(function(){
			$("#thumbnailImg4").click();
		});
	})
	
	function loadImg(value, num){
		if(value.files && value.files[0]){
			var reader = new FileReader();
			
			reader.onload = function(e) {
				switch(num){
				case 1 : $("#contentImg1").attr("src", e.target.result); break;
				case 2 : $("#contentImg2").attr("src", e.target.result); break;
				case 3 : $("#contentImg3").attr("src", e.target.result); break;
				case 4 : $("#contentImg4").attr("src", e.target.result); break;
				}
			}
			reader.readAsDataURL(value.files[0])
		}
	}</script>
</body>
</html>