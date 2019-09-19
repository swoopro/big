<%@page import="bean.DatasetDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.DatasetDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%-- <jsp:setProperty property="email" name="dto"/>
<jsp:setProperty property="gender" name="dto"/> --%>
<%
	DatasetDAO dao = new DatasetDAO();
	dao.insert(dto);

%>
</body>
</html>