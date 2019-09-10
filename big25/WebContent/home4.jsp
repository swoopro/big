<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- out객체 대용, 브라우저에 출력(표현)
	표현식, expression
 -->
 <%= session.getAttribute("id") %>님 환영합니다.<br>
 <%= session.getAttribute("name") %>
</body>
</html>