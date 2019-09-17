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
		//body부분을 먼저 읽어서
		//dom tree구조를 가지고 실행
		$("#btn1").on("click", function() {
			$("h1").slideUp(1000);//1000이 1초 밀리세컨드
		});
		$("#btn2").on("click", function() {
			$("h1").slideDown("slow");
		});
		$("#btn3").on("click", function() {
			$("h1").slideToggle("fast");
		});
		$("#btn4").on("click", function() {
			$("h1").animate({marginLeft:"300px"}, 1000)
				   .animate({marginLeft:0}, 1000);
		});
	});

</script>
</head>
<body>
<button id="btn1">슬라이드 업</button>
<button id="btn2">슬라이드 다운</button>
<button id="btn3">슬라이드 토글</button>
<button id="btn4">애니메어션효과</button>
<h1 style="width:50px; height:350px; background-color:lime;">나는 움직일거예요!</h1>


</body>
</html>