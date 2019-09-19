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
				url: "http://localhost:8888/big30/data/product100.xml",
				dataType: "xml",
				success: function(result) {
					alert("XML문서 연결 성공!!");
					alert($(result).find("record").length);
					if($(result).find("record").length > 0){
						$(result).find("record").each(function() {
						var pid = $(this).find("pid").text();
						var title = $(this).find("title").text();
						var content = $(this).find("content").text();
						var price = $(this).find("price").text();
						var company = $(this).find("company").text();
						$.ajax({
							url: "product100.jsp",
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
<h1>상품상품</h1>
<button type="button">XML 데이터 읽어오기</button>
<hr color="red">
<div></div>
</body>
</html>