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
public class Usuarios {
    String nombre;
    String apellido;
    String username;
    String clave;
    String tipo;
    
       // Método para verificar las credenciales del usuario
    public boolean verificarCredenciales(String pUsername, String pClave) {
        Conector db = new Conector();
        
        try {
            db.Conectar();
            String query = "SELECT * FROM usuarios WHERE username = ? AND clave = ?";
            ResultSet rs = db.executeSelect(query, pUsername, pClave);
            return rs.next();
            
        }catch (SQLException e) {
            System.err.println("Error al verificar las credenciales: " + e.getMessage());
            return false;
        }finally {
            try {
                db.Desconectar();
            } catch (SQLException e) {
                System.err.println("Error al verificar las credenciales: " + e.getMessage());
            }
        }
       
    }
}
