<jsp:directive.page language="java"
   contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
  $( function() {
    var dateFormat = "mm/dd/yy",
      from = $( "#from" )
        .datepicker({
          defaultDate: "+1w",
          changeMonth: true,
          numberOfMonths: 3
        })
        .on( "change", function() {
          to.datepicker( "option", "minDate", getDate( this ) );
        }),
      to = $( "#to" ).datepicker({
        defaultDate: "+1w",
        changeMonth: true,
        numberOfMonths: 3
      })
      .on( "change", function() {
        from.datepicker( "option", "maxDate", getDate( this ) );
      });
 
    function getDate( element ) {
      var date;
      try {
        date = $.datepicker.parseDate( dateFormat, element.value );
      } catch( error ) {
        date = null;
      }
 
      return date;
    }
  } );
</script>
<style>
body {
   font-family: "NanumGothic";
   font-weight: bolder;
   font-size: 14px;
}
.dateForm{
	width:145px;
	height:13px;
}
#calendar{
	width:90px;
	height:90px;
	margin-left:-120px;
}
.space {
   height: 5px;
}

.outer {
   width: 500px;
   height: 1000px;
   background: #EBEFF2;
}

.inner {
   margin-right: 10px;
   margin-top: 5px;
   float: right;
   width: 374px;
   height: 950px;
   border: 2px solid #C4C4C4;
   border-radius: 5px;
   background: white;
}

.reqTitle1 {
   width: 500px;
   height: 25px;
   background: #012E41;
   color: white;
   text-align: center;
}

.reqTitle2 {
   width: 374px;
   height: 15px;
   color: #012E41;
}

.box1 {
   width: 280px;
   height: 25px;
   margin-left: 30px;
   outline: none;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}

.box2 {
   width: 150px;
   height: 30px;
   margin-left: 15px;
   outline: none;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
   cursor: pointer;
}

.btn1 {
   font-size: 1px;
   width: 83px;
   height: 40px;
   margin-left: 5px;
   border: 1px solid #C4C4C4;
   background: white;
   border-radius: 5px;
   outline: none;
   cursor: pointer;
}

.btn1:hover {
   background: #F2A71A;
   color: white;
}

.btn1:focus {
   background: #F2A71A;
   color: white;
}

.btn2 {
   font-size: 12px;
   width: 350px;
   height: 30px;
   margin-left: 7px;
   background: #F2F2F2;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
   background: white;
   color:lightgray;
}

.btn2:hover {
   background: #F2A71A;
   color: white;
}

.btn2:focus {
   background: #F2A71A;
   color: white;
}

.btn3 {
   font-size: 1px;
   margin-left: 15px;
   width: 92px;
   height: 30px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}

.btn3:hover {
   background: #F2A71A;
   color: white;
}

.btn3:focus {
   background: #F2A71A;
   color: white;
}
.btnex{
   font-size: 12px;
   margin-left: 8px;
   width: 245px;
   height: 30px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
   color:lightgray;
}



.fontGroup1 {
   font-size: 12px;
}

.nextBtn {
   font-size: 15px;
   margin-top: 10px;
   margin-left: -3px;
   width: 374px;
   height: 40px;
   border: none;
   outline: none;
   background: #F2774B;
   color: white;
   font-weight: bolder;
   cursor: pointer;
}

.nextBtn:hover {
   background: #BFAE56;
}
.fontGroup11{
	color:lightgray;
	font-size:6px;
}
#span{
   width: 350px;
   height: 80px;
   background-color:#ECECEC;
   border:1px solid #ECECEC;
   margin:0 auto;
}
.plusText{
	width:350px;
	height:80px;
	border:1px solid lightgray;
	margin:0 auto;
}
</style>
</head>
<body>
   <div class="outer">
      <table>
         <tr>
            <th class="reqTitle1">의뢰하기</th>
         </tr>
      </table>
      <div>
         <jsp:include page="reqMenu1.jsp" />
      </div>
      <div class="inner">
         <table>
            <tr>
               <th class="reqTitle2">의뢰 신청</th>
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;&nbsp;&nbsp;시공 시작 희망일과 종료일을 선택해주세요.<br>
               </td>
            </tr>
            <tr>
              <td>
	            <label for="from">시작일</label>
				<input class="dateForm" type="text" id="from" name="from"><br>
				<label for="to">종료일</label>
				<input class="dateForm" type="text" id="to" name="to">
			  </td>
			  <td>
            	<img src="resources/calendar.png" id="calendar">
              </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;생각하시는 예산을 알려주세요.</td>
            </tr>
            <tr>
               <td>
                <div class="Container" >
  					<font size = 2 id = "slider_value_view">0</font>						  
  					<input style = "width:80%;" class="slider_range" type="range" value="0" min="10000000" max="500000000" step="500000"></input>						  
				</div>
               </td>
            <tr class="space">
            </tr>
          
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;시공하려는 지역을 선택해주세요.</td>
            </tr>
            <tr>
               <td>
                  <button class="btnex">이곳을 클릭 후 주소를 검색해주세요</button>
                  <button class="btn3">주소검색</button>
               </td>
            </tr>
            <tr>
               <td>
                  <button class="btn2">(선택)상세주소를 입력해주세요. 예)102동 401호</button>
               </td>
            </tr>
            <tr class="space">
            </tr>
             <tr>
               <td class="fontGroup1">&nbsp;&nbsp;이름을 입력해주세요.</td>
            </tr>
    		<tr>
               <td>
                  <button class="btn2">이름을 입력해주세요.</button>
               </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;휴대폰 번호를 입력해주세요.</td>
            </tr>
            <tr>
               <td>
                  <button class="btnex">휴대폰 번호를 입력해주세요.</button>
                  <button class="btn3">인증번호요청</button>
               </td>
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;시공하실 공간의 사진을 등록해주세요.</td>
            </tr>
            <tr>
               <td class="fontGroup11">&nbsp;&nbsp;(현재 0/20개, 총 0/20Mb)</td>
            </tr>
    		<tr>
               <td>
					<div id="span"></div>
               </td>
            </tr>
            <tr class="space">
            </tr>
              <tr>
            <td class="fontGroup1">&nbsp;&nbsp;공간의 상황을 선택해주세요.</td>
            </tr>
            <tr>
               <td>
                  <button class="btn1"><br>현재공실<br></button>
                  <button class="btn1">시공 시<br>공실예정</button>
                  <button class="btn1">거주 중<br>(부분시공예정)</button>
                  <button class="btn1">거주 중<br>(보관이사예정)</button>
               </td>
            </tr>
            <tr class="space">
            </tr>
             <tr>
               <td class="fontGroup1">&nbsp;&nbsp;시공 공간에 엘레베이터 여부를 선택해주세요.</td>
            </tr>
            <tr>
               <td>
                  <button class="btn3">네, 있습니다.</button>
                  <button class="btn3">아니요, 없습니다.</button>
               </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;요청사항이 있다면 입력해주세요.</td>
            </tr>
    		<tr>
    			<td>
    				<input type="text" placeholder="예)기존 싱크대 철거할 때 곰팡이 제거를 같이하고싶어요." class="plusText">
    			</td>
    		</tr>
    		<tr class="space">
            </tr>
            <tr>
				<td>
					<input name="check" id="check" type="checkbox"  value="all">
					<label for="check">전체동의</label>
				</td>
            </tr>
            <tr>
            	<td>
            		<hr>
            	</td>
            </tr>
            <tr class="space">
            </tr>
              <tr>
				<td>
					<input name="check" id="check" type="checkbox"  value="information1">
					<label for="check">(필수)개인정보 수집 및 이용에 동의</label>
				</td>
            </tr>  
            <tr>
				<td>
					<input name="check" id="check" type="checkbox"  value="information2">
					<label for="check">(필수) 개인정보 제3자 제공에 동의</label>
				</td>
            </tr>
         </table> 
         <table>
            <tr>
               <td>
                  <a href="step2.jsp"><button class="nextBtn">다음</button></a>
               </td>
            </tr>
         </table>
      </div>
   </div>
   <script>

		function ShowSliderValue(sVal)
		{
			var obValueView = document.getElementById("slider_value_view");
			obValueView.innerHTML = sVal +"원";
		}
		
		var RangeSlider = function(){
			var range = $('.slider_range');
		    
			range.on('input', function(){		
				ShowSliderValue(this.value);
			});
		};
		
		RangeSlider();


	</script>



</body>
</html>