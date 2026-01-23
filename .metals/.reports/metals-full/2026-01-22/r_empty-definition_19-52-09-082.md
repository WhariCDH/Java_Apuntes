error id: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java:java/lang/String#
file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 178
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
text:
```scala
import java.sql.*;
import java.util.Scanner;
public class CRUD21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stri@@ng url="jdbc:mysql://localhost:3306/escuela";
        String user="root";
        string password="";//si ya tienes mysql con contraseña ponla aqui
        
        //Intentaremos una conexion 
        try{
            Connection conexion=DriverManager.getConnection(url, user, password);
            Statement stmt=conexion.createStatement(); //Guardamos el estado de la conexion
            int opcion; //esta variable guarda la opcion elegida por el usuario
            //usaremos un do while por que necesitamos que al menos 1 vez se muestre el menu 
            do{
                System.out.println("---MENU DEL SISTEMA---");
                System.out.println("1. Crear Alumno");
                System.out.println("2. Leer Alumno");
                System.out.println("3. Actualizar Alumno");
                System.out.println("4. Eliminar Alumno");
                System.out.println("5. Salir");
                System.out.println("Eligir una opción: ");
                opcion=sc.nextInt(); //Esperemos a que el usuario escoja una opción 

                //Iniaciamos programando cada una de las opciones que puede elegir el usuario 
                switch (opcion) {
                    case 1: //Insertar datos de un alumno (create)
                    System.out.print("Nombre del alumno: ");
                    String nombre=sc.nextLine();
                    System.out.print("Edad del Alumno: ");
                    int edad=sc.nextInt();
                    //Generamos la instruccion sql para insertar en la tabla 
                    String sqlInsert="INSERT INTO alumnos(nombre,edad) VALUES('"+nombre+","+edad+"')";
                    //Se ejecuta la instrucción 
                    stmt.executeUpdate(sqlInsert);
                    //Se le avisa al usuario que ya quedó
                    System.out.println("Alumno registrado: ");
                    break;
                
                    default:
                        break;

            }
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#