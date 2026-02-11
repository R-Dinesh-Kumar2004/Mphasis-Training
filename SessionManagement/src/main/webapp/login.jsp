<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
	String message = request.getParameter("message");
	if(message != null){
		out.println("<p style='color:red'>"+message+"</p>");
	}
	
	%>
	<form action="login" method="post">
	Username : <input type="text" name="username"><br>
	Password : <input type="password" name="password"><br>
	<button type="submit">Login</button>
	</form>
</body>
</html>