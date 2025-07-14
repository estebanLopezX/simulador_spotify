package spotify.simulation.forms;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import spotify.simulation.clases.Role;
import spotify.simulation.clases.Subscription;
import spotify.simulation.clases.User;
import spotify.simulation.controller.RoleController;
import spotify.simulation.controller.SubscriptionController;
import spotify.simulation.controller.UserController;
import spotify.simulation.utilidades.ImagePanel;

public class ManageUsers extends javax.swing.JInternalFrame {

    private Subscription subscription;
    private Role role;
    private User user;
    private UserController userController;
    private SubscriptionController subscriptionController;
    private RoleController roleController;
    private List<Subscription> listSubscription;
    private List<Role> listRole;
    private List<User> listUser;
    private Map<Integer, Subscription> mapSubscription;
    private Map<Integer, Role> mapRole;

    public ManageUsers() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();

        //*****************************
        // Quitar bordes (incluso los invisibles o decorativos del LookAndFeel)
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        // *************
        //Diseño
        panelUsuarios.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelUsuarios.setBorderColor(Color.WHITE);
        panelUsuarios.setBorderThickness(3);
        panelUsuarios.setRoundTopLeft(50);
        panelUsuarios.setRoundTopRight(50);
        panelUsuarios.setRoundBottomRight(50);
        panelUsuarios.setRoundBottomLeft(50);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //*******
        // LOGICA
        subscription = new Subscription();
        role = new Role();
        user = new User();
        userController = new UserController();
        subscriptionController = new SubscriptionController();
        roleController = new RoleController();
        listSubscription = new ArrayList<>();
        listRole = new ArrayList<>();
        listUser = new ArrayList<>();
        mapSubscription = new HashMap<>();
        mapRole = new HashMap<>();
        this.llenarMapas();
        this.llenarCombos();
        this.llenarTabla();
    }

    public void llenarCombos() {
        DefaultComboBoxModel modelRole = new DefaultComboBoxModel<>();
        DefaultComboBoxModel modelSubscription = new DefaultComboBoxModel<>();

        listRole = roleController.getAllRoles();
        listSubscription = subscriptionController.getAllSubscriptions();

        int sizeRole = listRole.size();
        int sizeSubscription = listSubscription.size();

        modelRole.addElement("Seleccione un Rol");
        for (int i = 0; i < sizeRole; i++) {
            modelRole.addElement(listRole.get(i).getRoleName());
        }
        modelSubscription.addElement("Seleccione una Suscripción");
        for (int i = 0; i < sizeSubscription; i++) {
            modelSubscription.addElement(listSubscription.get(i).getSubscriptionName());
        }

        cmbRole.setModel(modelRole);
        cmbSuscripcion.setModel(modelSubscription);
    }

    public void llenarMapas() {
        for (Role r : roleController.getAllRoles()) {
            mapRole.put(r.getIdRole(), r);
        }

        for (Subscription s : subscriptionController.getAllSubscriptions()) {
            mapSubscription.put(s.getIdSubscription(), s);
        }
    }

    public void llenarTabla() {
        listUser = userController.getAllUsers();

        String[] textos = {"USUARIO", "TELEFONO", "CORREO", "SUSCRIPCIÓN", "ROL"};
        DefaultTableModel modelTable = new DefaultTableModel(textos, 0);

        for (User user1 : listUser) {
            Object[] obj = new Object[5];

            obj[0] = user1.getName();
            obj[1] = user1.getPhone();
            obj[2] = user1.getEmail();

            Role role = mapRole.get(user1.getRoleId());
            Subscription subscrip = mapSubscription.get(user1.getSubscriptionId());
            obj[3] = (role != null) ? role.getRoleName() : "Desconocido";
            obj[4] = (subscrip != null) ? subscrip.getSubscriptionName() : "Desconocido";

            modelTable.addRow(obj);
        }

        tablaSalida.setModel(modelTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuarios = new spotify.simulation.utilidades.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        round1 = new spotify.simulation.utilidades.Round();
        txtUsuario = new javax.swing.JTextField();
        round2 = new spotify.simulation.utilidades.Round();
        txtTelefono = new javax.swing.JTextField();
        round4 = new spotify.simulation.utilidades.Round();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbSuscripcion = new javax.swing.JComboBox<>();
        cmbRole = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        panelUsuarios.setBackground(new java.awt.Color(0, 102, 102));

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
        jLabel2.setText("USUARIOS");

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        round1.setBackground(new java.awt.Color(255, 255, 255));
        round1.setForeground(new java.awt.Color(255, 255, 255));
        round1.setRoundBottomLeft(30);
        round1.setRoundBottomRight(30);
        round1.setRoundTopLeft(30);
        round1.setRoundTopRight(30);

        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round1Layout = new javax.swing.GroupLayout(round1);
        round1.setLayout(round1Layout);
        round1Layout.setHorizontalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        round1Layout.setVerticalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round2.setBackground(new java.awt.Color(255, 255, 255));
        round2.setForeground(new java.awt.Color(255, 255, 255));
        round2.setRoundBottomLeft(30);
        round2.setRoundBottomRight(30);
        round2.setRoundTopLeft(30);
        round2.setRoundTopRight(30);

        txtTelefono.setBorder(null);

        javax.swing.GroupLayout round2Layout = new javax.swing.GroupLayout(round2);
        round2.setLayout(round2Layout);
        round2Layout.setHorizontalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        round2Layout.setVerticalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round4.setBackground(new java.awt.Color(255, 255, 255));
        round4.setForeground(new java.awt.Color(255, 255, 255));
        round4.setRoundBottomLeft(30);
        round4.setRoundBottomRight(30);
        round4.setRoundTopLeft(30);
        round4.setRoundTopRight(30);

        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round4Layout = new javax.swing.GroupLayout(round4);
        round4.setLayout(round4Layout);
        round4Layout.setHorizontalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        round4Layout.setVerticalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO ELECTRONICO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SUSCRIPCIÓN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ROL");

        cmbSuscripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1))))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                .addComponent(btnCerrar)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(75, 75, 75))))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbSuscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(round2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(round1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel7)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3))
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnCerrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(round3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(round1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(round2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSuscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = tablaSalida.getSelectedRow();

        if (index == -1 || user == null) {
            JOptionPane.showMessageDialog(panelUsuarios, "Seleccione un usuario de la tabla primero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(panelUsuarios,
                "¿Está seguro de que desea eliminar este usuario?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                userController.deleteUser(user.getId());
                JOptionPane.showMessageDialog(panelUsuarios, "Usuario eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();

                // Limpiar campos
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtUsuario.setText("");
                cmbRole.setSelectedIndex(0);
                cmbSuscripcion.setSelectedIndex(0);
                user = null;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(panelUsuarios, "Error al eliminar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        user = listUser.get(index);
        subscription = mapSubscription.get(user.getSubscriptionId());
        role = mapRole.get(user.getRoleId());

        txtUsuario.setText(user.getName());
        txtCorreo.setText(user.getEmail());
        txtTelefono.setText(user.getPhone());

        int indexRole = 0;
        int indexSubscription = 0;

        for (int i = 0; i < listRole.size(); i++) {
            if (listRole.get(i).getIdRole() == user.getRoleId()) {
                indexRole = i + 1;
                break;
            }
        }

        for (int i = 0; i < listSubscription.size(); i++) {
            if (listSubscription.get(i).getIdSubscription() == user.getSubscriptionId()) {
                indexSubscription = i + 1;
                break;
            }
        }

        cmbRole.setSelectedIndex(indexRole);
        cmbSuscripcion.setSelectedIndex(indexSubscription);
    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (user == null) {
            JOptionPane.showMessageDialog(panelUsuarios, "Seleccione un usuario de la tabla primero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nombre = txtUsuario.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txtTelefono.getText().trim();

        int indexRol = cmbRole.getSelectedIndex() - 1;
        int indexSuscripcion = cmbSuscripcion.getSelectedIndex() - 1;

        if (indexRol < 0 || indexRol >= listRole.size() || indexSuscripcion < 0 || indexSuscripcion >= listSubscription.size()) {
            JOptionPane.showMessageDialog(panelUsuarios, "Seleccione una suscripción y un rol válidos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idRol = listRole.get(indexRol).getIdRole();
        int idSuscripcion = listSubscription.get(indexSuscripcion).getIdSubscription();

        if (nombre != null && correo != null && telefono != null) {
            if (!nombre.isEmpty() && !correo.isEmpty() && !telefono.isEmpty()) {
                userController.updateUser(user.getId(), idSuscripcion, idRol, nombre, telefono, correo);
                JOptionPane.showMessageDialog(panelUsuarios, "Usuario creada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtUsuario.setText("");
                cmbRole.setSelectedIndex(0);
                cmbSuscripcion.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(panelUsuarios, "Los campos no pueden estar vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelUsuarios, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtUsuario.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txtTelefono.getText().trim();

        int indexRol = cmbRole.getSelectedIndex() - 1;
        int indexSuscripcion = cmbSuscripcion.getSelectedIndex() - 1;

        if (indexRol < 0 || indexRol >= listRole.size() || indexSuscripcion < 0 || indexSuscripcion >= listSubscription.size()) {
            JOptionPane.showMessageDialog(panelUsuarios, "Seleccione una suscripción y un rol válidos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (nombre != null && correo != null && telefono != null) {
            if (!nombre.isEmpty() && !correo.isEmpty() && !telefono.isEmpty()) {


                if (!correo.endsWith("@usantoto.edu.co")) {
                    JOptionPane.showMessageDialog(panelUsuarios, "El correo debe terminar con @usantoto.edu.co", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String parteUsuario = correo.substring(0, correo.indexOf("@"));


                if (!parteUsuario.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(panelUsuarios, "El nombre de usuario solo debe contener letras, sin números ni caracteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!nombre.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(panelUsuarios, "El nombre de usuario solo debe contener letras, sin números ni caracteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int idRol = listRole.get(indexRol).getIdRole();
                int idSuscripcion = listSubscription.get(indexSuscripcion).getIdSubscription();
                String contrasena = "1234";

                userController.addUser(idSuscripcion, idRol, nombre, telefono, correo, contrasena);

                JOptionPane.showMessageDialog(panelUsuarios, "Usuario creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTabla();

                txtCorreo.setText("");
                txtTelefono.setText("");
                txtUsuario.setText("");
                cmbRole.setSelectedIndex(0);
                cmbSuscripcion.setSelectedIndex(0);

            } else {
                JOptionPane.showMessageDialog(panelUsuarios, "Los campos no pueden estar vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelUsuarios, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbSuscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private spotify.simulation.utilidades.ImagePanel panelLogo2;
    private spotify.simulation.utilidades.PanelRound panelUsuarios;
    private spotify.simulation.utilidades.Round round1;
    private spotify.simulation.utilidades.Round round2;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round4;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
