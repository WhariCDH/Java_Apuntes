error id: file:///C:/Users/Dayana/Java_Apuntes/Clase04/Coche.java:java/io/PrintStream#println().
file:///C:/Users/Dayana/Java_Apuntes/Clase04/Coche.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 431
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase04/Coche.java
text:
```scala
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
    System.out.@@println();
}
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println().