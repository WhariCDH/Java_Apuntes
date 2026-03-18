//El programa pedirá la edad y clasificará su etapa de vida
package Clase02;
import java.util.Scanner;

public class ifelseif09 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe tu edad: ");
        int edad=entrada.nextInt();
        //Verificamos que la edad esté en el rango deseado
        if (edad>0 && edad<=130){
            if (edad<=12){
                System.out.println("Estás en la infancia, disfruta...");
            }
            else if (edad<=18){
                System.out.println("Estás en la adolescencia, disfruta...");
            }
            else if (edad<=25){
                System.out.println("Estás en la juventud, disfruta...");
            }
            else if (edad<=40){
                System.out.println("Estas en la Adultez temprana, disfruta...");
            }
            else if (edad<=65){
                System.out.println("Estás en la Adultez media, disfruta...");
            }
            else if (edad<=79){
                System.out.println("Estás en la Adultez tardía, vive....");
            }
            else if (edad<=99){
                System.out.println("Estás en la Senectud avanzada, contemple...");
            }
            else if (edad<=130){
                System.out.println("Estás en la Longevidad extrema, enseñe...");
            }
        }else{
                System.out.println("Esa edad no es válida...");
            }
            entrada.close();
    }
}
    
