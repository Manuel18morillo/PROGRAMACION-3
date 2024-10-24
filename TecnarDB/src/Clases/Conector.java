/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.*;

/**
 *
 * @author Ing. Narvaez Mejia
 */
public class Conector {
    
    String host ="jdbc:mysql://localhost/";
    String user ="root";
    String pass ="12345";
    String database="ManuelBd";
    Connection conexion;
    
    public void Conectar() throws SQLException{
    
        if (this.conexion == null || this.conexion.isClosed()) {
        try {
           
           this.conexion = DriverManager.getConnection(this.host+this.database, this.user, this.pass);
            
            System.out.println("Conexion exitosa");
            
           
        } catch (SQLException ex) {
            System.out.println("Error en la conexion" + ex.getMessage());
 
        }
       }
        
    }
    
    public void Desconectar() throws SQLException{
         try {
            if (this.conexion != null && !this.conexion.isClosed()) {
                this.conexion.close();
                System.out.println("Desconexion exitosa de la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al desconectar de la base de datos: " + e.getMessage());
        }
    }
    
    // Método para ejecutar un SELECT con parámetros
    public ResultSet executeSelect(String query, Object... parameters) throws SQLException {
        PreparedStatement statement = prepareStatement(query, parameters);
        return statement.executeQuery();
    }

    // Método para ejecutar INSERT, UPDATE o DELETE
    public int executeUpdate(String query, Object... parameters) throws SQLException {
        PreparedStatement statement = prepareStatement(query, parameters);
        return statement.executeUpdate();
    }

    // Método privado para preparar la consulta
    private PreparedStatement prepareStatement(String query, Object... parameters) throws SQLException {
        PreparedStatement statement = this.conexion.prepareStatement(query);
        for (int i = 0; i < parameters.length; i++) {
            statement.setObject(i + 1, parameters[i]);
        }
        return statement;
    }
    
    

    
}
