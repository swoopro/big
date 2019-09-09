<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
서버가 받은 데이터 입니다.<br>
<hr>

<%
	String id= request.getParameter("id");
	out.println("입력한 id값 : " + id + "<br>");
	String pw= request.getParameter("pw");
	out.println("입력한 pw값 : " + pw + "<br>");
	String name= request.getParameter("name");
	out.println("입력한 name값 : " + name + "<br>");
	String tel= request.getParameter("tel");
	out.println("입력한 tel값 : " + tel + "<br>");



%>
</body>
</html>