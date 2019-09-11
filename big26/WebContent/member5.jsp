<%@page import="bean.MemberDAO3"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO2"%>
<%@page import="bean.MemberDTO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.Select"%>
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
	
	<%//스크립트릿

		//2. DAO사용하여 db처리
		MemberDAO3 dao = new MemberDAO3();
		ArrayList<MemberDTO> list = dao.selectAll();
		out.println("<hr>");
		out.println("<h3>검색한 정보 확인</h3>");
		out.println("<hr>");
		
		for(int i=0; i < list.size(); i++){
			MemberDTO dto2 = list.get(i);
			
			out.print("<h3>당신이 검색한 id는 " + dto2.getId() + "</h3>");
			out.print("<h3>당신이 검색한 pw는 " + dto2.getPw() + "</h3>");
			out.print("<h3>당신이 검색한 name는 " + dto2.getName() + "</h3>");
			out.print("<h3>당신이 검색한 tel는 " + dto2.getTel() + "</h3>");
			out.print("<hr color=blue><br>");
		}
	

		
	%>
</body>

</html>