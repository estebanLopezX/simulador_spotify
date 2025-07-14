package spotify.simulation.forms;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.UnsupportedLookAndFeelException;
import spotify.simulation.utilidades.FondoPanel;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        //-----------------------------------
        //DISEÑO

        FondoPanel fondo = new FondoPanel();
        this.setContentPane(fondo); //Para llamar al fondo

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        panelMenu.setBackground(new java.awt.Color(0, 66, 123, 190)); // color azul con transparencia
        panelMenu.setBorderColor(Color.WHITE);
        panelMenu.setBorderThickness(3);
        panelMenu.setRoundTopLeft(50);
        panelMenu.setRoundTopRight(50);
        panelMenu.setRoundBottomRight(50);
        panelMenu.setRoundBottomLeft(50);

        //*----------------------------*
        // Botones
        btnArchivo.setContentAreaFilled(false);
        btnUsuarios.setContentAreaFilled(false);
        btnCanciones.setContentAreaFilled(false);
        btnArtistas.setContentAreaFilled(false);
        btnGeneros.setContentAreaFilled(false);
        btnRoles.setContentAreaFilled(false);
        btnSuscripciones.setContentAreaFilled(false);
    }

    public void centrarJInternal(JInternalFrame miVentana) {
        // Asegúrate de tener una referencia a tu contenedor principal (por ejemplo: jDesktopPane1)
        int x = (panelPrincipal.getWidth() - miVentana.getWidth()) / 2;
        int y = (panelPrincipal.getHeight() - miVentana.getHeight()) / 2;

        miVentana.setLocation(x, y);   // Centrar en el panel
        panelPrincipal.add(miVentana); // Añadir al contenedor
        miVentana.setVisible(true);    // Mostrar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelMenu = new spotify.simulation.utilidades.PanelRound();
        btnArchivo = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCanciones = new javax.swing.JButton();
        btnArtistas = new javax.swing.JButton();
        btnGeneros = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        btnSuscripciones = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panelMenu.setRoundBottomLeft(30);
        panelMenu.setRoundBottomRight(30);
        panelMenu.setRoundTopLeft(30);
        panelMenu.setRoundTopRight(30);

        btnArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivo.setText("SALIR");
        btnArchivo.setBorder(null);
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCanciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCanciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCanciones.setText("CANCIONES");
        btnCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionesActionPerformed(evt);
            }
        });

        btnArtistas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArtistas.setForeground(new java.awt.Color(255, 255, 255));
        btnArtistas.setText("ARTISTAS");
        btnArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtistasActionPerformed(evt);
            }
        });

        btnGeneros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGeneros.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneros.setText("GENEROS");
        btnGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerosActionPerformed(evt);
            }
        });

        btnRoles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnRoles.setText("ROLES");
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        btnSuscripciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuscripciones.setForeground(new java.awt.Color(255, 255, 255));
        btnSuscripciones.setText("SUSCRIPCIONES");
        btnSuscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuscripcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCanciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnArtistas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeneros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoles)
                .addGap(18, 18, 18)
                .addComponent(btnSuscripciones)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArchivo)
                    .addComponent(btnUsuarios)
                    .addComponent(btnCanciones)
                    .addComponent(btnArtistas)
                    .addComponent(btnGeneros)
                    .addComponent(btnRoles)
                    .addComponent(btnSuscripciones))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelPrincipal.setOpaque(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtistasActionPerformed
        ManageArtist manageArtista = new ManageArtist();
        this.centrarJInternal(manageArtista);
    }//GEN-LAST:event_btnArtistasActionPerformed

    private void btnGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerosActionPerformed
        ManageGeneros manageGeneros = new ManageGeneros();
        this.centrarJInternal(manageGeneros);
    }//GEN-LAST:event_btnGenerosActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        ManageRole manageRole = new ManageRole();
        this.centrarJInternal(manageRole);
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnSuscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuscripcionesActionPerformed
        ManageSuscriptions manageSuscriptions = new ManageSuscriptions();
        centrarJInternal(manageSuscriptions);
    }//GEN-LAST:event_btnSuscripcionesActionPerformed

    private void btnCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionesActionPerformed
        ManageSongs manageSongs = new ManageSongs();
        this.centrarJInternal(manageSongs);
    }//GEN-LAST:event_btnCancionesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        try {
            ManageUsers manageUsers = new ManageUsers();
            this.centrarJInternal(manageUsers);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnArtistas;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnGeneros;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnSuscripciones;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private spotify.simulation.utilidades.PanelRound panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
