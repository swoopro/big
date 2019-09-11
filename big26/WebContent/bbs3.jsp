<%@page import="bean.BbsDAO2"%>
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
<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	//1. 클라이언트가 입력한 map형태의 파라메터를 받는다.
	
	//2. DAO사용하여 db처리
	BbsDAO2 dao = new BbsDAO2();
	BbsDTO dto2 = dao.select(dto);
	
	//3. 처리결과를 클라이언트에게 다시알려준다.
			// => 클라이언트가 볼 수 있는 형태로 만들어서 알려준다.
			// => HTML로 만들어서 클라이언트에게 전송.
			out.println("<hr>");
			out.println("<h3>검색한 정보 확인</h3>");
			out.println("<hr>");

			out.print("<h3>당신이 검색한 id는 " + dto2.getId() + "</h3>");
			out.print("<h3>당신이 검색한 title는 " + dto2.getTitle() + "</h3>");
			out.print("<h3>당신이 검색한 content는 " + dto2.getContent() + "</h3>");
			out.print("<h3>당신이 검색한 writer는 " + dto2.getWriter() + "</h3>");

%>
</body>
</html>