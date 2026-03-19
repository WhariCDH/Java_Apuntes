error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/Empleado.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/Empleado.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 524
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/Empleado.java
text:
```scala
package Semana08Practica.Practica01;

public abstract class Empleado implements ValoresEmpleado{
    private String codigo;
    private String nombre;
    private int aniosServicio;


    //CONSTRUCTORES
    public Empleado(String codigo, String nombre, int aniosServicio) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.aniosServicio=aniosServicio;
    }

    //METODO GETTERS Y SETTERS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(Str@@ing codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    //METODO ABSTRACTO
    public abstract double calcularSueldoBase();
    public abstract double calcularBonificacion();
    public abstract double calcularDescuento();

    //METODO NORMAL
    public double sueldoFinal() {
        double sueldoFinal=calcularSueldoBase()+calcularBonificacion()-calcularDescuento();
        return sueldoFinal;
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#