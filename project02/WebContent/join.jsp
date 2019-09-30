<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link rel="stylesheet" href="css/join.css"> <!-- css 연결 설정 -->
<script src="js/jquery-3.4.1.js"></script> <!-- jquery 연결 설정 -->
<script src="js/join.js"></script> <!-- javascript 연결 설정 -->
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
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:setProperty property="*" name="dto" />

	<%
		//insert메소드를 호출하기 위해 DAO객체 생성
		MemberDAO dao = new MemberDAO();
		//insert메소드를 호출
		dao.insert(dto);
	%>
	
	<div id="dc">
	<table border="1">
		<tr>
			<td class="t"><h1>회원가입이 완료되었습니다.</h1></td>
		</tr>
		<tr>
			<td></td>
		</tr>
		<tr>
			<td class="t"><img src="img/태극기.png" width="600" height="400"></td>
		</tr>
		<tr>
			<td></td>
		</tr>
		<tr>
			<td class="t">
				<button type="button" onclick="login()">확인</button>
			</td>
		</tr>
	</table>	
	</div>

</body>

</html>