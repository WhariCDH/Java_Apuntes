package Clase03;
import javax.swing.JButton;    //Usaremos el objeto JButton
import javax.swing.JFrame;     //Usaremos el objeto JFrame
public class graficos18 {
    public static void main(String[] args) {
        //El programa crea una ventana básica con un botón
        //Creamos la ventana (guardar en la variable frame)
        JFrame frame=new JFrame("Ventana básica");
        //Creamos el botón(guardado en la variable botón)
        JButton button=new JButton("Haz clic");
        //Establecemos el tamaño de la ventana
        frame.setSize(300,200);
        //Estabelcemos la operación salir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Agregamos el boton a la ventana
        frame.add(button);
        //hacemos visible la ventana
        frame.setVisible(true);
        
    }
    
}
