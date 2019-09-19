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
				url: "http://localhost:8888/big30/data/product.json",
				dataType: "json",
				success: function(result) {
					alert("JSON문서 연결 성공!!");
					if(result.length > 0){
						alert(result.length+"개의 리스트가 있음");
						$(result).each(function(i, person) {
							var pid = person.pid;
							var title = person.title;
							var content = person.content;
							var price = person.price;
							var company = person.company;
							
							$.ajax({
								url: "product200.jsp",
								data: {
									pid : pid,
									title : title,
									content : content,
									price : price,
									company : company,
								},
								success: function() {
									console.log("db처리 ok!!");							
								}
							});
						});
					}
				}						
			});
		});
	});


</script>
</head>
<body>
<h1>JSON</h1>
<button type="button">JSON 데이터 읽어오기</button>
<hr color="red">
<div></div>
</body>
</html>