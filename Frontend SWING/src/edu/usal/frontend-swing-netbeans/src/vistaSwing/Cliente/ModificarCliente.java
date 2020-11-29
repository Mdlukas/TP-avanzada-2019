/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaSwing.Cliente;

import edu.usal.controlador.consola.ControladorCliente;
import edu.usal.domain.*;

/**
 *
 * @author fservidio
 */
public class ModificarCliente extends javax.swing.JInternalFrame {

    ControladorCliente controlador;
    Cliente consulta;

    /**
     * Creates new form ModificarCliente
     */
    public ModificarCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textFidCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textFMailCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateFechaNacimientoCliente = new com.toedter.calendar.JDateChooser();
        textFDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFRSCliente = new javax.swing.JTextField();
        textFApellidoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFNombreCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFCalleDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textFNumeroPasaporte = new javax.swing.JTextField();
        textFAutoridadEmisionPasaporte = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textFPaisEmisionPasaporte = new javax.swing.JTextField();
        dateFechaEmisionPasaporte = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dateVencimientoPasaporte = new com.toedter.calendar.JDateChooser();
        textFCodigoPostalDireccion = new javax.swing.JTextField();
        textFProviciaDireccion = new javax.swing.JTextField();
        textFCiudadDireccion = new javax.swing.JTextField();
        textFAlturaDireccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        btnVerCliente = new javax.swing.JButton();
        textfCelularTelefono = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        textfLaboralTelefono = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        textfPersonalTelefono = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBoxAerolineapFrecuente = new javax.swing.JComboBox<>();
        comboBoxAlianzapFrecuente = new javax.swing.JComboBox<>();
        textFNumeroPFrecuente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        comboBoxCategoriapFrecuente = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Cliente");

        jLabel10.setText("Ingresar ID de Cliente a Modificar");

        textFidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFidClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("ID:");

        jLabel6.setText("Mail:");

        jLabel5.setText("Fecha de Nacimiento:");

        jLabel4.setText("DNI:");

        jLabel3.setText("RS:");

        jLabel2.setText("Apellido:");

        jLabel1.setText("Nombre:");

        textFNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFNombreClienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Datos Personales");

        jLabel11.setText("Dirección");

        jLabel9.setText("Pasaporte");

        jLabel14.setText("Calle:");

        jLabel18.setText("Numero:");

        jLabel19.setText("Autoridad de Emisión:");

        jLabel20.setText("Pais de Emisión:");

        jLabel21.setText("Fecha de Emisión:");

        jLabel22.setText("Fecha de Vencimiento:");

        jLabel15.setText("Altura:");

        jLabel16.setText("Ciudad:");

        jLabel17.setText("Provincia:");

        jLabel27.setText("Codigo Postal:");

        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnVerCliente.setText("Ver datos");
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        jLabel29.setText("Celular:");

        jLabel28.setText("Laboral:");

        textfPersonalTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfPersonalTelefonoActionPerformed(evt);
            }
        });

        jLabel30.setText("Personal:");

        jLabel8.setText("Telefono");

        comboBoxAerolineapFrecuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxAerolineapFrecuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAerolineapFrecuenteActionPerformed(evt);
            }
        });

        comboBoxAlianzapFrecuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Pasajero Frecuente:");

        jLabel24.setText("Numero:");

        jLabel25.setText("Alianza:");

        jLabel7.setText("Aerolinea:");

        jLabel26.setText("Categoria:");

        comboBoxCategoriapFrecuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel10)
                .addContainerGap(527, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerCliente)
                .addGap(377, 377, 377))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel24)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(textFNumeroPFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboBoxAlianzapFrecuente, javax.swing.GroupLayout.Alignment.LEADING, 0, 156, Short.MAX_VALUE)
                                        .addComponent(comboBoxAerolineapFrecuente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(textfPersonalTelefono)
                                    .addComponent(textfLaboralTelefono)
                                    .addComponent(textfCelularTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxCategoriapFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarCliente)
                        .addGap(540, 540, 540))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(textFApellidoCliente)
                                    .addComponent(textFRSCliente)
                                    .addComponent(textFDNI))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel13))
                                .addComponent(dateFechaNacimientoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel27))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFCodigoPostalDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFProviciaDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFCiudadDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFAlturaDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFCalleDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textFPaisEmisionPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFAutoridadEmisionPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFNumeroPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dateVencimientoPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(dateFechaEmisionPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(255, 255, 255))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(jLabel9))))
                        .addComponent(textFMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btnVerCliente))
                .addGap(36, 36, 36)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(textFNumeroPFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(comboBoxAlianzapFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxAerolineapFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(comboBoxCategoriapFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(textfPersonalTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(textfLaboralTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(textfCelularTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnGuardarCliente)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(textFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(textFCalleDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18)
                                        .addComponent(textFNumeroPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(textFApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(textFAlturaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19)
                                        .addComponent(textFAutoridadEmisionPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(textFRSCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(textFCiudadDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20)
                                        .addComponent(textFPaisEmisionPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(textFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(textFProviciaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)))
                                .addComponent(dateFechaEmisionPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(textFCodigoPostalDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel22))
                                .addComponent(dateFechaNacimientoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(dateVencimientoPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(textFMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFidClienteActionPerformed

    private void textFNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFNombreClienteActionPerformed

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        //Inicializo controller y  Cliente
        this.controlador = new ControladorCliente();
        this.consulta = new Cliente();
        //Realizo consulta a la base de datos.
        consulta.setIDCliente(Integer.parseInt(this.textFidCliente.getText()));
        consulta = controlador.ConsultadeCliente(consulta);

        //Mapeo y populo campos..
        //Mapeo el cliente primero.
        this.textFNombreCliente.setText(consulta.getNombreCliente());
        this.textFApellidoCliente.setText(consulta.getApellidoCliente());
        this.textFMailCliente.setText(consulta.getMail());
        this.textFRSCliente.setText(consulta.getRS());
        this.textFDNI.setText(consulta.getDni());
        if(consulta.getFechaNacimiento() !=  null){
            this.dateFechaNacimientoCliente.setDate(consulta.getFechaNacimiento());
        }

        //Direccion
        if (consulta.getDireccion() != null){
            this.textFAlturaDireccion.setText(consulta.getDireccion().getAltura());
            this.textFCalleDireccion.setText(consulta.getDireccion().getCalle());
            this.textFCodigoPostalDireccion.setText(consulta.getDireccion().getCodigoPostal());
            this.textFCiudadDireccion.setText(consulta.getDireccion().getCiudad());
            this.textFProviciaDireccion.setText(consulta.getDireccion().getProvincia());
        }


        //Ahora el telefono
        //TODO Falta implementar la parte de telefono en esta pantalla.
//        Telefono telefonoAlta = new Telefono();
//        telefonoAlta.setNumeroPersonal(text);
//        telefonoAlta.setNumeroLaboral();
//        telefonoAlta.setNumeroCelular();

        //Pasaporte
        if(consulta.getPasaporte() != null){
            this.textFNumeroPasaporte.setText(consulta.getPasaporte().getNrodePasaporte());
            this.textFAutoridadEmisionPasaporte.setText(consulta.getPasaporte().getAutoridadEmision());
            this.dateVencimientoPasaporte.setDate(consulta.getPasaporte().getFechadeVencimiento());
            this.dateFechaEmisionPasaporte.setDate(consulta.getPasaporte().getFechadeEmision());
            this.textFPaisEmisionPasaporte.setText(consulta.getPasaporte().getPaisEmision());
        }

        //Pasajero Frecuente
        //Todo y la implementacion posta de esto
        if (consulta.getPasajeroFrecuente() != null){
            this.textFNumeroPFrecuente.setText(consulta.getPasajeroFrecuente().getNumero());
        }

    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        //Inicializo controller y  Cliente
        controlador = new ControladorCliente();

        if (consulta != null ){

            //Mapeo el cliente primero.
            consulta.setNombreCliente(this.textFNombreCliente.getText());
            consulta.setApellidoCliente(this.textFApellidoCliente.getText());
            consulta.setMail(this.textFMailCliente.getText());
            consulta.setRS(this.textFRSCliente.getText());
            consulta.setDni(this.textFDNI.getText());
            consulta.setFechaNacimiento(this.dateFechaNacimientoCliente.getDate());

            //Direccion
            Direccion direccionAlta = new Direccion();
            direccionAlta.setAltura(this.textFAlturaDireccion.getText());
            direccionAlta.setCalle(this.textFCalleDireccion.getText());
            direccionAlta.setCodigoPostal(this.textFCodigoPostalDireccion.getText());
            direccionAlta.setCiudad(this.textFCiudadDireccion.getText());
            direccionAlta.setProvincia(this.textFProviciaDireccion.getText());

            //Ahora el telefono
            //TODO Falta implementar la parte de telefono en esta pantalla.
            Telefono telefonoAlta = new Telefono();
//        telefonoAlta.setNumeroPersonal(text);
//        telefonoAlta.setNumeroLaboral();
//        telefonoAlta.setNumeroCelular();

            //Pasaporte
            Pasaporte pasaporteAlta = new Pasaporte();
            pasaporteAlta.setNrodePasaporte(this.textFNumeroPasaporte.getText());
            pasaporteAlta.setAutoridadEmision(this.textFAutoridadEmisionPasaporte.getText());
            pasaporteAlta.setFechadeVencimiento(this.dateVencimientoPasaporte.getDate());
            pasaporteAlta.setFechadeEmision(this.dateFechaEmisionPasaporte.getDate());
            pasaporteAlta.setPaisEmision(this.textFPaisEmisionPasaporte.getText());

            //Pasajero Frecuente
            Pasajero pasajeroAlta = new Pasajero();

            // Y finalmente el mapeo final.
            consulta.setTelefono(telefonoAlta);
            consulta.setPasaporte(pasaporteAlta);
            consulta.setDireccion(direccionAlta);
            consulta.setPasajeroFrecuente(pasajeroAlta);
            this.controlador.ModificaciondeCliente(consulta);
        } else {
            System.out.println("Se deben consultar un cliente primero antes de modificarlo!");
        }

    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void textfPersonalTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfPersonalTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfPersonalTelefonoActionPerformed

    private void comboBoxAerolineapFrecuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAerolineapFrecuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxAerolineapFrecuenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JComboBox<String> comboBoxAerolineapFrecuente;
    private javax.swing.JComboBox<String> comboBoxAlianzapFrecuente;
    private javax.swing.JComboBox<String> comboBoxCategoriapFrecuente;
    private com.toedter.calendar.JDateChooser dateFechaEmisionPasaporte;
    private com.toedter.calendar.JDateChooser dateFechaNacimientoCliente;
    private com.toedter.calendar.JDateChooser dateVencimientoPasaporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFAlturaDireccion;
    private javax.swing.JTextField textFApellidoCliente;
    private javax.swing.JTextField textFAutoridadEmisionPasaporte;
    private javax.swing.JTextField textFCalleDireccion;
    private javax.swing.JTextField textFCiudadDireccion;
    private javax.swing.JTextField textFCodigoPostalDireccion;
    private javax.swing.JTextField textFDNI;
    private javax.swing.JTextField textFMailCliente;
    private javax.swing.JTextField textFNombreCliente;
    private javax.swing.JTextField textFNumeroPFrecuente;
    private javax.swing.JTextField textFNumeroPasaporte;
    private javax.swing.JTextField textFPaisEmisionPasaporte;
    private javax.swing.JTextField textFProviciaDireccion;
    private javax.swing.JTextField textFRSCliente;
    private javax.swing.JTextField textFidCliente;
    private javax.swing.JTextField textfCelularTelefono;
    private javax.swing.JTextField textfLaboralTelefono;
    private javax.swing.JTextField textfPersonalTelefono;
    // End of variables declaration//GEN-END:variables
}
