package data;

import logica.Contenido;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContenidoDAO {
    private final Connection conn;

    public ContenidoDAO(Connection conn) {
        this.conn = conn;
    }

    public List<Contenido> cargarTodo() {
        List<Contenido> contenidos = new ArrayList<>();
        String query = "SELECT * FROM Contenido";
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                Contenido nuevoContenido = new Contenido();
                nuevoContenido.setId_contenido(rs.getInt("id_contenido"));
                nuevoContenido.setTitulo(rs.getString("titulo"));
                nuevoContenido.setTipo(rs.getString("tipo"));
                nuevoContenido.setGenero(rs.getString("genero"));
                nuevoContenido.setAnio(rs.getInt("año"));
                nuevoContenido.setEstado(rs.getBoolean("estado"));
                nuevoContenido.setPuntaje(rs.getFloat("puntaje"));
                contenidos.add(nuevoContenido);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return contenidos;
    }

}
