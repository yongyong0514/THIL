<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Style>
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

.table1 {
	width: 550	px;
	height: 30px;
}
</Style>
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
					<td class="title2">신용카드</td>
				<tr>
			</table>
		</div>
		<div class="left">
			<table>
				<tr>
					<td class="table1">이용 약관 안내</td>
					<td>전체동의<td>
				</tr>
				<tr>
					<td>전자금융거래 기본 약관</td>
					<td>동의합니다</td>
				</tr>
				<tr>
					<td>약관내용11</td>
				</tr>				
				<tr>
					<td>개인정보 수집 및 이용 동의</td>
					<td>동의합니다</td>
				</tr>
				<tr>
					<td>약관내용22</td>
				</tr>
				<tr>
					<td>개인정보제공 및 위탁 동의</td>
					<td>동의합니다</td>
				</tr>
				<tr>
					<td>약관내용33</td>
				</tr>
				<tr>
					<td>
						<button>다음</button>
					</td>
				</tr>
			</table>
		
		
		</div>
		<div class="right">
			<table>
				<tr>
					<td>> 약관 동의</td>
				</tr>
				<tr>
					<td>> 약관 동의</td>
				</tr>
				<tr>
					<td>> 약관 동의</td>
				</tr>
				<tr>
					<td>> 약관 동의</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>