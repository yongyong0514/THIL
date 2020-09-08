<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

.inner {
	display: flex;
	justify-content: center;
	text-align: center;
}

.article {
	width: 1000px;
	height: 1123px;
	background-color: #EBEFF2;
}

.title {
	height: 100px;
	font-size: 30px;
	font-weight: bolder;
}

.val {
	font-size: 18px;
	width: 150px;
	height: 40px;
	background: #012E41;
	color: white;
	border-radius: 5px;
}

.listResult {
	height: 40px;
	background: white;
}

.listButton {
	height: 40px;
	background: white;
}

.reqButton {
	font-family: "NanumGothic";
	font-weight: normal;
	font-size: 15px;
	margin-right: 10px;
	width: 80px;
	height: 30px;
	background: #F2A71A;
	color: white;
	border: none;
	outline: none;
	cursor: pointer;
}

.reqButton:hover {
	background: #012E41;
	color: white;
}

body {
	font-family: "NanumGothic";
	font-weight: bolder;
}

.sidebar {
	width: 200px;
	height: 1123px;
}

.sidebutton {
	width: 200px;
	height: 100px;
	font-size: 25px;
	font-weight: bold;
	background: #EBEFF2;
}

.sidebutton:hover {
	background: #012E41;
	color: white;
}

#btn_group2 button {
	border: 0;
	outline: 0;
	font-size: 20px;
	font-weight: bold;
	color: white;
	border-radius: 15px;
}

.bsChange:hover, .logout:hover {
	background: #012E41;
	color: white;
}

.bsChange {
	margin-top: 400px;
	margin-left: 20px;
	width: 150px;
	height: 80px;
	background: #F2774B;
}

.logout {
	margin-top: 50px;
	margin-left: 20px;
	width: 150px;
	height: 80px;
	background: #BFAE56;
	border-radius: 5px;
}
</style>
</head>
<body>
		<jsp:include page="../../common/menubar.jsp"/>
		<jsp:include page="../../common/searchQenq.jsp"/>
		<jsp:include page="../../common/mypagebar1.jsp"/>
	<div class="outer">
		<div class="inner">
			<div class="section">
				<div class="sidebar">
					<div id="btn_group">
						<button class="sidebutton"
							onclick="location.href='businessPort.jsp'">나의 시공</button>
						<button class="sidebutton" onclick="location.href='#'">문의
							내역</button>
						<button class="sidebutton" onclick="location.href='#'">리뷰
							관리</button>
						<button class="sidebutton" onclick="location.href='#'">정보
							수정</button>
					</div>

					<div id="btn_group2">
						<button class="bsChange" onclick="location.href='#'">사업자
							전환</button>
						<button class="logout">로그아웃</button>
					</div>
				</div>
			</div>
			<div class="article">
				<div class="table-area">
					<table align="center">
						<tr>
							<th colspan="6" align="center" class="title">나의 의뢰</th>
						</tr>
						<tr class="listName">
							<th class="val">의뢰번호</th>
							<th class="val">의뢰일</th>
							<th class="val">의뢰업종</th>
							<th class="val">상호명</th>
							<th class="val">견적가</th>
							<th class="val">의뢰현황</th>
						</tr>
						<tr class="listResult">
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
						</tr>
						<tr>
							<th colspan="6" align="right" class="listButton"><button
									class="reqButton">결제하기</button>
								<button class="reqButton">구매결정</button>
								<button class="reqButton">리뷰작성</button></th>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div class="foot">
		<jsp:include page="../../common/footer1.jsp" />
	</div>
	</div>
</body>
</html>