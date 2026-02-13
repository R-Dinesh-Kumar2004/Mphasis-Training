<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= application.getContextPath() %>/book/add" method="post">
		<input type="text" name="book_name" placeholder="Enter book name"/><br/>
		<input type="text" name="book_price" placeholder="Enter book price"/><br/>
		<input type="text" name="no_of_copies" placeholder="Enter no of copies"/><br/>
		<input type="date" name="date_of_publication" placeholder="Enter publication date"/><br/>
		
		<input type="submit" value="Submit" />
	</form>
</body>
</html>