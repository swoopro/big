// '로그인' 버튼을 누를 때
function login() {
	location.href="login.html"; //'로그인' 페이지로 이동
}

// '로그아웃' 버튼을 누를 때
function logout() {
	location.href="logout2.jsp"; //'로그아웃' 후 세션 초기화를 위해 logout.jsp 페이지로 이동
	alert("로그아웃 되었습니다")
}

//'회원가입' 버튼을 누를 때
function join() {
	location.href="join.html"; // '회원가입' 페이지로 이동
}

// '회원정보' 버튼을 누를 때
function infor() {
	location.href="informaiton.jsp"; // '회원정보' 페이지로 이동
}
