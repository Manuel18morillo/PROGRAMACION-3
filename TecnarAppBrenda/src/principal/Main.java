/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import Clases.conexion;
import Ventanas.FrmLogin;

/**
 *
 * @author Ing. Narvaez Mejia
 */
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //JfrmDatos app = new FrmAdminClientes();
       conexion c = new conexion();
       c.conectar();
       
       FrmLogin n = new FrmLogin();
       n.setVisible(true);
    }
    
}
