<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
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


  <%--우리동네 포트폴리오 임시 --%>
    <div class="townPhoto">
		<div class="portfolio">
			<c:forEach var="list" items="${ requestScope.list }">
			<div class="thumb-list" align="center">
			<input type="hidden" value="<c:out value="${ list.bno }"/>">
				<div>
					<input type="hidden" value="<c:out value="${ list.bno }"/>">
					<img src="${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/<c:out value="${ requestScope.files[0].changeName}"/>
						"width="380px" height="290px">
				</div>
				
				<p><c:out value="${ list.bsAdd }"/>
				<c:out value="${list.catName }"/>
				비용 : <c:out value="${ list.pPrice }"/><br></p>
				<p id="bsTitle" ><c:out value="${ list.bsTitle }"/><br></p>
				<p><c:out value="${ list.pNote }"/></p>
				
			</div>
		</c:forEach>
		
		
		
		</div>
		
    </div>

 
    
    <script>
   
    </script>
</body>
</html>









