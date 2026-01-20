//Hacer un programa que válide el ingreso de una edad
package Clase02;
import java.util.Scanner;
public class while15 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad=0;
        System.out.print("Escribe tu edad (mayor a 0 y menor a 130): ");
        edad=entrada.nextInt();

        while(edad<=0 || edad>130){  //Solo entra si cumple la condición, while es un buble y debe cumplir para salir
            System.out.println("Escribe una edad válida. ");
            edad=entrada.nextInt();

        }
        System.out.println("Edad válida: "+edad);
        entrada.close();
    }
}