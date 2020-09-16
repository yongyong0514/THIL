<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="styleshet" href="css/jquery.bxslider.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내가 사는 그집</title>
<style>
.townPhoto {
		width:1200px;
		height:3000px;
		border:2px dashed darkgray;
		margin:0 auto;
		float:left;
	}
	.portfolio {
		width:380;
		height:400;
		display:inline-block;
		margin:10px;
		align:center;
	}
	.portfolio {
		opacity:0.8;
		cursor:pointer;
	}
	#bsTitle {
		font-size:22px;
		color:orange;
	}
</style>
</head>
<body>
	<div class="wrap">
    <jsp:include page="../common/menubar.jsp"/>
	<jsp:include page="../common/searchQenq.jsp"/>
  	<jsp:include page="../common/Kategorie.jsp"/>
    <jsp:include page="../common/locateSelectbar.jsp"/>
    
     <div class="townPhoto">
		<div class="portfolio">
			<c:forEach var="hmap" items="${ requestScope.list }">
			<div class="thumb-list" align="center">
			<input type="hidden" value="<c:out value="${ hmap.bno }"/>">
				<div>
					<input type="hidden" value="<c:out value="${ hmap.bno }"/>">
					<img src="${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/<c:out value="${ hmap.changeName}"/>
						"width="380px" height="290px">
				</div>
				
				<p><c:out value="${ hmap.bsAdd }"/>
				<c:out value="${hmap.catName }"/>
				비용 : <c:out value="${ hmap.pPrice }"/><br></p>
				<p id="bsTitle" ><c:out value="${ hmap.bsTitle }"/><br></p>
				<p><c:out value="${ hmap.pNote }"/></p>
				
			</div>
		</c:forEach>
	
		</div>
		
    </div>
  
    <jsp:include page="../common/footer.jsp"/>
    </div>
    <!-- 우리동네 진행중 -->
    <script>
   
    </script>
</body>
</html>









