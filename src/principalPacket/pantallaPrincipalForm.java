/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalPacket;

import fichaMedica.registroFichaForm;
import fichaMedica.consultaFichaForm;
import Paciente.desbloquearPacienteForm;
import Paciente.registrarPacienteForm;
import Paciente.buscarPacienteForm;
import citaMedica.consultarCitaForm;
import citaMedica.modificarCitaForm;
import citaMedica.nuevaCitaForm;
import facturaPago.consultaPagoForm;
import facturaPago.generarFacturaForm;
import facturaPago.generarReceta;
import productoMedico.buscarProductoForm;
import productoMedico.registroProductoForm;

/**
 *
 * @author j3s
 */
public class pantallaPrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipalForm
     */
    public pantallaPrincipalForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaCita = new javax.swing.JButton();
        btnModificarCita = new javax.swing.JButton();
        btnConsultarCita = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();
        btnDesbloquearPaciente = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGenerarFactura = new javax.swing.JButton();
        btnGenerarReceta = new javax.swing.JButton();
        btnRegistrarPago = new javax.swing.JButton();
        btnConsultarPago = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrarFicha = new javax.swing.JButton();
        btnConsultarFicha = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrarProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(250, 250, 250));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Citas Médicas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnNuevaCita.setBackground(new java.awt.Color(75, 75, 253));
        btnNuevaCita.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnNuevaCita.setForeground(new java.awt.Color(254, 254, 254));
        btnNuevaCita.setText("Nueva Cita");
        btnNuevaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCitaActionPerformed(evt);
            }
        });

        btnModificarCita.setBackground(new java.awt.Color(75, 75, 253));
        btnModificarCita.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnModificarCita.setForeground(new java.awt.Color(254, 254, 254));
        btnModificarCita.setText("Modificar Cita");
        btnModificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCitaActionPerformed(evt);
            }
        });

        btnConsultarCita.setBackground(new java.awt.Color(75, 75, 253));
        btnConsultarCita.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnConsultarCita.setForeground(new java.awt.Color(254, 254, 254));
        btnConsultarCita.setText("Consultar Cita");
        btnConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevaCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConsultarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNuevaCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarCita))
        );

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnRegistrarPaciente.setBackground(new java.awt.Color(75, 75, 253));
        btnRegistrarPaciente.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnRegistrarPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacienteActionPerformed(evt);
            }
        });

        btnBuscarPaciente.setBackground(new java.awt.Color(75, 75, 253));
        btnBuscarPaciente.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscarPaciente.setText("Buscar Paciente");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        btnDesbloquearPaciente.setBackground(new java.awt.Color(75, 75, 253));
        btnDesbloquearPaciente.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnDesbloquearPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnDesbloquearPaciente.setText("Desbloquear Paciente");
        btnDesbloquearPaciente.setMargin(new java.awt.Insets(0, -50, 0, -50));
        btnDesbloquearPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloquearPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDesbloquearPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRegistrarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesbloquearPaciente))
        );

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Facturas, Recetas, Pagos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnGenerarFactura.setBackground(new java.awt.Color(75, 75, 253));
        btnGenerarFactura.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnGenerarFactura.setForeground(new java.awt.Color(254, 254, 254));
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });

        btnGenerarReceta.setBackground(new java.awt.Color(75, 75, 253));
        btnGenerarReceta.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnGenerarReceta.setForeground(new java.awt.Color(254, 254, 254));
        btnGenerarReceta.setText("Generar Receta");
        btnGenerarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRecetaActionPerformed(evt);
            }
        });

        btnRegistrarPago.setBackground(new java.awt.Color(75, 75, 253));
        btnRegistrarPago.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnRegistrarPago.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistrarPago.setText("Registrar Pago");
        btnRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagoActionPerformed(evt);
            }
        });

        btnConsultarPago.setBackground(new java.awt.Color(75, 75, 253));
        btnConsultarPago.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnConsultarPago.setForeground(new java.awt.Color(254, 254, 254));
        btnConsultarPago.setText("Consultar Pago");
        btnConsultarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGenerarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGenerarReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnConsultarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarFactura)
                    .addComponent(btnGenerarReceta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPago)
                    .addComponent(btnConsultarPago)))
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha Médica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnRegistrarFicha.setBackground(new java.awt.Color(75, 75, 253));
        btnRegistrarFicha.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnRegistrarFicha.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistrarFicha.setText("Registrar Ficha Médica");
        btnRegistrarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFichaActionPerformed(evt);
            }
        });

        btnConsultarFicha.setBackground(new java.awt.Color(75, 75, 253));
        btnConsultarFicha.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnConsultarFicha.setForeground(new java.awt.Color(254, 254, 254));
        btnConsultarFicha.setText("Consultar Ficha Médica");
        btnConsultarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnConsultarFicha)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnRegistrarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnRegistrarFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarFicha))
        );

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto Médico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnRegistrarProducto.setBackground(new java.awt.Color(75, 75, 253));
        btnRegistrarProducto.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistrarProducto.setText("Registar Producto Médico");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(75, 75, 253));
        btnBuscarProducto.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 13)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscarProducto.setText("Buscar Producto Médico");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnRegistrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarProducto))
        );

        jLabel1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Médico");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        buscarProductoForm buscarProductoForm = new buscarProductoForm();
        buscarProductoForm.setVisible(true );
        
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnDesbloquearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloquearPacienteActionPerformed
        // TODO add your handling code here:
        desbloquearPacienteForm desbloPacienteForm = new desbloquearPacienteForm();
        desbloPacienteForm.setVisible(true);
    }//GEN-LAST:event_btnDesbloquearPacienteActionPerformed

    private void btnNuevaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCitaActionPerformed
        // TODO add your handling code here:
        nuevaCitaForm nuevaCitaForm = new nuevaCitaForm();
        nuevaCitaForm.setVisible(true);
    }//GEN-LAST:event_btnNuevaCitaActionPerformed

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        registrarPacienteForm registrarPacienteForm = new registrarPacienteForm();
        registrarPacienteForm.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnModificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCitaActionPerformed
        modificarCitaForm modificarCitaForm = new modificarCitaForm();
        modificarCitaForm.setVisible(true);
    }//GEN-LAST:event_btnModificarCitaActionPerformed

    private void btnConsultarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCitaActionPerformed
        consultarCitaForm consultarCitaForm = new consultarCitaForm();
        consultarCitaForm.setVisible(true);
    }//GEN-LAST:event_btnConsultarCitaActionPerformed

    private void btnRegistrarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFichaActionPerformed
        registroFichaForm registroFichaForm = new registroFichaForm();
        registroFichaForm.setVisible(true);
    }//GEN-LAST:event_btnRegistrarFichaActionPerformed

    private void btnConsultarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFichaActionPerformed
        consultaFichaForm consultaFichaForm = new consultaFichaForm();
        consultaFichaForm.setVisible(true);
    }//GEN-LAST:event_btnConsultarFichaActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        buscarPacienteForm buscarPacienteForm = new buscarPacienteForm();
        buscarPacienteForm.setVisible(true);
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        registroProductoForm registroProductoForm = new registroProductoForm();
        registroProductoForm.setVisible(true);
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        generarFacturaForm generarFacturaForm = new generarFacturaForm();
        generarFacturaForm.setVisible(true);
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void btnRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagoActionPerformed
        registrarPacienteForm registrarPacienteForm = new registrarPacienteForm();
        registrarPacienteForm.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPagoActionPerformed

    private void btnGenerarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRecetaActionPerformed
        generarReceta generarRecetaForm = new generarReceta();
        generarRecetaForm.setVisible(true);
    }//GEN-LAST:event_btnGenerarRecetaActionPerformed

    private void btnConsultarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPagoActionPerformed
        consultaPagoForm consultaPagoForm = new consultaPagoForm();
        consultaPagoForm.setVisible(true);
    }//GEN-LAST:event_btnConsultarPagoActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnConsultarCita;
    private javax.swing.JButton btnConsultarFicha;
    private javax.swing.JButton btnConsultarPago;
    private javax.swing.JButton btnDesbloquearPaciente;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnGenerarReceta;
    private javax.swing.JButton btnModificarCita;
    private javax.swing.JButton btnNuevaCita;
    private javax.swing.JButton btnRegistrarFicha;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JButton btnRegistrarPago;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}