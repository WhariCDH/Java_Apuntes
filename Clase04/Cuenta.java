package Clase04;


public class Cuenta {
    //Atributos de la clase Cuenta
    private String titular;
    private double saldo;
    
    //Constructor de la clase Cuenta 
    public Cuenta(String titular, double saldoInicial){
        this.titular=titular;
        this.saldo=saldoInicial;

    }
    //método getTitular para obtener el titular de la cuenta
    public String getTitular() {
        return titular;
    }

    //método getSaldo para obtener el saldo de la cuenta
    public double getSaldo() {
        return saldo;
    }

/*
 * ¿porqué a veces no se incluyen los setter?
 * porque no siempre es seguro permitir modificar todo desde afuera,
 * por ejemplo no es bueno poder cambiar el titular de una cuenta
 * o su saldo, sino a través de retiros y depósitos
 */

    //creamos un método para depositar dinero a la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    //creamos un método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
        }
    }
}