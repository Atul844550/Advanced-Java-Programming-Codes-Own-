<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> session start</h1>
<%

String name= request.getParameter("username");
out.print("welcome" +  name);
session.setAttribute("username", name);

%>
<a href= "session2.jsp"> next page</a>

</body>
</html>