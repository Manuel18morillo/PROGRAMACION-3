/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection cn;

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/bdparcial","root","");
            System.out.println("CONECTADO"); 
        } catch (Exception e) {
             System.out.println("ERROR DE CONEXION BD"+e);
        }
        return cn;
    }
    
}
