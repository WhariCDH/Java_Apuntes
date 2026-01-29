package Clase04;
import java.util.Scanner;

public class Encap25 {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        //pedimos los datos para construir el objeto
        //después no se podrán modificar directamente
        System.out.print("Nombre del titular: ");
        String titular=entrada.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial=entrada.nextDouble();
        entrada.nextLine(); //limpiamos el buffer

        //construiremos el objeto de clase Cuenta
        Cuenta cuenta=new Cuenta(titular, saldoInicial);

        //usaremos los métodos de la clase cuenta
        System.out.println("Bienvenido: "+cuenta.getTitular()+" Tu saldo actual es: "+cuenta.getSaldo());

        System.out.println("Presiona enter para continuar");
        entrada.nextLine();

        //haremos un deposito de 500
        System.out.println("Haremos un deposito de $500.00");
        cuenta.depositar(500);

        //mostramos el saldo
        System.out.println("Saldo actual: $" +cuenta.getSaldo());
        System.out.println("Presiona enter para continuar");
        entrada.nextLine();

        //haremos un retiro
        System.out.println("Haremos un retiro de $200.00");
        cuenta.retirar(200);

        System.out.println("Saldo actual: $"+cuenta.getSaldo());
        System.out.println("Gracias por entrar al servicio....");  
        entrada.close();
    }
}
