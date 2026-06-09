/* ===================================== */
/* VARIABLES */
/* ===================================== */

let jugador = "Whari";

var mundo = "Kanterbury";

/* ===================================== */
/* CONSTANTE */
/* ===================================== */

const juego = "Guardian Tales";

/* ===================================== */
/* EVENTO CLICK */
/* ===================================== */

function mostrarSaludo() {

    document.getElementById("mensaje").innerHTML =
        "Bienvenido " + jugador +
        " al mundo de " + mundo +
        " en " + juego;

}

/* ===================================== */
/* OPERADORES ARITMÉTICOS */
/* ===================================== */

function sumarNivel() {

    let nivelActual = 10;
    let recompensa = 5;

    let total = nivelActual + recompensa;

    document.getElementById("resultado").innerHTML =
        "Nivel total: " + total;

}

/* ===================================== */
/* OPERADORES RELACIONALES */
/* ===================================== */

function verificarNivel() {

    let nivel = 25;

    if (nivel >= 20) {

        document.getElementById("resultado").innerHTML =
            "Puedes entrar al castillo";

    } else {

        document.getElementById("resultado").innerHTML =
            "Nivel insuficiente";

    }

}

/* ===================================== */
/* OPERADORES LÓGICOS */
/* ===================================== */

function verificarAcceso() {

    let nivel = 40;
    let diamantes = 1000;

    if (nivel >= 30 && diamantes >= 500) {

        document.getElementById("resultado").innerHTML =
            "Acceso VIP permitido";

    } else {

        document.getElementById("resultado").innerHTML =
            "Acceso VIP denegado";

    }

}

/* ===================================== */
/* EVENTO MOUSEOVER */
/* ===================================== */

function cambiarColor() {

    document.body.style.backgroundColor = "lightblue";

}