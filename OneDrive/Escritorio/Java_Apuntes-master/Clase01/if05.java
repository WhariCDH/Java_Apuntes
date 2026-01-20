//El programa debe pedir la edad del usuario y avisar si puede votar
import java.util.Scanner;
public class if05 {

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        //Pedimos la edad
        System.out.print("Escriba la edad: ");
        int edad=entrada.nextInt();
        //Va la condición
        if (edad>=18){
            System.out.println("Si puede votar, felicidades......");
        }
        entrada.close();
    }
    
}
