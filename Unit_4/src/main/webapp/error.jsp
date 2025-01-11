<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page errorPage = "exception.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> testing exception</h1>
<%!
int a=78;
int b=0;
String str= "CSE 406 ADVANCED JAVA PROGRAMMING";
%>

<%
int div = a/b;
out.print("division result is"+ div);
out.print("<br>");
out.print("<br>");
out.print(str.toLowerCase());

%>

</body>
</html>