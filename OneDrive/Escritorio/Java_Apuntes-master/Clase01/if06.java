//El programa debe pedir un número y avisar si es positivo o negativo 
import java.util.Scanner; 
public class if06 {

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero=entrada.nextInt();
        if (numero>=0){
            System.out.println("El número es positivo.....");
        }
        else{
            System.out.println("El número es negativo.....");
        }
        entrada.close();

    }
    
}
