error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/MainVehiculo.java:java/util/Scanner#nextInt().
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/MainVehiculo.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2283
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/MainVehiculo.java
text:
```scala
package Semana08Practica.Practica02;

import java.util.Scanner;

public class MainVehiculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n===== SISTEMA VEHICULOS =====");
            System.out.println("1 Registrar Auto");
            System.out.println("2 Registrar Camion");
            System.out.println("3 Registrar Moto");
            System.out.println("4 Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Año Fabricacion: ");
                    int anio = sc.nextInt();

                    System.out.print("Numero de puertas: ");
                    int puertas = sc.nextInt();
                    sc.nextLine();

                    Auto a = new Auto(placa, marca, anio, puertas);

                    System.out.println("Costo Total: " + a.costoTotal());

                    break;

                case 2:

                    System.out.print("Placa: ");
                    placa = sc.nextLine();

                    System.out.print("Marca: ");
                    marca = sc.nextLine();

                    System.out.print("Año Fabricacion: ");
                    anio = sc.nextInt();

                    System.out.print("Toneladas de carga: ");
                    double ton = sc.nextDouble();
                    sc.nextLine();

                    Camion c = new Camion(placa, marca, anio, ton);

                    System.out.println("Costo Total: " + c.costoTotal());

                    break;

                case 3:

                    System.out.print("Placa: ");
                    placa = sc.nextLine();

                    System.out.print("Marca: ");
                    marca = sc.nextLine();

                    System.out.print("Año Fabricacion: ");
                    anio = sc.nex@@tInt();

                    System.out.print("Cilindrada: ");
                    double cil = sc.nextDouble();
                    sc.nextLine();

                    Moto m = new Moto(placa, marca, anio, cil);

                    System.out.println("Costo Total: " + m.costoTotal());

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 4);

        sc.close();
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().