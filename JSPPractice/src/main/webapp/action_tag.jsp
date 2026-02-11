<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag Demo</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param value="title" name="myHeader"/>
	</jsp:include>
	
	<jsp:useBean class="com.model.User" id="user" scope="request"/>
	<jsp:setProperty property="name" name="user" value="ram"/>
	<jsp:setProperty property="age" name="user" value="21"/>
	
	<p>User Name : <jsp:getProperty property="name" name="user"/>
	<p>Age : <jsp:getProperty property="age" name="user"/>
	
	<jsp:forward page="user_details.jsp">
		<jsp:param value="This is user details page" name="msg"/>
	</jsp:forward>
	
	<jsp:include page="footer.jsp"/>
</body>
</html>