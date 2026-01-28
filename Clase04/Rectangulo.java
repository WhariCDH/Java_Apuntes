package Clase04;

public class Rectangulo {
    //atributos de los objetos de esta clase
    double base;
    double altura;

    //Constructor de objetos de esta clase
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    //Función pra calcular el área (devolver un valor de tipo double)
    public double calcularArea(){
        return base*altura;
    }

    
}
