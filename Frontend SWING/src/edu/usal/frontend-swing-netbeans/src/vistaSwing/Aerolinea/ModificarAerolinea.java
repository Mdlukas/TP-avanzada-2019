/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaSwing.Aerolinea;

import edu.usal.controlador.consola.ControladorAerolinea;
import edu.usal.controlador.consola.ControladorAlianzayProvincia;
import edu.usal.domain.Aerolinea;
import edu.usal.domain.Alianza;

import java.util.List;

/**
 * @author fservidio
 */
public class ModificarAerolinea extends javax.swing.JInternalFrame {

    ControladorAerolinea controladorAerolinea = new ControladorAerolinea();
    ControladorAlianzayProvincia controladorAlianzayProvincia = new ControladorAlianzayProvincia();
    Aerolinea consulta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> comboBoxTipoDeAlianzaAerolineas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    public ModificarAerolinea() {
        initComponents();
        this.PopulateAlianzas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        comboBoxTipoDeAlianzaAerolineas = new javax.swing.JComboBox<>();
        btnVer = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Aerolinea");
        setToolTipText("");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de la Aerolinea:");

        jLabel3.setText("Tipo de Alianza:");

        jLabel1.setText("Ingresa ID de la Aerolinea a Modificar");

        jLabel4.setText("ID:");

        comboBoxTipoDeAlianzaAerolineas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(150, 150, 150))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(78, 78, 78))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(comboBoxTipoDeAlianzaAerolineas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnVer)))
                                .addGap(0, 75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnVer))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(comboBoxTipoDeAlianzaAerolineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (consulta != null) {
            Aerolinea modificar = new Aerolinea();
            modificar.setIDAerolinea(Integer.parseInt(this.jTextField3.getText()));
            modificar.setNombreAereoLinea(this.jTextField1.getText());
            modificar.setAlianza(this.comboBoxTipoDeAlianzaAerolineas.getSelectedItem().toString());
            if (this.controladorAerolinea.ModificaciondeAerolinea(modificar)) {
                vistaSwing.Alertas.AlertaCreacion alerta = new vistaSwing.Alertas.AlertaCreacion("Se pudo modificar la Aerolinea de forma correcta!");
                this.jPanel1.add(alerta);
                alerta.setClosable(true);
                alerta.show();
                alerta.moveToFront();
            } else {
                vistaSwing.Alertas.AlertaCreacion alerta = new vistaSwing.Alertas.AlertaCreacion("No se ha podido modificar de forma correcta, consulte la consola!");
                this.jPanel1.add(alerta);
                alerta.setClosable(true);
                alerta.show();
                alerta.moveToFront();
            }
        } else {
            vistaSwing.Alertas.AlertaCreacion alerta = new vistaSwing.Alertas.AlertaCreacion("Se debe consultar una aerolinea primero antes de modificarla!");
            super.add(alerta);
            alerta.setClosable(true);
            alerta.show();
            alerta.moveToFront();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (!this.jTextField3.getText().equals("")) {
            consulta = new Aerolinea();
            consulta.setIDAerolinea(Integer.parseInt(this.jTextField3.getText()));
            consulta = this.controladorAerolinea.ConsultadeAerolinea(consulta);
            //Checkeo que la aerolinea exista
            if (consulta != null) {
                this.jTextField1.setText(consulta.getNombreAereoLinea());
                this.comboBoxTipoDeAlianzaAerolineas.setSelectedItem(consulta.getAlianza());
            } else {
                vistaSwing.Alertas.AlertaCreacion alerta = new vistaSwing.Alertas.AlertaCreacion("No se ha podido encontrar esa aerolinea, consulte la consola!");
                super.add(alerta);
                alerta.setClosable(true);
                alerta.show();
                alerta.moveToFront();
            }
        } else {
            vistaSwing.Alertas.AlertaCreacion alerta = new vistaSwing.Alertas.AlertaCreacion("Se tiene que ingresar un ID primero!");
            super.add(alerta);
            alerta.setClosable(true);
            alerta.show();
            alerta.moveToFront();
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void PopulateAlianzas() {
        List<Alianza> alianzas = this.controladorAlianzayProvincia.ListarAlianzas();
        for (Alianza a : alianzas) {
            this.comboBoxTipoDeAlianzaAerolineas.addItem(a.getNombreAlianza());
        }
    }
    // End of variables declaration//GEN-END:variables
}
