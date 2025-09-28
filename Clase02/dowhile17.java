//El programa debe mostrar un menú y repetirlo mientras la opción no sea salir
package Clase02;
import java.util.Scanner;
public class dowhile17 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1 ->System.out.println("¡Hola!");
                case 2 ->System.out.println("¡Adios!");
                case 3 ->System.out.println("Saliendo del programa");
                default ->System.out.println("Opción no válida...");
            }
        }while (opcion!=3); //Mientras opcion no sea igual a 3
        entrada.close();
    }
}
