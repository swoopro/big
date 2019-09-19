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
				url: "http://localhost:8888/big30/data/rank2.json",
				dataType: "json",
				success: function(result) {
					alert("JSON문서 연결 성공!!");
					var rank_list = result.rank;
					//rank key에 해당하는 value들의 list!
					if(rank_list.length > 0){
						alert(rank_list.length+"개의 리스트가 있음");
						$(rank_list).each(function(i, person) {
							var name = person.name;
							var tel = person.tel;
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
<h1>제이슨</h1>
<button type="button">JSON 데이터 읽어오기</button>
<hr color="red">
<div></div>
</body>
</html>