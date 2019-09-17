<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	var array = ['포도','바나나','딸기'];
	$(function() {
		$("#p2").prev().css("border","2px dotted red"); // p2중심으로 왼쪽:prev
		$("#p2").next().css("border","2px solid blue"); // p2중심으로 오른쪽:next
		$("#p2").siblings().css("background","orange");
		$("p").css("color", "green");
		/* $("p").text("야채"); */
		/* $("p").each(function(i, tag) {//i:인덱스, tag:인덱스에 해당하는p태그
			$(tag).text(i+"번째 야채");//변수명이라 바꿔줘도댐 ,for문과흡사하다
		)}; */
		
		/* $("p").each(function(index, k) {
			$(k).text(array[index]);
		});  */
		/* $("#p1").insertAfter("#p3");//p1을 p3뒤에놓는다 */
		$("a[title]").css("background-color", "yellow");
		$("a[href='http://www.nate.com']").css("background-color", "pink");
		$("a[href^='mailto']").css("background-color", "aqua"); //^:시작
		$("a[href$='net']").css("background-color", "purple"); //$:끝
		$("a[href*='google']").attr("title", "나는 구글이야");//*포함하는지
		$("a[href='http://www.naver.com']").removeAttr("title");
	});

</script>
</head>
<body>
<p id="p1">감자</p>
<p id="p2">고구마</p>
<p id="p3">양파</p>
<p id="p4"><a href="http://www.naver.com" title="네이버 이동">네이버</a></p>
<p id="p5"><a href="mailto:admin@naver.com">관리자에게 메일</a></p>
<p id="p6"><a href="http://www.daum.net">다음</a></p>
<p id="p7"><a href="http://www.google.com">구글</a></p>
<p id="p8"><a href="http://www.nate.com">네이트</a></p>
</body>
</html>