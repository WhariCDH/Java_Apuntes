/*
Hacer un programa en java que:
Pida el nombre y la edad del usuario y que despues imprima esa
información en pantalla
*/
//(pida) si tiene que pedir necesita el objeto scanner
import java.util.Scanner;
public class EntradaDatos03 {
    public static void main(String[] args){
        //Debe construir un objeto de clase Scanner
        Scanner entrada=new Scanner(System.in);
        //Pedir el nombre
        System.out.println("Como te llamas?");
        String nombre=entrada.nextLine(); //recibe texto
        //Pedir edad
        System.out.println("Cuantos años tienes?");
        int edad=entrada.nextInt();
        entrada.nextLine();              //Salto de linea cuando finalizamos en enteros
        //Pedir signo zodiacal 
        System.out.println("Cual es tu signo?");
        String signo=entrada.nextLine();
        //Pedir tu edad
        System.out.println("Cual es tu genero?");
        String genero=entrada.nextLine();
        //Imprime la información
        System.out.println("Hola, "+nombre+" tienes "+edad+" años, tu signo es "+signo+" y tu genero es "+genero+".");
        entrada.close();
    }
    
}
