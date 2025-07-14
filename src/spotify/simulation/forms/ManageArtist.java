package spotify.simulation.forms;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import spotify.simulation.clases.Artist;
import spotify.simulation.controller.ArtistController;
import spotify.simulation.utilidades.ImagePanel;

public class ManageArtist extends javax.swing.JInternalFrame {

    private List<Artist> listArtist;
    private Artist objArtist;
    private ArtistController artistController;

    public ManageArtist() {
        initComponents();

        //*****************************
        // Quitar bordes (incluso los invisibles o decorativos del LookAndFeel)
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        //****************
        // Diseño
        panelArtist.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelArtist.setBorderColor(Color.WHITE);
        panelArtist.setBorderThickness(3);
        panelArtist.setRoundTopLeft(50);
        panelArtist.setRoundTopRight(50);
        panelArtist.setRoundBottomRight(50);
        panelArtist.setRoundBottomLeft(50);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //******************
        // Logica
        artistController = new ArtistController();
        listArtist = new ArrayList<>();
        objArtist = new Artist();
        this.llenarTabla();
    }

    public void llenarTabla() {

        listArtist = artistController.getAllArtists();

        String[] textos = {"NOMBRE ARTISTA"};
        DefaultTableModel modelTable = new DefaultTableModel(textos, 0);

        for (Artist artist : listArtist) {
            Object[] objFila = new Object[1];

            objFila[0] = artist.getArtistName();

            modelTable.addRow(objFila);
        }

        tablaSalida.setModel(modelTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArtist = new spotify.simulation.utilidades.PanelRound();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        round7 = new spotify.simulation.utilidades.Round();
        txtNombreArtista = new javax.swing.JTextField();
        round8 = new spotify.simulation.utilidades.Round();
        round9 = new spotify.simulation.utilidades.Round();
        round10 = new spotify.simulation.utilidades.Round();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        panelArtist.setBackground(new java.awt.Color(0, 102, 102));

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
        jLabel2.setText("ARTISTA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRAR");

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
        jLabel3.setText("NOMBRE ARTISTA");

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        round7.setBackground(new java.awt.Color(255, 255, 255));
        round7.setForeground(new java.awt.Color(255, 255, 255));
        round7.setRoundBottomLeft(30);
        round7.setRoundBottomRight(30);
        round7.setRoundTopLeft(30);
        round7.setRoundTopRight(30);

        txtNombreArtista.setBorder(null);

        javax.swing.GroupLayout round7Layout = new javax.swing.GroupLayout(round7);
        round7.setLayout(round7Layout);
        round7Layout.setHorizontalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        round7Layout.setVerticalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNombreArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round8.setBackground(new java.awt.Color(255, 255, 255));
        round8.setForeground(new java.awt.Color(255, 255, 255));
        round8.setRoundBottomLeft(30);
        round8.setRoundBottomRight(30);
        round8.setRoundTopLeft(30);
        round8.setRoundTopRight(30);

        javax.swing.GroupLayout round8Layout = new javax.swing.GroupLayout(round8);
        round8.setLayout(round8Layout);
        round8Layout.setHorizontalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        round8Layout.setVerticalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
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
            .addGap(0, 208, Short.MAX_VALUE)
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
            .addGap(0, 208, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelArtistLayout = new javax.swing.GroupLayout(panelArtist);
        panelArtist.setLayout(panelArtistLayout);
        panelArtistLayout.setHorizontalGroup(
            panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtistLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArtistLayout.createSequentialGroup()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelArtistLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1))
                            .addGroup(panelArtistLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtistLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(14, 14, 14))
                    .addGroup(panelArtistLayout.createSequentialGroup()
                        .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelArtistLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(round9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(round8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(round10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelArtistLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel3)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        panelArtistLayout.setVerticalGroup(
            panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistLayout.createSequentialGroup()
                .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtistLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArtistLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(panelArtistLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCerrar)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(round8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(round9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(round10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(panelArtist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelArtist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelArtist, "Por favor, seleccione un género de la lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        objArtist = listArtist.get(filaSeleccionada);

        if (filaSeleccionada >= 0 && filaSeleccionada < listArtist.size()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea eliminar al artista \"" + objArtist.getArtistName() + "\"?",
                    "Confirmación requerida",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                artistController.deleteArtist(objArtist.getIdArtist());
                JOptionPane.showMessageDialog(panelArtist, "El artista fue eliminado exitosamente.", "Eliminación completada", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();
                txtNombreArtista.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El proceso de eliminación fue cancelado.", "Acción cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelArtist, "El índice seleccionado no es válido.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        objArtist = listArtist.get(index);

        txtNombreArtista.setText(objArtist.getArtistName());
    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelArtist, "Debe seleccionar un artista de la tabla.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        objArtist = listArtist.get(filaSeleccionada);
        String nombreModificado = txtNombreArtista.getText();

        if (nombreModificado != null) {
            if (!nombreModificado.trim().isEmpty()) {
                artistController.updateArtist(objArtist.getIdArtist(), nombreModificado);
                JOptionPane.showMessageDialog(panelArtist, "Los datos del artista fueron actualizados satisfactoriamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();
                txtNombreArtista.setText("");
            } else {
                JOptionPane.showMessageDialog(panelArtist, "El campo de nombre no puede quedar vacío.", "Entrada requerida", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelArtist, "Debe ingresar un nombre válido para continuar.", "Dato inválido", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombreIngresado = txtNombreArtista.getText();

        if (nombreIngresado != null) {
            if (!nombreIngresado.trim().isEmpty()) {
                artistController.addArtist(nombreIngresado);
                JOptionPane.showMessageDialog(panelArtist, "El artista se agregó exitosamente.", "Proceso completado", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();
                txtNombreArtista.setText("");
            } else {
                JOptionPane.showMessageDialog(panelArtist, "Por favor, complete el campo de nombre.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelArtist, "El campo de nombre no puede estar sin inicializar.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private spotify.simulation.utilidades.PanelRound panelArtist;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.Round round10;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round7;
    private spotify.simulation.utilidades.Round round8;
    private spotify.simulation.utilidades.Round round9;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextField txtNombreArtista;
    // End of variables declaration//GEN-END:variables
}
