error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/EmpleadoAdministrativo.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/EmpleadoAdministrativo.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 523
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica01/EmpleadoAdministrativo.java
text:
```scala
package Semana08Practica.Practica01;

public class EmpleadoAdministrativo extends Empleado {

    private String area;

    public EmpleadoAdministrativo(String codigo, String nombre, int aniosServicio, String area) {
        super(codigo, nombre, aniosServicio);
        this.area=area;
    }

    //area = RRHH / Contabilidad / Logística
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override 
    public double@@ calcularSueldoBase() {
            return sueldoBaseAdministrativo;
    }
    
    @Override
    public double calcularBonificacion() {
        if (getAniosServicio() > 5) {
            return 200;
        } else {
            return 0;
        }
    }
    
    @Override
    public double calcularDescuento() {
        
        return calcularSueldoBase()*descuentoAFP;


    }


    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 