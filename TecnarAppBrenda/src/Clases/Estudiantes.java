/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ing. Narvaez Mejia
 */
public class Estudiantes {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String clave;
    private Map<String,String> Est = new HashMap();
    
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

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the Est
     */
    public Map<String,String> getEst() {
        return Est;
    }

    /**
     * @param Est the Est to set
     */
    public void setEst(Map<String,String> Est) {
        this.Est = Est;
    }
    
    
}
