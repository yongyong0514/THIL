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
		margin:0 auto;
	}
	.portfolio {
		width:380;
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


  <%--우리동네 포트폴리오 --%>
    <div class="townPhoto">
		<c:forEach var="hmap" items="${ requestScope.list }">
		<div class="portfolio"> 	
			<div class="thumb-list" align="center">	
			
				<div>
					<input type="hidden" name="str" value="<c:out value="${ hmap.bno }"/>">
					<img src="${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/<c:out value="${ hmap.changeName}"/>
						"width="380px" height="290px">
				</div>
				
				<p><c:out value="${ hmap.bsAdd }"/>
				<c:out value="${hmap.catName }"/>
				비용 : <c:out value="${ hmap.portPrice }"/><br></p>
				<p id="bsTitle" ><c:out value="${ hmap.bsTitle }"/><br></p>
				<p><c:out value="${ hmap.portNote }"/></p>
				
			</div>
	
		</div>
		</c:forEach>
		
    </div>

 
    
    <script>
		/* $(function(){
			$(".portfolio").click(function(){
				
				var str = $(this).find("input").val();
								
				location.href="${applicationScope.contextPath}/selectOne.wo?str=" + str; 
				
			})
		}); */
		$(function(){
			$(".portfolio").click(function(){
				
				var str = $(this).find("input").val();
		
			window.open("${applicationScope.contextPath}/selectOne.wo?str=" + str, "townReq", "resizable=yes, left=200, top=100, width:600, height:500"); 
			/* location.href="${applicationScope.contextPath}/selectOne.wo"; */
		})
	});
		
	</script>
</body>
</html>









