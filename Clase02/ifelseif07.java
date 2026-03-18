package Clase02;
/*
El programa debe pedir la calificación de un alumno y clasificarlo de 
la siguente manera:
-Si la calificación es >=17 debe avisar tu calificaión es excelente 
-Si la calif. es >=11 debe avisar tu calif. es aprobatoria 
-De lo contrario debe avisar, tu calificación es reprobatoria.
 */
import java.util.Scanner;
public class ifelseif07{
    public static void main(String[] args) {
        //Aqui el codigo de tu programa
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe tu calificación: ");
        int calificacion=entrada.nextInt();

        if(calificacion>=17){
            System.out.println("Tu calificación es excelente: ");
        }
        else if(calificacion>=11){
            System.out.println("Tu calificación es aprobatoria: ");
        }
        else{
            System.out.println("Tu calificación es reprobatoria: ");
        }
        entrada.close();
    }

}