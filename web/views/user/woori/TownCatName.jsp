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
	.imgDiv {
		width:380px;
		height:290px;
	}
</style>
</head>
<body>


  <%--우리동네 포트폴리오 --%>
    <div class="townPhoto">
		<c:forEach var="hmap" items="${ requestScope.list }">
	<div class="portfolio"> 	
			<div class="thumb-list" align="center">	
			
				<div id="imgDiv">
					<input type="hidden" name="str" value="<c:out value="${ hmap.bno }"/>">
					<img id="tPhoto" src="${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/<c:out value="${ hmap.changeName}"/>
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
		/*  $(document).ready(function(){
			  $.ajax({ url:"${ applicationScope.contextPath }/selectList.tw",
				  	   type:"GET",
				  	 async: false,
				  	  success:function(data) {
				  		  console.log(data);
				  		  				  		  
				  		
				  		var $townPhoto = $(".townPhoto");
				  		for(var i = 0; i < data.length; i++) {
					  		var $div_portfolio = $("<div class='portfolio'>");
					  		var $div_thumb_list = $("<div class='thumb-list' align='center'>");
					  		var $div_img = $("<div class='imgDiv'>");
					  		var $img = $("<img src=''>");
					  		var $input_bno = $("<input type='hidden' name='str' value=''/>");
					  		var $p =$("<p id='bsTitle'>")
					  		var $p = $("<p>");
					  		$input_bno.val(data[i].bno);
					  		$div_img.attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[0].changeName);
					  		$img.attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[0].changeName);
					  		$p.text(data[i].bsAdd);
					  		$p.text(data[i].catName);
					  		비용 : $p.text(data[i].portPrice);
					  		$p.text(data[i].bsTitle);
					  		$p.text(data[i].portNote);
					  		$div_thumb_list.append($div_img);
					  		$div_thumb_list.append($input_bno);
					  		$div_thumb_list.append($p)
					  		$div_portfolio.append($div_thumb_list);
					  		$townPhoto.append($div_portfolio);

				  		}
				  		
				  	  },
				  	  error : function(e) {
				  		  alert("에러발생");
				  	  }
			  });
		  }); */
	</script>	
</body>
</html>









