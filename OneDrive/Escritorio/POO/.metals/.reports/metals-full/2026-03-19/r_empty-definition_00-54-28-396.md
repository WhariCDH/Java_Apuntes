error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 136
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java
text:
```scala
package Semana08Practica.Practica02;

public class Moto extends Vehiculo {

    private double cilinbrada;

    public Moto(String@@ placa, String marca, int anioFabricacion, double cilindrada) {
        super(placa, marca, anioFabricacion);
        this.cilinbrada=cilindrada;
    }

    @Override
    public double calcularPeaje() {
        return peajeMoto;
    }

    @Override
    public double calcularSeguro() {
        if (getCilinbrada() > 250) {
            return seguroBase*50;
        }
        }

    @Override
    public double calcularImpuesto() {
        return calcularSeguro()*impuestoCamion;
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 