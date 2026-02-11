<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Dispatcher Demo</title>
</head>
<body>
	<form action="set_rate">
		<label>Enter the previous month : </label>
		<input type="text" name="prev"><br>
		<label>Enter the current month : </label>
		<input type="text" name="curr"><br>
		<button type="submit">Calculate</button>
	</form>
</body>
</html>