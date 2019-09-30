<%@page import="java.io.Console"%>
<%@page import="bean.MovieDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
 String s1 = request.getParameter("s1");  //셀렉박스(장르) 값 받아오기
 String s2 = request.getParameter("s2");  //셀렉박스(분류) 값 받아오기
 MovieDAO dao = new MovieDAO();
 ArrayList<MovieDTO> list = dao.selectAll(); //모든영화 검색결과 
 ArrayList<MovieDTO> list2 = dao.count(s1);   //장르(s1)선택된영화 조회수 높은대로 검색
 ArrayList<MovieDTO> list3 = dao.selectJanre(s1); //장르별(s1) 영화모두검색
 ArrayList<MovieDTO> list4 = dao.allcount(); //전체영화를 조회순 높은대로 검색
 ArrayList<MovieDTO> list5 = dao.score(s1); //장르(s1) 선택된영화 평점순으로검색
 ArrayList<MovieDTO> list6 = dao.allscore(); //전체영화를 평점높은순으로검색
 
 
 if(s1.equals("장르") && s2.equals("sort")){ //셀렉박스s1이 "장르"이고 s2가"분류"이면 모든영화출력
	//s1이="장르" && s2="분류"이면 모든영화 표시    
	 for(int i=0; i < list.size(); i++){
			MovieDTO dto = list.get(i);
%>			
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
	

<%
	 }	
 }else if(s1.equals("애니메이션") && s2.equals("sort")){  //셀렉박스s1이 "애니메이션"이고 s2가"분류"이면 애니메이션영화 모두출력
	 for(int i=0; i < list3.size(); i++){
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
<%
	 }	
 }else if(s1.equals("액션") && s2.equals("sort")){//셀렉박스s1이 "액션"이고 s2가"분류"이면 액션영화 모두출력
	 for(int i=0; i < list3.size(); i++){
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
<%
	 }	
 }else if(s1.equals("로맨스") && s2.equals("sort")){ //셀렉박스s1이 "로맨스"이고 s2가"분류"이면 로맨스영화 모두출력
	 for(int i=0; i < list3.size(); i++){
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
<%
	 }	
 }else if(s1.equals("공포") && s2.equals("sort")){ //셀렉박스s1이 "공포"이고 s2가"분류"이면스 공포영화 모두출력 
	 for(int i=0; i < list3.size(); i++){
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
<%
	 }	
 }else if(s1.equals("코미디") && s2.equals("sort")){ //셀렉박스s1이 "코미디"이고 s2가"분류"이면 코미디영화 모두출력
	 for(int i=0; i < list3.size(); i++){
			MovieDTO dto = list3.get(i);
%>
			<button type="button">
			<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
				src="img/<%= dto.getImg()%>" width=200 height=150>
			</a>
		</button>
<%			
	 }
	  }
 else if(s1.equals("장르") && s2.equals("count")){ //셀렉박스s1이 "장르"이고 s2가"조회순"이면 전체영화를 조회순으로 출력
      		for(int i=0; i < list4.size(); i++){
      			MovieDTO dto = list4.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("애니메이션") && s2.equals("count")){ //셀렉박스s1이 "애니메이션"이고 s2가"조회순"이면 애니메이션영화를 조회순으로 출력
      		for(int i=0; i < list2.size(); i++){
      			MovieDTO dto = list2.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("액션") && s2.equals("count")){ //셀렉박스s1이 "액션"이고 s2가"조회순"이면 액션영화를 조회순으로 출력
      		for(int i=0; i < list2.size(); i++){
      			MovieDTO dto = list2.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("로맨스") && s2.equals("count")){ //셀렉박스s1이 "로맨스"이고 s2가"조회순"이면 로맨스영화를 조회순으로 출력
      		for(int i=0; i < list2.size(); i++){
      			MovieDTO dto = list2.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("공포") && s2.equals("count")){//셀렉박스s1이 "공포"이고 s2가"조회순"이면 공포영화를 조회순으로 출력
      		for(int i=0; i < list2.size(); i++){
      			MovieDTO dto = list2.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("코미디") && s2.equals("count")){ //셀렉박스s1이 "코미디"이고 s2가"조회순"이면 코미디영화를 조회순으로 출력
      		for(int i=0; i < list2.size(); i++){
      			MovieDTO dto = list2.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("장르") && s2.equals("score")){ //셀렉박스s1이 "장르"이고 s2가"평점순"이면 전체영화를 평점순으로 출력
      		for(int i=0; i < list6.size(); i++){
      			MovieDTO dto = list6.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("애니메이션") && s2.equals("score")){ //셀렉박스s1이 "애니메이션"이고 s2가"평점순"이면 애니메이션영화를 평점순으로 출력
      		for(int i=0; i < list5.size(); i++){
      			MovieDTO dto = list5.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("액션") && s2.equals("score")){ //셀렉박스s1이 "액션"이고 s2가"평점순"이면 액션영화를 평점순으로 출력
      		for(int i=0; i < list5.size(); i++){
      			MovieDTO dto = list5.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("로맨스") && s2.equals("score")){ //셀렉박스s1이 "로맨스"이고 s2가"평점순"이면 로맨스영화를 평점순으로 출력
      		for(int i=0; i < list5.size(); i++){
      			MovieDTO dto = list5.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("공포") && s2.equals("score")){ //셀렉박스s1이 "공포"이고 s2가"평점순"이면 공포영화를 평점순으로 출력
      		for(int i=0; i < list5.size(); i++){
      			MovieDTO dto = list5.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
	 }	
 }else if(s1.equals("코미디") && s2.equals("score")){ //셀렉박스s1이 "코미디"이고 s2가"평점순"이면 코미디영화를 평점순으로 출력
      		for(int i=0; i < list5.size(); i++){
      			MovieDTO dto = list5.get(i);
   %>
				<button type="button">
					<a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>"> <img
						src="img/<%= dto.getImg()%>" width=200 height=150>
					</a>
				</button>
<%
      		}
 }
%>

