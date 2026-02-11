<%@page import="java.util.Arrays"%>
<%@page import="com.model.Student"%>
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
	Student student = (Student) request.getAttribute("student");
	out.print(student);
	%>
	
	<%!
	String isSelected(Student student,String value){
		return Arrays.asList(student.getStream()).contains(value) ? "selected" : "";
	}
	%>
	
	<form action="student_servlet" method="post">
	Name : <input type="text" name="name" value="<%= student.getName() %>"><br>
	Phone no : <input type="tel" name="phoneNo" value="<%= student.getPhoneNo() %>"><br>
	Addmission date : <input type="date"
			name="admissionDate" value="<%= student.getAdmissionDate() %>"><br>
	Stream :
	<select name="stream" multiple>
		<option value="IT" <%= isSelected(student, "IT")%>>IT</option>
		<option value="CSE" <%= isSelected(student, "CSE")%>>CSE</option>
		<option value="AIDS" <%= isSelected(student, "AIDS")%>>AIDS</option>
		<option value="Cyber"<%= isSelected(student, "Cyber")%>>Cyber</option>
	</select><br>
	
	<button type="submit">Submit</button>
	</form>
</body>
</html>