error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 124
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java
text:
```scala
package Semana08Practica.Practica02;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public@@ Auto(String placa, String marca, int anioFabricacion, int numeroPuertas) {
        super(placa, marca, anioFabricacion);
        this.numeroPuertas=numeroPuertas;
    }

    @Override
    public double calcularPeaje() {
        return peajeAuto;
    }

    @Override
    public double calcularSeguro() {
        if (anioFabricacion < 2015) {
            return seguroBase+50;
        } else {
            return 0;
        }
    }

    @Override
    public double calcularImpuesto() {
        return impuestoAuto;
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 