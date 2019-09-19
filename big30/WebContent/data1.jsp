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
		$("button").click(function() {
			$.ajax({
				url: "http://localhost:8888/big30/data/rank.xml",
				dataType: "xml",
				success: function(result) {
					alert("XML문서 연결 성공!!");
					alert($(result).find("rank").length);
					//result안에 rank태그 개수찾기
					if($(result).find("rank").length > 0){
						$(result).find("rank").each(function() {
						var name = $(this).find("name").text();
						var tel = $(this).find("tel").text();
						$("div").append(name+","+tel+"<br>");
						});						
					}
				}
			});
		});
	});


</script>
</head>
<body>
<h1>동계 올림픽 순위</h1>
<button type="button">XML 데이터 읽어오기</button>
<hr color="red">
<div></div>
</body>
</html>