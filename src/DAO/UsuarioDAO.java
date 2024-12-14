package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author allan
 */
public class UsuarioDAO {
   
    Conexion conexion = new Conexion("proyectofinalpoo"); 

    public boolean verificarUsuario(String username, String password) {
        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        try (Connection con = conexion.getConexion(); 
             PreparedStatement stmt = con.prepareStatement(query)) { 

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); 
        }   catch (Exception e) {
            e.printStackTrace(); 
        }
        return false;
    }
}