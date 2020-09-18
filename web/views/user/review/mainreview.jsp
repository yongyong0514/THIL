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
	margin: 0 auto;
}

header {
	margin: auto;
	width: 1200px;
	height: 60px;
}
.title{
	margin:auto;
	width:1200px;
	height:50px;
	padding-bottom:20px;
	}
.category{
	margin:auto;
	width:1200px;
	height:400px;
}
#detail{
	float:right;
	margin-right:20px;
	border:0;
	outline:0;
	font-size:20px;
	font-weight:bold;
	background:orange;
	color:white;
	border-radius:15px;
	cursor:pointer;
}
.reviewzone{
display:flex;
}
.reviewSide{
	margin: auto;
	width:1200px;
	background:#EBEFF2;

}
.reviewBoard{

	height:300px;
	width:658px;
	background:white;
	float:left;
}

.reviewPhoto{
	height:300px;
	width:430px;
	background:blue;
	float:left;
	margin-left:30px;

}
.list {
	margin: 0;
}
li{
	height:350px;
	list-style:none;
}


</style>
</head>
<body>
	<header>
	<jsp:include page="../common/menubar.jsp"/> 
	</header>
	<jsp:include page="../common/searchQenq.jsp"/> 
	<div class="category">
		<jsp:include page="../common/Kategorie.jsp"/> 
	</div>
	<div class="title">
	<h3>사용자 리뷰</h3>
	</div>
	<div class="reviewSide">
		<div class="reviewzone">
			<ul class="list">
				<li>
				<br>
				<c:forEach var="rev" items="$">
				<div class="reviewBoard">
					<input type ="hidden" value="<c:out value="${# }"/>">
					<p><c:out value="${ #}"/> x <c:out value="${# }"/> 윤창이의 황금망치  <button id="detail">자세히보기</button>
					<br><c:out value="${#}"/>경기도 남양주시
					<br><c:out value="${#}"/>창호 시공
					<br><c:out value="${#}"/>1,000만원
					</p>
					<p><c:out value="${#}"/>호캉스를 집에서 즐기는 거 같은 인테리어로 꾸며봤어요~ 마치 영화속 주인공이 된듯한 기분도 들고 너무너무 마음에 드네요!</p>
				</div>
				<div class="reviewPhoto">
					<img src="../../resources/image/city1.PNG" width="430px" height="300px">
				</div>
				</li>
				</c:forEach>
				<li>
				<br>
				<div class="reviewBoard">
				<p>김O호 님 x 윤창이의 황금망치  <button id="detail">자세히보기</button>
				<br>경기도 남양주시
				<br>창호 시공
				<br>1,000만원
				</p>
				<p>호캉스를 집에서 즐기는 거 같은 인테리어로 꾸며봤어요~ 마치 영화속 주인공이 된듯한 기분도 들고 너무너무 마음에 드네요!</p>
				</div>
				<div class="reviewPhoto">
				<img src="../../resources/image/city1.PNG" width="430px" height="300px">
				</div>
				
				</li>
				<li>
				<br>
				<div class="reviewBoard">
				<p>김O호 님 x 윤창이의 황금망치  <button id="detail">자세히보기</button>
				<br>경기도 남양주시
				<br>창호 시공
				<br>1,000만원
				</p>
				<p>호캉스를 집에서 즐기는 거 같은 인테리어로 꾸며봤어요~ 마치 영화속 주인공이 된듯한 기분도 들고 너무너무 마음에 드네요!</p>
				</div>
				<div class="reviewPhoto">
					<img src="../../resources/image/city1.PNG" width="430px" height="300px">
				</div>
				</li>
			</ul>
		</div>
		
		<table>
		
		
		</table>
	</div>
	<script>
	$(function(){
		$("#detail").click(function()){
			var str = $(this).find("input").val();
			
		}
	})
	
	</script>
</body>
</html>