package Clase04;
//Creamos la clase Vehiculo para ejemplicar ademas de la herencia
//una introducción al polimorfismo
//Super clase vehiculo 
class Vehiculo{
    public void arrancar(){
        System.out.println("El Vehiculo esta arrancando....");
    }
}

//Subclase Coche2
class Coche2 extends Vehiculo{
    //Este método debería estar sobreescribiendo uno que ya existe la super clase
    @Override //Sobreescribe si el método ya existe 
    public void arrancar(){
        System.out.println("El coche arranca con llaves....");
    }
}

//Subclase Bicicleta
class Bicicleta extends Vehiculo{
    @Override
    public void arrancar(){
        System.out.println("La bicicleta no necesita arrancar....");
    }
}
public class Herencia28 {
    public static void main(String[] args) {
        Vehiculo miVehiculo0=new Vehiculo();
        Vehiculo miVehiculo1=new Coche2();
        Vehiculo miVehiculo2=new Bicicleta();

        miVehiculo0.arrancar(); //Vehiculo
        miVehiculo1.arrancar(); //Coche
        miVehiculo2.arrancar(); //Bicicleta
    }
}