<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바코드의 일부분을 넣는다.
	작은 일부분의 자바 코드 프로그램
	스크립트릿 (scriptlet)
	스크립트릿은 여러번 쓸 수 있다.
	  -->	
	<%
	    String id = request.getParameter("id");
		String name = request.getParameter("name");
		//db table에 해당 id가 있는지 검사
		//id, pw가 맞으면, 세션등록
		//세션 = 클라이언트와 서버의연결
		//세션이 유지되는동안 세션정보를 아무데서나 쓸수있다.
		//세션이 끊어지면 쓸수없다.
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		//session.invalidate() 세션끊는 메소드!
			
	%>
	<a href="home3.jsp">HOME3</a>
</body>
</html>