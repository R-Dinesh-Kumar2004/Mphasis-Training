<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<%
		PrintWriter printWriter = response.getWriter();
		for(int i=0;i<10;i++){
			printWriter.println(i+" * "+5+" = "+(i*5)+"\n");
		}
	%>
</body>
</html>