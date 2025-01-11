<%@ page import= "java.util.Random, java.util.ArrayList, java.io.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>directive tag using</title>
</head>
<body>
<h1> using page directive</h1>
<h1> random no.</h1>
<%

Random r= new Random();
int n= r.nextInt(200);

out.println(n);
out.println("<br>");
out.print("My random numbert is:-" + n );
out.print("<br>");

%>

<%= "My random numbert is:-" + n  %>

</body>
</html>