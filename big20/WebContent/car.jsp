<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
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
	//1. 클라이언트가 입력한 값 받아옴!
	//ttpRequest request = new HttpRequest();

	//받아올 수 있는 객체를 jsp에서 만들어놓았다.
	//내장된 객체(이미 객체를 만들어 놓음.)
	String search = request.getParameter("search");
	//2. db처리(생략)
	//3. 결화를 클라이언트에게 보내준다.
	//PrintWriter out = new PrintWriter();
	out.println("<h1>검색결과입니다.<h1>");
	out.println("<hr>");
	out.println(search+ "에 대한 검색결과입니다. ");
%>
</body>
</html>