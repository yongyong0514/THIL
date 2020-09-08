<jsp:directive.page language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::내가 사는 그 집:: 관리 시스템</title>
</head>
<body>
	<script>
			location.replace("${applicationScope.contextPath}/views/admin/adminIndex.jsp");
	</script>
</body>
</html>