<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/jsp/common/header.jsp" />

	<h2>Edit Category</h2>
	
	<form method="post"
	      action="${pageContext.request.contextPath}/admin/update-category">
		
		ID:
	    <input type="hidden" name="id" value="${category.id}" />
	
	    Name:
	    <input type="text" name="name" value="${category.name}" /><br><br>
	
	    <button>Update</button>
	</form>
	
	<jsp:include page="/jsp/common/footer.jsp" />
</body>
</html>