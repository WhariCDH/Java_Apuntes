//El programa debe pedir un número de dia de la semana y mostrar tu nombre 
package Clase02;
import java.util.Scanner;
public class switch10 {

    public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            System.out.println("Escribe un número de dia de la semana: ");
            int dia=entrada.nextInt();
            //Si el dia es menor que 1 y mayor que 7 entra al switch
            if (!(dia<1 || dia>7)){
                switch(dia){
                    case 1:
                    System.out.println("El día es Lunes.");
                    break;
                    case 2:
                    System.out.println("El día es Martes.");
                    break;
                    case 3:
                    System.out.println("El día es Miercoles.");
                    break;
                    case 4:
                    System.out.println("El día es Jueves.");
                    break;
                    case 5:
                    System.out.println("El día es Viernes.");
                    break;
                    case 6:
                    System.out.println("El día es Sabado");
                    break;
                    case 7:
                    System.out.println("El día es Domingo");
                    break;
                }

            }else{
                System.out.println("Ese día no existe....");
            }
            entrada.close();

    }
    
}