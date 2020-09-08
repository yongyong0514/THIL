<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${ pageContext.request.contextPath }"
	scope="application" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>내가 사는 그 집</title>
<style>
.topBar {
	width: 1200px;
	margin: 0 auto;
}

.topLogo {
	width: 200px;
	float: left;
}

.topMenu {
	width: 120px;
}

.topIcon {
	width: 20px;
	height: 20px;
}

.topBtn {
	width: 110px;
	height: 40px;
	outline :none;
	border: none;
	cursor: pointer;
	background: white;
	font-size: 18px;
	font-weight: bold;
}

.topBtn:hover {
	background: #C4C4C4;
}
</style>

</head>
<body>
	<div>
		<table class="topBar">
			<tr>
				<th><img src="<%=request.getContextPath()%>/resources/images/symbol.png" class="topLogo" onclick="goHome();"></th>
				<th class="topMenu">
				<div class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/about.png" class="topIcon">&nbsp;ABOUT</div></th>
				<th class="topMenu">
				<button class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/town.png" class="topIcon" onclick="goTown();">&nbsp;우리동네</button></th>
				<th class="topMenu">
				<button class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/review.png" class="topIcon">&nbsp;시공후기</button></th>
				<th class="topMenu">
				<button class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/guide.png" class="topIcon">&nbsp;가이드</button></th>
				<th class="topMenu">
				<button class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/review.png" class="topIcon" onclick="goCenter();">&nbsp;고객센터</button></th>
				<th class="topMenu">
				<button class="topBtn"><img src="<%=request.getContextPath()%>/resources/images/login.png" class="topIcon" onclick="goLogin();">&nbsp;로그인</button></th>
			</tr>
		</table>
	</div>
	<script>
		function goHome() {
			location.href = "${ applicationScope.contextPath }/main.me";
		}
		function goTown() {
			location.href = "${ applicationScope.contextPath }/selectList.tw";
		}
		function goCenter() {
			location.href = "${ applicationScope.contextPath }/selectList.ct";
		}
		function goLogin() {
			location.href = "${ applicationScope.contextPath }/login.me";
		}
	</script>
</body>
</html>