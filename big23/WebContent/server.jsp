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
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    out.println("글번호: " + id + "<br>");
    out.println("글제목: " + title + "<br>");
    out.println("글내용: " + content + "<br>");
    out.println("글쓴이: " + writer + "<br>");
    %>
</body>
</html>