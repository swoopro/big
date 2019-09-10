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
	Cookie[] cookies = request.getCookies();
//자바코드 자동 import => ctrl + shift + o
//jsp는 해당 위치로 가서 자동 import => ctrl + shift + m
for(int i = 0; i<cookies.length; i++){
	Cookie cookie = cookies[i];
	out.print("쿠키명: " + cookie.getName() + "<br>");
	out.print("쿠키값: " + cookie.getValue() + "<br>");
	out.print("<hr>");
}
for(int i = 0; i<cookies.length; i++){
	Cookie cookie = cookies[i];
	if(cookie.getName().equals("id")){
		out.print("쿠키값: " + cookie.getValue() + "<br>");
	}
}

%>
</body>
</html>