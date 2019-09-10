<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	session.setAttribute("id", id);
	//session.invalidate() 세션끊는 메소드!
%>
<%= session.getAttribute("id") %>님 환영합니다.<br>
<a href = "cafe.jsp">cafe</a>
</body>
</html>