<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>date action tag</title>
</head>
<body>
<h1>action come through Action Tag</h1>
<%
out.print("today date: - "+ java.util.Calendar.getInstance().getTime());

%>

</body>
</html>