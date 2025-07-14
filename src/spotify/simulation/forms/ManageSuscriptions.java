package spotify.simulation.forms;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import spotify.simulation.clases.Subscription;
import spotify.simulation.controller.SubscriptionController;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.ImagePanel;

public class ManageSuscriptions extends javax.swing.JInternalFrame {

    private Subscription subscription;
    private List<Subscription> listSubscription;
    private SubscriptionController susbsController;
    private UserController userController;

    public ManageSuscriptions() {
        initComponents();

        //*****************************
        // Quitar bordes (incluso los invisibles o decorativos del LookAndFeel)
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        //****************
        // Diseño
        panelSuscriptions.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelSuscriptions.setBorderColor(Color.WHITE);
        panelSuscriptions.setBorderThickness(3);
        panelSuscriptions.setRoundTopLeft(50);
        panelSuscriptions.setRoundTopRight(50);
        panelSuscriptions.setRoundBottomRight(50);
        panelSuscriptions.setRoundBottomLeft(50);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //******************
        // Logica
        subscription = new Subscription();
        listSubscription = new ArrayList<>();
        susbsController = new SubscriptionController();
        userController = new UserController();
        this.llenarTabla();
    }

    private void llenarTabla() {

        listSubscription = susbsController.getAllSubscriptions();

        String[] textos = {"NOMBRE", "BENEFICIOS", "DESCRIPCIÓN"};
        DefaultTableModel tablaModel = new DefaultTableModel(textos, 0);

        for (Subscription susSubscriptions : listSubscription) {
            Object[] obj = new Object[3];

            obj[0] = susSubscriptions.getSubscriptionName();
            obj[1] = susSubscriptions.getBenefits();
            obj[2] = susSubscriptions.getDescription();

            tablaModel.addRow(obj);
        }

        tablaSalida.setModel(tablaModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuscriptions = new spotify.simulation.utilidades.PanelRound();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        round7 = new spotify.simulation.utilidades.Round();
        txtSuscripcion = new javax.swing.JTextField();
        ds = new spotify.simulation.utilidades.Round();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBeneficios = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        d = new spotify.simulation.utilidades.Round();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        panelSuscriptions.setBackground(new java.awt.Color(0, 102, 102));

        round3.setBackground(new java.awt.Color(255, 255, 255));
        round3.setRoundBottomLeft(100);
        round3.setRoundBottomRight(100);
        round3.setRoundTopLeft(100);
        round3.setRoundTopRight(100);

        javax.swing.GroupLayout panelLogo2Layout = new javax.swing.GroupLayout(panelLogo2);
        panelLogo2.setLayout(panelLogo2Layout);
        panelLogo2Layout.setHorizontalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        panelLogo2Layout.setVerticalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout round3Layout = new javax.swing.GroupLayout(round3);
        round3.setLayout(round3Layout);
        round3Layout.setHorizontalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        round3Layout.setVerticalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tablaSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSalida);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUSCRIPCIONES");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRAR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUSCRIPCIÓN");

        round7.setBackground(new java.awt.Color(255, 255, 255));
        round7.setForeground(new java.awt.Color(255, 255, 255));
        round7.setRoundBottomLeft(30);
        round7.setRoundBottomRight(30);
        round7.setRoundTopLeft(30);
        round7.setRoundTopRight(30);

        txtSuscripcion.setBorder(null);

        javax.swing.GroupLayout round7Layout = new javax.swing.GroupLayout(round7);
        round7.setLayout(round7Layout);
        round7Layout.setHorizontalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSuscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        round7Layout.setVerticalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSuscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        ds.setBackground(new java.awt.Color(255, 255, 255));
        ds.setForeground(new java.awt.Color(255, 255, 255));
        ds.setRoundBottomLeft(30);
        ds.setRoundBottomRight(30);
        ds.setRoundTopLeft(30);
        ds.setRoundTopRight(30);

        txtBeneficios.setColumns(20);
        txtBeneficios.setRows(5);
        jScrollPane2.setViewportView(txtBeneficios);

        javax.swing.GroupLayout dsLayout = new javax.swing.GroupLayout(ds);
        ds.setLayout(dsLayout);
        dsLayout.setHorizontalGroup(
            dsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        dsLayout.setVerticalGroup(
            dsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dsLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BENEFICIOS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCRIPCIÓN");

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setRoundBottomLeft(30);
        d.setRoundBottomRight(30);
        d.setRoundTopLeft(30);
        d.setRoundTopRight(30);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane3.setViewportView(txtDescription);

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnActualizar.setBackground(new java.awt.Color(0, 66, 123));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(246, 206, 1));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(222, 36, 24));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuscriptionsLayout = new javax.swing.GroupLayout(panelSuscriptions);
        panelSuscriptions.setLayout(panelSuscriptionsLayout);
        panelSuscriptionsLayout.setHorizontalGroup(
            panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(round7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(btnCerrar)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))))
                .addGap(19, 19, 19))
        );
        panelSuscriptionsLayout.setVerticalGroup(
            panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuscriptionsLayout.createSequentialGroup()
                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelSuscriptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSuscriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuscriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuscriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelSuscriptions, "Por favor, seleccione una suscripción.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        subscription = listSubscription.get(filaSeleccionada);

        if (filaSeleccionada >= 0 && filaSeleccionada < listSubscription.size()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de que desea eliminar la suscripción \"" + subscription.getSubscriptionName() + "\"?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (!userController.hasUserWithSubscription(subscription.getIdSubscription())) {
                    susbsController.deleteSubscription(subscription.getIdSubscription());
                    JOptionPane.showMessageDialog(panelSuscriptions, "Suscripción eliminada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();

                    // Limpiar campos del formulario
                    txtSuscripcion.setText("");
                    txtBeneficios.setText("");
                    txtDescription.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Eliminación cancelada. Hay usuarios asociados a esta suscripción.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelSuscriptions, "Índice fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        subscription = listSubscription.get(index);

        txtSuscripcion.setText(subscription.getSubscriptionName());
        txtBeneficios.setText(subscription.getBenefits());
        txtDescription.setText(subscription.getDescription());
    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombreSuscripcion = txtSuscripcion.getText();
        String descripcion = txtDescription.getText();
        String beneficios = txtBeneficios.getText();

        if (nombreSuscripcion != null && descripcion != null && beneficios != null) {
            if (!nombreSuscripcion.trim().isEmpty() && !descripcion.trim().isEmpty() && !beneficios.trim().isEmpty()) {
                susbsController.addSubscription(nombreSuscripcion, descripcion, beneficios);
                JOptionPane.showMessageDialog(panelSuscriptions, "Suscripción creada con éxito.", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();

                // Limpiar campos
                txtSuscripcion.setText("");
                txtDescription.setText("");
                txtBeneficios.setText("");
            } else {
                JOptionPane.showMessageDialog(panelSuscriptions, "Ningún campo puede estar vacío.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelSuscriptions, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelSuscriptions, "Por favor, seleccione una suscripción.", "Atención", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        subscription = listSubscription.get(filaSeleccionada);

        String nombreSuscripcion = txtSuscripcion.getText();
        String beneficios = txtBeneficios.getText();
        String descripcion = txtDescription.getText();

        if (nombreSuscripcion != null && beneficios != null && descripcion != null) {
            if (!nombreSuscripcion.trim().isEmpty() && !beneficios.trim().isEmpty() && !descripcion.trim().isEmpty()) {
                susbsController.updateSubscription(subscription.getIdSubscription(), nombreSuscripcion, beneficios, descripcion);
                JOptionPane.showMessageDialog(panelSuscriptions, "Suscripción actualizada con éxito.", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();

                // Limpiar campos
                txtSuscripcion.setText("");
                txtBeneficios.setText("");
                txtDescription.setText("");
            } else {
                JOptionPane.showMessageDialog(panelSuscriptions, "Ningún campo puede quedar vacío.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelSuscriptions, "Todos los campos deben tener un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private spotify.simulation.utilidades.Round d;
    private spotify.simulation.utilidades.Round ds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.PanelRound panelSuscriptions;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round7;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextArea txtBeneficios;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSuscripcion;
    // End of variables declaration//GEN-END:variables
}
