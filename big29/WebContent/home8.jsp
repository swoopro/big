<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String re = request.getParameter("re");
	//db처리
%>
<table border="1">
	<tr>
		<td>아이디:<%= id%></td>
	</tr>
	<tr>
		<td>댓글:<%= re%></td>
	</tr>
</table>
