<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		int serialNumber = 0;
	%>

	<table border="1">
		<thead>
			<tr>
				<th>Book Id</th>
				<th>Book Name</th>
				<th>Book Price</th>
				<th>No. of Copies</th>
				<th>In Stock</th>
				<th>Date of Publication</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="<%= ++serialNumber %>" /></td>
					<td><c:out value="${book.bookName}" /></td>
					<td><c:out value="${book.bookPrice}" /></td>
					<td><c:out value="${book.noOfCopies}" /></td>
					<td><c:out value="${book.stock}" /></td>
					<td><c:out value="${book.dateOfPublication}" /></td>
					<td>
						<a  href="<%= application.getContextPath() %>/openUpdateBookPage?bookId=${book.bookId}" >Update</a> |
						<a  href="<%= application.getContextPath() %>/book/delete/${book.bookId}" >Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		<tr>
			<td><a href="<%= application.getContextPath() %>/openAddBookPage">Add Book</a></td>
		</tr>
	</table>
	
	<%@ include file="message.jsp" %>
</body>
</html>