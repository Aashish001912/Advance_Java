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
  String bCode=request.getParameter("bcode");
  String bName=request.getParameter("bname");
  String bAuthor=request.getParameter("bauthor");
  float bPrice=Float.parseFloat(request.getParameter("bprice"));
  int bQty=Integer.parseInt(request.getParameter("bqty"));
  out.println("*******Book Details********<br>");
  out.println("Book Code:"+bCode+"<br>");
  out.println("Book Name:"+bName+"<br>");
  out.println("Book Author:"+bAuthor+"<br>");
  out.println("Book Price:"+bPrice+"<br>");
  out.println("Book Qty:"+bQty+"<br>");
  

%>
</body>
</html>