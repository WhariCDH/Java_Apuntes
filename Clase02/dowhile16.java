//El programa debe pedir un número y contar desde el 1 hasta ese número
package Clase02;
import java.util.Scanner;
public class dowhile16 {

    public static void main(String[] args) {
        int i=1;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe un número y contaremos hasta él: ");
        int numero=entrada.nextInt();  //5
        do{  //Ha lo siguente}
            System.out.println("Contando "+i); //1,2,3,4,5,
            i++; //2,3,4,5,6
        }while (i<=numero); //condición de mientras 1 sea menor o igual al número que colocamos 
        entrada.close();

    }
    
}
