<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> session2 start</h1>
<%
String name= (String)session.getAttribute("username");
out.print("hello, how are you?"+ name);



%>

</body>
</html>