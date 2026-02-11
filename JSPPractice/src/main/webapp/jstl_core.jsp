<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core Demo</title>
</head>
<body>
	<!-- 
	<c:set var="age" value="${12}"/>
	<c:if test="${age >= 18 }">
	<p>You are eligible for voting...</p>
	</c:if>
	
	<c:if test="${age < 18 }">
	<p>You are not eligible for voting...</p>
	</c:if>
	
	List<Student> studentList = (List<Student>) request.getAttribute("studentList");;
	%>
	for (Student s : studentList) {
			out.print(s + "/n");
		}}
	%>

	<c:if test="${studentList.size() > 0}">
		<c:out value="The size of the student is ${studentList.size() }"></c:out>
	</c:if>
	
	-->
	
	<c:forEach var="student" items="${studentList}">
		<p><c:out value="${student.getName() }"></c:out>
		<p><c:out value="${student.getPhoneNo() }"></c:out>
		<p><c:out value="${student.getAdmissionDate() }"></c:out>
		<p><c:out value="Student Streams"></c:out>
		<ul>
			<c:forEach var="val" items="${student.getStream() }">
				<li><c:out value="${val}"></c:out></li>
			</c:forEach>
		</ul>
	</c:forEach>

  </body>
</html>