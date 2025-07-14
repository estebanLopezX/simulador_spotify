package spotify.simulation.forms;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import spotify.simulation.clases.SessionManager;
import spotify.simulation.clases.User;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.FondoPanel;
import spotify.simulation.utilidades.ImagePanel;
import spotify.simulation.utilidades.PanelRound;

public class Login extends javax.swing.JFrame {

    private UserController userController;
    private User user;

    public Login() {

        FondoPanel fondo = new FondoPanel();
        this.setContentPane(fondo); //Para llamar al fondo

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        panelLetras.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelLetras.setBorderColor(Color.WHITE);
        panelLetras.setBorderThickness(3);
        panelLetras.setRoundTopLeft(5);
        panelLetras.setRoundTopRight(5);
        panelLetras.setRoundBottomRight(50);
        panelLetras.setRoundBottomLeft(50);

        panelLogin2.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelLogin2.setBorderColor(Color.WHITE);
        panelLogin2.setBorderThickness(3);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        // ************
        // LOGICA
        userController = new UserController();
        user = new User();
        SessionManager.login(null);

    }

    private void cerrarAplicacion() {
        int opcion;
        String[] textoBotones = {"Aceptar", "Cancelar"};

        opcion = JOptionPane.showOptionDialog(this, "¿ Esta seguro de cerrar la aplicación?", " Cerrar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textoBotones, textoBotones[1]);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin2 = new spotify.simulation.utilidades.PanelRound();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        round4 = new spotify.simulation.utilidades.Round();
        txtUsuario = new javax.swing.JTextField();
        round5 = new spotify.simulation.utilidades.Round();
        txtCotrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        panelLetras = new spotify.simulation.utilidades.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin2.setBackground(new java.awt.Color(0, 66, 123));
        panelLogin2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panelLogin2.setRoundBottomLeft(50);
        panelLogin2.setRoundBottomRight(50);
        panelLogin2.setRoundTopLeft(50);
        panelLogin2.setRoundTopRight(50);

        round3.setBackground(new java.awt.Color(255, 255, 255));
        round3.setRoundBottomLeft(100);
        round3.setRoundBottomRight(100);
        round3.setRoundTopLeft(100);
        round3.setRoundTopRight(100);

        javax.swing.GroupLayout panelLogo2Layout = new javax.swing.GroupLayout(panelLogo2);
        panelLogo2.setLayout(panelLogo2Layout);
        panelLogo2Layout.setHorizontalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panelLogo2Layout.setVerticalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout round3Layout = new javax.swing.GroupLayout(round3);
        round3.setLayout(round3Layout);
        round3Layout.setHorizontalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        round3Layout.setVerticalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, round3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        round4.setBackground(new java.awt.Color(255, 255, 255));
        round4.setRoundBottomLeft(30);
        round4.setRoundBottomRight(30);
        round4.setRoundTopLeft(30);
        round4.setRoundTopRight(30);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);

        javax.swing.GroupLayout round4Layout = new javax.swing.GroupLayout(round4);
        round4.setLayout(round4Layout);
        round4Layout.setHorizontalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        round4Layout.setVerticalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        round5.setBackground(new java.awt.Color(255, 255, 255));
        round5.setRoundBottomLeft(30);
        round5.setRoundBottomRight(30);
        round5.setRoundTopLeft(30);
        round5.setRoundTopRight(30);

        txtCotrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCotrasenia.setBorder(null);

        javax.swing.GroupLayout round5Layout = new javax.swing.GroupLayout(round5);
        round5.setLayout(round5Layout);
        round5Layout.setHorizontalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtCotrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        round5Layout.setVerticalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCotrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");

        btnRegistrarse.setBackground(new java.awt.Color(222, 36, 24));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(246, 206, 1));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogin2Layout = new javax.swing.GroupLayout(panelLogin2);
        panelLogin2.setLayout(panelLogin2Layout);
        panelLogin2Layout.setHorizontalGroup(
            panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(176, 176, 176))
            .addGroup(panelLogin2Layout.createSequentialGroup()
                .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogin2Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLogin2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnRegistrarse)
                        .addGap(27, 27, 27)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panelLogin2Layout.setVerticalGroup(
            panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogin2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 540, 360));

        panelLetras.setBackground(new java.awt.Color(102, 255, 255));
        panelLetras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        panelLetras.setBorderColor(new java.awt.Color(255, 255, 255));
        panelLetras.setBorderThickness(3);
        panelLetras.setRoundBottomLeft(4);
        panelLetras.setRoundBottomRight(5);
        panelLetras.setRoundTopLeft(50);
        panelLetras.setRoundTopRight(50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout panelLetrasLayout = new javax.swing.GroupLayout(panelLetras);
        panelLetras.setLayout(panelLetrasLayout);
        panelLetrasLayout.setHorizontalGroup(
            panelLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLetrasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelLetrasLayout.setVerticalGroup(
            panelLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLetrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(panelLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 260, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REPRODUCTOR DE MÚSICA USTA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 530, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIENVENIDO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 260, 60));

        btnSalir.setBackground(new java.awt.Color(222, 36, 24));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.cerrarAplicacion();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registrarse miVentana = new Registrarse();
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        String correo = txtUsuario.getText().trim();
        char[] passwordChars = txtCotrasenia.getPassword();  // Corregí el nombre a txtContrasenia
        String clave = new String(passwordChars);

        if (correo.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Correo y contraseña son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        user = userController.obtenerUsuarioPorCorreoYClave(correo, clave);
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SessionManager.login(user);

        int rol = user.getRoleId();

        String mensajeBienvenida = "Bienvenido " + user.getName() + "!";

        if (rol == 1) {
            JOptionPane.showMessageDialog(this, mensajeBienvenida, "Inicio exitoso", JOptionPane.INFORMATION_MESSAGE);
            MainMenu adminMenu = new MainMenu();
            adminMenu.setLocationRelativeTo(null);
            adminMenu.setVisible(true);
        } else if (rol == 2) {
            JOptionPane.showMessageDialog(this, mensajeBienvenida, "Inicio exitoso", JOptionPane.INFORMATION_MESSAGE);
            EspectadorMenu espectadorMenu = new EspectadorMenu();
            espectadorMenu.setLocationRelativeTo(null);
            espectadorMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Rol no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.dispose();

    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private spotify.simulation.utilidades.PanelRound panelLetras;
    private spotify.simulation.utilidades.PanelRound panelLogin2;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round4;
    private spotify.simulation.utilidades.Round round5;
    private javax.swing.JPasswordField txtCotrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
