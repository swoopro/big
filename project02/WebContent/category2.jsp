<%@page import="java.io.Console"%>
<%@page import="bean.MovieDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 String s1 = request.getParameter("s1"); //셀렉박스(s1)값 받아오기
 MovieDAO dao = new MovieDAO();
 ArrayList<MovieDTO> list = dao.selectAll(); //모든영화 검색한거 가져오기
 ArrayList<MovieDTO> list2 = dao.selectJanre(s1); //셀렉박스로 검색한 장르별 영화가져오기
 
      	 if(s1.equals("장르")){	//s1이 "장르"이면     for문안에 버튼넣어서 모든영화 표시      
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
      	}else{//이외에는 선택된장르(s1값) 에맞는 영화들 표시
      		
	 for(int i=0; i < list2.size(); i++){
      	MovieDTO dto2 = list2.get(i);
%>
      	<button type="button">
        <a href="movie.jsp?img=<%=dto2.getImg()%>&mid=<%=dto2.getMid()%>">
        <img src="img/<%= dto2.getImg()%>" width=200 height=150>
        </a>
        </button>
   <%
 }
      	}
   %>
