/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaPago;

import javax.swing.JOptionPane;

/**
 *
 * @author j3s
 */
public class consultaPagoForm extends javax.swing.JFrame {

     public static String mensajeConsultarPago = "";
    public static String mensajeConsultarPago1 = "";
    public static String mensajeConsultarPago2 = "";
    public static String mensajeConsultarPago3 = "";
    /**
     * Creates new form consultaPagoForm
     */
    public consultaPagoForm() {
        initComponents();
        jCheckBox1.setEnabled(false);
    jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigoCita = new javax.swing.JTextField();
        txtCodigoFactura = new javax.swing.JTextField();
        txtCodigoPaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtCodigoCita.setBackground(new java.awt.Color(254, 254, 254));
        txtCodigoCita.setEnabled(false);
        txtCodigoCita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoCitaFocusLost(evt);
            }
        });

        txtCodigoFactura.setBackground(new java.awt.Color(254, 254, 254));
        txtCodigoFactura.setEnabled(false);
        txtCodigoFactura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFacturaFocusLost(evt);
            }
        });

        txtCodigoPaciente.setBackground(new java.awt.Color(254, 254, 254));
        txtCodigoPaciente.setEnabled(false);
        txtCodigoPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoPacienteFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 0, 24)); // NOI18N
        jLabel1.setText("Consulta de pagos");

        jRadioButton2.setText("Por código de cita");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jRadioButton3.setText("Por código de la factura");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jLabel3.setText("Código de la cita:");

        jLabel4.setText("Código de la factura:");

        jLabel2.setText("Código del paciente:");

        jRadioButton1.setText("Por código del paciente");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(75, 75, 253));
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aquí se deberían de mostrar los resultados");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Activar Eliminar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCodigoFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigoCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(btnConsultar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("eliminar_boton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoCitaFocusLost
        String codigoCita = txtCodigoCita.getText();
        mensajeConsultarPago2 = "";
        if (codigoCita.equals(""))
        mensajeConsultarPago2 += "El campo código de la cita no puede estar vacío\n";
        if (!esNumero(codigoCita))
        mensajeConsultarPago2 += "El campo código de la cita no puede contener espacios en blanco ni caracteres alfabéticos\n";
    }//GEN-LAST:event_txtCodigoCitaFocusLost

    private void txtCodigoFacturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFacturaFocusLost
        String codigoFactura = txtCodigoFactura.getText();
        mensajeConsultarPago3 = "";
        if (codigoFactura.equals(""))
        mensajeConsultarPago3 += "El campo código de la factura no puede estar vacío\n";
        if (!esNumero(codigoFactura))
        mensajeConsultarPago3 += "El campo código de la factura no puede contener espacios en blanco ni caracteres alfabéticos\n";
    }//GEN-LAST:event_txtCodigoFacturaFocusLost

    private void txtCodigoPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoPacienteFocusLost
        String codigoPac = txtCodigoPaciente.getText();
        mensajeConsultarPago1 = "";
        if (codigoPac.equals(""))
        mensajeConsultarPago1 += "El campo código del paciente no puede estar vacío\n";
        if (!esNumero(codigoPac))
        mensajeConsultarPago1 += "El campo código del paciente no puede contener espacios en blanco ni caracteres alfabéticos\n";
    }//GEN-LAST:event_txtCodigoPacienteFocusLost

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if(jRadioButton2.isSelected())
        txtCodigoCita.setEnabled(true);
        else{
            txtCodigoCita.setEnabled(false);
        
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if(jRadioButton3.isSelected())
        txtCodigoFactura.setEnabled(true);
        else{
            txtCodigoFactura.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if(jRadioButton1.isSelected())
        txtCodigoPaciente.setEnabled(true);
        else{
            txtCodigoPaciente.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String codigoPac = txtCodigoPaciente.getText();
        String codigoFac = txtCodigoFactura.getText();
        String codigoCita = txtCodigoCita.getText();

        mensajeConsultarPago = "";
        mensajeConsultarPago = mensajeConsultarPago1 + mensajeConsultarPago2 + mensajeConsultarPago3;
       // mensajeConsultarPago = "xDDD";
        if (!mensajeConsultarPago.equals(""))    
        {
            jCheckBox1.setEnabled(true);
        }
        if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()){
            if(jRadioButton1.isSelected() && mensajeConsultarPago1.equals(""))
            if (codigoPac.equals("")){
                mensajeConsultarPago += "El campo código del paciente no puede estar vacío\n";
                txtCodigoPaciente.setBackground(java.awt.Color.PINK);
            }else{
                if(!mensajeConsultarPago1.equals(""))
                txtCodigoPaciente.setBackground(java.awt.Color.PINK);
                else
                txtCodigoPaciente.setBackground(java.awt.Color.WHITE);
            }
            else if(!mensajeConsultarPago1.equals(""))
            txtCodigoPaciente.setBackground(java.awt.Color.PINK);
            else
            txtCodigoPaciente.setBackground(java.awt.Color.WHITE);

            if(jRadioButton2.isSelected() && mensajeConsultarPago2.equals(""))
            if (codigoCita.equals("")){
                mensajeConsultarPago += "El campo código de la cita no puede estar vacío\n";
                txtCodigoCita.setBackground(java.awt.Color.PINK);
            }else{
                if(!mensajeConsultarPago2.equals(""))
                txtCodigoCita.setBackground(java.awt.Color.PINK);
                else
                txtCodigoCita.setBackground(java.awt.Color.WHITE);
            }
            else if(!mensajeConsultarPago2.equals(""))
            txtCodigoCita.setBackground(java.awt.Color.PINK);
            else
            txtCodigoCita.setBackground(java.awt.Color.WHITE);

            if(jRadioButton3.isSelected() && mensajeConsultarPago3.equals(""))
            if (codigoFac.equals("")){
                mensajeConsultarPago += "El campo código de la factura no puede estar vacío\n";
                txtCodigoFactura.setBackground(java.awt.Color.PINK);
            }else{
                if(!mensajeConsultarPago3.equals(""))
                txtCodigoFactura.setBackground(java.awt.Color.PINK);
                else
                txtCodigoFactura.setBackground(java.awt.Color.WHITE);
            }
            else if(!mensajeConsultarPago3.equals(""))
            txtCodigoFactura.setBackground(java.awt.Color.PINK);
            else
            txtCodigoFactura.setBackground(java.awt.Color.WHITE);

            if(mensajeConsultarPago.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Buscando....", "Mensaje", 1);
            else
            JOptionPane.showMessageDialog(rootPane, mensajeConsultarPago, "Advertencia", 2);

        }else{
            JOptionPane.showMessageDialog(rootPane, "No se ha escogido ningún campo para realizar la consulta", "Advertencia", 2);
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        jButton1.setEnabled(true);
        else if(!jCheckBox1.isSelected())
              jButton1.setEnabled(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(consultaPagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaPagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaPagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaPagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaPagoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCodigoCita;
    private javax.swing.JTextField txtCodigoFactura;
    private javax.swing.JTextField txtCodigoPaciente;
    // End of variables declaration//GEN-END:variables

    public boolean esNumero(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean contieneDigito(String str) {

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) || str.equals("")) {
                return true;
            }
        }
        return false;
    }

}