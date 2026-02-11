<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Collections"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp tags</title>
</head>
<body>

	<!-- scriptlet tag -->
	<%
	    
		String greet = "Welcome to JSP learning";
		out.print(greet);
	%>
	
	<!-- declaration tag -->
	<%!
		
		String greet = "This is declarative tags";
		List<Integer> list = new ArrayList<>(Arrays.asList(3,2,1));
	%>
	
	<%
		Collections.sort(list);
	%>
	
	<!-- expression tag -->
	<%= list %>
	
</body>
</html>