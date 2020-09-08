<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
.outer {
	width: 800px;
	height: 500px;
	margin-left: auto;
	margin-right: auto;
	margin-top: 50px;
}

#title {
	background: #012E40;
	color: white;
}

#middletext, #information, #portphoto {
	background: #012E40;
	color: white;
	margin: 10px
}

input {
	height: 20px;
}

.solid {
	border-style: solid;
}

#collum {
	margin-left: 50px;
}

textarea {
	resize: none;
	max-width: 90%;
	margin-left: 40px;
}

#saveman {
	background: #F2784B;
	color: white;
	font-size: 30px;
	text-align: center;
	font-weight: bold;
	padding: 15px;
	margin-top: 20px;
	margin-bottom: 20px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="outer">
		<div id="title">
			<h3 align="center">리뷰 작성</h3>
		</div>
		<form id="reviewBoard" action="#" method="#">
			<div id="mainframe" class="solid">
				<div id=information>
					<h3 align="center">리뷰를 작성하시면 아래의 정보가 함께 표시됩니다.</h3>
				</div>
				<table id=collum>
					<tr>
						<td>닉네임</td>
						<td><input type="text" maxlength="13" size="15" name="userId"
							id="userId" readonly></td>
						<td>&nbsp;&nbsp;상호명</td>
						<td><input type="text" maxlength="13" size="15" name="sangho"
							id="sangho" readonly></td>
						<td>&nbsp;&nbsp;시공 업종</td>
						<td><input type="text" maxlength="13" size="15" name="sigong"
							id="sigong" readonly></td>
					</tr>
					<tr>
						<td>의뢰 주소</td>
						<td><input type="text" maxlength="13" size="15"
							name="gsaddress" id="gsaddress" readonly></td>
						<td>&nbsp;&nbsp;견적가</td>
						<td><input type="text" maxlength="13" size="15" name="gmoney"
							id="gmoney" readonly></td>
						<td>&nbsp;&nbsp;평가 점수</td>
						<td><input type="text" maxlength="13" size="15"
							name="prating" id="prating"></td>
					</tr>
				</table>
				<br> <br>
				<div id="middletext">
					<h3 align="center">게시글 본문</h3>
				</div>
				<br>
					<textarea cols="100" rows="20" name="tx" placeholder="게시글을 입력해주세요"></textarea>
				<br>
				<div id="portphoto">
					<h3 align="center">사진 첨부</h3>
				</div>
				<div id="attchPhto">
				<p>사진을 첨부해주세요</p>
				</div>
				<div id="save">저장</div>
			</div>
		</form>
	</div>

	<script>
		$("#save").click(function() {
			$("#reviewBoard").submit();
		});
	</script>
</body>
</html>