<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP page Project 2 </title>
</head>
<body>
<h1>first program in JSP java</h1>
<h1>declarative tag</h1>
<%!
int a=10;
int b=20;
String name = "My Name is Atul Soni";
int add()
{
	return a+b;
}
String reversed()
{
	StringBuilder sb= new StringBuilder(name);
	return sb.reverse().toString();
}
%>

<h1> expression tag</h1>
<%=
reversed()

%>
<h1> scriplet tag</h1>
<%
out.println(a);
out.print("<br>");
out.println(b);
out.print("<br>");
out.println("addition result is: " + add());

%>

</body>
</html>