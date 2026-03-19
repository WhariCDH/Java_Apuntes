error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java:java/lang/Override#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java
empty definition using pc, found symbol in pc: java/lang/Override#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 304
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Moto.java
text:
```scala
package Semana08Practica.Practica02;

public class Moto extends Vehiculo {

    private double cilinbrada;

    public Moto(String placa, String marca, int anioFabricacion, double cilindrada) {
        super(placa, marca, anioFabricacion);
        this.cilinbrada=cilindrada;
    }

    @Overr@@ide
    public double calcularPeaje() {
        return peajeCamion;
    }

    @Override
    public double calcularSeguro() {
        return seguroBase+(toneladasCarga*20);
    }

    @Override
    public double calcularImpuesto() {
        return calcularSeguro()*impuestoCamion;
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/Override#