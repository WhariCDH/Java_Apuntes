package Clase04;
//Super clase y sub clase 
//Ejemplo basico de herencia 
//Creamos la clase animal (Que se convertirá en super clase cuando herede)
class Animal{
    //Con un metodo llamado hacerSonido
    void hacerSonido(){
        System.out.println("Los animales hacen sonidos....");

    }
}
//Crearemos la clase Perro que se convertirá en subclase al heredar de la clase animal
class Perro extends Animal{
    //Con un método llamado ladrar 
    void ladrar(){
        System.out.println("Los perros ladran...");

    }
}
//Iniciamos nuestro programa 
public class Herencia26 {
    public static void main(String[] args) {
        //Creamos miPerro de clase Perro que heredo de la clase Animal
        Perro miPerro=new Perro();
        miPerro.hacerSonido();
        miPerro.ladrar();
    }
    
}
