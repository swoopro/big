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
	String no = request.getParameter("no");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	out.println("입력한 no값: " + no + "<br>");
	out.println("입력한 title값: " + title + "<br>");
	out.println("입력한 content값: " + content + "<br>");
	out.println("입력한 writer값: " + writer + "<br>");


%>
</body>
</html>