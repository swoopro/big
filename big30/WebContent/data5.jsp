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
				url: "http://localhost:8888/big30/data/MOCK_DATA.json",
				dataType: "json",
				success: function(result) {
					alert("JSON문서 연결 성공!!");
					if(result.length > 0){
						alert(result.length+"개의 리스트가 있음");
						$(result).each(function(i, person) {
							var id = person.id;
							var first_name = person.first_name;
							var last_name = person.last_name;
							var email = person.email;
							var gender = person.gender;
							var ip_address = person.ip_address;
							$("div").append(id+","+first_name+","+last_name
									+","+email+","+gender
									+","+ip_address+"<br>");
						});
					}
				}
			});
		});
	});


</script>
</head>
<body>
<h1>제이슨</h1>
<button type="button">JSON 데이터 읽어오기</button>
<hr color="red">
<div></div>
</body>
</html>