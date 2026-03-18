//Mejora de la anterior
package Clase02;
import java.util.Scanner;
public class ifelseif08 {

    public static void main(String[] args) {
        //Aqui el codigo de tu programa
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe tu calificación: ");
        double calificacion=entrada.nextDouble();

        if(calificacion>=17 && calificacion<=20){
            System.out.println("Tu calificación es excelente: ");
        }
        else if(calificacion>=11 && calificacion<=16.999){
            System.out.println("Tu calificación es aprobatoria: ");
        }
        else if(calificacion>=0 && calificacion<=11.999){
            System.out.println("Tu calificación es reprobatoria: ");
        }
        else{
            System.out.println("Esa calificación no es válida.");
        }
        entrada.close();
    }

}
    
