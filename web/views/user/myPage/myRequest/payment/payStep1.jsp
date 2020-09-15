<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의뢰/결제</title>
<style>
.outer {
	width: 700px;
	height: 500px;

}

.inner {
	width: 700px;
	height: 500px;
	background: lightgrey;
}

.left {
	float: left;
	width: 350px;
	height: 500px;
	background: yellow;
}

.right {
	float: left;
	width: 350px;
	height: 500px;
	background: green;
}
</style>
</head>
<body>
	<div class="outer">
		<div class="inner">
			<div class="left">
				<table>
					<tr>
						<td>
							<button></button>
						</td>
					</tr>
					
					<tr>
						<td>
							<label>신용카드</label>
						</td>
					</tr>
				
				</table>
			</div>
			<div class="right">
			</div>
		</div>
	</div>
</body>
</html>