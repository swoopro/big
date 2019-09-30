<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원정보 페이지</title>
<link rel="stylesheet" href="css/informaiton.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="js/informaiton.js"></script>
</head>

<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>

	<jsp:setProperty property="*" name="dto" />
	
	<%

	//session 설정(id)
		//session에 속성 넣기("id", "idValue")
	/* 	session.setAttribute("id", "root"); */
		//sseion에서 값 가져와서(feat. 형변환) 변수 id에 할당
		String id = (String)session.getAttribute("id"); 
		
		//dto에 id값 넣어주기
		//dto에 session에서 꺼내어 할당한 변수 id값 넣어주기(delete메소드의 sql문 실행시 where 조건으로 id가 필요)
		dto.setId(id);
		
		//delete메소드를 호출하기 위해 DAO객체 생성(회원탈퇴를 하기 위하여  delete메소드가 필요)
		MemberDAO dao = new MemberDAO();
 		
		//dao의 delete메소드를 호출
 		dao.delete(dto);

//infor.jsp에서 수정한 입력값이 dto에 잘 들어갔는지 확인용 		
/* 		out.println(dto.getId());
		out.println(dto.getPw());
		out.println(dto.getName());
		out.println(dto.getBirth());
		out.println(dto.getTel());
		out.println(dto.getEmail());
		out.println(dto.getfJenre1());
		out.println(dto.getfJenre2());
		out.println(dto.getfJenre3()); */
		
	%>
	<div class="hr">
		<h1>Movie Information Search Server</h1>
	</div>
	
</body>

</html>