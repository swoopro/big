//call 함수를 만들어줌 ->함수정의, 함수선언
//함수는 선언만 해주어서는 실행되지 않음.
//함수는 반드시 호출(사용)해야만 실행됨.
function call() {
    //1. 입력값을 2개 받아서
    var n1 = prompt("커피값 입력", "0");
    var n2 = prompt("주문수량 입력", "0");
    // var n11 = parseInt(n1);
    // var n11 = parseInt(n2);
    var n11 = Number(n1); //(타입에맞는)숫자로 바꿔주는 함수  특이하게 대문자임
    var n22 = Number(n2);

    var mul = n11 * n22;
    //2. 두개의 곱이 25000을 넘는지 체크
    //3. 넘으면, 네이버 쇼핑사이트로 링크
    //4. 넘지않으면, 다음 쇼핑사이트로 링크
    if (mul >= 25000) {
        location.href = "http://www.naver.com";
    } else {
        location.href = "http://www.daum.net";

    }

}

function call2() {
    //1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); //숫자로 바꿔주는 함수  특이하게 대문자임
    var n22 = Number(n2);

    var mul = n11 * n22;
    //2. 두개의 곱이 25000을 넘는지 체크
    //3. 넘으면, 네이버 쇼핑사이트로 링크
    //4. 넘지않으면, 다음 쇼핑사이트로 링크
    if (mul >= 25000) {
        location.href = "http://www.naver.com";
    } else {
        location.href = "http://www.daum.net";

    }

}

function call3() {
    //1. 입력값을 2개 받아서
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); //숫자로 바꿔주는 함수  특이하게 대문자임
    var n22 = Number(n2);

    var mul = n11 * n22;
    //2. 두개의 곱이 25000을 넘는지 체크
    //3. 넘으면, 네이버 쇼핑사이트로 링크
    //4. 넘지않으면, 다음 쇼핑사이트로 링크
    if (mul >= 25000) {
        document.getElementById("result").value = mul - 5000;
    } else {
        document.getElementById("result").value = mul;

    }

}

function cal() {
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;

    var n11 = Number(n1); //숫자로 바꿔주는 함수  특이하게 대문자임
    var n22 = Number(n2);

    var mul = n11 * n22;
    return mul; //다른데 가져가서 사용해야하면 리턴해준다
}

function call4() {
    //1. 입력값을 2개 받아서
    mul = cal(); //cal()은 mul로 리턴된다 그거를 가져와서 변수mul로지정

    //2. 두개의 곱이 25000을 넘는지 체크
    //3. 넘으면, 네이버 쇼핑사이트로 링크
    //4. 넘지않으면, 다음 쇼핑사이트로 링크
    if (mul >= 25000) {
        document.getElementById("result").value = mul - 5000;
    } else {
        document.getElementById("result").value = mul;

    }

}

function call5() {
    //1. 입력값을 2개 받아서
    mul = cal(); //cal()은 mul로 리턴된다 그거를 가져와서 변수mul로지정

    //2. 두개의 곱이 25000을 넘는지 체크
    //3. 넘으면, 네이버 쇼핑사이트로 링크
    //4. 넘지않으면, 다음 쇼핑사이트로 링크
    if (mul >= 25000) {
        document.getElementById("h2").textContent = mul - 5000; //태그내용안에 넣는것
        document.getElementById("p").textContent = mul - 5000;
    } else {
        document.getElementById("h2").textContent = mul;
        document.getElementById("p").textContent = mul;

    }

}