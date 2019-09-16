<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() { //body를 dom tree로 메모리에 먼저읽어들이고,이 스크립트를 실행시켜라
			   //도큐먼트 레디랑 같은거
	$("#data").load("txt/readme.txt");
	
	$("#button").click(function() {
		$("#content").val($("#data").text());
	/* 	$(document).ready(); */		
		if($("#date").val().length < 1){
			alert("날짜를 입력해야합니다.");
			return false;
		}else if($("#title").val().length < 1){
			alert("제목을 입력해야합니다.");
			return false;
		}	
	});
	
});
	

</script>
</head>
<body>
<div id="data"></div>
<form action="server.jsp">
날짜: <input type="text" id="date" name="date"><br>
제목: <input type="text" id="title" name="title"><br>
내용: <input type="text" id="content" name="content"><br>
<input id="button" type="submit" value="일기 서버로전송"><br>



</form>
</body>
</html>