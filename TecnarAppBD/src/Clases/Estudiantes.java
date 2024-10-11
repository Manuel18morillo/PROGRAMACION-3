/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Narvaez Mejia
 */
public class Estudiantes {

    
    public boolean ValidarDatos(String pCedula, String pClave){
       
        boolean logueado = false;
        
        // Información de la base de datos
        String url = "jdbc:mysql://localhost:3307/bdparcial"; // Cambia a tu URL de base de datos
        String usuarioBD = "root"; // Tu usuario de la base de datos
        String claveBD = ""; // Tu contraseña de la base de datos
        
        // Conexión a la base de datos
        try (Connection conexion = DriverManager.getConnection(url, usuarioBD, claveBD)) {
            
            // Consulta SQL para verificar las credenciales
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND Clave = ?";
            
            // Preparar la declaración SQL
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, pCedula); // Asignar el valor de la cédula
            statement.setString(2, pClave); // Asignar el valor de la clave
            
            // Ejecutar la consulta
            ResultSet resultado = statement.executeQuery();
            
            // Verificar si hay un resultado (es decir, si las credenciales son correctas)
            if (resultado.next()) {
                logueado = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace(); // Mostrar error si ocurre algún problema con la base de datos
        }
        
        return logueado; // Devolver si se ha iniciado sesión correctamente o no
       
    }
    public void registrar(String nombre,int cantidad, double precio){
    
     Conexion conexion = new Conexion();
        Connection conn = null;

        // Consulta SQL para insertar un nuevo producto
        String sql = "INSERT INTO productos (nombre, cantidad, precio) VALUES (?, ?, ?)";

        try {
            // Obtener la conexión de la clase Conexion
            conn = conexion.conectar();

            if (conn != null) {
                // Preparar la consulta con PreparedStatement
                PreparedStatement stmt = conn.prepareStatement(sql);

                // Asignar valores a los parámetros de la consulta
                stmt.setString(1, nombre);
                stmt.setInt(2, cantidad);
                stmt.setDouble(3, precio);

                // Ejecutar la sentencia SQL
                int filasInsertadas = stmt.executeUpdate();

                // Comprobar si se insertó correctamente
                if (filasInsertadas > 0) {
                    System.out.println("Producto registrado correctamente.");
                }

                // Cerrar el PreparedStatement
                stmt.close();
            }

        } catch (SQLException e) {
            // Manejo de errores SQL
            System.out.println("Error al registrar el producto: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();  // Asegurarse de cerrar la conexión después de usarla
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
   public void registrarUsuario(String usuario, String apellido, String direccion, String telefono, String clave) {
        // Crear una instancia de la clase Conexion para obtener la conexión
        Conexion conexion = new Conexion();
        Connection conn = null;

        // Consulta SQL para insertar un nuevo usuario
        String sql = "INSERT INTO usuarios (usuario, apellido, direccion, telefono, clave) VALUES (?, ?, ?, ?, ?)";

        try {
            conn = conexion.conectar();

            if (conn != null) {
                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, usuario);
                stmt.setString(2, apellido);
                stmt.setString(3, direccion);
                stmt.setString(4, telefono);
                stmt.setString(5, clave);

                int filasInsertadas = stmt.executeUpdate();

                if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                }

                stmt.close();
            }

        } catch (SQLException e) {
            System.out.println("Error al registrar el usuario: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();  
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
