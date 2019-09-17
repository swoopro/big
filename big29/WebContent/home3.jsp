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
		$.ajax({
			url:"home5.jsp",
			success:function(result){
				document.write(result);
			}			
		});			
		});
		$("#b2").click(function() {
			var idValue = $("#id").val();
			$.ajax({
				url:"home6.jsp",
				data:{
					id : idValue 
				},
				success:function(result){
					$("div").html(result);
				}			
			});			
			});
		$("#b3").click(function() {
			var reValue = $("#re").val();
			$.ajax({
				url:"home7.jsp",
				data:{
					re : reValue
				},
				success:function(result){
					$("div").append(result);
				}			
			});			
			});
		$("#b4").click(function() {
			var idValue = $("#id").val();
			var reValue = $("#re").val();
			$.ajax({
				url:"home8.jsp",
				data:{
					id : idValue,
					re : reValue
				},
				success:function(result){
					$("div").append(result);
				}			
			});			
			});
	});



</script>
</head>
<body>
ID입력:<input type="text" id="id" name="id"><br>
댓글입력:<input type="text" id="re" name="re"><br>
<hr color="red">
<div></div>

<button type="button" id="b1">AJAX통신1(테이블로 결과 받아옴)</button>
<button type="button" id="b2">AJAX통신2(아이디가 동일한지 검사)</button>
<button type="button" id="b3">AJAX통신3(리스트로 결과 받아옴)</button>
<button type="button" id="b4">AJAX통신4(아이디 + 댓글을썼는지 표시되게(표형태로!))</button>
</body>
</html>