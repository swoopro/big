<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			alert("나를 눌렀군요!!");
		});
	$("#b2").click(function() {
		var reply = $("#reply").val();
		/* $("#div").append("<h3>" + reply + "</h3>");  누적해서쓸때*/
 		/*  $("#div").text(reply);  텍스트 한번만쓸때 다시쓰면 덮어써짐*/
 	   $("#div").html("<h3>" + reply + "</h3>");/* html형식으로쓸때 , 누적x */ 	   
	});
	$("#b3").click(function() {
		var reply = $("#reply").val();
		$("#div2").append("<img src=img/1.jpg>" + reply);
	});
});
	

</script>
</head>
<body>
	<button type="button" id="b1">Click Me!!</button><br>
	
	댓글쓰기: <input type="text" id="reply">
	<button type="button" id="b2">댓글달기</button><br>
	<div id="div"></div>
	
	<button type="button" id="b3">이미지달기</button><br>
	<div id="div2"></div>
</body>
</html>