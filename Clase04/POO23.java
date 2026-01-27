package Clase04;
import java.util.Scanner;


public class POO23 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //Creamos un objeto de clase Coche
        Coche coche1=new Coche("Toyota", "Corolla", 2025);
        //Invocaremos a su método mostrarInfo()
        coche1.mostrarInfo();

        //Creamos otro objeto con datos introducidos desde el teclado
        System.out.print("Marca del Vehículo: ");
        String marca=entrada.nextLine();

        System.out.print("Modelo del vehículo: ");
        String modelo=entrada.nextLine();
        
        System.out.print("Año del Vehiculo: ");
        int año=Integer.parseInt(entrada.nextLine());

        Coche coche2=new Coche(marca, modelo, año);
        coche2.mostrarInfo();
        entrada.close();

    }
    
}
