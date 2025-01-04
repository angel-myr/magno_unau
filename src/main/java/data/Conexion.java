package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final String url = "jdbc:mysql://localhost:3306/magno_unau?useSSL=false&serverTimezone=UTC";
    private final String username = "root";
    private final String password = "root";
    private Connection conn = null;

    public Connection conectar() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void desconectar() {
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexión cerrada!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
