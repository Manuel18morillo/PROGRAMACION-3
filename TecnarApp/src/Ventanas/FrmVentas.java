/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class FrmVentas extends javax.swing.JFrame {

    private DefaultTableModel  dtm;
    private Object[] Cliente = new Object[5];
    private int filaSeleccionada;
    
    public FrmVentas() {
        initComponents();
        dtm = (DefaultTableModel) jTable.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion de ventas");

        jLabel1.setText("CLIENTE");

        jLabel2.setText("PRODUCTO");

        jLabel3.setText("PRECIO");

        jLabel5.setText("FECHA COMPRA");

        jLabel6.setText("CANTIDAD");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("IVA 19%");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Producto", "Precio", "Fecha Compra", "Cantidad", "IVA", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(txtPrecio)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(82, 82, 82)
                                        .addComponent(txtFCompra))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCargar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtFCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCargar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String cliente = txtCliente.getText();
        String producto = txtProducto.getText();
        String precioStr = txtPrecio.getText();
        String fechaCompra = txtFCompra.getText();
        String cantidadStr = txtCantidad.getText();
        
         if (cliente.isEmpty() || producto.isEmpty() || precioStr.isEmpty() ||
            fechaCompra.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Datos imcompletos, Por favor completarlos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precio = Double.parseDouble(precioStr);
        int cantidad = Integer.parseInt(cantidadStr);

        // Calcular el IVA y el Total
        double subtotal = precio * cantidad;
        double iva = subtotal * 0.19; 
        double total = subtotal + iva;  

        Object[] fila = new Object[7];
        fila[0] = cliente;
        fila[1] = producto;
        fila[2] = String.format("%.2f", precio);
        fila[3] = fechaCompra;
        fila[4] = cantidad;
        fila[5] = String.format("%.2f", iva);
        fila[6] = String.format("%.2f", total);
        dtm.addRow(fila);

        txtCliente.setText("");
        txtProducto.setText("");
        txtPrecio.setText("");
        txtFCompra.setText("");
        txtCantidad.setText("");
        txtCliente.requestFocus();

        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCargar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if(jTable.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "No ha selecccionado registro en la tabla", "Error al modificar el registro", JOptionPane.WARNING_MESSAGE);
        }else{
            filaSeleccionada = jTable.getSelectedRow();
            txtCliente.setText(dtm.getValueAt(jTable.getSelectedRow(),0).toString());
            txtProducto.setText(dtm.getValueAt(jTable.getSelectedRow(),1).toString());
            txtPrecio.setText(dtm.getValueAt(jTable.getSelectedRow(),2).toString());
            txtFCompra.setText(dtm.getValueAt(jTable.getSelectedRow(),3).toString());
            txtCantidad.setText(dtm.getValueAt(jTable.getSelectedRow(),4).toString());
            txtCliente.requestFocus();
            
            btnGuardar.setEnabled(false);
            btnCargar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = jTable.getSelectedRow();

    if (filaSeleccionada == -1) {
    JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

    String cliente = txtCliente.getText().trim();
    String producto = txtProducto.getText().trim();
    String precioStr = txtPrecio.getText().trim();
    String fechaCompra = txtFCompra.getText().trim();
    String cantidadStr = txtCantidad.getText().trim();

    if (cliente.isEmpty() || producto.isEmpty() || precioStr.isEmpty() ||
    fechaCompra.isEmpty() || cantidadStr.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
}

    try {
        double precio = Double.parseDouble(precioStr);
        int cantidad = Integer.parseInt(cantidadStr);
        
        double total = precio * cantidad * 1.19; 
    
        double iva = total - (precio * cantidad);

    dtm.setValueAt(cliente, filaSeleccionada, 0);
    dtm.setValueAt(producto, filaSeleccionada, 1);
    dtm.setValueAt(String.format("%.2f", precio), filaSeleccionada, 2);
    dtm.setValueAt(fechaCompra, filaSeleccionada, 3);
    dtm.setValueAt(cantidad, filaSeleccionada, 4);
    dtm.setValueAt(String.format("%.2f", iva), filaSeleccionada, 5);  
    dtm.setValueAt(String.format("%.2f", total), filaSeleccionada, 6); 

    txtCliente.setText("");
    txtProducto.setText("");
    txtPrecio.setText("");
    txtFCompra.setText("");
    txtCantidad.setText("");
    txtCliente.requestFocus();

    btnGuardar.setEnabled(true);
    btnCargar.setEnabled(true);
    btnEliminar.setEnabled(true);
    btnModificar.setEnabled(false);

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(jTable.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun registro en la tabla", "ERRROR ELIMINAR REGISTRO", JOptionPane.ERROR_MESSAGE);
        }else{
        JOptionPane.showConfirmDialog(null, "Desea eliminar este registro?", "CONFIRMACION DE ELIMINACION", JOptionPane.YES_NO_OPTION);
        dtm.removeRow(jTable.getSelectedRow());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFCompra;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
