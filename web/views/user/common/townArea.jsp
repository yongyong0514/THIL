<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내가 사는 그집</title>
<style>
	body {
		margin: 0;
    	padding: 0;
    	border: 0;
    	font-size: 100%;
    	font-style: normal;
    	vertical-align: top;
    	box-sizing: border-box;
	}

	.townPhoto {
		width:1200px;
		height:3000px;
		border:2px dashed darkgray;
		float:left;
	}
</style>
</head>
<body>


  <%--우리동네 포트폴리오 임시 --%>
    <div class="townPhoto">
		<div class="portfolio">
		
		<c:forEach var="hmap" items="${ requestScope.list }">
			<div class="thumb-list" align="center">
				<div>
					<input type="hidden" value="<c:out value="${ hmap.bid }"/>">
					<img src="${ applicationScope.contextPath }/resources/thumbnail_uploadFiles/<c:out value="${ hmap.changeName }"/>"
						width="200px" height="150px">
				</div>
				<p>
				No. <c:out value="${ hmap.bno }"/> <c:out value="${ hmap.bTitle }"/><br>
				조회수 : <c:out value="${ hmap.bCount }"/>
				</p>
			</div>
		</c:forEach>
		
		</div>
		
    </div>

 
    
    <script>
   
    </script>
</body>
</html>









