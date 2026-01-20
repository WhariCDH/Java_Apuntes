/*
El programa pide dos números, los suma y muestra el resultado
importaremos la libreria util para pedir datos desde el teclado
 */
import java.util.Scanner;

public class SumaEnteros02 {
    public static void main(String[] args){
    //Crearemos un objeto para pedir datos desde el teclado
    Scanner entrada=new Scanner(System.in);
    //Pedimos los números que sumaremos
    System.out.print("Ingrese el primer número entero: ");
    int numero1=entrada.nextInt();
    System.out.print("Ingrese el segundo número entero: ");
    int numero2=entrada.nextInt();
    System.out.print("Ingrese el terce número entero: ");
    int numero3=entrada.nextInt();
    //Calculemos el resultado
    int suma=numero1+numero2+numero3;
    //Mostramos el resultado
    System.out.println("La suma de "+numero1+" + "+numero2+" + "+numero3+" es "+suma);
    entrada.close();
    }
}
