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
var array =["java", "fun java", "park"];
/* 	$("#b2").click(function() {
		
		$("#title").val(array[0]);
		$("#content").val(array[1]);
		$("#writer").val(array[2]);
	}); */
	title.value =array[0];
	content.value =array[1];
	writer.value =array[2];
	$("#b1").click(function() {
		
		if ($("#title").val().length < 3) {
			alert("3글자 이상 입력해주세요.")
			return false;
		}else if ($("#writer").val().length < 1) {
			alert("글쓴이를 입력해주세요.")
			return false;
		}
	});
	
});
	

</script>
</head>
<body>
<form action="server2.jsp">
제목:<input type="text" id="title" name="title"><br>
내용:<input type="text" id="content" name="content"><br>
글쓴이:<input type="text" id="writer" name="writer"><br>
<button type="submit" id="b1">전송</button>
<button type="button" id="b2">데이터가져오기</button>
</form>
</body>
</html>