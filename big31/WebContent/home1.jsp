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
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fphoto.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
				//rss2json.com에서  json으로바꿔줌
				dataType: "json",
				data: {
					url: "http://photo.chosun.com/site/data/rss/rss.xml",
					api_key: "kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
					count: 20 //20개가져오기
				},
				success: function(result) {
					/* alert("조선 일보 사이트 연결 ok!"); */
						$("#result").empty(); //div#result 지우기
					for(var i=0; i <20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<img src = " + thumbnail + " width=50 heigth=50>");
						$("#result").append("<a href="+link+">"+title+"</a><br>");
					}
				}
			});			
		});
		$("#b2").click(function() {
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
				dataType: "json",
				data:{
					url: "http://www.chosun.com/site/data/rss/rss.xml",
					api_key: "kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
					count: 20
				},
				success: function(result) {
					$("#result").empty();
					for (var i = 0; i < 20; i++) {
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<img src = " + thumbnail + " width=50 heigth=50>");
						$("#result").append("<a href="+link+">"+title+"</a><br>");
					}
				}
			});
		});
		$("#b3").click(function() {
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
				dataType: "json",
				data:{
					url: "http://www.chosun.com/site/data/rss/ent.xml",
					api_key: "kvcjqfujgi2dwkhknkqnz5c5iqztx9smsebwsquz",
					count: 20
				},
				success: function(result) {
					$("#result").empty();
					for (var i = 0; i < 20; i++) {
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<img src = " + thumbnail + " width=50 heigth=50>");
						$("#result").append("<a href="+link+">"+title+"</a><br>");
					}
				}
			});
		});
	});

</script>
</head>
<body>
<button type="button" id="b1">포토</button>
<button type="button" id="b2">속보</button>
<button type="button" id="b3">연예</button>
<hr color = "red">
<div id="result">

</div>

</body>
</html>