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
	String price = request.getParameter("price");
	
	Cookie cookie1 = new Cookie("id", id); 
	Cookie cookie2 = new Cookie("price", price);
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
	Cookie[] cookies = request.getCookies();
	for(int i=0; i<cookies.length; i++){
		Cookie cookie = cookies[i];
		out.print("쿠키명: " + cookie.getName());
		out.print("쿠키값: " + cookie.getValue());
		out.print("<hr>");
	}
	
%>
</body>
</html>