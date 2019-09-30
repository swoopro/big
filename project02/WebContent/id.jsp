<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
///// id 중복 확인(기존에 가입되어 db에 있는지 여부를 확인) /////

	String id = request.getParameter("id");

	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	MemberDAO dao = new MemberDAO();
	MemberDTO dto2 = dao.select(dto);

	int loginCheck = 0;
	if (id.equals(dto2.getId())) {
		loginCheck = 1;
	}

%>
<%=loginCheck%>

