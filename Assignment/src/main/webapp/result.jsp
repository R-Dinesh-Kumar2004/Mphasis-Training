<%@page import="java.util.Arrays"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display JSP</title>
</head>
<body>

	<h3> Java style jsp </h3>
	
	<%
	Student student = (Student)request.getAttribute("studentData");
	%>
	
	<%!
	String upper(String name){
		return name.toUpperCase();
	}
	%>
	
	<p><%= "Name : "+ upper(student.getName()) %></p>
	<p><%= "Age : "+ student.getAge() %></p>
	<p><%= "Gender : "+ student.getGender() %></p>
	<p><%= "Skills : "+ Arrays.toString(student.getSkills()) %></p>
	<p><%= "City : "+ student.getCity() %></p>
	
	
	<h3> JSTL style jsp </h3>
	
	<c:if test="${not empty studentData}">
		<c:out value="Name : ${studentData.getName() }"/><br><br>
		<c:out value="Age : ${studentData.getAge() }"/><br><br>
		<c:out value="Gender : ${studentData.getGender() }"/><br><br>
		<c:out value="Skills"/>
		<ul>
			<c:forEach var="val" items="${studentData.getSkills()}">
				<li><c:out value="${val}"/></li>
			</c:forEach>
		</ul>
		<c:out value="City : ${studentData.getCity() }"/><br>
	</c:if>
	
	<p><a href="registration.html">Back to Form</a></p>
	
</body>
</html>