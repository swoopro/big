<%@page import="javafx.scene.control.Alert"%>
<%@page import="bean.MovieDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/category.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="js/movie.js"></script>
<script>
$(function() {
	
	$("#s1").on("change", function() {//select의 change이벤트효과
		console.log("1");
		var s1Value = $(this).val(); //s1 바뀐값 가져오기
		//var text = $("s1 option:selected").text();
		console.log("2");
		$.ajax({
			url:"category2.jsp",
			data:{
				s1 : s1Value
			},
			success:function(result){
				console.log("3");
				$("#d3").html(result); //div#d3에 result값표시
			}			
		});
	});
	
	$("#s2").change(function() {// s2 셀렉박스 값 바뀌면!
		var s1Value = $("#s1").val(); // s1, s2 값 가져오기
		var s2Value = $(this).val();
		$.ajax({
			url:"category4.jsp",
			data:{
				s1 : s1Value,
				s2 : s2Value
			},
			success:function(result){
				console.log("333");
				$("#d3").html(result); //div#d3에 result값표시
			}			
		});
		
	});
	
	$("#b1").click(function() {
		var s0Value = $("#s0").val(); //s0셀렉박스 값
		var search = $("#search").val(); // input태그 (검색어)
		$.ajax({
			url:"category3.jsp",
			data:{
				s0 : s0Value,
				search : search		
			},
			success:function(result){
				$("#d3").html(result); //div#d3에 result값표시
			}			
		});
	});
});//$function end

function enter() {//검색어 input태그에서 엔터누르면
	$("#b1").click(); //b1(검색버튼)이 클릭되도록설정  : 엔터or검색버튼 둘중아무거나 눌러도 검색실행됨
}



</script>
</head>
<body>
<form action="">
        <h1><br>Watch a Movie</h1>
        
         <%
        String id = (String) session.getAttribute("id");//세션에 연결된 id가져오기
		%>
        
        <div id="d1">
        <% if (id != null){%> 
        <%= id %>님 환영합니다! <!-- 세션id가 있으면(로그인상태면) 환영문구띄우기 -->
        <br>        
        <button type="button" id="bout" onclick="logout()">로그아웃</button>
    	<button type="button" id="binfor" onclick="infor()">회원정보</button>
    <%
        }else{
     %>
        	<button type="button" id="bin" onclick="login()">로그인</button>
        	<button type="button" id="bjoin" onclick="join()">회원가입</button>
     <%   	
	}%>
	
        </div>
      
        <div id="d2">
       		<% if (id != null){%>
            <button type="button" id="homeb" onclick="home()" >추천장르</button>
       		<% }%> <!-- 로그인일때만 추천장르버튼 띄우기 -->
       		
            <button type="button" onclick="category()">카테고리</button>
            <br>
            <br>
            
             <select id="s0" name="s0">   <!-- 셀렉박스설정 -->   	
                <option value="전체">전체</option>
                <option value="제목">제목</option>
                <option value="줄거리">줄거리</option>
                <option value="제목+줄거리">제목+줄거리</option>
                <option value="감독">감독</option>
            </select>
            
           <input type="text" name="search" id="search" placeholder="검색어를 입력하세요." 
            onkeypress="if(event.keyCode==13) {enter(); return false;}"> <!-- keycode13(엔터키)가 눌리면 enter()함수실행 -->
            <button  type="button" id="b1">검색</button>
            <br><br>
            <select id="s1" name="s1">
                <option value="장르">장르</option>
                <option value="애니메이션">애니메이션</option>
                <option value="액션">액션</option>
                <option value="로맨스">로맨스</option>
                <option value="공포">공포</option>
                <option value="코미디">코미디</option>
            </select>
            
            <select id="s2" name="s2">
                <option value="sort">분류</option>
                <option value="count">조회순</option>
                <option value="score">평점순</option>
            </select>
        </div>        
        <br>
        <br>
        
        
        <div id="d3">
        <% 
        	MovieDAO dao = new MovieDAO();
        	ArrayList<MovieDTO> list = dao.selectAll(); //selectAll결과 list로 받아주기
        
      	  for(int i=0; i < list.size(); i++){
         	MovieDTO dto = list.get(i); // for문안에 버튼 넣어서 검색결과 모두 출력
         								// 카테고리페이지 켜지면 영화전체 보임
        %>								
        <button type="button">
       <a href="movie.jsp?img=<%=dto.getImg()%>&mid=<%=dto.getMid()%>">
       <!-- ?뒤에쓰는거는 url에도찍어주고, 데이터도 넘겨줌 -->
        <img src="img/<%= dto.getImg()%>" width=200 height=150>
        </a>
        </button>
        <%
        	}
        %>
        </div>
        
        
    </form>

</body>
</html>