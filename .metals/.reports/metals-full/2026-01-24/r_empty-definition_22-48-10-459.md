error id: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java:java/io/PrintStream#println(+8).
file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 3292
uri: file:///C:/Users/Dayana/Java_Apuntes/Clase03/CRUD21.java
text:
```scala
package Clase03;

import java.sql.*;
import java.util.Scanner;

public class CRUD21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/escuela";
        String user="root";
        String password="123456";//si ya tienes mysql con contraseña ponla aqui
        
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
                System.out.print("Eligir una opción: ");

                opcion = sc.nextInt(); //Esperemos a que el usuario escoja una opción 
                sc.nextLine(); // limpiar buffer 

                //Iniaciamos programando cada una de las opciones que puede elegir el usuario 
                switch (opcion) {
                    case 1: //Insertar datos de un alumno (create) 
                        System.out.print("Nombre del alumno: ");
                        String nombre=sc.nextLine(); 
                
                        System.out.print("Edad del Alumno: ");
                        int edad=sc.nextInt();
                
                        //Generamos la instruccion sql para insertar en la tabla 
                        String sqlInsert="INSERT INTO alumnos(nombre,edad) VALUES('"+nombre+"',"+edad+")"; //edad no lleva comilla por que es entero 
                        //Se ejecuta la instrucción 
                        stmt.executeUpdate(sqlInsert);
                        //Se le avisa al usuario que ya quedó
                        System.out.println("Alumno registrado: ");
                        break;

                    case 2: //Leer datos de los alumnos (Read)
                        //esta instrucción muestra todos los datos de la tabla alumno
                        ResultSet rs=stmt.executeQuery("SELECT * FROM alumnos");
                        System.out.println("\nListado de Alumnos");
                        //mientras rs tenga un siguiente elemento
                        while (rs.next()) {
                            System.out.println(rs.getInt("id")+"-"+rs.getString("nombre")+"-Edad: "+rs.getInt("Edad")); 
                        }
                        break;
                    
                    case 3: //Actualizar alumnos (Update)

                        System.out.print("ID del alumno a actualizar: ");
                        int idUpdate=sc.nextInt(); 

                        System.out.println("Nuevo nombre: ");
                        String nuevoNombre=sc.nextLine();

                        System.out.print@@ln("Nueva edad: ");
                        int nuevaEdad=sc.nextInt();

                        String sqlUpdate="UPDATE alumno Set nombre='"+nuevoNombre+"',edad="+nuevaEdad+" WHERE id="+idUpdate;
                        stmt.executeUpdate(sqlUpdate);
                        System.out.println("Alumno Actualizado");
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcion != 5);

            stmt.close();  //cerrar conexiónes
            conexion.close();
            sc.close();

        } catch (SQLException e) {
            System.out.println("Error en la base de datos:");
            e.printStackTrace();
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).