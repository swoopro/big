<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
날짜: ${param.date}<br> <!-- param:내장객체 ,받아와서 출력해줌 -->
제목: ${param.title}<br>
내용: ${param.content}<br>

<%-- <%
	String date = request.getParameter("date");
%>
날짜: <%= date %> --%>
</body>
</html>