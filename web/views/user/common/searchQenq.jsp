<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.searchOuter {
	margin: 0 auto;
	width: 1200px;
	height: 100px;
}

.searchArea1 {
	width: 800px;
}

.searchArea2 {
	width: 400px;
}

.searchBar {
	float: left;
	width: 800px;
	height: 50px;
	border: none;
	border-bottom: 5px solid #C4C4C4;
	outline: none;
	cursor: pointer;
	font-size: 20px;
}

.searchBtn {
	float: right;
	width: 200px;
	height: 50px;
	border-radius: 5px;
	border: 2px solid #C4C4C4;
	font-size: 20px;
	font-weight: bolder;
}

.searchIcon {
	float: left;
	width: 50px;
	height: 50px;
	cursor: pointer;
}

</style>
</head>
<body>
	<table class="searchOuter">
		<tr>
			<th class="searchArea1"><input type="text" value="" class="searchBar"></th><th><img src="<%=request.getContextPath()%>/resources/images/search.png" class="searchIcon">
			</th>
			<th class="searchArea2">
				<button class="searchBtn">빠른 의뢰	 문의</button>
			</th>
		</tr>
	</table>
</body>
</html>