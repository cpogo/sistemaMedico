/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productoMedico;

import ConexionProducto.RegistroProductoConexion;
import ConexionProveedor.RegistroProveedorConexion;
import conexiondb.conexiondb;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;


public class ProveedorForm extends javax.swing.JFrame {

    public ProveedorForm() {
        initComponents();
        Connection c = conexiondb.getDBConnection();
        int numCodigo = RegistroProveedorConexion.getMaxId_Proveedor(c)+1;
        lblcodigoprov.setText(String.valueOf(numCodigo));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprovenom = new javax.swing.JTextField();
        txtproveape = new javax.swing.JTextField();
        txtprovetel = new javax.swing.JTextField();
        btnRegistarPro = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblcodigoprov = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedor");

        jLabel1.setText("Código Proveedor");

        jLabel2.setText("Nombre:");

        jLabel5.setText("Teléfono:");

        txtprovenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprovenomKeyTyped(evt);
            }
        });

        txtproveape.setEnabled(false);
        txtproveape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtproveapeKeyTyped(evt);
            }
        });

        txtprovetel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprovetelKeyTyped(evt);
            }
        });

        btnRegistarPro.setText("Registar");
        btnRegistarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarProActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Apellido:");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        lblcodigoprov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnRegistarPro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(60, 60, 60))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtprovenom, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(txtproveape)
                            .addComponent(txtprovetel)
                            .addComponent(lblcodigoprov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodigoprov, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtprovenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproveape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtprovetel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnRegistarPro)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprovenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprovenomKeyTyped
       char c=evt.getKeyChar();
            if(Character.isDigit(c)) {
              getToolkit().beep();
              evt.consume();
                                     
          }        // TODO add your 
    }//GEN-LAST:event_txtprovenomKeyTyped

    private void txtprovetelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprovetelKeyTyped
        char c=evt.getKeyChar();
            if(Character.isLetter(c)) {
              getToolkit().beep();
              evt.consume();
                                     
          }        // TODO add your 
    }//GEN-LAST:event_txtprovetelKeyTyped

    private void txtproveapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproveapeKeyTyped
        char c=evt.getKeyChar();
            if(Character.isDigit(c)) {
              getToolkit().beep();
              evt.consume();
                                     
          }        // TODO add your 
    }//GEN-LAST:event_txtproveapeKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected())
        txtproveape.setEnabled(true);
        else
         txtproveape.setEnabled(false);   
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void btnRegistarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarProActionPerformed
    
       
        
        String nombrep,apellidop="",telefonop;
        nombrep=txtprovenom.getText();
        apellidop=txtproveape.getText();
        telefonop=txtprovetel.getText();
        
        if (txtprovenom.getText().equals(""))
        {JOptionPane.showMessageDialog(rootPane, "Debe al menos llenar el campo Nombre!", "Mensaje", 1);
            txtprovenom.setBackground(java.awt.Color.PINK);
        }
        else 
        {
        Connection c = conexiondb.getDBConnection();
            
        RegistroProveedorConexion.registrarProveedor(c,nombrep,apellidop,telefonop); 
        JOptionPane.showMessageDialog(rootPane, "Registro exitoso", "Mensaje", 1);
        btnRegistarPro.setEnabled(false);
        }
    }//GEN-LAST:event_btnRegistarProActionPerformed

  
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
            java.util.logging.Logger.getLogger(ProveedorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveedorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistarPro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblcodigoprov;
    private javax.swing.JTextField txtproveape;
    private javax.swing.JTextField txtprovenom;
    private javax.swing.JTextField txtprovetel;
    // End of variables declaration//GEN-END:variables
}
