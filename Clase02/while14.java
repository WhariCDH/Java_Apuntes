//El programa debe mostrar la suma de los números del 1 al número que el usuario indique
package Clase02;
import java.util.Scanner;
public class while14 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int suma=0;   //Guardamos la suma de los números
        int numero=1; //Vamos a ir contando
        System.out.println("Hasta cual número quieres contar? ");
        int limite=entrada.nextInt();
        while (numero<=limite){
            suma+=numero; //Se guarda lo que ya tiene suma mas lo que vale actualmente número
            numero++; //Número incrementa en uno 
        }
        System.out.printf("La suma de los números hasta %d es: %d ",limite,suma);
        entrada.close();
    }

    
}
