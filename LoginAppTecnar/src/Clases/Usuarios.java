package clases;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Usuarios {
    // Mapa para almacenar los usuarios
    private static Map<String, Map<String, String>> user = new HashMap<>();

    public Usuarios() {
        Map<String, String> userDetails = new HashMap<>();
        userDetails.put("nombre", "Manuel");
        userDetails.put("email", "Manuel@gmail.com");
        userDetails.put("clave", "12345");
        user.put("ManuMB", userDetails);

        
        
    }

    public boolean ValidarUsuario(String pusername, String pclave) {
        Map<String, String> userDetails = user.get(pusername);
        boolean logueado;
        
        if (userDetails != null) {
            String storedClave = userDetails.get("clave");

            if (storedClave != null && storedClave.equals(pclave)) {
                return logueado = true;
            }
        
        }
        return logueado = false;
    }

    public void registrarusuario(String name, String username, String clave, String email) {
        if (user.containsKey(username)) {
            JOptionPane.showMessageDialog(null, "Este usuario ya existe");
        } else {
            Map<String, String> userDetails = new HashMap<>();
            userDetails.put("nombre", name);
            userDetails.put("email", email);
            userDetails.put("clave", clave);
            user.put(username, userDetails);
            JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
        }
        
    }

    public void mostrar() {
        for (Map.Entry<String, Map<String, String>> entry : user.entrySet()) {
            String username = entry.getKey();
            Map<String, String> details = entry.getValue();

            System.out.println("\nUsername: " + username);
            for (Map.Entry<String, String> detail : details.entrySet()) {
                System.out.println(detail.getKey() + ": " + detail.getValue());
            }
        }
    }

   
 
}
