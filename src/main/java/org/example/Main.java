package org.example;

import data.Conexion;
import data.ContenidoDAO;
import vista.Inicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        var prueba = new Conexion();
        var bd = prueba.conectar();
        var data = new ContenidoDAO(bd);
        var result = data.cargarTodo();
        for(var element : result) {
            System.out.println(element.getTitulo());
        }
        System.out.println(result);
        prueba.desconectar();
        System.out.println("Hola LeonDeidad");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("------> magno_unou <------");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            var inicio = new Inicio();
            frame.setContentPane(inicio.getPanel1());

            frame.pack();
            frame.setSize(720, 480);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });
    }
}