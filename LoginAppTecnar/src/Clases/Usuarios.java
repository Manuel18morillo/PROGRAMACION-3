/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.HashMap;
import java.util.Map;
public class Usuarios {
    private String nombre;
    private String email;
    private String username;
    private String clave;

    private Map<String,String> User = new HashMap();
    public Usuarios(){
        
    User.put("nombre","Manuel");
    User.put("email","Manuel@gmail.com");
    User.put("username","ManuMB");
    User.put("clave","12345"); 
    
}
    public boolean ValidarUsuario(String pUsername, String pClave){
        boolean logueado = false;
        if(getUser().get("username").equals(pUsername) && getUser().get("clave").equals(pClave)){
        logueado = true;
        
        return logueado;
    }
    return logueado;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return the User
     */
    public Map<String,String> getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(Map<String,String> User) {
        this.User = User;
    }
    
    
    
    
}