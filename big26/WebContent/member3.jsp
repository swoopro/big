<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<!-- 	1-1. 클라이언트가 입력한 map형태의 파라메터를 받는다.
		1-2. DTO객체생성후, 파라메터 값을 넣는다. -->
	<!-- 자동 import + dto객체 생성 -->
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<!-- 파라메터 받아서 dto에 넣어주는 역할 -->
	<jsp:setProperty property="*" name="dto" /> <!-- 하나씩할때는 여러번써주면됨
												getProperty는하나씩여러번써줘야함 -->
	<!-- 액션태그 -->
	
	<%//스크립트릿

		//2. DAO사용하여 db처리
		MemberDAO dao = new MemberDAO();

		dao.insert(dto);

		//3. 처리결과를 클라이언트에게 다시알려준다.
		// => 클라이언트가 볼 수 있는 형태로 만들어서 알려준다.
		// => HTML로 만들어서 클라이언트에게 전송.
		out.println("<hr>");
		out.println("<h3>입력한 정보 확인</h3>");
		out.println("<hr>");

		out.print("<h3>당신이 입력한 id는 " + dto.getId() + "</h3>");
		out.print("<h3>당신이 입력한 pw는 " + dto.getPw() + "</h3>");
		out.print("<h3>당신이 입력한 name는 " + dto.getName() + "</h3>");
		out.print("<h3>당신이 입력한 tel는 " + dto.getTel() + "</h3>");
	%>
</body>

</html>