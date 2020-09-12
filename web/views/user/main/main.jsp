<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${ pageContext.request.contextPath }" scope="application"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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

	.wrap {
		width:1200px;
        height:4500px;
        margin:auto;
        font-weight:bold; 
        text-decoration: none;
	}
	.photo {
		width:1200px;
		height:500px;
		border:2px dashed darkgray;
		float:left;
	}
	.photo-rivew {
		width:100%;
		height:800px;
		border:2px dashed darkgray;
		float:left;
	}
</style>
</head>
<body>
	<div class="wrap">
    <jsp:include page="../common/menubar.jsp"/>
	<jsp:include page="../common/searchQenq.jsp"/>
  	<jsp:include page="../common/Kategorie.jsp"/>
    <jsp:include page="../common/locateSelectbar.jsp"/>
   <!-- 리뷰 슬라이드 -->
    <div class="photo">포트폴리오
    	
  </div>
    <jsp:include page="../common/townArea.jsp"/>
    <jsp:include page="../common/footer.jsp"/>
</div>

   
    
    <script>
    $(function() {
    	$('.gallery').bxSlider({
    		auto:true,
    		autoControls:false,
    		pagerCutom:'.slider-gallery'
    	});
    });
	</script>
</body>
</html>









