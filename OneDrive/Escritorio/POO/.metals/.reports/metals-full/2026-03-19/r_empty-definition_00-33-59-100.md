error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 320
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Auto.java
text:
```scala
package Semana08Practica.Practica02;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Auto(Stri@@ng placa, String marca, int anioFabricacion, int numeroPuertas) {
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

empty definition using pc, found symbol in pc: java/lang/String#