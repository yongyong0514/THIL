<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>내가 사는 그 집 - 관리 시스템</title>
<style>
body {
	font-family: "NanumGothic";
	font-weight: bold;
	text-align: center;
}

.newsize {
	width: 550px;
	height: 5px;
}

.outer {
	width: 600px;
	height: 950px;
}

.inner {
	margin-top: 12.5px;
	margin-left: 10px;
	margin-right: 10px;
	width: 575px;
	height: 900px;
	border: 2px solid #C4C4C4;
	border-radius: 2px;
}

.innerMore {
	margin-top: 25px;
	margin-left: 15px;
	margin-right: 10px;
	width: 540px;
	height: 675px;
}

.tnumber {
	width: 600px;
	height: 25px;
	background: #012E41;
	color: white;
	font-size: 15px;
}

.tstatus {
	width: 540px;
	height: 20px;
	background: #012E41;
	color: white;
	font-size: 12px;
	border-radius: 2px;
}

.tLabel1 {
	width: 60px;
	height: 25px;
	font-size: 12px;
}

.tLabel2 {
	width: 65px;
	height: 25px;
	font-size: 12px;
}

.tInput1 {
	margin-top: 2.5px;
	width: 100px;
	height: 20px;
	border: 2px solid #C4C4C4;
	outline: none;
	background: #EBEFF2;
	border-radius: 2px;
	font-weight: normal;
}

.modify {
	border: 2px solid #EBEFF2;
}

.modify1 {
	width: 100px;
	height: 20px;
	float: right;
	color: white;
	outline: none;
	cursor: pointer;
	font-size: 11px;
}

.val {
	width: 60px;
	height: 25px;
	background: #F2F2F2;
	font-size: 12px;
}

.valResult {
	width: 60px;
	height: 25px;
	font-weight: normal;
	font-size: 12px;
}

.infoList {
	width: 540px;
	height: 250px;
}

.qnaList {
	width: 540px;
	height: 250px;
}

.val2 {
	width: 100px;
	height: 25px;
	background: #F2F2F2;
	font-size: 10px;
}

.val3 {
	width: 200px;
	height: 25px;
	background: #F2F2F2;
	font-size: 10px;
}

.val2Result {
	height: 40px;
	font-size: 12px;
	font-weight: normal;
}

.bsButton1 {
	width: 200px;
	height: 30px;
	font-size: 16px;
	border: none;
	outline: none;
	background:#F2A71A;
	color: white;
	border-radius: 5px;
	cursor: pointer;
	font-weight: bolder;
}

.bsButton1:hover, .bsButton2:hover {
	border: 2px solid black;
}

.bsButton2 {
	width: 200px;
	height: 30px;
	font-size: 16px;
	border: none;
	outline: none;
	background: grey;
	color: white;
	border-radius: 5px;
	cursor: pointer;
	font-weight: bolder;
}
</style>
</head>
<body>
	<div class="outer">
		<table>
			<tr class="close">
				<th class="tnumber">사업자 정보</th>
			</tr>
		</table>
		<div class="inner">
			<div class="innerMore">
				<table>
					<tr>
						<td colspan="10" class="tstatus">회원정보</td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr>
						<td class="tLabel1">회원코드</td>
						<td colspan="2"><input type="text" id="uno" class="tInput1"
							readonly></td>
						<td class="tLabel1">아이디</td>
						<td colspan="2"><input type="text" id="userId" class="tInput1"
							readonly></td>
						<td class="tLabel1">닉네임</td>
						<td colspan="2"><input type="text" id="userNick" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr>
						<td class="tLabel1">이름</td>
						<td colspan="2"><input type="text" id="userName" class="tInput1"
							readonly></td>
						<td class="tLabel1">연락처</td>
						<td colspan="2"><input type="text" id="userPhone" class="tInput1"
							readonly></td>
						<td class="tLabel1">등록일</td>
						<td colspan="2"><input type="text" id="userDate" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr>
						<td class="tLabel1">사업자번호</td>
						<td colspan="2"><input type="text" id="bno" class="tInput1" readonly></td>
						<td class="tLabel1">사업자여부</td>
						<td colspan="2"><input type="text" id="bsMember" class="tInput1" readonly></td>
						<td class="tLabel1"></td>
						<td colspan="2"></td>
						<td></td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr>
						<td colspan="10" class="modify"><button class="modify1" disabled>회원 정보 수정</button></td>
					</tr>
					<tr>
						<td colspan="10"></td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr class="newsize">
					</tr>
				</table>
				<table>
					<tr>
						<td colspan="10" class="tstatus">사업자 정보</td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr>
						<td class="tLabel2">사업자번호</td>
						<td colspan="2"><input type="text" id="bsNum" class="tInput1"
							readonly></td>
						<td class="tLabel2">상호명</td>
						<td colspan="2"><input type="text" id="bsTitle" class="tInput1"
							readonly></td>
						<td class="tLabel2">시공업종</td>
						<td colspan="2"><input type="text" id="catName" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr>
						<td class="tLabel2">경력</td>
						<td colspan="2"><input type="text" id="bsYear" class="tInput1"
							readonly></td>
						<td class="tLabel2">AS</td>
						<td colspan="2"><input type="text" id="bsAs" class="tInput1"
							readonly></td>
						<td class="tLabel2">계약금</td>
						<td colspan="2"><input type="text" id="bsDepo" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr>
						<td class="tLabel2">법인여부</td>
						<td colspan="2"><input type="text" id="bsCorp" class="tInput1"
							readonly></td>
						<td class="tLabel2">대표자명</td>
						<td colspan="2"><input type="text" id="bsName" class="tInput1"
							readonly></td>
						<td class="tLabel2">대표연락처</td>
						<td colspan="2"><input type="text" id="bsPhone" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr>
						<td class="tLabel2">사업장주소</td>
						<td colspan="2"><input type="text" id="bsAdd" class="tInput1"
							readonly></td>
						<td class="tLabel2">거래은행</td>
						<td colspan="2"><input type="text" id="bsBank" class="tInput1"
							readonly></td>
						<td class="tLabel2">계좌번호</td>
						<td colspan="2"><input type="text" id="bsAct" class="tInput1"
							readonly></td>
						<td></td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr>
						<td colspan="10" class="modify"><button class="modify1" disabled>사업자 정보 수정</button></td>
					</tr>
					<tr>
						<td colspan="10"></td>
					</tr>
					<tr class="newsize">
					</tr>
					<tr class="newsize">
					</tr>
				</table>
				<div class="infoList">
					<table>
						<tr>
							<td colspan="10" class="tstatus">진행 중인 의뢰 내역</td>
						</tr>
						<tr>
							<td class="val">의뢰코드</td>
							<td class="val">진행상태</td>
							<td class="val">의뢰인이름</td>
							<td class="val">시공시작일</td>
							<td class="val">시공종료일</td>
							<td class="val">견적가</td>
						</tr>
						<tr class="valResult">
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
							<td>0</td>
						</tr>
					</table>
				</div>
				<div class="qnaList">
				</div>
			</div>
		</div>
		<div>
			<table align="center">
				<tr>
					<td>
					</td>
				</tr>
				<tr>
				 	<td>
				 		<button class="bsButton1" onclick="accept();">사업자 전환 승인</button>
				 	</td>
				 	<td style="width: 40px;">
				 	</td>
				 	<td>	
				 		<button class="bsButton2">사업자 정보 삭제</button>
				 	</td>	
				<tr>
			</table>
		</div>
	</div>
<script>
	function accept() {
		var popupWidth = 420;
		var popupHeight = 320;
		var popupX = (window.screen.width / 2) - (popupWidth / 2);
		var popupY= (window.screen.height / 2) - (popupHeight / 2);
		var num = document.location.href.split("=");
		window.open('${ applicationScope.contextPath }/views/admin/pages/adminBs/adminBsInfo/adminBsAccept/bsAccept1.jsp?num=' + num[1], '', 'status=no, height=' + popupHeight  + ', width=' + popupWidth  + ', left='+ popupX + ', top='+ popupY);
	};
</script>
<script>
	$(function() {
		var bnoOne = document.location.href.split("=");
		$.ajax({
			url: "${applicationScope.contextPath}/AdminBsInfoBeforeServlet.ad",
			data: { bnoOne : bnoOne[1] },
			type: "post",
			success: function(data) {
				console.log(data);
					
				for(key in data) {
					$("#uno").val(data[key].uno);
					$("#userId").val(data[key].userId);
					$("#userNick").val(data[key].userNick);
					$("#userName").val(data[key].userName);
					$("#userPhone").val(data[key].userPhone);
					$("#userDate").val(data[key].userDate);
					
					$("#bno").val(data[key].bno);
					$("#bsNum").val(data[key].bsNum);
					$("#bsTitle").val(data[key].bsTitle);
					$("#bsYear").val(data[key].bsYear);
					$("#bsAs").val(data[key].bsAs);
					$("#bsDepo").val(data[key].bsDepo);
					$("#bsCorp").val(data[key].bsCorp);
					$("#bsName").val(data[key].bsName);
					$("#bsPhone").val(data[key].bsPhone);
					$("#bsAdd").val(data[key].bsAdd);
					$("#bsBank").val(data[key].bsBank);
					$("#bsAct").val(data[key].bsAct);
					$("#bsMember").val(data[key].bsMember);
					$("#catName").val(data[key].catName);
				}
			}
		});
	});
</script>
</body>
</html>