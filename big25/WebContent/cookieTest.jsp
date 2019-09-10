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
	Cookie cookie1 = new Cookie("id", "root");
	Cookie cookie2 = new Cookie("pw", "1234");
	//웹서버가 브라우저에게 명령하는 내장된 객체 response
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
%>

<a href = "cookieView.jsp">쿠키 보러 가기</a>
</body>
</html>