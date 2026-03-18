//Debes construir un menú que muestre las operaciones aritméticas después debes pedir dos 
//números y realizar la operación elegida por el usuario
package Clase02;
import java.util.Scanner;
public class switch11 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opción \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
        System.out.print("Elige una opción (1-4): ");
        int opcion=entrada.nextInt();
        //Condiciones de los 2 numeros que entraran en la operación matematico
        if (opcion >= 1 && opcion <= 4) {
        System.out.print("Escribe el primer número: ");
        double n1=entrada.nextDouble();
        System.out.print("Escribe el segundo número: ");
        double n2=entrada.nextDouble();
        double r=0; //Declaramos ya que se usara mas de una vez en r=n1+n2; y eso causara error
        switch(opcion){
            case 1:
                r=n1+n2;
                System.out.println("La suma es:"+r);
                break;
            case 2:
                r=n1-n2;
                System.out.println("La resta es:"+r);
                break;
            case 3:
                r=n1*n2;
                System.out.println("La multiplicaión es:"+r);
                break;
            case 4:
                r=n1/n2;
                System.out.println("La división es:"+r);
            default:  //es como el else de los if
                System.out.println("Opción no válida...");

        }
        entrada.close();
    }
        
}
}