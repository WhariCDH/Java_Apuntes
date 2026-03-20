error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoYape.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoYape.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 433
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoYape.java
text:
```scala
package Semana08Practica.Practica03;

public class PagoYape extends Pago {

    private int numeroCelular;

    public PagoYape(String codigoPago, double monto, int numeroCelular) {
        super(codigoPago, monto);
        this.numeroCelular=numeroCelular;
    }

    //GETTERS Y SETTERS DEL NUEVO ATRIBUTO
    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int@@ numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    //LLAMANDO A LOS METODOS ABSTRACTOS
    @Override
    public double calcularComision() {
        return comisionYape;
    }

    @Override
    public double calcularImpuesto() {
        return impuestoGeneral;
    }

    
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 