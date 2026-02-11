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

	<h2>Categories</h2>
	
	<c:if test="${not empty message}">
		<p style="color:red">
			<c:out value="${message}"/>
		</p>
	</c:if>
	
	<c:if test="${empty categories}">
	    <p>No categories available</p>
	</c:if>
	
	<c:if test="${not empty categories}">
	<table border="1">
	    <tr>
	        <th>ID</th>
	        <th>Name</th>
	        <th>Action</th>
	    </tr>
	
	    <c:forEach var="s" items="${categories}">
	        <tr>
	            <td>${s.id}</td>
	            <td>${s.name}</td>
	            <td>
	                <a href="edit-category?id=${s.id}">Edit</a> |
	                <a href="delete-category?id=${s.id}">Delete</a>
	            </td>
	        </tr>
	    </c:forEach>
	</table>
	</c:if>
	
	<p><a href="${pageContext.request.contextPath}/admin/add-category">
	    Add Category
	</a></p>
	
	<br><br>
	
	<jsp:include page="/jsp/common/footer.jsp" />
	
</body>
</html>