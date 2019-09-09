<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 클라이언트가 전송한 데이터 서버에서 받아줌. -->
<%
	String name = request.getParameter("name");
	out.println("클라이언트에게 받은 데이터" + name);
%>
</body>
</html>