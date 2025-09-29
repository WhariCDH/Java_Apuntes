package Clase03;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class graficos19 {

    public static void main(String[] args) {
        //El programa crea una ventana con etiqueta y boton que cambie el texto
        JFrame frame=new JFrame("Etiqueta Interactiva"); //Creamos una ventana
        JLabel etiqueta=new JLabel("Hola");                  //Creamos una etiqueta
        JButton button=new JButton("Cambiar texto");      //Creamos un botón
        //Le daremos vida al botón, para esto necesitamos agregar un evento al botón
        button.addActionListener(e ->etiqueta.setText("Texto cambiado"));
        //Modificaremos propiedades del objeto frame
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(etiqueta);   //Agrega etiqueta a la ventana
        frame.add(button);     //Agrega el botón a la ventana
        frame.setSize(300,150);  //Establece el tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Se programa el evento para cerrar
        //La ventana
        frame.setVisible(true); //Se hace visible la ventana

    }
    
}
