function add0() {
    var n1 = Number(document.getElementById("n1").value);
    var n2 = Number(document.getElementById("n2").value);

    var add = n1 + n2;
    return add;
}

function add2() {
    add = add0();
    if (add >= 100) {
        document.getElementById("result").value = add - 10;
        document.getElementById("h1").textContent = add - 10;
        document.getElementById("p").textContent = add - 10;
    } else {
        document.getElementById("result").value = add;
        document.getElementById("h1").textContent = add;
        document.getElementById("p").textContent = add;
    }
}

function minus0() {
    var n1 = Number(document.getElementById("n1").value);
    var n2 = Number(document.getElementById("n2").value);

    var minus = n1 - n2;
    return minus;
}

function minus2() {
    minus = minus0();
    if (minus >= 100) {
        document.getElementById("result").value = minus - 10;
        document.getElementById("h1").textContent = minus - 10;
        document.getElementById("p").textContent = minus - 10;
    } else {
        document.getElementById("result").value = minus;
        document.getElementById("h1").textContent = minus;
        document.getElementById("p").textContent = minus;
    }
}

function mul0() {
    var n1 = Number(document.getElementById("n1").value);
    var n2 = Number(document.getElementById("n2").value);

    var mul = n1 * n2;
    return mul;
}

function mul2() {
    mul = mul0();
    if (mul >= 100) {
        document.getElementById("result").value = mul - 10;
        document.getElementById("h1").textContent = mul - 10;
        document.getElementById("p").textContent = mul - 10;
    } else {
        document.getElementById("result").value = mul;
        document.getElementById("h1").textContent = mul;
        document.getElementById("p").textContent = mul;
    }
}

function div0() {
    var n1 = Number(document.getElementById("n1").value);
    var n2 = Number(document.getElementById("n2").value);

    var div = n1 / n2;
    return div;
}

function div2() {
    div = div0();
    if (div >= 100) {
        document.getElementById("result").value = div - 10;
        document.getElementById("h1").textContent = div - 10;
        document.getElementById("p").textContent = div - 10;
    } else {
        document.getElementById("result").value = div;
        document.getElementById("h1").textContent = div;
        document.getElementById("p").textContent = div;
    }
}