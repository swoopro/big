<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO3"%>
<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
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
	BbsDAO3 dao = new BbsDAO3();
	ArrayList<BbsDTO> list = dao.selectAll();
	out.println("<hr>");
	out.println("<h3>검색한 정보 확인</h3>");
	out.println("<hr>");
%>
	<table border="1" bordercolor="brown">
		<tr>
			<th>아이디</th>
			<th>제목</th>
			<th>내용</th>
			<th>글쓴이</th>
		</tr>
	<%
	for(int i=0; i<list.size(); i++){
			%>
		<tr>
			<%
		BbsDTO dto2 = list.get(i);
			%>
		<td>
		<a href = "bbs3.jsp?id=<%= dto2.getId() %>">
			<%= dto2.getId() %></a></td>
		<td><%= dto2.getTitle() %></td>
		<td><%= dto2.getContent() %></td>
		<td><%= dto2.getWriter() %></td>
		
		
		</tr>
	<%
	}
	%>
		
	</table>

</body>
</html>