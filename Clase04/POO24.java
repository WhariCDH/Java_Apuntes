package Clase04;
//para crear cajas de mensajes en modo gráfico
import javax.swing.JOptionPane;

public class POO24 {

    public static void main(String[] args) {

        double base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del Rectángulo: "));

        double altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del Rectángulo: "));

        //crearemos un objeto de clase Rectángulo
        Rectangulo rect=new Rectangulo(base, altura);

        //invocamos a la función calcularArea del objeto rectángulo,
        //guardando lo que nos devuelve
        double area=rect.calcularArea();

        //mostramos la información al usuario
        JOptionPane.showMessageDialog(null,"El área del rectángulo es: "+area);
    }
}
