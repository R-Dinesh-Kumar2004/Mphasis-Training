<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(request.getParameter("name") == null){
			response.sendRedirect("login_page.html");
		}
	%>
	<h1>Success</h1>
</body>
</html>