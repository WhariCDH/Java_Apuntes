error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Camion.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Camion.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 417
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Camion.java
text:
```scala
package Semana08Practica.Practica02;

public class Camion extends Vehiculo {

    private double toneladasCarga;

    public Camion(String placa, String marca, int anioFabricacion, double toneladasCarga) {
        super(placa, marca, anioFabricacion);
        this.toneladasCarga=toneladasCarga;
    }

    @Override
    public double calcularPeaje() {
        return peajeCamion;
    }

    @Override@@
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

empty definition using pc, found symbol in pc: 