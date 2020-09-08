<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header {
	margin: 0 auto;
	width: 1200px;
	height: 50px;
}
.wrap {
	width: 1200px;
	height: 100%;
	margin: auto;
	font-weight: bold;
}


.middle {
	width: 1200px;
	height: auto;
	margin: auto;
}

.title {
	margin-top: 50px;
	width: 1200px;
	height: 100px;
}

.nav1 {
	background: #012E41;
	width: 100%;
	height: 20px;
}

.qna-area {
	background: #EBEFF2;
	width: 100%;
	height: 1100px;
}

.menuBtn {
	margin-top: 0px;
	width: 14%;
	height: 100%;
	float: left;
}

.menuList {
	background: #EBEFF2;
	color: #012E41;
	font-weight: bolder;
	font-size: 25px;
	width: 200px;
	height: 100px;
}

.aboutList {
	width: 80%;
	height: 100%;
	float: left;
	font-weight: bolder;
	font-size: 25px;
	margin-left: 52px;
	
}
.qna-formarea{
	background: white;
	border: 5px groove #ced4da;
	width: 930px;
	height: 95%;
	padding: 10px;
	margin-top: 10px;
}
.c {
	border-spacing: 0 25px;
	margin:auto;
	

}

.c input[type="text"], .c input[type="password"], .c input[type="tel"] {
	width: 550px; /* 원하는 너비 설정 */
	height: auto; /* 높이값 초기화 */
	line-height: normal; /* line-height 초기화 */
	padding: .8em .5em; /* 원하는 여백 설정, 상하단 여백으로 높이를 조절 */
	font-size: 20px;
	border: 1px solid #999;
	border-radius: 10px; /* iSO 둥근모서리 제거 */
	outline-style: none; /* 포커스시 발생하는 효과 제거를 원한다면 */
	-webkit-appearance: none; /* 브라우저별 기본 스타일링 제거 */
	-moz-appearance: none;
	appearance: none;
}

.c select {
	width: 550px;
	height: auto;
	line-height: normal;
	font-size: 20px;
	padding: .8em .5em;
	border: 1px solid #999;
	border-radius: 10px;
}

.c input[type="checkbox"] {
	width: 20px;
	height: 20px;
}

.c label[name="b"] {
	color: #F2A71B;
}

.c textarea {
	font-size: 20px;
}

.btns {
	margin-top: 35px;
}

button[type="submit"] {
	background: #012E41;
	width: 100%;
	height: 60px;
	color: white;
	font-size: 25px;
}

.menuList:hover {
	background: #012E41;
	color: white;
}
</style>
</head>
<body>

	<header>
		<jsp:include page="../common/menubar.jsp" />

	</header>
	<jsp:include page="../common/searchQenq.jsp" />
	<div class="wrap">
		<div align="center" class="middle">
			<div class="title">
				<h1 align="center">고객센터</h1>
			</div>
			<div class="nav1"></div>
			<div class="qna-area">
				<div class="menuBtn">
					<div>
						<a onclick="location.href='#'"><input type="submit"
							class="menuList" value="1:1 문의"></a>
					</div>
					<div>
						<a onclick="location.href='#'"><input type="submit"
							class="menuList" value="자주 묻는 질문"></a>

					</div>
				</div>

				<div class="aboutList">
					<div class="qna-formarea">
						<c:if test="${ empty sessionScope.loginUser }">
							<form id="qnaForm"
								action="${ applicationScope.contextPath }/login.me"
								method="post">
								<table class="c" align="center">
									<tr>
										<td width="200px">이름</td>
										<td width="550px"><input type="text" name="userName"
											placeholder="이름" onfocus="this.placeholder=''"
											onblur="this.placeholder='이름'" /></td>
									</tr>
									<tr>
										<td>연락처</td>
										<td><input type="tel" name="userPhone" placeholder="연락처"
											onfocus="this.placeholder=''" onblur="this.placeholder='연락처'" /></td>
									</tr>
									<tr>
										<td>아이디(이메일)</td>
										<td><input type="text" name="userEmail"
											placeholder="아이디(이메일)" onfocus="this.placeholder=''"
											onblur="this.placeholder='아이디(이메일)'" /></td>
									</tr>
									<tr>
										<td>회원코드</td>
										<td><input type="text" name="userNick" placeholder="회원코드"
											onfocus="this.placeholder=''"
											onblur="this.placeholder='회원코드'" /></td>
									</tr>
									<tr>
										<td>문의 유형</td>
										<td><select id="searchCondition" name="searchCondition">
												<option value="">문의유형을 선택해 주세요.</option>
												<option value="">사업자 신고</option>
												<option value="">리뷰 신고</option>
												<option value="">파트너스 관련 문의</option>
												<option value="">공사 후 문의</option>
												<option value="">기타 문의</option>
										</select></td>
										<td><label id="nnResult"></label></td>
									</tr>
									<td>문의 내용</td>
									<td><textarea name="content" cols="40" rows="7"
											style="resize: none;"></textarea></td>
									<tr>
									<tr>
										<td></td>
										<td><input type="checkbox" id="" name="" value="">
											<label for="">전체 동의</label></td>
									</tr>
									<tr>
										<td></td>
										<td>&nbsp;<input type="checkbox" id="" name="" value="">
											<label for="" name="b">(필수)</label><label>개인정보 수집 및
												이용에 동의</label></td>
									</tr>
									<tr>
										<td></td>
										<td>&nbsp;<input type="checkbox" id="" name="interest"
											value="낚시"> <label for="" name="b">(필수)</label><label>개인정보
												제 3자 제공에 동의</label></td>
									</tr>
									<tr>
										<td></td>
										<td>&nbsp;<input type="checkbox" id="" name="" value="">
											<label for="" name="b">(선택)</label><label>인테리어 정보 및
												마케팅 수신에 동의</label></td>
									</tr>
								</table>
								<div class="btns" align="center">

									<button type="submit">문의하기</button>

								</div>

							</form>
						</c:if>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<jsp:include page="../common/footer.jsp" />
		</div>
	</div>
</body>
</html>