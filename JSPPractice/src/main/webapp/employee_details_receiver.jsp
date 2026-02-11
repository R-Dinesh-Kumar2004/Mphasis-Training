<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receiver Employee Details</title>
</head>
<body>
	<%
	Employee employee = (Employee) request.getAttribute("employee");
	%>
	
	<%!String format(double value) {
		return String.format("%.2f", value);
	}%>
	
	<h2>Employee Details :</h2>
	<p><%="Employee ID : " + employee.getId()%></p>
	<p><%="Employee name : " + employee.getName()%></p>
	<p><%="Department : " + employee.getDepartment()%></p>
	<p><%="Attendence percentage : " + format(employee.getAttendancePercentage())%></p>
	<p><%="Salary payable : " + format(employee.getSalaryPayable())%></p>
	<p><%="Attendence Grade : " + employee.getAttendanceGrade()%></p>
</body>
</html>