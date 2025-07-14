package spotify.simulation.forms;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import spotify.simulation.clases.Role;
import spotify.simulation.clases.SessionManager;
import spotify.simulation.clases.Subscription;
import spotify.simulation.clases.User;
import spotify.simulation.controller.RoleController;
import spotify.simulation.controller.SubscriptionController;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.ImagePanel;

public class EspectadorInicio extends javax.swing.JPanel {

    private RoleController roleController;
    private SubscriptionController subscriptionControler;
    private UserController userController;

    private List<Role> listRole;
    private List<Subscription> listSubscription;

    private Map<Integer, Role> mapRole;
    private Map<Integer, Subscription> mapSubscription;

    private Role role;
    private Subscription subscription;

    private User user;

    public EspectadorInicio() {

        initComponents();

        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);

        if (panelLogo instanceof ImagePanel) {
            ((ImagePanel) panelLogo).setImage("/spotify/simulation/imagenes/LOGO.png");
        }
        if (panelSantoto1 instanceof ImagePanel) {
            ((ImagePanel) panelSantoto1).setImage("/spotify/simulation/imagenes/santoto_stereo.png");
        }
        if (panelSantoto instanceof ImagePanel) {
            ((ImagePanel) panelSantoto).setImage("/spotify/simulation/imagenes/santoto_zul.png");
        }
        if (panelStereo instanceof ImagePanel) {
            ((ImagePanel) panelStereo).setImage("/spotify/simulation/imagenes/stereo.png");
        }

        panelnput1.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput1.setBorderColor(Color.WHITE);
        panelnput1.setBorderThickness(2);
        panelnput1.setRoundTopLeft(10);
        panelnput1.setRoundTopRight(10);
        panelnput1.setRoundBottomRight(10);
        panelnput1.setRoundBottomLeft(10);
        panelnput2.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput2.setBorderColor(Color.WHITE);
        panelnput2.setBorderThickness(2);
        panelnput2.setRoundTopLeft(10);
        panelnput2.setRoundTopRight(10);
        panelnput2.setRoundBottomRight(10);
        panelnput2.setRoundBottomLeft(10);
        panelnput3.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput3.setBorderColor(Color.WHITE);
        panelnput3.setBorderThickness(2);
        panelnput3.setRoundTopLeft(10);
        panelnput3.setRoundTopRight(10);
        panelnput3.setRoundBottomRight(10);
        panelnput3.setRoundBottomLeft(10);
        panelnput4.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput4.setBorderColor(Color.WHITE);
        panelnput4.setBorderThickness(2);
        panelnput4.setRoundTopLeft(10);
        panelnput4.setRoundTopRight(10);
        panelnput4.setRoundBottomRight(10);
        panelnput4.setRoundBottomLeft(10);
        panelnput5.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput5.setBorderColor(Color.WHITE);
        panelnput5.setBorderThickness(2);
        panelnput5.setRoundTopLeft(10);
        panelnput5.setRoundTopRight(10);
        panelnput5.setRoundBottomRight(10);
        panelnput5.setRoundBottomLeft(10);
        panel1.setBackground(new java.awt.Color(255, 255, 255, 103));
        panel1.setBorderColor(Color.WHITE);
        panel1.setBorderThickness(1);
        panel1.setRoundTopLeft(10);
        panel1.setRoundBottomLeft(10);
        panel2.setBackground(new java.awt.Color(255, 255, 255, 103));
        panel2.setBorderColor(Color.WHITE);
        panel2.setBorderThickness(1);
        panel2.setRoundTopLeft(10);
        panel2.setRoundBottomLeft(10);

        btnSalir.setContentAreaFilled(false);
        btnCambiarContrase1.setContentAreaFilled(false);
        btnCambiarContrase1.setBorderPainted(false);
        btnCambiarContrase1.setFocusPainted(false);
        btnSuscripcion.setContentAreaFilled(false);
        btnSuscripcion.setBorderPainted(false);
        btnSuscripcion.setFocusPainted(false);

        /**
         * *************
         */
        // LOGICA
        userController = new UserController();
        roleController = new RoleController();
        subscriptionControler = new SubscriptionController();

        listRole = roleController.getAllRoles();
        listSubscription = subscriptionControler.getAllSubscriptions();

        user = SessionManager.getCurrentUser();
        mapRole = new HashMap<>();
        mapSubscription = new HashMap<>();

        role = new Role();
        subscription = new Subscription();

        this.llenarMapas();
        this.llenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogo = new spotify.simulation.utilidades.ImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        round3 = new spotify.simulation.utilidades.Round();
        panelStereo = new spotify.simulation.utilidades.ImagePanel();
        panelnput1 = new spotify.simulation.utilidades.PanelRound();
        txtUsuario = new javax.swing.JLabel();
        panelnput2 = new spotify.simulation.utilidades.PanelRound();
        txtTelefono = new javax.swing.JLabel();
        panelnput3 = new spotify.simulation.utilidades.PanelRound();
        txtCorreo = new javax.swing.JLabel();
        panelnput4 = new spotify.simulation.utilidades.PanelRound();
        txtRol = new javax.swing.JLabel();
        panelnput5 = new spotify.simulation.utilidades.PanelRound();
        txtSuscripcion = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        panel1 = new spotify.simulation.utilidades.PanelRound();
        imagePanel1 = new spotify.simulation.utilidades.ImagePanel();
        panelSantoto1 = new spotify.simulation.utilidades.ImagePanel();
        panel2 = new spotify.simulation.utilidades.PanelRound();
        panelSantoto = new spotify.simulation.utilidades.ImagePanel();
        btnSalir = new javax.swing.JButton();
        btnSuscripcion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCambiarContrase1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPRODUCTOR DE MUSICA USTA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 410, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, 30));

        round3.setBackground(new java.awt.Color(255, 255, 255));
        round3.setRoundTopLeft(15);
        round3.setRoundTopRight(15);

        javax.swing.GroupLayout round3Layout = new javax.swing.GroupLayout(round3);
        round3.setLayout(round3Layout);
        round3Layout.setHorizontalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        round3Layout.setVerticalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        add(round3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 10, 430));

        javax.swing.GroupLayout panelStereoLayout = new javax.swing.GroupLayout(panelStereo);
        panelStereo.setLayout(panelStereoLayout);
        panelStereoLayout.setHorizontalGroup(
            panelStereoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelStereoLayout.setVerticalGroup(
            panelStereoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        add(panelStereo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, 90));

        panelnput1.setRoundBottomLeft(5);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput1Layout = new javax.swing.GroupLayout(panelnput1);
        panelnput1.setLayout(panelnput1Layout);
        panelnput1Layout.setHorizontalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput1Layout.setVerticalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 190, 30));

        panelnput2.setRoundBottomLeft(5);

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput2Layout = new javax.swing.GroupLayout(panelnput2);
        panelnput2.setLayout(panelnput2Layout);
        panelnput2Layout.setHorizontalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput2Layout.setVerticalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        panelnput3.setRoundBottomLeft(5);

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput3Layout = new javax.swing.GroupLayout(panelnput3);
        panelnput3.setLayout(panelnput3Layout);
        panelnput3Layout.setHorizontalGroup(
            panelnput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput3Layout.setVerticalGroup(
            panelnput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        panelnput4.setRoundBottomLeft(5);

        txtRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRol.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput4Layout = new javax.swing.GroupLayout(panelnput4);
        panelnput4.setLayout(panelnput4Layout);
        panelnput4Layout.setHorizontalGroup(
            panelnput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnput4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtRol, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput4Layout.setVerticalGroup(
            panelnput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        panelnput5.setRoundBottomLeft(5);

        txtSuscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSuscripcion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput5Layout = new javax.swing.GroupLayout(panelnput5);
        panelnput5.setLayout(panelnput5Layout);
        panelnput5Layout.setHorizontalGroup(
            panelnput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnput5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSuscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput5Layout.setVerticalGroup(
            panelnput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSuscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        d.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("CAMBIAR SUSCRIPCION");
        add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 160, -1));

        javax.swing.GroupLayout panelSantoto1Layout = new javax.swing.GroupLayout(panelSantoto1);
        panelSantoto1.setLayout(panelSantoto1Layout);
        panelSantoto1Layout.setHorizontalGroup(
            panelSantoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        panelSantoto1Layout.setVerticalGroup(
            panelSantoto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSantoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSantoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 270, 180));

        panel2.setRoundBottomLeft(5);

        javax.swing.GroupLayout panelSantotoLayout = new javax.swing.GroupLayout(panelSantoto);
        panelSantoto.setLayout(panelSantotoLayout);
        panelSantotoLayout.setHorizontalGroup(
            panelSantotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        panelSantotoLayout.setVerticalGroup(
            panelSantotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(panelSantoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(panelSantoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 270, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btnSuscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuscripcionActionPerformed(evt);
            }
        });
        add(btnSuscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 160, 20));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAMBIAR CONTRASEÑA");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 160, -1));

        btnCambiarContrase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContrase1ActionPerformed(evt);
            }
        });
        add(btnCambiarContrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 160, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Window ventana = SwingUtilities.getWindowAncestor(this);
        if (ventana != null) {
            ventana.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSuscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuscripcionActionPerformed
        ChangeSubscriptionPanel panel = new ChangeSubscriptionPanel(user);
        panel.setVisible(true);
    }//GEN-LAST:event_btnSuscripcionActionPerformed

    private void btnCambiarContrase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContrase1ActionPerformed
        String inputPassword = JOptionPane.showInputDialog(this, "Ingresa tu contraseña actual:",
                "Verificación de Contraseña", JOptionPane.PLAIN_MESSAGE);

// Si el usuario cancela el cuadro de diálogo
        if (inputPassword == null) {
            return;
        }

        boolean isValid = userController.validatePassword(user.getId(), inputPassword);

        if (isValid) {
            ChangePasswordPanel changePanel = new ChangePasswordPanel(user);
            changePanel.setVisible(true); 
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Intenta nuevamente.",
                    "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCambiarContrase1ActionPerformed

    public void llenarMapas() {
        for (Subscription s : listSubscription) {
            mapSubscription.put(s.getIdSubscription(), s);
        }

        for (Role r : listRole) {
            mapRole.put(r.getIdRole(), r);
        }
    }

    public void llenarCampos() {
        User user = SessionManager.getCurrentUser();

        txtUsuario.setText(user.getName());
        txtTelefono.setText(user.getPhone());
        txtCorreo.setText(user.getEmail());

        Role r = mapRole.get(user.getRoleId());
        Subscription s = mapSubscription.get(user.getSubscriptionId());

        txtRol.setText(r.getRoleName());
        txtSuscripcion.setText(s.getSubscriptionName());
    }

    public class ChangePasswordPanel extends JDialog {

        private JPasswordField txtNewPassword;
        private JPasswordField txtConfirmPassword;
        private JButton btnSubmit;

        public ChangePasswordPanel(User user) {
            setTitle("Cambiar Contraseña");
            setSize(300, 200);
            setModal(true);
            setLocationRelativeTo(null);

            txtNewPassword = new JPasswordField(15);
            txtConfirmPassword = new JPasswordField(15);
            btnSubmit = new JButton("Cambiar");

            btnSubmit.addActionListener(e -> {
                String newPass = new String(txtNewPassword.getPassword());
                String confirmPass = new String(txtConfirmPassword.getPassword());

                if (!newPass.equals(confirmPass)) {
                    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                userController.updatePassword(user.getId(), newPass);
                JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            });

            setLayout(new GridLayout(3, 2));
            add(new JLabel("Nueva Contraseña:"));
            add(txtNewPassword);
            add(new JLabel("Confirmar Contraseña:"));
            add(txtConfirmPassword);
            add(new JLabel(""));
            add(btnSubmit);
        }
    }

    public class ChangeSubscriptionPanel extends JDialog {

        private JComboBox<String> cmbSubscription;
        private JButton btnConfirm;

        public ChangeSubscriptionPanel(User user) {
            setTitle("Cambiar Suscripción");
            setSize(300, 150);
            setModal(true);
            setLocationRelativeTo(null);

            cmbSubscription = new JComboBox<>();
            cmbSubscription.addItem("Premium"); 
            cmbSubscription.addItem("Gratuita");  

            btnConfirm = new JButton("Confirmar");

            btnConfirm.addActionListener(e -> {
                int selectedIndex = cmbSubscription.getSelectedIndex();
                int subscriptionId = (selectedIndex == 0) ? 1 : 2;

                userController.updateSubscription(user.getId(), subscriptionId);
                JOptionPane.showMessageDialog(this, "Suscripción actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                dispose();
            });

            setLayout(new GridLayout(2, 1));
            add(cmbSubscription);
            add(btnConfirm);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContrase1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSuscripcion;
    private javax.swing.JLabel d;
    private spotify.simulation.utilidades.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private spotify.simulation.utilidades.PanelRound panel1;
    private spotify.simulation.utilidades.PanelRound panel2;
    private spotify.simulation.utilidades.ImagePanel panelLogo;
    private spotify.simulation.utilidades.ImagePanel panelSantoto;
    private spotify.simulation.utilidades.ImagePanel panelSantoto1;
    private spotify.simulation.utilidades.ImagePanel panelStereo;
    private spotify.simulation.utilidades.PanelRound panelnput1;
    private spotify.simulation.utilidades.PanelRound panelnput2;
    private spotify.simulation.utilidades.PanelRound panelnput3;
    private spotify.simulation.utilidades.PanelRound panelnput4;
    private spotify.simulation.utilidades.PanelRound panelnput5;
    private spotify.simulation.utilidades.Round round3;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtRol;
    private javax.swing.JLabel txtSuscripcion;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
