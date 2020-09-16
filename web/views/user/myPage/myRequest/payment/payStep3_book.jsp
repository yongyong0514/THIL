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
	height: 450px;
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
	height: 450px;
}

.right {
	float: left;
	width: 150px;
	height: 450px;
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
	width: 90px;
	border: 2px solid #EBEFF2;
	outline: none;

}
input[type=radio] {
	width: 10px;
	height: 10px;
}

.subTitle {
	height: 13px;
	font-size: 12px;
	font-weight: bolder;
}

.phone {
	display: none;
}

.ss {
	display: none;
}

.card {
	display: none;
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
					<td class="bank"><input type="radio" value="경남은행" name="userBank">경남은행</td>
					<td class="bank"><input type="radio" value="광주은행" name="userBank">광주은행</td>
					<td class="bank"><input type="radio" value="국민은행" name="userBank">국민은행</td>
					<td class="bank"><input type="radio" value="기업은행" name="userBank">기업은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="농협" name="userBank">농협</td>
					<td class="bank"><input type="radio" value="대구은행" name="userBank">대구은행</td>
					<td class="bank"><input type="radio" value="부산은행" name="userBank">부산은행</td>
					<td class="bank"><input type="radio" value="산업은행" name="userBank">산업은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="새마을금고" name="userBank">새마을금고</td>
					<td class="bank"><input type="radio" value="수협" name="userBank">수협</td>
					<td class="bank"><input type="radio" value="시티은행" name="userBank">시티은행</td>
					<td class="bank"><input type="radio" value="신한은행" name="userBank">신한은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="신협" name="userBank">신협</td>
					<td class="bank"><input type="radio" value="우리은행" name="userBank">우리은행</td>
					<td class="bank"><input type="radio" value="우체국은행" name="userBank">우체국은행</td>
					<td class="bank"><input type="radio" value="전북은행" name="userBank">전북은행</td>
				</tr>
				<tr>	
					<td></td>
					<td class="bank"><input type="radio" value="SC제일은행" name="userBank">SC제일은행</td>
					<td class="bank"><input type="radio" value="제주은행" name="userBank">제주은행</td>
					<td class="bank"><input type="radio" value="하나은행" name="userBank">하나은행</td>
				</tr>
				<tr>
					<td class="subTitle">출금계좌번호</td>
					<td colspan="4">
					<input type="text" class="box1" name="userAct"></td>
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
					<input type="text" class="box1" name="userName"></td>
				</tr>
				<tr>
					<td colspan="5" class="bar">					
				</tr>
				<tr>
					<td class="subTitle">현금연수증</td>
					<td colspan="4" class="bank">
					<input type="radio" name="receiptsType" value="income">소득공제용&nbsp;&nbsp;
					<input type="radio" name="receiptsType" value="expense">지출증빙용&nbsp;&nbsp;
					<input type="radio" name="receiptsType" value="">미발행</td>
				</tr>
				<tr>
					<td class="subTitle">발급번호</td>
					<td>
						<select id="receiptsNumType" name="receiptsNumType">
							<option value="" selected="selected">선택하세요</option>
							<option value="phone">휴대폰번호</option>					
							<option value="ss">주민등록번호</option>
							<option value="card">현금영수증카드번호</option>
						</select>
					</td>
					<td colspan="3" class="phone">
						<input type="text" class="box3" name="rNum1">-<input type="text" class="box3" name="rNum1">-<input type="text" class="box3" name="rNum1">
					</td>
					<td colspan="3" class="ss">
						<input type="text" class="box2" name="rNum2">-<input type="text" class="box2" name="rNum2">
					</td>
					<td colspan="3" class="card">
						<input type="text" class="box3" name="rNum3">-<input type="text" class="box3" name="rNum3">-<input type="text" class="box3" name="rNum3">-<input type="text" class="box3" name="rNum3">
					</td>
				</tr>
				<tr>
					<td colspan="5" class="bar">					
				</tr>
				<tr>
					<td class="subTitle">이메일</td>
					<td colspan="2"><input type="text" class="box1" name="payEmail"></td>
					<td colspan="2" class="subTitle" align="right"><input type="checkbox" style="width: 14px;">구매 내역에 동의합니다.</td>
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
    $(document).on("contextmenu",function(e){
        console.log("c"+e);
        return false;
    });
	</script>
	<script>
	$('#receiptsNumType').change(function() {
		var state = $('#receiptsNumType option:selected').val();
		if ( state == 'phone') {
			$('.phone').show();
			$('.ss').hide();
			$('.card').hide();
		} else if ( state == 'ss') {
			$('.ss').show();
			$('.phone').hide();
			$('.card').hide();
		} else if ( state == 'card') {
			$('.card').show();
			$('.ss').hide();
			$('.phone').hide();
		} else {
			$('.card').hide();
			$('.ss').hide();
			$('.phone').hide();
		}
	});
	</script>
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
		$(document).ready(function() {
			var userBank = $('input[name=userBank]:checked').val();
			sessionStorage.setItem('userBank', userBank);
			
			var userAct = $('input[name=userAct]').val();
			sessionStorage.setItem('userAct', userAct);
			
			var userName = $('input[name=userName]').val();
			sessionStorage.setItem('userName', userName);
			
			var payEmail = $('input[name=payEmail]').val();
			sessionStorage.setItem('payEmail', payEmail);
 			
			var receiptsType = $('input[name=receiptsType]:checked').val();
		
 			var receiptsNumType = $("#receiptsNumType option:selected").val();
			
			if(sessionStorage.getItem('receiptsNumType') == 'phone') {
				var rNumArr = new Array($('input[name=rNum1]').length);
				
				for( var i = 0; i < $('input[name=rNum1]').length ; i++ ) {
					rNumArr[i] = $("input[name=rNum1]").eq(i).val();
				}
				
			} else if (sessionStorage.getItem('receiptsNumType') == 'ss') {
				var rNumArr = new Array($('input[name=rNum2]').length);
				
				for( var i = 0; i < $('input[name=rNum2]').length ; i++ ) {
					rNumArr[i] = $("input[name=rNum2]").eq(i).val();
				}
				
			} else if (sessionStorage.getItem('receiptsNumType') == 'card') {
				var rNumArr = new Array($('input[name=rNum3]').length);
				
				for( var i = 0; i < $('input[name=rNum3]').length ; i++ ) {
					rNumArr[i] = $("input[name=rNum3]").eq(i).val();
				}
			}						
			
			var payCReceipts = receiptsType.concat("$", receiptsNumType, "$", rNumArr.join('$'));	
			sessionStorage.setItem('payCReceipts', payCReceipts);
		});
		

		
		location.href="${ applicationScope.contextPath }/views/user/myPage/myRequest/payment/payStep4_book.jsp";
	}
	</script>
</body>
</html>