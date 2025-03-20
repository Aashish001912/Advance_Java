<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uName=request.getParameter("uname");
out.println("Welcome User : "+uName+"<br>");
out.println("*******ServletContext*******<br>");
out.println("Servlet Info : "+application.getServerInfo()+"<br>");
out.println("Context-Value : "+application.getInitParameter("a")+"<br>");
out.println("******ServletConfig******<br>");
ServletConfig scf=(ServletConfig)request.getAttribute("scf");
out.println("ServeletName:"+scf.getServletName()+"<br>");
out.println("Config-value:"+scf.getInitParameter("b")+"<br>");
out.println("******JSP Config********<br>");
out.println("ServletName:"+config.getServletName()+"<br>");
%>
</body>
</html>