<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>의뢰/결제</title>
<Style>
body {
	font-family: "NanumGothic";
}
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
	width: 550px;
	height: 440px;
}

.right {
	float: left;
	width: 150px;
	height: 440px;
	background: #EBEFF2;
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
	width: 450px;
	height: 40px;
	text-align: center;
	font-size: 22px;
	font-weight: bolder;
}


#titleBtn {
	width: 100px;
	height: 30px;
}


.table1 {
	width: 420px;
	height: 30px;
	font-size: 17px;
	font-weight: bolder;
}

.table1-1 {
	width: 110px;
	height: 30px;
	font-size: 17px;
	font-weight: bolder;
}

.table2 {
	width: 420px;
	height: 30px;
	font-size: 19px;
	font-weight: bolder;
}

.table2-1 {
	width: 110px;
	height: 30px;
	font-size: 19px;
	font-weight: bolder;
}
.groupBox {
	width: 530px;
	height: 30px;
}

.textBox {
	width: 510px;
	height: 60px;
	resize: none;
	border: 2px solid lightgrey;
	outline: none;
	cursor: default;
}

.nextBtn {
	width: 517px;
	height: 50px;
	border: none;
	outline: none;
	cursor: pointer;
	background: #F2774B;
	font-size: 20px;
	font-weight: bolder;
}

.nextBtn:hover {
	background: #012E41;
	color: white;
}

.step {
	height: 30px;
	font-size: 16px;
}

.stepNow {
	height: 30px;
	font-size: 16px;
	font-weight: bold;
}

#checkall {
	width: 18px;
	height: 18px;
}

.bank {
	width: 100px;
	font-size: 12px;
}

.resultBox {
	width: 100px;
}

.bar {
	border-bottom: 2px solid lightgrey;
}

.box0 {
	width: 200px;
	border: none;
	outline: none;
	font-size: 18px;
}

.box1 {
	width: 200px;
	border: 2px solid #EBEFF2;
	outline: none;

}

.box2 {
	width: 92px;
	border: 2px solid #EBEFF2;
	outline: none;

}

.box3 {
	width: 50px;
	border: 2px solid #EBEFF2;
	outline: none;

}

select {
	width: 100px;
	border: 2px solid #EBEFF2;
	outline: none;

}
input[type=radio] {
	width: 10px;
	height: 10px;
}

.subTitle {
	width: 100px;
	height: 18px;
	font-size: 12px;
	font-weight: bolder;
}

.subTitle2 {
	width: 100px;
	height: 18px;
	font-size: 18px;
	font-weight: bolder;
}

.securityNum {
	width: 10px;
	height: 18px;
}

.tip {
	font-size: 12px;
	font-weight: bolder;	
}

.otpSize {
	margin-left: 60px;
	float: right;
	width: 150px;
	height: 150px;
}

.inputBtn2 {
	width: 300px;
	font-size: 12px;
	font-weight: bolder;
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
					<td class="title2">계좌이체</td>
					<td><div id="titleBtn"></div></td>
				<tr>
			</table>
		</div>
		<div class="left">
			<table>
				<tr>
					<td class="subTitle">사업자명출력</td>
				</tr>
				<tr>
					<td colspan="5" class="bar">
				</tr>
				<tr>
					<td class="subTitle">상품명</td><td colspan="5"><input type="text" class="box0" readonly></td>
				</tr>
				<tr>
					<td class="subTitle">시공일</td><td colspan="5"><input type="text" class="box0" readonly></td>			
				</tr>
				<tr>
					<td class="subTitle">견적가</td><td colspan="5"><input type="text" class="box0" readonly></td>
				</tr>
				<tr>
					<td colspan="5" class="bar">
				</tr>
				<tr>
					<td style="height: 10px;">
				</tr>
				<tr>
					<td class="subTitle2">은행명</td>
				</tr>
				<tr>
					<td colspan="5" class="bar">
				</tr>
				<tr>
					<td style="height: 10px;">
				</tr>							
				<tr>
					<td class="subTitle">OTP 번호 입력</td>
				</tr>
				<tr>
					<td style="height: 20px;">
				</tr>		
				<tr>
					<td colspan="2"><img src="<%=request.getContextPath() %>/resources/images/myPage/myRequest/payment/otp.png" class="otpSize"></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
					<td colspan="3" class="inputBtn2">OPT 생성 번호 :&nbsp;
						<input type="text" class="securityNum">&nbsp;
						<input type="text" class="securityNum">&nbsp;
						<input type="text" class="securityNum">&nbsp;
						<input type="text" class="securityNum">&nbsp;
						<input type="text" class="securityNum">&nbsp;
						<input type="text" class="securityNum">
					</td>
				</tr>
				<tr>
					<td style="height: 21px;">
				</tr>	
				<tr>
					<td colspan="5">
						&nbsp;<button class="nextBtn" onclick="nextBtn();">결제요청</button>
					</td>
				</tr>
			</table>
		
		
		</div>
		<div class="right">
			<table>
				<tr style="height: 10px;">
				</tr>
				<tr>
					<td class="step">&nbsp;&nbsp;&nbsp;&nbsp;결제 수단 선택</td>
				</tr>
				<tr>
					<td class="step">&nbsp;&nbsp;&nbsp;&nbsp;약관 동의</td>
				</tr>
				<tr>
					<td class="stepNow">&nbsp;&nbsp;>&nbsp;&nbsp;계좌 정보 입력</td>
				</tr>
				<tr>
					<td class="step">&nbsp;&nbsp;&nbsp;&nbsp;결제 확인</td>
				</tr>
			</table>
		</div>
	</div>
	<script>
	$(document).ready(function() {

	    $("#checkall").click(function() {

	    	if($("#checkall").prop("checked")) {
	    		$("input[name=chk]").prop("checked",true);
	        
	    	} else {
	    		$("input[name=chk]").prop("checked",false);
	        }
	    });
	});
	</script>
	<script>
	function nextBtn() {
		location.href="${ applicationScope.contextPath }/views/user/myPage/myRequest/payment/payStep6_book.jsp";
	}
	</script>
</body>
</html>