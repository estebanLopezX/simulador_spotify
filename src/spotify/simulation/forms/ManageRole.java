package spotify.simulation.forms;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import spotify.simulation.clases.Role;
import spotify.simulation.controller.RoleController;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.ImagePanel;

public class ManageRole extends javax.swing.JInternalFrame {

    private List<Role> listRole = new ArrayList<>();
    private RoleController roleController;
    private UserController userController;
    private Role objRole;

    public ManageRole() {
        initComponents();

        //*****************************
        // Quitar bordes (incluso los invisibles o decorativos del LookAndFeel)
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        panelRole.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelRole.setBorderColor(Color.WHITE);
        panelRole.setBorderThickness(3);
        panelRole.setRoundTopLeft(50);
        panelRole.setRoundTopRight(50);
        panelRole.setRoundBottomRight(50);
        panelRole.setRoundBottomLeft(50);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //*************************
        // LOGICCA
        userController = new UserController();
        roleController = new RoleController();
        listRole = roleController.getAllRoles();
        objRole = new Role();
        this.llenarTabla();
    }

    public void llenarTabla() {
        listRole = roleController.getAllRoles();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        for (Role role : listRole) {
            String estado = role.getStatus() == 1 ? "Activo" : "Inactivo";
            modelo.addRow(new Object[]{role.getRoleName(), estado});
        }

        tablaSalida.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRole = new spotify.simulation.utilidades.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        round7 = new spotify.simulation.utilidades.Round();
        txtNombreRol = new javax.swing.JTextField();
        round8 = new spotify.simulation.utilidades.Round();
        txtEstado = new javax.swing.JTextField();
        round9 = new spotify.simulation.utilidades.Round();
        round10 = new spotify.simulation.utilidades.Round();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        panelRole.setBackground(new java.awt.Color(0, 102, 102));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ROLES");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRAR");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE ROL");

        round7.setBackground(new java.awt.Color(255, 255, 255));
        round7.setForeground(new java.awt.Color(255, 255, 255));
        round7.setRoundBottomLeft(30);
        round7.setRoundBottomRight(30);
        round7.setRoundTopLeft(30);
        round7.setRoundTopRight(30);

        txtNombreRol.setBorder(null);

        javax.swing.GroupLayout round7Layout = new javax.swing.GroupLayout(round7);
        round7.setLayout(round7Layout);
        round7Layout.setHorizontalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNombreRol, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        round7Layout.setVerticalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNombreRol, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round8.setBackground(new java.awt.Color(255, 255, 255));
        round8.setForeground(new java.awt.Color(255, 255, 255));
        round8.setRoundBottomLeft(30);
        round8.setRoundBottomRight(30);
        round8.setRoundTopLeft(30);
        round8.setRoundTopRight(30);

        txtEstado.setBorder(null);

        javax.swing.GroupLayout round8Layout = new javax.swing.GroupLayout(round8);
        round8.setLayout(round8Layout);
        round8Layout.setHorizontalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        round8Layout.setVerticalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round9.setBackground(new java.awt.Color(255, 255, 255));
        round9.setForeground(new java.awt.Color(255, 255, 255));
        round9.setRoundBottomLeft(30);
        round9.setRoundBottomRight(30);
        round9.setRoundTopLeft(30);
        round9.setRoundTopRight(30);

        javax.swing.GroupLayout round9Layout = new javax.swing.GroupLayout(round9);
        round9.setLayout(round9Layout);
        round9Layout.setHorizontalGroup(
            round9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        round9Layout.setVerticalGroup(
            round9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        round10.setBackground(new java.awt.Color(255, 255, 255));
        round10.setForeground(new java.awt.Color(255, 255, 255));
        round10.setRoundBottomLeft(30);
        round10.setRoundBottomRight(30);
        round10.setRoundTopLeft(30);
        round10.setRoundTopRight(30);

        javax.swing.GroupLayout round10Layout = new javax.swing.GroupLayout(round10);
        round10.setLayout(round10Layout);
        round10Layout.setHorizontalGroup(
            round10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        round10Layout.setVerticalGroup(
            round10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTADO");

        javax.swing.GroupLayout panelRoleLayout = new javax.swing.GroupLayout(panelRole);
        panelRole.setLayout(panelRoleLayout);
        panelRoleLayout.setHorizontalGroup(
            panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoleLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRoleLayout.createSequentialGroup()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRoleLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1))
                            .addGroup(panelRoleLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoleLayout.createSequentialGroup()
                        .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(round9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(round8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(round10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoleLayout.createSequentialGroup()
                                .addComponent(btnCerrar)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoleLayout.createSequentialGroup()
                                .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRoleLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4)))
                                .addGap(73, 73, 73))))))
        );
        panelRoleLayout.setVerticalGroup(
            panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoleLayout.createSequentialGroup()
                .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRoleLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(panelRoleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCerrar)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(round9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(round10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelRoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelRole, "Por favor, seleccione un rol de la tabla.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        objRole = listRole.get(filaSeleccionada);

        if (filaSeleccionada >= 0 && filaSeleccionada < listRole.size()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de que desea eliminar este rol?",
                    "Confirmación de eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                if (!userController.hasUserWithRol(objRole.getIdRole())) {
                    roleController.deleteRole(objRole.getIdRole());
                    JOptionPane.showMessageDialog(null, "El rol fue eliminado exitosamente.", "Eliminación completada", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                    listRole = roleController.getAllRoles();
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar este rol porque está asignado a uno o más usuarios.", "Acción no permitida", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La operación de eliminación fue cancelada.", "Acción cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El índice seleccionado no es válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        if (index >= 0 && index < listRole.size()) {
            objRole = listRole.get(index);
            txtNombreRol.setText(objRole.getRoleName());

            if (objRole.getStatus() == 1) {
                txtEstado.setText("Activo");
            } else {
                txtEstado.setText("Inactivo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice de selección inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int estadoNumerico = 0;
        String nombreRol = txtNombreRol.getText();
        String estadoTexto = txtEstado.getText();

        if (nombreRol != null && estadoTexto != null) {
            if (!nombreRol.trim().isEmpty() && !estadoTexto.trim().isEmpty()) {
                if (estadoTexto.equalsIgnoreCase("Activo") || estadoTexto.equalsIgnoreCase("Inactivo")) {
                    estadoNumerico = estadoTexto.equalsIgnoreCase("Activo") ? 1 : 0;

                    roleController.addRole(nombreRol, estadoNumerico);
                    JOptionPane.showMessageDialog(panelRole, "El rol se ha registrado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();
                    txtEstado.setText("");
                    txtNombreRol.setText("");
                } else {
                    JOptionPane.showMessageDialog(panelRole, "El estado ingresado no es válido. Use 'Activo' o 'Inactivo'.", "Estado inválido", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(panelRole, "Debe completar todos los campos antes de continuar.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelRole, "Los valores ingresados no pueden ser nulos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int index = tablaSalida.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(panelRole, "Seleccione un rol", "Abvertencia", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        objRole = listRole.get(index);
        int statusParse = 0;
        String name = txtNombreRol.getText();
        String status = txtNombreRol.getText();
        if (name != null && status != null) {
            if (!name.isEmpty() && !status.isEmpty()) {
                if (status == "Activo") {
                    status = "1";
                    statusParse = Integer.parseInt(status);
                } else {
                    status = "0";
                    statusParse = Integer.parseInt(status);
                }
                roleController.updateRole(objRole.getIdRole(), name, statusParse);
                JOptionPane.showMessageDialog(panelRole, "Rol actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();
                txtEstado.setText("");
                txtNombreRol.setText("");
            } else {
                JOptionPane.showMessageDialog(panelRole, "Los campos no pueden estar vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelRole, "Los campos no pueden ser nulos.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.PanelRound panelRole;
    private spotify.simulation.utilidades.Round round10;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round7;
    private spotify.simulation.utilidades.Round round8;
    private spotify.simulation.utilidades.Round round9;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombreRol;
    // End of variables declaration//GEN-END:variables
}
