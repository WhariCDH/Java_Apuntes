package Clase04;

public class Coche {  //Nuestra clase publica puede accedida desde otro archivo
    String marca;
    String modelo;
    int año;

//Creamos el constructor de objetivos de esa clase
public Coche(String marca, String modelo, int año){
    this.marca=marca;
    this.modelo=modelo;
    this.año=año;
}
//Creamos un método para mostrar información del coche 
public void mostrarInfo(){
    System.out.println("---Ficha Técnica del Vehícuo---");
    System.out.println("Marca: "+marca);
    System.out.println("Modelo: "+modelo);
    System.out.println("Año: "+año);
    System.out.println("-------------------------------");
    }
}
