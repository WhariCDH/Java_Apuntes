package Clase03;
import javax.swing.JButton; //Crea botón
import javax.swing.JFrame; //Crea ventana 
import javax.swing.JLabel; //Crea etiqueta
import javax.swing.JTextField; //Creamos caja de texto

public class graficos20 {
    public static void main(String[] args) {
        //El programa crea una suma basica 
        JFrame ventana=new JFrame("Sumadora");
        JTextField num1=new JTextField(5); 
        JTextField num2=new JTextField(5);
        JButton sumar=new JButton("Sumar");
        JLabel resultado=new JLabel("Resultado");

        sumar.addActionListener(e ->{
            //en la variable a, guardamos ya convertido a entero lo que tomamos del objeto num1
            int a=Integer.parseInt(num1.getText());
            //en la variable b, guardamos ya convertido a entero lo que tomamos del objeto num2
            int b=Integer.parseInt(num2.getText());
            //se realiza y se muestra la suma 
            resultado.setText("Resultado: "+(a+b));
        });

        //establecemos parámetros para la ventana 
        ventana.setLayout(new java.awt.FlowLayout()); //la usamos en modo awt
        ventana.add(new JLabel("Numero 1: "));
        ventana.add(num1);
        ventana.add(new JLabel("Numero 2: "));
        ventana.add(num2);
        ventana.add(sumar);
        ventana.add(resultado);
        ventana.setSize(350,150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true); 
    }
    
}
