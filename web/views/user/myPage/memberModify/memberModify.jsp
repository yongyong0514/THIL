<jsp:directive.page language="java"
   contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
   height: 128px;

}

.section {
   width: 200px;
   height: 1123px;

}

.article {

   width: 1000px;
   height: 1123px;
   background: #EBEFF2;
   text-align:center;
}
.changeform{
	margin-top:50px;
}
.c {
	border-spacing: 0 30px;
	margin: auto;
	font-size: 20px;
}

.c input[name="userId"],
.c input[name="userName"],
.c input[name="userNick"],
.c input[name="userBank"],
.c input[name="userAct"],
 .c input[type="password"]{
	width: 500px; /* 원하는 너비 설정 */
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
.c input[name=tel1],
.c input[name=tel2],
.c input[name=tel3] {
	width: 140px;
	height: 35px;
	line-height: normal; /* line-height 초기화 */
	padding: .5em .5em; /* 원하는 여백 설정, 상하단 여백으로 높이를 조절 */
	font-size: 20px;
	border: 1px solid #999;
	border-radius: 10px; /* iSO 둥근모서리 제거 */
	outline-style: none; /* 포커스시 발생하는 효과 제거를 원한다면 */
	-webkit-appearance: none; /* 브라우저별 기본 스타일링 제거 */
	-moz-appearance: none;
	appearance: none;
}

.saveman {
	margin-top: 30px;
}

#modify {
	background: #012E41;
	width: 100%;
	height: 80px;
	color: white;
	font-size: 25px;
}

#delete {
	margin-top: 10px;
	background: white;
	width: 100%;
	height: 80px;
	font-size: 25px;
	color: gray;
}

footer{

   width:1200px;
   height:200px;
   margin:auto;
}
.title {
   height: 100px;
   font-size: 30px;
   font-weight: bolder;
}
.val2 {
   font-size: 18px;
   width: 600px;
   height: 40px;
   background: #012E41;
   color: white;
   border-radius: 5px;
}
.val {
   font-size: 18px;
   width: 150px;
   height: 40px;
   background: #012E41;
   color: white;
   border-radius: 5px;
}

.listResult {
   height: 120px;
   background: white;
}

.listButton {
   height: 40px;
   background: white;
}

.reqButton {
   font-family: "NanumGothic";
   font-weight: normal;
   font-size: 15px;
   margin-right: 10px;
   width: 80px;
   height: 30px;
   background: #F2A71A;
   color: white;
   border: none;
   outline: none;
   cursor: pointer;
}

.reqButton:hover {
   background: #012E41;
   color: white;
}

</style>
</head>
<body>
   <header>
   <jsp:include page="../../common/menubar.jsp"/> 
   <jsp:include page="../../common/searchQenq.jsp"/> 
   </header>
   <div class="information">
   <jsp:include page="../../common/mypagebar.jsp"/> 
   </div>
      <div class="inner">
         <div class="section">
         <jsp:include page="../../common/sidebar.jsp"/> 
         </div>
         <div class="article">
     
			<div class="changeform">
				<h1 align="center">정보 수정</h1>	
				<form id="modifyForm"
					action="${ applicationScope.contextPath }/modify.mp" method="post">
					<table class="c" align="center">
						<tr>
							<td width="220px">* 아이디(이메일)</td>
							<td><input type="text" maxlength="13" name="userId"
								id="userId" value="<c:out value="${ sessionScope.loginUser.userId }"/>" disabled /></td>
						</tr>
						<tr>
							<td>* 이름</td>
							<td><input type="text" maxlength="5" name="userName"
								value="<c:out value="${ sessionScope.loginUser.userName }"/>" disabled /></td>
						</tr>
						<tr>
							<td>* 닉네임</td>
							<td><input type="text" maxlength="5" name="userNick"></td>
						</tr>
						<tr>
							<td>* 연락처</td>
							<td><input type="text" maxlength="3" name="tel1" size="2"
									placeholder="010" onfocus="this.placeholder=''"
									onblur="this.placeholder='010'"/>  -  
									<input type="text" maxlength="4" name="tel2" size="2"
									placeholder="1234" onfocus="this.placeholder=''" 
									onblur="this.placeholder='1234'"/>  -  
									<input type="text" maxlength="4" name="tel3" size="2"
									placeholder="5678" onfocus="this.placeholder=''"
									onblur="this.placeholder='5678'"/></td>
						</tr>
						<tr>
							<td>* 비밀번호</td>
							<td><input type="password" maxlength="13" name="userPwd"></td>
							<td></td>
						</tr>
						<tr>
							<td>* 비밀번호확인</td>
							<td><input type="password" maxlength="13" name="userPwd2"></td>
							<td><label id="pwdResult"></label></td>
						</tr>

						<tr>
							<td>거래은행</td>
							<td><input type="text" size="50" name="userBank"></td>
						</tr>
						<tr>
							<td>계좌번호</td>
							<td><input type="text" size="50" name="userAct"></td>
						</tr>

					</table>
					<div class="saveman" align="center">
						<button id="modify" onclick="modify();">정보 수정</button>
					
						<button id="delete">회원탈퇴</button>
					</div>
				</form>
			</div>
         </div>
      </div>
         <footer>
      <jsp:include page="../../common/footer.jsp"/> 
   </footer>
   
   <script>

	function modify() {
		$("#modifyForm").submit();
	}


</script>
   </script>
</body>
</html>