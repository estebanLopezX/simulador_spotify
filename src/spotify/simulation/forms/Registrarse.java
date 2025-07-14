package spotify.simulation.forms;

import java.awt.Color;
import javax.swing.JOptionPane;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.FondoPanel;
import spotify.simulation.utilidades.ImagePanel;

public class Registrarse extends javax.swing.JFrame {

    private UserController userController;

    public Registrarse() {
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

        panelLogin2.setBackground(new java.awt.Color(0, 66, 123, 200)); // color azul con transparencia
        panelLogin2.setBorderColor(Color.WHITE);
        panelLogin2.setBorderThickness(3);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //*******************
        //Logica
        userController = new UserController();
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
        txtConfirmarContrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        round1 = new spotify.simulation.utilidades.Round();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        round2 = new spotify.simulation.utilidades.Round();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        round6 = new spotify.simulation.utilidades.Round();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        panelLetras = new spotify.simulation.utilidades.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        txtConfirmarContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmarContrasenia.setBorder(null);

        javax.swing.GroupLayout round5Layout = new javax.swing.GroupLayout(round5);
        round5.setLayout(round5Layout);
        round5Layout.setHorizontalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        round5Layout.setVerticalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIRMAR CONTRASEÑA");

        btnRegistrarse.setBackground(new java.awt.Color(222, 36, 24));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("CREAR CUENTA");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        round1.setBackground(new java.awt.Color(255, 255, 255));
        round1.setRoundBottomLeft(30);
        round1.setRoundBottomRight(30);
        round1.setRoundTopLeft(30);
        round1.setRoundTopRight(30);

        txtTelefono.setBorder(null);

        javax.swing.GroupLayout round1Layout = new javax.swing.GroupLayout(round1);
        round1.setLayout(round1Layout);
        round1Layout.setHorizontalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        round1Layout.setVerticalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");

        round2.setBackground(new java.awt.Color(255, 255, 255));
        round2.setRoundBottomLeft(30);
        round2.setRoundBottomRight(30);
        round2.setRoundTopLeft(30);
        round2.setRoundTopRight(30);

        txtCorreo.setText("@usantoto.edu.co");
        txtCorreo.setBorder(null);

        javax.swing.GroupLayout round2Layout = new javax.swing.GroupLayout(round2);
        round2.setLayout(round2Layout);
        round2Layout.setHorizontalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        round2Layout.setVerticalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO");

        round6.setBackground(new java.awt.Color(255, 255, 255));
        round6.setRoundBottomLeft(30);
        round6.setRoundBottomRight(30);
        round6.setRoundTopLeft(30);
        round6.setRoundTopRight(30);

        txtContrasenia.setBorder(null);

        javax.swing.GroupLayout round6Layout = new javax.swing.GroupLayout(round6);
        round6.setLayout(round6Layout);
        round6Layout.setHorizontalGroup(
            round6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        round6Layout.setVerticalGroup(
            round6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");

        javax.swing.GroupLayout panelLogin2Layout = new javax.swing.GroupLayout(panelLogin2);
        panelLogin2.setLayout(panelLogin2Layout);
        panelLogin2Layout.setHorizontalGroup(
            panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogin2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(round6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                                .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(105, 105, 105))
                                        .addComponent(round2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLogin2Layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel2))
                                            .addGroup(panelLogin2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(round1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(round4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(187, 187, 187))
                            .addGroup(panelLogin2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogin2Layout.createSequentialGroup()
                        .addComponent(btnRegistrarse)
                        .addGap(193, 193, 193))))
        );
        panelLogin2Layout.setVerticalGroup(
            panelLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogin2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(round6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        jLabel1.setText("REGISTRARSE");

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

        btnSalir.setBackground(new java.awt.Color(222, 36, 24));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(panelLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombreUsuario = txtUsuario.getText().trim();
        String correoElectronico = txtCorreo.getText().trim();
        String telefonoUsuario = txtTelefono.getText().trim();
        char[] contrasenaChars = txtContrasenia.getPassword();
        String contrasena = new String(contrasenaChars);
        char[] confirmarContrasenaChars = txtConfirmarContrasenia.getPassword();
        String confirmarContrasena = new String(confirmarContrasenaChars);

        if (nombreUsuario != null && correoElectronico != null && telefonoUsuario != null && contrasena != null) {
            if (!nombreUsuario.isEmpty() && !correoElectronico.isEmpty() && !telefonoUsuario.isEmpty() && !contrasena.isEmpty()) {

                if (!confirmarContrasena.equals(contrasena)) {
                    JOptionPane.showMessageDialog(panelLogin2, "Las contraseñas no coinciden.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (!correoElectronico.endsWith("@usantoto.edu.co")) {
                    JOptionPane.showMessageDialog(panelLogin2, "El correo debe finalizar con @usantoto.edu.co", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String usuarioCorreo = correoElectronico.substring(0, correoElectronico.indexOf("@"));

                if (!usuarioCorreo.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(panelLogin2, "La parte del usuario del correo solo puede contener letras, sin números ni símbolos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!nombreUsuario.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(panelLogin2, "El nombre solo puede contener letras y espacios.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                userController.addUser(2, 2, nombreUsuario, telefonoUsuario, correoElectronico, confirmarContrasena);

                JOptionPane.showMessageDialog(panelLogin2, "Usuario creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Limpiar campos
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtUsuario.setText("");
                txtContrasenia.setText("");
                txtConfirmarContrasenia.setText("");

                Login login = new Login();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(panelLogin2, "Ningún campo puede estar vacío.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelLogin2, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private spotify.simulation.utilidades.PanelRound panelLetras;
    private spotify.simulation.utilidades.PanelRound panelLogin2;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.Round round1;
    private spotify.simulation.utilidades.Round round2;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round4;
    private spotify.simulation.utilidades.Round round5;
    private spotify.simulation.utilidades.Round round6;
    private javax.swing.JPasswordField txtConfirmarContrasenia;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
