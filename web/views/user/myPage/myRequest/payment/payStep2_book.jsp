<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.outer {
	width: 700px;
	height: 440px;
}

.tableTop {
	width: 700px;
	height: 50px;
	background: #232526;
	background: -webkit-linear-gradient(to left, #414345, #232526);
	background: linear-gradient(to left, #414345, #232526);
	color: white;
}

.left {
	float: left;
	width: 500px;
	height: 440px;
	background: yellow;
}

.right {
	float: left;
	width: 200px;
	height: 440px;
	background: green;
}

.pngIcon2 {
	width: 40px;
	height: 40px;
}

.title1 {
	width: 100px;
	height: 40px;
	font-size: 20px;
	font-weight: bolder;
	
}

.title2 {
	width: 550px;
	height: 40px;
	text-align: center;
	font-size: 22px;
	font-weight: bolder;
}
</style>
</head>
<body>
	<div class="outer">
		<div class="tableTop">
			<table>
				<tr>
					<td>&nbsp;&nbsp;<img
						src="<%=request.getContextPath() %>/resources/admin/logo/logo_symbol.png"
						class="pngIcon2">
					</td>
					<td><label class="title1">전자결제</label></td>
					<td class="title2">계좌이체</td>
				<tr>
			</table>
		</div>
		<div class="left">
		</div>
		<div class="right">
		</div>
	</div>
</body>
</html>