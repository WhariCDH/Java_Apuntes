error id: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java:java/lang/System#
file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 774
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
text:
```scala
import java.sql.*;
import java.util.Scanner;
public class CRUD21 {

    public static void main(String[] args) {
        Scanner sc=new Scanner{System.in};

        String url="jdbc:mysql://localhost:3306/escuela";
        String user="root";
        string password="";//si ya tienes mysql con contraseña ponla aqui
        
        //Intentaremos una conexion 
        try{
            Connection conexion=DriverManager.getConnection(url, user, password);
            Statement stmt=conexion.createStatement(); //Guardamos el estado de la conexion
            int opcion; //esta variable guarda la opcion elegida por el usuario
            //usaremos un do while por que necesitamos que al menos 1 vez se muestre el menu 
            do{
                @@System.out.println();
            }
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#