package Semana09;

public class Venta<T extends Espectaculo> {  //"<T extends Espectaculo>" Solo acepta objetos que hereden de Espectaculo

    private T ticket;

    public Venta(T ticket) {
        this.ticket = ticket;
    }

    public void mostrarVenta(){

        System.out.println("Precio final ticket: " + ticket.calcularPrecioFinal());
    }

    public double obtenerTotal(){
        return ticket.calcularPrecioFinal();
    }
}