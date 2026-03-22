package Semana11.Ejercicio.Fase03;

import javax.swing.*;
import java.util.ArrayList;

public class GestionEstudiantes extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnEditar;

    private JList<Estudiante> listaVisual;
    private DefaultListModel<Estudiante> modelo;

    private ArrayList<Estudiante> lista;

    public GestionEstudiantes(){

        setTitle("Gestion Estudiantes");
        setSize(400,420);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lista = new ArrayList<>();
        modelo = new DefaultListModel<>();

        txtNombre = new JTextField();
        txtNombre.setBounds(40,30,130,25);
        add(txtNombre);

        txtEdad = new JTextField();
        txtEdad.setBounds(200,30,130,25);
        add(txtEdad);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(40,70,90,30);
        add(btnAgregar);

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(145,70,90,30);
        add(btnEditar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(250,70,90,30);
        add(btnEliminar);

        listaVisual = new JList<>(modelo);
        JScrollPane sp = new JScrollPane(listaVisual);
        sp.setBounds(40,120,300,220);
        add(sp);

        //EVENTOS
        btnAgregar.addActionListener(e -> agregar());
        btnEliminar.addActionListener(e -> eliminar());
        btnEditar.addActionListener(e -> editar());

        listaVisual.addListSelectionListener(e -> cargarCampos());
    }

    private void agregar(){

        try{

            String nom = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());

            Estudiante est = new Estudiante(nom,edad);

            lista.add(est);
            modelo.addElement(est);

            txtNombre.setText("");
            txtEdad.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Ingrese edad válida");
        }
    }

    private void eliminar(){

        int pos = listaVisual.getSelectedIndex();

        if(pos != -1){
            lista.remove(pos);
            modelo.remove(pos);
        }else{
            JOptionPane.showMessageDialog(this,
                    "Seleccione estudiante");
        }
    }

    private void editar(){

        try{

            int pos = listaVisual.getSelectedIndex();

            if(pos != -1){

                String nom = txtNombre.getText();
                int edad = Integer.parseInt(txtEdad.getText());

                Estudiante est = lista.get(pos);

                est.setNombre(nom);
                est.setEdad(edad);

                modelo.set(pos, est);

            }else{
                JOptionPane.showMessageDialog(this,
                        "Seleccione estudiante");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Datos incorrectos");
        }
    }

    private void cargarCampos(){

        int pos = listaVisual.getSelectedIndex();

        if(pos != -1){

            Estudiante est = lista.get(pos);

            txtNombre.setText(est.getNombre());
            txtEdad.setText(String.valueOf(est.getEdad()));
        }
    }

    public static void main(String[] args) {
        new GestionEstudiantes().setVisible(true);
    }
}