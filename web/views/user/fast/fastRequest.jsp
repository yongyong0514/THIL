<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: "NanumGothic";
}
.outer {
	width: 500px;
	height: 700px;
	background: #EBEFF2;
}

.topBar {
	width: 500px;
	height: 30px;
	background: #012E41;
}

.inner {
	margin-top: 10px;
	margin-left: 8px;
	width: 480px;
	height: 650px;
	background: white;
	border: 2px solid #C4C4C4;
	border-radius: 5px;
}

.title1 {
	width: 100px;
	font-size: 12px;
	font-weight: bolder;
}

.title2 {
	font-size: 16px;
	font-weight: bolder;
}

input[type=radio] { 
	display:none;  
	margin:10px; 
}

input[type=radio] + label { 
	display:inline-block; 
	margin: 4px; 
	padding: 8px 19px; 
	border: 2px solid #C4C4C4;
	border-radius: 5px;
	font-size: 12px !important; 
	width: 65px; 
	text-align: center; 
	cursor: pointer;
} 

input[type=radio]:checked + label {  
   	background-image: none; 
	background-color:#F2A71A; 
	color: white; 
} 

.inbox1 {
	width: 210px;
}

.title3 {
	width: 475px;
	height: 50px;
	border: none;
	background: #F2774B;
	color: white;
	cursor: pointer;
	outline: none;
	font-size: 16px;
	font-weight: bolder;
}

.title3:hover {
	background: #012E41;	
}
</style>
</head>
<body>
	<div class="outer">
		<div class="topBar">
		</div>
		<div class="inner">
			<table>
				<tr>
					<td class="title1" colspan="4">
						상담을 원하시는 업종을 선택해주세요.
					</td>
				</tr>
				<tr>
					<td>
						업종 셀렉트바
					</td>
				</tr>
				<tr>
					<td class="title1" colspan="4">
						공사하는 공간의 평형을 선택해주세요.
					</td>
				</tr>
				<tr>
					<td>
						게이지바
					</td>
				</tr>
				<tr>
					<td class="title1" colspan="4">
						시공할 지역을 선택해주세요.
					</td>
				</tr>
				<tr>
					<td>
						시/도 선택
					</td>
				</tr>
				<tr>
					<td class="title1" colspan="4">
						공사 시작 예정일을 선택해주세요.
					</td>
				</tr>
				<tr>
					<td>
						<input type="radio" id="radio1" name="radios"><label for="radio1">2주 이내</label>
					</td>
					<td>
						<input type="radio" id="radio2" name="radios"><label for="radio2">1개월 이내</label>
					</td>					
					<td>
						<input type="radio" id="radio3" name="radios"><label for="radio3">3개월 이내</label>
					</td>
					<td>
						<input type="radio" id="radio4" name="radios"><label for="radio4">3개월 이후</label>
					</td>
				</tr>
				<tr>
					<td class="title2" colspan="2">
						성함을 입력해주세요.
					</td>
					<td colspan="2">
						<input type="text" class="inbox1">
					</td>
				</tr>
				<tr>
					<td class="title2" colspan="2">
						연락처를 입력해주세요.
					</td>
					<td colspan="2">
						<input type="text" class="inbox1">
					</td>
				</tr>
				<tr>
					<td class="title2" colspan="2">
						기타사항을 입력해주세요.
					</td>
					<td colspan="2">
						<input type="text" class="inbox1">
					</td>
				</tr>
			</table>
			<table>
				<tr>
					<td class="title1">
						<input type="checkbox">전체동의
					</td>
				</tr>
				<tr>
					<td class="title1">
						<input type="checkbox">(필수) 개인정보 수집 및 이용에 동의
					</td>
				</tr>
				<tr>
					<td class="title1">
						<input type="checkbox">(필수) 개인정보 제 3자 제공에 동의
					</td>
				</tr>
				<tr>
					<td class="title1">
						<input type="checkbox">(선택) 인테리어 정보 및 마케팅 수신에 동의
					</td>
				</tr>
			</table>
			<table>
				<tr>
					<td>
						<button class="title3">상담 신청하기</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>