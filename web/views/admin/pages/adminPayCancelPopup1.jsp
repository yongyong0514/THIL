<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>의뢰관리/결제취소</title>
<style>
body {
	font-family: "NanumGothic";
	font-weight: "bolder";
}

.outer {
	width: 400px;
	height: 300px;
}

.top {
	width: 400px;
	height: 30px;
	background: #232526;
	background: -webkit-linear-gradient(to left, #414345, #232526);
	background: linear-gradient(to left, #414345, #232526);
	color: white;	
}

.pngIcon2 {
	width: 25px;
	height: 25px;
}

.title2 {
	font-size: 17px;
	font-weight: bolder;
}

.inner {
	width: 400px;
	height: 270px;
}

.title1 {
	width: 400px;
	height: 50px;
	font-size: 20px;
	font-weight: bolder;
	text-align: center;
}

.btn1 {
	margin-top: 50px;
	width: 400px;
	height: 50px;
	background: #F2774B;
	color: white;
	border: none;
	outline: none;
	cursor: pointer;
	font-weight: bolder;
	font-size: 20px;
}

.btn1:hover {
	background: #012E41;
}

.btn2 {
	width: 400px;
	height: 50px;
	background: white;
	border: none;
	outline: none;
	cursor: pointer;
	font-weight: bolder;
	font-size: 20px;
}

.btn2:hover {
	background: lightgrey;
}
</style>
</head>
<body>
	<div class="outer">
		<div class="top">
			<table>
				<tr>
					<td>
					&nbsp;&nbsp;<img src="<%=request.getContextPath() %>/resources/admin/logo/logo_symbol.png" class="pngIcon2">
					</td>
					<td>
						<label class="title2">결제취소</label>
					</td>
			</table>	
		</div>
		<div class="inner">
			<table>
				<tr>
					<td class="title1">결제를 취소하시겠습니까?</td>
				</tr>
				<tr>
					<td class="title1">시공대기시 재결재만 결제취소가 가능하며,<br> 대금결제로 돌아갑니다.</td>
				</tr>
				<tr>
					<td><button class="btn1" onclick="complete();">결제취소</button></td>
				</tr>
				<tr>
					<td><button class="btn2" onclick="closeBtn();">닫기</button></td>				
				</tr>
			</table>
		</div>
	</div>
	<script>
    $(document).on("contextmenu dragstart selectstart", function(e) {
        return false;
    });
	</script>
	<script>
		function complete() {
			var rnoOne = document.location.href.split("=");
			
			$.ajax({
				url: "${ applicationScope.contextPath }/AdminPayCancel.ad",
				data: { rnoOne : rnoOne[1]},
				type: "post"
				});
			
			location.replace("${ applicationScope.contextPath }/views/admin/pages/adminPayCancelPopup2.jsp");
		};
	</script>
	<script>
	function closeBtn() {
		window.opener.location.reload();
		window.close();
	}
	</script>
</body>
</html>