<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category</title>
</head>
<body>
<jsp:include page="/jsp/common/header.jsp" />

<h2>Add Category</h2>

<c:if test="${not empty message}">
	<p style="color:red">
		<c:out value="${message}"/>
	</p>
</c:if>
<form method="post"
      action="${pageContext.request.contextPath}/admin/add-category">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" required /></td>
        </tr>

        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" required /></td>
        </tr>
        
        <tr>
            <td colspan="2">
                <button type="submit">Add Category</button>
                &nbsp;
                <a href="${pageContext.request.contextPath}/admin/categories">
                    Cancel
                </a>
            </td>
        </tr>
    </table>
</form>

<jsp:include page="/jsp/common/footer.jsp" />
</body>
</html>