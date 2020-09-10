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
	<jsp:include page="../../common/menubar.jsp" />
	<jsp:include page="../../common/searchQenq.jsp" />
	<jsp:include page="../../common/mypagebar1.jsp" />
	<div class="outer">
		<div class="inner">
			<div class="section">
				<div class="sidebar">
					<div id="btn_group">
						<button class="sidebutton"
							onclick="location.href='businessPort.jsp'">나의 의뢰</button>
						<button class="sidebutton" onclick="location.href='#'">문의내역</button>
						<button class="sidebutton" onclick="location.href='#'">리뷰관리</button>
						<button class="sidebutton" onclick="location.href='#'">정보수정</button>
					</div>

					<div id="btn_group2">
						<button class="bsChange" onclick="location.href='#'">사업자전환</button>
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
						<c:forEach var="um" items="${ requestScope.list }">
							<tr class="listName">
								<th class="val">의뢰코드</th>
								<th class="val">의뢰일</th>
								<th class="val">의뢰업종</th>
								<th class="val">상호명</th>
								<th class="val">견적가</th>
								<th class="val">진행상태</th>
							</tr>
							<tr class="listResult">
								<td><c:out value="" /></td>
								<td><c:out value="" /></td>
								<td><c:out value="" /></td>
								<td><c:out value="" /></td>
								<td><c:out value="" /></td>
								<td><c:out value="" /></td>
							</tr>
							<tr>
								<th colspan="6" align="right" class="listButton"><button class="reqButton">결제하기</button>
									<button class="reqButton">구매결정</button>
									<button class="reqButton">리뷰작성</button>
								</th>
							</tr>
						</c:forEach>

					</table>
					<div class="paging-area" align="center">
						<button id="paging"
							onclick="location.href='${applicationScope.contextPath}/UserMyRequestManage.user?currentPage=1'"><<</button>

						<c:if test="${ requestScope.pi.currentPage <= 1 }">
							<button id="paging" disabled><</button>
						</c:if>

						<c:if test="${ requestScope.pi.currentPage > 1 }">
							<button id="paging"
								onclick="location.href='${applicationScope.contextPath}/UserMyRequestManage.user?currentPage=<c:out value="${ requestScope.pi.currentPage - 1 }"/>'"><</button>
						</c:if>


						<c:forEach var="p" begin="${ requestScope.pi.startPage }"
							end="${ requestScope.pi.endPage }" step="1">
							<c:if test="${ requestScope.pi.currentPage eq p }">
								<button id="paging" disabled>
									<c:out value="${ p }" />
								</button>
							</c:if>
							<c:if test="${ requestScope.pi.currentPage ne p }">
								<button id="paging"
									onclick="location.href='${applicationScope.contextPath}/UserMyRequestManage.user?currentPage=<c:out value="${ p }"/>'">
									<c:out value="${ p }" />
								</button>
							</c:if>
						</c:forEach>


						<c:if
							test="${ requestScope.pi.currentPage >= requestScope.pi.maxPage }">
							<button id="paging" disabled>></button>
						</c:if>

						<c:if
							test="${ requestScope.pi.currentPage < requestScope.pi.maxPage }">
							<button id="paging"
								onclick="location.href='${applicationScope.contextPath}/UserMyRequestManage.user?currentPage=<c:out value="${ requestScope.pi.currentPage + 1 }"/>'">></button>
						</c:if>

						<button id="paging"
							onclick="location.href='${applicationScope.contextPath}/UserMyRequestManage.user?currentPage=<c:out value="${ requestScope.pi.maxPage }"/>'">>></button>
					</div>
				</div>
			</div>
		</div>
		<div class="foot">
			<jsp:include page="../../common/footer1.jsp" />
		</div>
	</div>
</body>
</html>