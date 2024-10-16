/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Estudiantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class FrmVentas extends javax.swing.JFrame {

    private DefaultTableModel  dtm;
    private Object[] Producto = new Object[5];
    private int filaSeleccionada;
    
    public FrmVentas() {
        initComponents();
        dtm = (DefaultTableModel) jTable1.getModel();
        cargarProductos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btncargar = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion de ventas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "producto", "precio", "cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Producto");

        btnregistrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Precio");

        btncargar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btncargar.setText("Cargar");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnregistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btncargar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar))
                .addGap(173, 173, 173))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String producto = txtproducto.getText();
        String precioStr = txtprecio.getText();
        String cantidadStr = txtcantidad.getText();


    int cantidad = Integer.parseInt(cantidadStr);

    double precio = Double.parseDouble(precioStr);

    Estudiantes e=new Estudiantes();
    
    e.registrar(producto, cantidad, precio);
    
    
    
        txtproducto.setText("");
        txtprecio.setText("");
        txtcantidad.setText("");
        txtproducto.requestFocus();

        btnregistrar.setEnabled(true);
        btneliminar.setEnabled(true);
        btncargar.setEnabled(true);
        
        cargarProductos();
        
    }//GEN-LAST:event_btnregistrarActionPerformed
private void cargarProductos() {
        String url = "jdbc:mysql://localhost:3307/bdparcial"; 
        String usuario = "root";
        String contraseña = "";
        
        String sql = "SELECT idproducto, nombre, cantidad, precio FROM productos";

        dtm.setRowCount(0);

        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Object[] usuarioFila = new Object[4];
                usuarioFila[0] = rs.getString("idproducto");                
                usuarioFila[1] = rs.getString("nombre");
                usuarioFila[2] = rs.getString("precio");
                usuarioFila[3] = rs.getString("cantidad");

                dtm.addRow(usuarioFila);
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los productos: " + e.getMessage());
        }
    }
    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        if(jTable1.getSelectedRow() == -1){
        JOptionPane.showMessageDialog(null, "Registro no seleccionado", "Error al modificar el registro", JOptionPane.WARNING_MESSAGE);
    } else {
        filaSeleccionada = jTable1.getSelectedRow();
        
        txtproducto.setText(dtm.getValueAt(filaSeleccionada, 1).toString()); 
        txtprecio.setText(dtm.getValueAt(filaSeleccionada, 3).toString());    
        txtcantidad.setText(dtm.getValueAt(filaSeleccionada, 2).toString());  
        txtproducto.requestFocus();

        btnregistrar.setEnabled(false);
        btncargar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(true);
    }
    }//GEN-LAST:event_btncargarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla", "ERROR AL MODIFICAR", JOptionPane.ERROR_MESSAGE);
    } else {
        String nuevoProducto = txtproducto.getText().trim();
        String nuevaCantidad = txtcantidad.getText().trim();
        String nuevoPrecio = txtprecio.getText().trim();

        
        if (nuevoProducto.isEmpty() || nuevaCantidad.isEmpty() || nuevoPrecio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String idUsuario = jTable1.getValueAt(filaSeleccionada, 0).toString(); 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdparcial", "root", "");
            
            String sql = "UPDATE productos SET nombre = ?, cantidad = ?, precio = ? WHERE idproducto = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nuevoProducto);
            ps.setString(2, nuevoPrecio);
            ps.setString(3, nuevaCantidad);
            ps.setString(4, idUsuario);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setValueAt(nuevoProducto, filaSeleccionada, 1); 
                dtm.setValueAt(nuevaCantidad, filaSeleccionada, 2); 
                dtm.setValueAt(nuevoPrecio, filaSeleccionada, 3);  
                
                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            ps.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        txtproducto.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtproducto.requestFocus();
        
        btnregistrar.setEnabled(true);
        btncargar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnmodificar.setEnabled(false);
    }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if(jTable1.getSelectedRow() == -1){
        JOptionPane.showMessageDialog(null, "Ningún registro seleccionado", "ERROR ELIMINAR REGISTRO", JOptionPane.ERROR_MESSAGE);
    } else {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar este registro?", "CONFIRMACIÓN DE ELIMINACIÓN", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION) {
            int selectedRow = jTable1.getSelectedRow();
            String idProducto = jTable1.getValueAt(selectedRow, 0).toString();

            eliminarRegistroDeBD(idProducto);

            dtm.removeRow(selectedRow);
        }
    }
} 

private void eliminarRegistroDeBD(String idProducto) {
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        String url = "jdbc:mysql://localhost:3307/bdparcial";  
        String user = "root";  
        String password = ""; 
        con = DriverManager.getConnection(url, user, password);
        
        String sql = "DELETE FROM productos WHERE idproducto = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, idProducto);
        
        // Ejecutar la eliminación
        int rowsDeleted = ps.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "El registro ha sido eliminado exitosamente.");
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if(ps != null) ps.close();
            if(con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btneliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
