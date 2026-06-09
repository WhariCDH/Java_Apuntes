
/********************************/
/* VARIABLES Y CONSTANTES */
/********************************/

function mostrarDatos()
{

    // ✔ VARIABLE

    let nombre = "Whari";

    // ✔ CONSTANTE

    const pais = "Perú";

    alert(
        "Nombre: " + nombre +
        "\nPaís: " + pais
    );

}


/********************************/
/* OPERADORES ARITMÉTICOS */
/********************************/

function sumar()
{

    let numero1 = 10;

    let numero2 = 5;

    let resultado = numero1 + numero2;

    alert(
        "Resultado = " + resultado
    );

}


/********************************/
/* OPERADORES RELACIONALES */
/********************************/

function comparar()
{

    let edad = 18;

    if(edad >= 18)
    {
        alert("Es mayor de edad");
    }
    else
    {
        alert("Es menor de edad");
    }

}


/********************************/
/* OPERADORES LÓGICOS */
/********************************/

function validarAcceso()
{

    let usuario = "admin";

    let clave = "1234";

    if(
        usuario == "admin"
        &&
        clave == "1234"
      )
    {
        alert("Acceso permitido");
    }
    else
    {
        alert("Acceso denegado");
    }

}


/********************************/
/* OPERADORES DE ASIGNACIÓN */
/********************************/

function puntosJuego()
{

    let puntos = 100;

    // equivalente a:
    // puntos = puntos + 50

    puntos += 50;

    alert(
        "Puntos Totales: " + puntos
    );

}


/********************************/
/* INPUT TEXT */
/********************************/

function saludar()
{

    let nombreUsuario =
    document.getElementById("nombre").value;

    alert(
        "Hola " + nombreUsuario
    );

}


/********************************/
/* EVENTO ONCHANGE */
/********************************/

function elegirHeroe(heroe)
{

    alert(
        "Elegiste: " + heroe
    );

}


/********************************/
/* EVENTO ONMOUSEOVER */
/********************************/

function mensajeMouse()
{

    console.log(
        "Mouse sobre la caja"
    );

}


/********************************/
/* EVENTO ONLOAD */
/********************************/

window.onload = function()
{

    console.log(
        "Página cargada correctamente"
    );

}