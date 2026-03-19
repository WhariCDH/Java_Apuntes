error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Vehiculo.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Vehiculo.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 237
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica02/Vehiculo.java
text:
```scala
package Semana08Practica.Practica02;

public abstract class Vehiculo implements TarifasVehiculo {

    private String placa;
    private String marca;
    private int anioFabricacion;

    //CONSTRUCTORES
    public Vehiculo(Str@@ing placa, String marca, int anioFabricacion) {
        this.placa=placa;
        this.marca=marca;
        this.anioFabricacion=anioFabricacion;
    }

    //GETTERS Y SETTERS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //METODOS ADSTRACTOS
    public abstract double calcularPeaje();
    public abstract double calcularSeguro();
    public abstract double calcularImpuesto();

    //METODO NORMAL
    public double costoTotal() {
        return calcularPeaje()+calcularSeguro()+calcularImpuesto();
    }

    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#