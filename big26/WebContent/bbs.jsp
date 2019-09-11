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
	//1. 클라이언트가 입력한 map형태의 파라메터를 받는다.
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	//2. DAO사용하여 db처리
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	
	dto.setId(id);
	dto.setTitle(title);
	dto.setContent(content);
	dto.setWriter(writer);
	dao.insert(dto);
	
	//3. 처리결과를 클라이언트에게 다시알려준다.
			// => 클라이언트가 볼 수 있는 형태로 만들어서 알려준다.
			// => HTML로 만들어서 클라이언트에게 전송.
			out.println("<hr>");
			out.println("<h3>입력한 정보 확인</h3>");
			out.println("<hr>");

			out.print("<h3>당신이 입력한 id는 " + id + "</h3>");
			out.print("<h3>당신이 입력한 title는 " + title + "</h3>");
			out.print("<h3>당신이 입력한 content는 " + content + "</h3>");
			out.print("<h3>당신이 입력한 writer는 " + writer + "</h3>");

%>
</body>
</html>