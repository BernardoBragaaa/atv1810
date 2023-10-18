<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="modelo.numero" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	numero num = (numero) session.getAttribute("numero");
	
	out.println(num.getA() + "<br>");
	out.println(num.getB() + "<br>");
	out.println(num.getC() + "<br>");
	
	out.println(num.soma() + "<br>");
	out.println(num.sub() + "<br>");
	out.println(num.mult() + "<br>");
	out.println(num.div() + "<br>");
	%>
</body>
</html>