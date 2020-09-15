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
	background: #F2A71A;
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
	width: 520px;
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
	height: 18px;
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
			</table>
			<table>			
				<tr>
					<td class="subTitle">거래은행</td>
					<td class="bank"><input type="radio" value="경남은행" name="gener">경남은행</td>
					<td class="bank"><input type="radio" value="광주은행" name="gener">광주은행</td>
					<td class="bank"><input type="radio" value="국민은행" name="gener">국민은행</td>
					<td class="bank"><input type="radio" value="기업은행" name="gener">기업은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="농협" name="gener">농협</td>
					<td class="bank"><input type="radio" value="대구은행" name="gener">대구은행</td>
					<td class="bank"><input type="radio" value="부산은행" name="gener">부산은행</td>
					<td class="bank"><input type="radio" value="산업은행" name="gener">산업은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="새마을금고" name="gener">새마을금고</td>
					<td class="bank"><input type="radio" value="수협" name="gener">수협</td>
					<td class="bank"><input type="radio" value="시티은행" name="gener">시티은행</td>
					<td class="bank"><input type="radio" value="신한은행" name="gener">신한은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="신협" name="gener">신협</td>
					<td class="bank"><input type="radio" value="우리은행" name="gener">우리은행</td>
					<td class="bank"><input type="radio" value="우체국은행" name="gener">우체국은행</td>
					<td class="bank"><input type="radio" value="전북은행" name="gener">전북은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="SC제일은행" name="gener">SC제일은행</td>
					<td class="bank"><input type="radio" value="제주은행" name="gener">제주은행</td>
					<td class="bank"><input type="radio" value="하나은행" name="gener">하나은행</td>
				</tr>
				<tr>
					<td class="subTitle">출금계좌번호</td>
					<td colspan="4">
					<input type="text" class="box1"></td>
				</tr>
				<tr>
					<td class="subTitle">비밀번호</td>
					<td colspan="4">
					<input type="text" class="box1"></td>
				</tr>
				<tr>
					<td class="subTitle">주민등록번호</td>
					<td colspan="4">
					<input type="text" class="box2">&nbsp;
					<input type="text" class="box2"></td>
				</tr>
				<tr>
					<td class="subTitle">예금주</td>
					<td colspan="4">
					<input type="text" class="box1"></td>
				</tr>
				<tr>
					<td colspan="5" class="bar">					
				</tr>
				<tr>
					<td class="subTitle">현금연수증</td>
					<td colspan="4" class="bank">
					<input type="radio" name="gener1">소득공제용&nbsp;&nbsp;
					<input type="radio" name="gener1">지출증빙용&nbsp;&nbsp;
					<input type="radio" name="gener1">미발행</td>
				</tr>
				<tr>
					<td class="subTitle">발급번호</td>
					<td colspan="4"><select></select>&nbsp;
					<input type="text" class="box2">&nbsp;
					<input type="text" class="box2"></td>
				</tr>
				<tr>
					<td colspan="5" class="bar">					
				</tr>
				<tr>
					<td class="subTitle">이메일</td>
					<td colspan="2"><input type="text" class="box1"></td>
					<td colspan="2" class="subTitle" align="right"><input type="checkbox" style="width: 14px;">구매 내역에 동의합니다.</td>
				</tr>
				<tr>
				</tr>
				<tr>
					<td colspan="5">
						&nbsp;<button class="nextBtn" onclick="nextBtn();">다음</button>
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
		location.href="${ applicationScope.contextPath }/views/user/myPage/myRequest/payment/payStep4_book.jsp";
	}
	</script>
	<script>
	</script>
</body>
</html>