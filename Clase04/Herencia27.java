package Clase04;
//Creamos la clase base, super clase o clase padre 
class Persona2{
    private String nombre; //Indicamos un atributo 

    public Persona2(String nombre){ //creamos el constructor 
        this.nombre=nombre; //Asignamos valor al atributo desde una variable 
    }

    //Creamos un método para mostrar la información de esta clase
    public void mostrarNombre(){
        System.out.println("El nombre es: "+this.nombre);

    }
}

//crearemos la subclase, clase derivada o clase hija
class Estudiante2 extends Persona2{
    private String profesion;
    //Creamos el constructor 
    public Estudiante2(String nombre, String profesion){
        super(nombre); //Se inicializa en la super clase, es heredado
        this.profesion=profesion; //Se inicializa aqui, es local
    }
    //Construimos el método mostrarProfesicion
    public void mostrarProfesion(){
        System.out.println("La profesión es: "+this.profesion);

    }  
}

    public class Herencia27 {
        public static void main(String[] args) {
            Estudiante2 estudiante=new Estudiante2("ana","Ingeniera de Software");
            estudiante.mostrarNombre();      //heredado desde la clase Persona2
            estudiante.mostrarProfesion();   //propio de la clase Estudiante2 
        }
    
}
