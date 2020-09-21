<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
img {
		margin: 0;
    	padding: 0;
    	border: 0;
    	font-size: 100%;
    	font-style: normal;
    	vertical-align: top;
    	box-sizing: border-box
	}
.wrap {
		width: 1200px;
		height:100%;
        margin: auto;
        font-weight: bold;
	}
.content{
		background: white;
		float: left;
		width: 900px;
		height: 450px;
	}
	.Kategorie {
		width: 100%;
		height: 30%;
	}
	.Kategorie-item {
		background: white;
		width: 900px;		
		float: left;
		margin-left: 0 auto;      
	}
	.item{
		width:100px;
		height:30px;
		margin: 50px;
		float:left;
		cursor:pointer;
		font-size:20px;
		color:navy;
    	text-align: center;
	}
	.connect {
		background: white;
		margin-top:30px;
		float: left;
		width: 300px;
		height: 450px;
	}
</style>
</head>
<body>
<div class="content">
    <div class="Kategorie">
    <div class="Kategorie-item">
			<div class="item" id="paper">
			<input type="hidden" name="str" value="C001"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item01.png" width="50" height="50"><br>
				<a>도배</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C002"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item02.png" width="50" height="50"><br>
			<a>장판</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C003"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item03.png" width="50" height="50"><br>
			<a>타일</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C004"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item04.png" width="50" height="50"><br>
			<a>마루</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C005"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item05.png" width="50" height="50"><br>
			<a>도어</a
			></div>
			<div class="item">
			<input type="hidden" name="str" value="C006"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item06.png" width="50" height="50"><br>
			<a>창호</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C007"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item07.png" width="50" height="50"><br>
			<a>조명</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C008"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item08.png" width="50" height="50"><br>
			<a>욕실</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C009"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item09.png" width="50" height="50"><br>
			<a>주방</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C010"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item10.png" width="50" height="50"><br>
			<a>페인트</a>
			</div>
			<div class="item">
			<input type="hidden" name="str" value="C011"/>
			<img src="<%=request.getContextPath()%>/resources/images/main/item11.png" width="50" height="50"><br>
			<a>블라인드</a>
			</div>
		</div>
    </div>   
    </div>
    <div class="connect">
    	<div class="connect-nav">
    		<div class="c-title" style="color:orange; font-size:50px;"><a>퀵:커넥트</a></div><br>
			<div class="citem" style="font-size:25px;"><a># 격식있는 스타일</a></div><br>
			<div class="citem" style="font-size:25px;"><a># 직선이 만들어낸 시원한 스타일</a></div><br>
			<div class="citem" style="font-size:25px;"><a># 아늑하고 따스한</a></div><br>
			<div class="citem" style="font-size:25px;"><a># 군더더기 없는 깔끔한 스타일</a></div><br>
		</div>
    </div>
    <script>
   
     
       $(function(){
		$(".item").click(function(){
			
			var str = $(this).find("input").val();
							
			location.href="${applicationScope.contextPath}/catNameSelect.cs?str=" + str; 
			
		})
	});   
      
      /* $(".item").click(function() {
    	  var str = $(this).find("input").val();
    	  
    	  $.ajax({
    		  url:"${applicationScope.contextPath}/catNameSelect.cs?str=" + str,
    		  type:"GET",
			  	 async: false,
			  	  success:function(data) {
			  		  console.log(data);
			  		  				  		  
			  		
			  		var $townPhoto = $(".townPhoto");
			  		for(var i = 0; i < data.length; i++) {
				  		var $div_portfolio = $("<div class='portfolio'>");
				  		var $div_thumb_list = $("<div class='thumb-list' align='center'>");
				  		var $div_img = $("<img class='imgDiv'>");
				  		//var $div_img = $("<img class='imgDiv' src='${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/"+data[i].changeName+"'> style='z-index:10;'");
				  		var $img = $("<img src=''>");
				  		var $input_bno = $("<input type='hidden' name='str' value=''/>");
				  		var $p2 =$("<p id='bsTitle'>")
				  		var $p = $("<p id='bsText'>");
				  		var $p3 = $("<p id='portNote'>")
				  		$input_bno.val(data[i].bno);
				  		$div_img.attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[i].changeName);
				  		$img.attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[i].changeName);
				  		$p.text(data[i].bsAdd +"                    "+data[i].catName + "     " + "비용 : "  + data[i].portPrice + " 만원");					  	
				  		$p2.text(data[i].bsTitle);
				  		$p3.text(data[i].portNote);				  		
				  		$div_thumb_list.append($div_img);
				  		$div_thumb_list.append($input_bno);
				  		$div_thumb_list.append($p)
				  		$div_thumb_list.append($p2)
				  		$div_thumb_list.append($p3)
				  		$div_portfolio.append($div_thumb_list);
				  		$townPhoto.append($div_portfolio);
				  		
				  		
				  		
			  		/* $tpho = $("#tPhoto").attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[0].changeName);			  		
			  		$img = $("<img>").attr("src","${ applicationScope.contextPath }/resources/upLoadFiles/portfolio/" + data[0].changeName); */				  						  											
					
			  		$("${applicationScope.contextPath}/views/user/woori/TownCatName.jsp").val(resultStr);
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











