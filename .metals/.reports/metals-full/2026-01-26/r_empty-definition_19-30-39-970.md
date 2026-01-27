error id: file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO22.java:java/lang/System#
file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO22.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 914
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO22.java
text:
```scala
package Clase04;
import java.util.Scanner;
//Inicia la programación orientada a objetos 
//Se debe crear la clase que formará objetos de un cierto tipo
class Persona{  //Definimos la clase (molde) Persona, para crear objetos
    //de este tipo
    String nombre; //atributo o propiedad del objeto de clase Persona 
    int edad;      //atributo o propiedad del objeto de clase Persona 

}

public class POO22 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //crearemos el objeto p1 de clase Persona
        Persona p1=new Persona();
        //Asignamos valores a los atributos nombre y edad el objeto p1
        System.out.print("Escribe tu nombre: ");
        p1.nombre=teclado.nextLine();
        System.out.print("Escribe tu edad: ");
        p1.edad=teclado.nextInt();

        //paa visualizar la información del objeto p1
        @@System.out.println("El nombre guardado en el objeto p1 es: "+p1.nombre);




        
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#