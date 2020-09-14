<jsp:directive.page language="java"
   contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
<style>
body {
   font-family: "NanumGothic";
   font-weight: bolder;
   font-size: 14px;
}

.space {
   height: 5px;
}

.outer {
   width: 500px;
   height: 600px;
   background: #EBEFF2;
}

.inner {
   margin-right: 10px;
   margin-top: 5px;
   float: right;
   width: 374px;
   height: 550px;
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
   font-size: 12px;
   width: 80px;
   height: 30px;
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
.btn1.active-color{
   color:#F2A71A;
}

.btn2 {
   font-size: 12px;
   width: 110px;
   height: 30px;
   margin-left: 7px;
   background: #F2F2F2;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
   background: white;
   width: 110px;
}

.btn2:hover {
   background: #F2A71A;
   color: white;
}

.btn2:focus {
   background: #F2A71A;
   color: white;
}
 .btn2.active-color{
   color:#F2A71A;
}

.btn3 {
   font-size: 12px;
   margin-left: 15px;
   width: 160px;
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
.btn3.active-color{
   color:#F2A71A;
}

.select1 {
   font-size: 12px;
   margin-left: 5px;
   width: 347px;
   height: 30px;
   outline: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}

.fontGroup1 {
   font-size: 12px;
}

.nextBtn {
   font-size: 15px;
   margin-top: 15px;
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
#radios{
   font-size: 12px;
   margin-left: 15px;
   width: 160px;
   height: 30px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}
input[type=radio]{
   display:none; margin:10px;
   
}
input[type=radio]+label{
   /* display:inline-block;
   margin:-2px;
   padding:8px 19px;
   background-color:white;
   border:1px solid #ccc;
   font-size:13px !important;
   width:110px;
   text-align:center; */
   margin-top:5px;
   padding:7px 45px;
   font-size: 10px;
   margin-left: 15px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}

#br1{
	 margin-top:5px;
   padding:7px 16px;
   font-size: 10px;
   margin-left: 11px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}

#br1:hover{
	background: #F2A71A;
   color: white;
}
#br1:checked + label {
   background-color: #F2A71A;
   color: white;
}
.w{
margin-top:5px;
   padding:7px 20px;
   font-size: 10px;
   margin-left: 11px;
   background: white;
   outline: none;
   border: none;
   cursor: pointer;
   border: 1px solid #C4C4C4;
   border-radius: 5px;
}
.w:hover{
	background: #F2A71A;
   color: white;
}
.w:checked + label {
   background-color: #F2A71A;
   color: white;
}
input[type=radio]+label:hover {
   background: #F2A71A;
   color: white;
}

input[type=radio]:checked + label {
   background: #F2A71A;
   color: white;
}
input[type=radio].active-color{
   color:#F2A71A;
}
 input[type=radio]:radio+label{
   background-image:none;
   background: #F2A71A;
   color:white;
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
         <jsp:include page="reqMenu.jsp" />
      </div>
      <div class="inner">
         <form id="insertRequest"action="${ applicationScope.contextPath}/insertRequest" method="post">
         <table>
            <tr>
               <th class="reqTitle2">의뢰 신청</th>
            </tr>
            
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;&nbsp;&nbsp;업종<input
                  type="text" value="도배" class="box1"readonly name="part"></td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;도배를 시공하려는 공간의 개수를 선택해주세요</td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td >
               	  <input id="br1" type="radio" name="broom"> <label class="br" for="br1">거실 1개</label>
                  <input id="br2" type="radio"name="broom"><label  class="br" for="br2">거실 2개</label>
                  <input id="br3"  type="radio" name="broom"> <label class="br" for="br3">거실 3개</label>
                  <input id="br4" type="radio"name="broom"><label class="br" for="br4">거실 4개</label>
               </td>
            <tr class="space">
            </tr>
            <tr>
               <td><select class="select1" name="room">
                     <option value="방1개">방 1개</option>
                     <option value="방2개">방 2개</option>
                     <option value="방3개">방 3개</option>
                     <option value="방4개">방 4개</option>
                     <option value="방5개">방 5개</option>
                     <option value="방6개">방 6개</option>
                     <option value="방7개">방 7개</option>
                     <option value="방8개">방 8개</option>
                     <option value="방9개">방 9개</option>
                     <option value="방10개">방 10개</option>
               </select></td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;시공할 전체 면적을 입력해주세요.</td>
            </tr>
            <tr>
               <td><input type="text" align="center" class="box2"
                  placeholder="평" name="size"> <img src=""> <input type="text"
                  align="center" class="box2" placeholder="m2"></td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;시공할 벽지의 종류를 선택해주세요</td>
            </tr>
            
            <tr>
               <td>
               	  <input class="w" id="w1" type="radio" name="wall"> <label class="w" for="w1">실크</label>
                  <input class="w" id="w2" type="radio"name="wall"><label class="w" for="w2">합지</label>
                  <input class="w" id="w3"  type="radio" name="wall"> <label class="w" for="w3">선택안함</label>
  
               </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;천장 시공 여부를 선택해주세요<br></td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td>
                <input id="radios1" type="radio" name="ceil"> <label for="radios1">천장 시공 포함</label>
                  <input id="radios2" type="radio"name="ceil"><label for="radios2">천장 시공 안함</label>
               </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;몰딩 위치를 선택해주세요</td>
            </tr>
            <tr>
               <td>
               
                  <button class="btn1" value="상단" name="molding">상단</button>
                  <button class="btn1" value="하단" name="molding">하단</button>
                  <button class="btn1" value="전부" name="molding">상 + 하단</button>
                  <button class="btn1" value="없음" name="molding">없음</button>
               </td>
            </tr>
            <tr class="space">
            </tr>
            <tr>
               <td class="fontGroup1">&nbsp;&nbsp;베란다 확장 여부를 선택하세요</td>
            </tr>
            <tr>
               <td>
                  <button class="btn3"value="확장" name="expansion">확장</button>
                  <button class="btn3" value="확장안함" name="expansion">확장안함</button>
               </td>
            </tr>
         </table> 
         <table>
            <tr>
               <td>
                  <div class="nextBtn" onclick="insertRequest();" align="center" ><br>다음</div>
               </td>
            </tr>
         </table>
        </form>
      </div>
   </div>
      <script>
         function insertRequest(){
            
            $("#insertRequest").submit();
         }
      </script>

</body>
</html>