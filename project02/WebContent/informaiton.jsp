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
	<!-- 1-1. 클라이언트가 입력한 map형태의 파라메터를 받는다. -->
	<!-- 1-2. DTO객체 생성 후, 파라메터 값을 넣는다. -->
	
	<!-- jsp태그 : 액션태그 -->
	<!-- DTO, DAO, DB 모두에서 항목들이 일치하는지 확인(순서, 대소문자 까지) -->

	<!-- jsp useBean -->
	<!-- 자동 import + dto객체를 생성해주는 역할(id="생성하려는 객체") -->
	<!-- 클라이언트가 입력한 값들을 DTO에 넣어주기 위해 DTO객체 생성 -->
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	
	<!-- jsp setProperty -->
	<!-- 파라메터를 받아서 dto에 넣어주는 역할(name="넣어주려는 객체") -->
	<!-- 클라이언트가 입력한 값들을 DTO에 넣어줌-->
	<%-- <jsp:setProperty property="*" name="dto" /> --%> 
	
	<%
	//session 설정(id)
		//session에 속성 넣기("id", "idValue")
		/* session.setAttribute("id", "root"); */
		
		//login.jsp에서 로그인완료 시 session으로 잡아놓은 회원아이디(id)를 꺼내서 변수 id에 할당
		//session에서 값 가져와서(feat. 형변환) 변수 id에 할당
		String id = (String)session.getAttribute("id"); 
		//dto에 session에서 꺼내어 할당한 변수 id값 넣어주기(select메소드의 sql문 실행시 where 조건으로 id가 필요)
		dto.setId(id);
		
		//select메소드를 호출하기 위해 DAO객체 생성(회원정보를 db에서 검색하여 보여주기 위해 select메소드가 필요)
		MemberDAO dao = new MemberDAO();
		
		//dao의 select메소드를 호출하여 return값을 dto2에 넣어줌
		MemberDTO dto2 = dao.select(dto);
	
		//select메소드가 잘 실행되어 dto2(db)에 저장되어 있는지 확인용 
		/* out.println(dto2.getId());
		out.println(dto2.getPw());
		out.println(dto2.getName());
		out.println(dto2.getBirth());
		out.println(dto2.getTel());
		out.println(dto2.getEmail());
		out.println(dto2.getfJenre1());
		out.println(dto2.getfJenre2());
		out.println(dto2.getfJenre3()); */
		
	%>
	<div class="hr">
		<h1><br>Watch a Movie</h1>
	</div>
<!-- 	<form action="infor2.jsp"> -->
    <div class="hr">
        <!-- 아이디: 중복, 글자수 -->
        <!-- 비밀번호: 안보이게, 글자수, 비밀번호 확인 -->
        <!-- 이름: 한글2글자 이상 -->
        <!-- 탄생년도: 숫자 4자리만 되게 -->
        <!-- 전화번호: 11자리 이하 -->
        <!-- 이메일: 상관없음 -->
        <!-- 선호장르1,2,3: 액션/코미디/로맨스/애니메이션/공포 다섯개만 가능하게 -->

        <table border="1" align="center">
            <tr>
                <td>아이디</td>
            </tr>
            <tr>
                <td>
                    <input type="text" name="id" id="id" value="<%= dto2.getId() %>" readonly="readonly" maxlength="20" width="600" height="50" >
                </td>
            </tr>
            <tr>
                <td>
                    <div id="idC"></div> <!-- id 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>비밀번호</td>
            </tr>
            <tr>
                <td>
               		<input type="password" name="pw" id="pw" value="<%=dto2.getPw()%>" maxlength="20" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="pwC"></div> <!-- pw 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>비밀번호 확인</td>
            </tr>
            <tr>
                <td>
                	<input type="password" name="pw2" id="pw2" value="<%=dto2.getPw()%>" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="pw2C"></div> <!-- pw확인 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>이름</td>
            </tr>
            <tr>
                <td>
               		<input type="text" name="name" id="name" value="<%=dto2.getName()%>" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="nameC"></div> <!-- name 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>탄생년도</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="birth" id="birth" value="<%=dto2.getBirth()%>" placeholder="    태어난 년도를 숫자 4자리로 입력 (1900년에서 2018년까지만 입력가능)" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="birthC"></div> <!-- birth 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>전화번호</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="tel" id="tel" value="<%=dto2.getTel()%>" placeholder="    '-' 빼고 입력" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="telC"></div> <!-- tel 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>이메일</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="email" id="email" value="<%=dto2.getEmail()%>" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>선호장르1</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="fJenre1" id="fJenre1" value="<%=dto2.getfJenre1()%>" placeholder="    액션/코미디/로맨스/애니메이션/공포 중 1개 입력" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="fJenre1C"></div> <!-- fJenre1 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>선호장르2</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="fJenre2" id="fJenre2" value="<%=dto2.getfJenre2()%>" placeholder="    액션/코미디/로맨스/애니메이션/공포 중 1개 입력" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="fJenre2C"></div> <!-- fJenre2 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td>선호장르3</td>
            </tr>
            <tr>
                <td>
                	<input type="text" name="fJenre3" id="fJenre3" value="<%=dto2.getfJenre3()%>" placeholder="    액션/코미디/로맨스/애니메이션/공포 중 1개 입력" width="600" height="50">
                </td>
            </tr>
            <tr>
                <td>
                    <div id="fJenre3C"></div> <!-- fJenre3 입력조건 확인창 -->
                </td>
            </tr>
            <tr>
                <td><button type="button" id="b1">회원정보수정</button><button type="button" id="b2">회원 탈퇴</button></td>
            </tr>

        </table>
    </div>
<!-- 	</form> -->
	
</body>

</html>