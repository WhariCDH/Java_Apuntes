error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoTrasferencia.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoTrasferencia.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 46
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana08Practica/Practica03/PagoTrasferencia.java
text:
```scala
package Semana08Practica.Practica03;

public@@ class PagoTrasferencia extends Pago {

    private String cuentaDestino;

    public PagoTrasferencia(String codigoPago, double monto, String cuentaDestino) {
        super(codigoPago, monto);
        this.cuentaDestino=cuentaDestino;
    }

    //GETTERS Y  SETTERS DE LOS ATRIBUTOS ADICIONALES
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    //LLAMANDO A LOS METODOS ABSTRACTOS
    @Override
    public double calcularComision() {
        return comisionTransferencia;
    }

    @Override
    public double calcularImpuesto() {
        return impuestoGeneral;
    }
    
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 