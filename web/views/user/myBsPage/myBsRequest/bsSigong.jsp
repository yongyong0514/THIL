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

	
}

header {
	margin: 0 auto;
	width: 1200px;
	height: 328px;
	background: red;
}

.section {
	width: 200px;
	height: 1123px;

}

.article {
	width: 1000px;
	height: 1123px;
	text-align:center;
	background: #EBEFF2;
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
.reqButton2 {
	font-family: "NanumGothic";
	font-weight: normal;
	font-size: 15px;
	margin-right: 10px;
	width: 150px;
	height: 30px;
	background: #F2A71A;
	color: white;
	border: none;
	outline: none;
	cursor: pointer;
}

.reqButton2:hover {
	background: #012E41;
	color: white;
}
</style>
</head>
<body>
	<header>
	<jsp:include page="../../common/menubar.jsp"/> 
	</header>
	<div class="information">
	<jsp:include page="../../common/searchQenq.jsp"/> 
	</div>
		<div class="inner">
			<div class="section">
				<jsp:include page="../../common/bsPagebar.jsp"/> 
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
							<th colspan ="6" align="right" class="listButton">
							<button class="reqButton">수락하기</button>
							<button class="reqButton">취소</button>
							<button class="reqButton2">계약서 업로드</button>
							<button class="reqButton2">시공 정보 입력</button>
							<button class="reqButton">시공 완료</button>
							</th>
						</tr>
					</table>
				</div>
			</div>
		</div>
	<jsp:include page="../../common/footer.jsp" />

</body>
</html>