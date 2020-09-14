<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/views/admin/adcommon/adminMenuBar.jsp"></c:import>
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

.section {
	width: 1290px;
	height: 870px;
	position: absolute;
	margin-left: 155px;
	margin-top: 75px;
	float: left;
	border: none;
}

.dash {
	width: 1290px;
	height: 150px;
}

.dashBoard {
	width: 1290px;
	height: 80px;
	font-size: 32px;
}

.boardArea {
	width: 1290px;
	height: 700px;
}

.boardList1 {
	width: 1290px;
	height: 350px;
}

.boardList2 {
	width: 1290px;
	height: 350px;
}

.table1 {
	float: left;
	width: 645px;
	height: 350px;
	background: red;
}

.table2 {
	float: left;
	width: 645px;
	height: 350px;
	background: yellow;
}

.table3 {
	float: left;
	width: 645px;
	height: 350px;
	background: blue;
}

.table4 {
	float: left;
	width: 645px;
	height: 350px;
	background: grey;
}

.refreshBtn {
	width: 120px;
	height: 30px;
	background: #012E41;
	color: white;
	font-weight: bolder;
	font-size: 15px;
	border: none;
	outline: none;
	cursor: pointer;
}

.refreshBtn:hover {
	background: #F2784B;
	color: white;
	outline: none;

</style>
</head>
<body>
	<div class="section">
		<div class="dash">
			<table>
				<tr class="dashBoard">
					<th><label>&nbsp;&nbsp;&nbsp;&nbsp;DashBoard</label></th>
				</tr>
				<tr>
					<th><button class="refreshBtn">새로고침</button></th>
				</tr>
			</table>
		</div>
		<div class="boardArea">
			<div class="boardList1">
				<div class="table1">
					<table>
						<tr>
							<td colspan="4">
								<label class="tableLabel">의뢰완료 송금 관리</label>
								<button class="tableBtn" >바로가기</button>
							</td>
						</tr>
						<tr>
							<td>의뢰코드</td>
							<td>진행단계</td>
							<td>시공완료일</td>
							<td>송금여부</td>
						</tr>
					</table>
					<table id ="tableReqMenu">
						<tbody>
						</tbody>
					</table>
				</div>
				<div class="table2">
				</div>
			</div>
			<div class="boardList2">
				<div class="table3">
				</div>
				<div class="table4">
				</div>
			</div>
		</div>
	</div>
</body>
</html>