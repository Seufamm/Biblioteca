
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaLibro extends Conexion {
    
    public boolean registrar(Libro li) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO Paciente (codigo, titulo, autor, disponibilidad, cantidadEjemplares, estanteriaId) VALUES(?, ?, ?, ?, ?, ?)";
            
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, li.getCodigo());
                ps.setString(2, li.getTitulo());
                ps.setString(3, li.getAutor());
                ps.setString(4, li.getDisponibilidad());
                ps.setInt(5, li.getCantidadEjemplares());
                ps.setInt(6, li.getEstanteriaId());
                ps.execute();
                return true;
            } catch (SQLException e){
                System.err.println(e);
                return false;
            } finally {
                try {
                    con.close();
                }catch (SQLException e){
                    System.err.println(e);
                }
            }
    }
}
    
