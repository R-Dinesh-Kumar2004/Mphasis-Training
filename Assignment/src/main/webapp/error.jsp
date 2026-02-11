<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<style type="text/css">
p {
	color: red;
}
</style>
</head>
<body>
	<%
	String message = request.getParameter("message");
	%>
	<p>
	<%= request.getParameter("message") %>
	</p>
</body>
</html>