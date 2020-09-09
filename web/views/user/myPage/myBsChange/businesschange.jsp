<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<style>

	body {
	font-family: "NanumGothic";
	font-weight: bolder;
	}
	.inner {
	display: flex;
	justify-content: center;
	}
	
	header {
	margin: 0 auto;
	width: 1200px;
	height: 60px;
	}
	
	.information{
	margin: auto;
	width: 1200px;
	height: 225px;

	}
	
	footer {
	margin: 0 auto;
	width: 1200px;
	height: 328px;
	}
	

	.section {
	width: 200px;
	height: 1123px;
	background: white;
	}

	.article{
	width: 1000px;
	height: 1123px;
	border: 1px solid gray;
	}
	
	
	
	table{
		margin:auto;
	}
	td{
		padding:10px;
	}
	input{
		height: 35px;
	
	}
	.save{
		background: orange;
		margin-top:150px;
		height:100px;
		cursor:pointer;
	}
	input[type=text]{
		background:#EBEFF2;
		border:1px solid gray;
	
	}
	

	.btn-radio {
	display: inline-block;
	margin-right: 10px;
	}
	.btn-radio input[type=radio] {
	display: none;
	}
	.btn-radio label {
	display: inline-block;
	background:#EBEFF2;
	cursor: pointer;
	padding: 0px 15px;
	line-height: 34px;
	border: 1px solid #999;
	border-radius: 6px;
	user-select: none;
	}
 
	/* Checked */
	.btn-radio input[type=radio]:checked + label {
	background: #ffe0a6;
	}
 
	/* Hover */
	.btn-radio label:hover {
	color: #666;
	}
</style>
</head>
<body>
	<header>
	<jsp:include page="../common/header.jsp"/> 
	</header>
	<jsp:include page="../common/searchQenq.jsp"/> 
	<div class="information">
	<jsp:include page="mypagebar.jsp"/> 
	</div>
	<div class="inner">
		<div class="section">
		<jsp:include page="sidebar.jsp"/> 
		
		</div>
		
		<div class="article">
		<br>
		<h3 align="center">사업자 전환 신청</h3>
		<div class="changeform">
			<form id = "inputform" action="#" method=get>
				<table>
					<tr>
						<td>업종</td>
						<td>
						<input type="checkbox" name="category" id="paper" value="도배">
						<label for="paper">도배</label>
						<input type="checkbox" name="category" id="floor" value="장판">
						<label for="floor">장판</label>
						<input type="checkbox" name="category" id="tile" value="타일">
						<label for="tile">타일</label>
						<input type="checkbox" name="category" id="wood" value="마루">
						<label for="wood">마루</label>
						<input type="checkbox" name="category" id="door" value="도어">
						<label for="door">도어</label>
						<input type="checkbox" name="category" id="window" value="창호">
						<label for="window">창호</label>
						<br>
						<input type="checkbox" name="category" id="light" value="조명">
						<label for="light">조명</label>
						<input type="checkbox" name="category" id="bath" value="욕실">
						<label for="bath">욕실</label>
						<input type="checkbox" name="category" id="kitchen" value="주방">
						<label for="kitchen">주방</label>
						<input type="checkbox" name="category" id="paint" value="페인트">
						<label for="paint">페인트</label>
						<input type="checkbox" name="category" id="blind" value="블라인드">
						<label for="blind">블라인드</label>
					<!-- 		<select name="category">
								<option value="10">도배</option>
								<option value="20">장판</option>
								<option value="30">타일</option>
								<option value="40">마루</option>
								<option value="50">도어</option>
								<option value="60">창호</option>
								<option value="70">조명</option>
								<option value="80">욕실</option>
								<option value="90">주방</option>
								<option value="100">페인트</option>
								<option value="110">블라인드</option>
							</select> -->
						</td>
					</tr>
					<tr>
						<td>사업자 번호 &nbsp;&nbsp;</td>
						<td colspan="3"><input type="text" size="50" name="bsChange"></td>
					</tr>
					<tr>
						<td>사업등록신고일자 &nbsp;&nbsp;</td>
						<td colspan="3"><input type="text" size="50" name="bsChange"></td>
					</tr>
					<tr>
						<td>경력</td>
						<td>
						<div class="btn-radio">
							<input type="radio" name="bsYear" id="bsYear-1">
							<label for="bsYear-1">1년</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsYear" id="bsYear-2">
							<label for="bsYear-2">5년</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsYear" id="bsYear-3">
							<label for="bsYear-3">10년</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsYear" id="bsYear-4">
							<label for="bsYear-4">15년</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsYear" id="bsYear-5">
							<label for="bsYear-5">20년</label>
						</div>

						</td>
					</tr>
					<tr>
						<td>상호명</td>
						<td colspan="3"><input type="text" size="50" name="bsTitle"></td>
					</tr>
					<tr>
						<td>법인여부</td>
						<td>
						<div class="btn-radio">
							<input type="radio" name="bsCorp" id="bsCorpY">
							<label for="bsCorpY">예</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsCorp" id="bsCorpN">
							<label for="bsCorpN">아니오</label>
						</div>
						</td>
					</tr>
					<tr>
						<td>대표자명</td>
						<td colspan="3"><input type="text" size="50" name="bsName"></td>
					</tr>
					<tr>
						<td>대표연락처</td>
						<td colspan="3"><input type="text" size="50" name="bsPhone"></td>
					</tr>
					<tr>
						<td>AS가능 여부</td>
						<td>
						<div class="btn-radio">
							<input type="radio" name="bsAs" id="bsAsY">
							<label for="bsAsY">예</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsAs" id="bsAsN">
							<label for="bsAsN">아니오</label>
						</div>
						</td>
					</tr>
						<tr>
						<td>계약금</td>
						<td>
						<div class="btn-radio">
							<input type="radio" name="bsDeposit" id="bsDeposit-1">
							<label for="bsDeposit-1">5%</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsDeposit" id="bsDeposit-2">
							<label for="bsDeposit-2">10%</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsDeposit" id="bsDeposit-3">
							<label for="bsDeposit-3">20%</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsDeposit" id="bsDeposit-4">
							<label for="bsDeposit-4">30%</label>
						</div>
						<div class="btn-radio">
							<input type="radio" name="bsDeposit" id="bsDeposit-5">
							<label for="bsDeposit-5">기타</label>
						</div>
						
						
						</td>
					</tr>
						<tr>
						<td>거래은행</td>
						<td colspan="3"><input type="text" size="50" name="bsBank"></td>
					</tr>
					<tr>
						<td>계좌번호</td>
						<td colspan="3"><input type="text" size="50" name="bsBankNum"></td>
					</tr>
				</table>
            	<div class="save" align="center">
            		<p style="font-size:40px; color:white; padding-top:20px;">저장</p>
            	</div>
			</form>
		</div>
	</div>
	</div>
	<footer>
		<jsp:include page="../common/footer.jsp"/> 
	</footer>
	<script>
	$(".save").click(function() {
		$("#inputform").submit();
	});
	</script>
</body>
</html>