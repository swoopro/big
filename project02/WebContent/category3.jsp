<%@page import="java.util.ArrayList"%>
<%@page import="bean.MovieDTO"%>
<%@page import="bean.MovieDAO"%>
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
	String s0 = request.getParameter("s0"); //셀렉박스 값 가져오기 (검색어 조건)
	String s = request.getParameter("search"); // input태그 검색어 가져오기
	MovieDAO dao = new MovieDAO();
	ArrayList<MovieDTO> list = dao.titlesearch(s);  //제목으로 검색값
	ArrayList<MovieDTO> list2 = dao.storysearch(s); //줄거리로 검색값
	ArrayList<MovieDTO> list3 = dao.tssearch(s);    //제목+줄거리 검색값
	ArrayList<MovieDTO> list4 = dao.mdsearch(s);	//감독으로 검색값
	ArrayList<MovieDTO> list5 = dao.allsearch(s);	//전체 검색값

	if(s0.equals("제목")){ //셀렉박스(s0)이 "제목"으로 선택되면 디비에서 title항목에서만 검색해서 화면에출력
		for(int i=0; i < list.size(); i++){
			MovieDTO dto = list.get(i);
%>
			<button type="button">
	       <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
	        <img src="img/<%= dto.getImg()%>" width=200 height=150>
	        </a>
	        </button>
<%
		}
	}
	if(s0.equals("줄거리")){ //셀렉박스(s0)이 "줄거리"로 선택되면 디비에서 story항목에서만 검색해서 화면에출력
		for(int i=0; i < list2.size(); i++){
			MovieDTO dto = list2.get(i);
%>
			<button type="button">
	       <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
	        <img src="img/<%= dto.getImg()%>" width=200 height=150>
	        </a>
	        </button>
<%
		}
	}
	if(s0.equals("제목+줄거리")){ //셀렉박스(s0)이 "제목+줄거리"로 선택되면 디비에서
		for(int i=0; i < list3.size(); i++){ // title or story 항목에서 검색해서 출력
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
	        <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
	        <img src="img/<%= dto.getImg()%>" width=200 height=150>
	        </a>
	        </button>
<%
		}
	}
	if(s0.equals("감독")){//셀렉박스(s0)이 "감독"으로 선택되면 디비에서 md항목에서만 검색해서 화면에출력
		for(int i=0; i < list4.size(); i++){
			MovieDTO dto = list4.get(i);
%>
			<button type="button">
	        <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
	        <img src="img/<%= dto.getImg()%>" width=200 height=150>
	        </a>
	        </button>
<%
		}
	}
%>
<%
if(s0.equals("전체")){ //셀렉박스(s0)이 "전체"으로 선택되면 디비에서 모든항목에서 검색해서 화면에출력
		for(int i=0; i < list5.size(); i++){
			MovieDTO dto = list5.get(i);
%>
			<button type="button">
	        <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
	        <img src="img/<%= dto.getImg()%>" width=200 height=150>
	        </a>
	        </button>
<%
}
		}
%>	        




</body>
</html>