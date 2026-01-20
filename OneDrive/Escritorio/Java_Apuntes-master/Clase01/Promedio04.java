/*
Hacer un programa que pida 3 calificacaiones y muestre el promedio 
*Pedir datos (Scanner)
*Calificaciones (Numero con decimal)
*Mostrar el promedio
 */
import java.util.Scanner;
public class Promedio04 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        //pedir las 3 calificaciones
        System.out.print("Ingresa la calif. de química: ");
        double quimica=entrada.nextDouble();
        System.out.print("Ingrese la calif. de física: ");
        double fisica=entrada.nextDouble();
        System.out.print("Ingrese la calif. de matemática: ");
        double matematica=entrada.nextDouble();
        //Calculemos el promedio
        double promedio=(fisica+quimica+matematica)/3;
        //Mostramos el resultado redondeado a 2 decimales
        System.out.printf("El promedio de las tres calif. es: %.2f\n" ,promedio);  //printf: formato de 2 decimales, %.2f\n para ejecutar
        entrada.close();
    }
}
