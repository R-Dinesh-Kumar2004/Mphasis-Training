<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formating Tags Demo</title>
</head>
<body>
	<fmt:setLocale value="en_IN" />
	<p>
		<c:out value="${message }" />
	</p>
	<p>
		<fmt:formatNumber value="${endrolledCount }" />
	</p>
	<p>
		<fmt:formatNumber value="${fees }" type="currency" />
	</p>
	<p>
		<fmt:formatDate value="${dateOfExam }" pattern="dd-MM-yyyy" />
	</p>
</body>
</html>