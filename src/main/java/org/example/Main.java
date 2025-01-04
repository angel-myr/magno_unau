package org.example;

import data.Conexion;
import data.ContenidoDAO;

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
    }
}