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
				url: "http://localhost:8888/big30/data/dataset.xml",
				dataType: "xml",
				success: function(result) {
					alert("XML문서 연결 성공!!");
					alert($(result).find("record").length);
					if($(result).find("record").length > 0){
						$(result).find("record").each(function() {
				//this는 $(result).find("record")을 의미
						var id = $(this).find("id").text();
						var fname = $(this).find("first_name").text();
						var lname = $(this).find("last_name").text();
						var email = $(this).find("email").text();
						var gender = $(this).find("gender").text();
						var ip = $(this).find("ip_address").text();
						$("div").append(id+","+fname+","+lname
								+","+email+","+gender+","
								+ip+"<br>");
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