<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	//db처리
	String saveId = "root";
	if(id.equals(saveId)){
		out.print("<font color=red>아이디가 동일함</font>");
	}else{
		out.print("<font color=blue>아이디가 동일하지않음</font>");
	}
%>