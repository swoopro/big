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
			$("#d1").append($("#reply").val() + "<br>");
			return false; //a태그가 가지는성질은 페이지를 넘긴다 디폴트는 트루
						  //false하면은 페이지안넘긴다
		});

		$("#b2").click(function() {
			$("#d2").append("<img src=img/1.jpg width=200 height=100>" + "<br>");
			return false;
		});
		
		var check = false;//체크가 안되어있음.
		$("#food").change(function() {
			if(check == false){				
				$("#u1 input").attr("checked", true);//체크안되있으면 u1안에인풋을들 체크해줌
				check = true;//체크가 되어있음 체크 변수를지정해줌.
			}else{
				$("#u1 input").attr("checked", false);
				check = false;				
			}			
		});
		
		$("#me").focus(function() {
			console.log($(this).val());//선택했는데 자기자신을또 선택해줘야하는경우this
		});
		
		$("#button1").mouseover(function() {
			console.log("마우스를 올리셨군요");
		});
		
		$("#button2").mouseout(function() {
			console.log("마우스를 떠나셨군요");
		});
	
		$("#id").keyup(function() {
			console.log("id 길이 계산 시작합니다");
			console.log("글자수: " + $(this).val().length);			
		if ($(this).val().length < 5) {
			$("#d3").html("<font color=blue>아이디는 5글자 이상 입력해야합니다.</font>");
			return false;//false 쓰면   form을쓸때 넘어가지않음
		}else{
			$("#d3").html("<font color=red>아이디를 5글자 이상 입력했습니다.</font>");
		}
		});
		
	});
	

</script>
</head>
<body>
	<a href="" id="b1">댓글달기</a> |
	<a href="" id="b2">이미지달기</a> |
	<a href="" id="b3">하위메뉴 선택하기</a>
	<hr color="red">
	댓글입력:<input type="text" id="reply">
	<br>
	<div id="d1"></div>

	<br>
	<hr color="red">
	이미지추가되는곳<br>
	<div id="d2"></div>

	<br>
	<hr color="red">

	<ul id="u1">
		<input type="checkbox" id="food">음식
		<li><input type="checkbox">고구마</li>
		<li><input type="checkbox">양파</li>
		<li><input type="checkbox">감자</li>
	</ul>
	
	<br>
	<hr color="red">
	포커스가 오면 <input type="text" id="me" value="나한테 포커스가 올거야">
	
	<br>
	<hr color="red">
	<button id="button1">내위로 올려요</button>
	<button id="button2">나를 떠나요</button>
	<br>
	<hr color="red">
	가입할 id입력:<input type="text" id="id">
	<div id="d3"></div>
</body>
</html>