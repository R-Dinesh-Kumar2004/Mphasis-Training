<%@page import="app.management.book.model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Book</h2>
	<%
	Book book = (Book)request.getAttribute("book");
	%>
	<form action="<%= application.getContextPath() %>/book/update/<%= book.getBookId()%>" method="post">
	
		<input type="text" name="book_name" value="<%=book.getBookName() %>"/><br/>
		<input type="text" name="book_price" value="<%=book.getBookPrice() %>"/><br/>
		<input type="text" name="no_of_copies" value="<%=book.getNoOfCopies() %>"/><br/>
		<input type="date" name="date_of_publication" value="<%=book.getDateOfPublication() %>"/><br/>
		
		<input type="submit" value="Submit" />
	</form>
</body>
</html>