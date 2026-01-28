error id: file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO24.java:
file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO24.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 187
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase04/POO24.java
text:
```scala
package Clase04;
//para crear cajas de mensajes en modo gráfico
import javax.swing.JOptionPane;

public class P0043 {

    public static void main(String[] args) {

        double@@ base = Double.parseDouble(
            JOptionPane.showInputDialog("Ingresa la base del Rectángulo: ")
        );

        double altura = Double.parseDouble(
            JOptionPane.showInputDialog("Ingresa la altura del Rectángulo: ")
        );

        //crearemos un objeto de clase Rectángulo
        Rectangulo rect = new Rectangulo(base, altura);

        //invocamos a la función calcularArea del objeto rectángulo,
        //guardando lo que nos devuelve
        double area = rect.calcularArea();

        //mostramos la información al usuario
        JOptionPane.showMessageDialog(
            null,
            "El área del rectángulo es: " + area
        );
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 