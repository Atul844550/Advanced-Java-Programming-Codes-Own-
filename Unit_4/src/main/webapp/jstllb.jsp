<%@ taglib prefix="shruti" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1> Taglib JSP tags</h1>
<shruti:set var="name" value="My name is shruti"></shruti:set>
<shruti:out value="${name}"></shruti:out><br>
<shruti:if test="${10<8}">
<h4>Condition is true</h4>

</shruti:if>
<shruti:out value="${56*2}"></shruti:out><br>

<shruti:out value="${56/2}"></shruti:out>
</body>