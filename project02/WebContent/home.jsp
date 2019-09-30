<%@page import="bean.MovieDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@page import="bean.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="js/movie.js"></script>

</head>
<body>
	
	<h1><br>Watch a Movie</h1>
	<div id="d1">
			<%= session.getAttribute("id") %>님 환영합니다!
	
<%
	/* 비로그인 상태(로그인이 완료 되었을 때 session값으로 잡은 id값이 null) 이면 '로그인', '회원가입' 버튼이 보이도록 */
	if(session.getAttribute("id") == null) {
		/* out.println(session.getAttribute("id") + "님 환영합니다!"); */
	%>
	<button type="button" id="bin" onclick="login()">로그인</button>
	<button type="button" id="bjoin" onclick="join()">회원가입</button>
	<%-- <% session.setAttribute("id", null); %> --%>
	<% 
	/* 로그인 상태(로그인이 완료 되었을 때 session값으로 잡은 id값이 null이 아니면) 이면 '로그아웃', '회원정보' 버튼이 보이도록 */
	}else {
	%>
	<button type="button" id="bout" onclick="logout()">로그아웃</button>
	<button type="button" id="binfor" onclick="infor()">회원정보</button>
	<%
	}
	%>	
	</div>

	<div id="d2">
		<button type="button" onclick="home()">추천장르</button>
		<button type="button" onclick="category()">카테고리</button>
	</div><br><br>
	
	
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<%
		String id = (String)session.getAttribute("id");
		MemberDAO dao0 = new MemberDAO();
		dto.setId(id);
		MemberDTO dto2 = dao0.select(dto);
		

		MovieDAO dao = new MovieDAO();
		ArrayList<MovieDTO> list1 = dao.selectJanre(dto2.getfJenre1());
		ArrayList<MovieDTO> list2 = dao.selectJanre(dto2.getfJenre2());
		ArrayList<MovieDTO> list3 = dao.selectJanre(dto2.getfJenre3());
	%>
	<div class="fjanre"><%= dto2.getfJenre1()%><br>
		<!-- 장르1 -->
		<%
			for (int i = 0; i < list1.size(); i++) {
				MovieDTO dto3 = list1.get(i);
		%>
		<button type="button">
			<a href="movie.jsp?img=<%=dto3.getImg()%>&mid=<%=dto3.getMid()%>"> <img
				src="img/<%=dto3.getImg()%>" width=200 height=150>
			</a>
		</button>
		
		<%
			}
		%>
	</div>
	<br><br>

	<div class="fjanre"><%= dto2.getfJenre2()%><br>
		<!-- 장르2 -->
		<%
			for (int i = 0; i < list2.size(); i++) {
				MovieDTO dto3 = list2.get(i);
		%>
		<button type="button">
			<a href="movie.jsp?img=<%=dto3.getImg()%>&mid=<%=dto3.getMid()%>"> <img
				src="img/<%=dto3.getImg()%>" width=200 height=150>
			</a>
		</button>
		<%
			}
		%>

	</div><br><br>

	<div class="fjanre"><%= dto2.getfJenre3()%><br>
		<!-- 장르3 -->
		<%
			for (int i = 0; i < list3.size(); i++) {
				MovieDTO dto3 = list3.get(i);
		%>
		<button type="button">
			<a href="movie.jsp?img=<%=dto3.getImg()%>&mid=<%=dto3.getMid()%>"> <img
				src="img/<%=dto3.getImg()%>" width=200 height=150>
			</a>
		</button>
		<%
			}
		%>
	</div>

</body>
</html>