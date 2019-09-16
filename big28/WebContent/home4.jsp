<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
var food = ["사과", "바나나", "멜론"];
$(function() {
	document.write(food[0] + "<br>");	//배열을 찍어도 주소값이나오지않고
	document.write(food[1] + "<br>");	//값이나온다	
	document.write(food[2] + "<br>");		
	document.write(food + "<br>");		

	// var food2 = [];

/* var food2 = new Array();
 	var data1 = prompt("배열에 넣을값을 입력하세요");
	var data2 = prompt("배열에 넣을값을 입력하세요");
	var data3 = prompt("배열에 넣을값을 입력하세요");
	food2[0] = data1;
	food2[1] = data2;
	food2[2] = data3;
	
	console.log(food2[0]);
	console.log(food2[1]);
	console.log(food2[2]);
	document.write(food2); */
var food2 = [];
for (var i = 0; i < 3; i++) {
	food2[i] = prompt("배열에넣을값을 입력하세요.");
}
	document.write(food2);
	
	
});
 	

</script>
</head>
<body>
	
</body>
</html>