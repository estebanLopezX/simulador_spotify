package spotify.simulation.forms;

import java.awt.Color;
import java.awt.Window;
import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Genere;
import spotify.simulation.clases.Artist;
import spotify.simulation.clases.SessionManager;
import spotify.simulation.clases.Song;
import spotify.simulation.clases.User;
import spotify.simulation.controller.ArtistController;
import spotify.simulation.controller.GenereController;
import spotify.simulation.controller.SongController;
import spotify.simulation.utilidades.ImagePanel;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
import spotify.simulation.clases.UserSong;
import spotify.simulation.controller.UserSongController;
import spotify.simulation.utilidades.AudioPlayer;

public class EspectadorAgregarMusica extends javax.swing.JPanel {

    private List<Song> listSong;
    private List<Artist> listArtist;
    private List<Genere> listGenere;
    private List<UserSong> listUserSong;
    private List<UserSong> listFavorite;

    private ArtistController artistController;
    private GenereController genereController;
    private SongController songController;
    private UserSongController userSongController;

    private Map<Integer, Artist> mapArtistas;
    private Map<Integer, Genere> mapGeneros;
    private Map<Integer, Song> mapSong;

    private Song objSong;
    private User user;

    private byte[] bytes;

    private Clip clip;
    private int pausePosition = 0;
    private boolean isPlaying = false;
    private int indexCombo = SessionManager.getIndexCombo();

    private DefaultTableModel listModel = new DefaultTableModel();

    public EspectadorAgregarMusica() {
        initComponents();

        if (panelStereo instanceof ImagePanel) {
            ((ImagePanel) panelStereo).setImage("/spotify/simulation/imagenes/stereo.png");
        }
        if (panelBuscar instanceof ImagePanel) {
            ((ImagePanel) panelBuscar).setImage("/spotify/simulation/imagenes/icon_agregar.png");
        }
        if (panelMas instanceof ImagePanel) {
            ((ImagePanel) panelMas).setImage("/spotify/simulation/imagenes/icon_mas.png");
        }
        if (panelPausar instanceof ImagePanel) {
            ((ImagePanel) panelPausar).setImage("/spotify/simulation/imagenes/icon_pausar.png");
        }
        if (panelList instanceof ImagePanel) {
            ((ImagePanel) panelList).setImage("/spotify/simulation/imagenes/icon_list.png");
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

        panelBoton1.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelBoton1.setBorderColor(Color.WHITE);
        panelBoton1.setBorderThickness(2);
        panelBoton1.setRoundTopLeft(30);
        panelBoton1.setRoundTopRight(30);
        panelBoton1.setRoundBottomRight(30);
        panelBoton1.setRoundBottomLeft(30);
        panelBtn2.setBackground(new java.awt.Color(119, 165, 139, 103));
        panelBtn2.setBorderColor(Color.WHITE);
        panelBtn2.setBorderThickness(2);
        panelBtn2.setRoundTopLeft(30);
        panelBtn2.setRoundTopRight(30);
        panelBtn2.setRoundBottomRight(30);
        panelBtn2.setRoundBottomLeft(30);
        panelBtn3.setBackground(new java.awt.Color(0, 66, 123, 103));
        panelBtn3.setBorderColor(Color.WHITE);
        panelBtn3.setBorderThickness(2);
        panelBtn3.setRoundTopLeft(30);
        panelBtn3.setRoundTopRight(30);
        panelBtn3.setRoundBottomRight(30);
        panelBtn3.setRoundBottomLeft(30);
        panelBtn4.setBackground(new java.awt.Color(200, 50, 50, 150)); // rojo suave con 150 de opacidad
        panelBtn4.setBorderColor(Color.WHITE);
        panelBtn4.setBorderThickness(2);
        panelBtn4.setRoundTopLeft(30);
        panelBtn4.setRoundTopRight(30);
        panelBtn4.setRoundBottomRight(30);
        panelBtn4.setRoundBottomLeft(30);

        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnPausar.setContentAreaFilled(false);
        btnPausar.setBorderPainted(false);
        btnPausar.setFocusPainted(false);
        btnMyList.setContentAreaFilled(false);
        btnMyList.setBorderPainted(false);
        btnMyList.setFocusPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusPainted(false);
        btnSalir.setContentAreaFilled(false);

        //************
        //LOGICA
        songController = new SongController();
        genereController = new GenereController();
        artistController = new ArtistController();
        userSongController = new UserSongController();
        listSong = songController.getAllSongs();
        listUserSong = userSongController.getAllUserSongs();
        listGenere = genereController.getAllGeneres();
        listArtist = artistController.getAllArtists();
        objSong = new Song();
        user = new User();
        listFavorite = new ArrayList<>();
        cmbTypeList.setSelectedIndex(SessionManager.getIndexCombo());
        this.inicializarMapas();
        this.llenarTablas();
        this.llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        panelStereo = new spotify.simulation.utilidades.ImagePanel();
        panelnput1 = new spotify.simulation.utilidades.PanelRound();
        txtArtista = new javax.swing.JLabel();
        panelnput2 = new spotify.simulation.utilidades.PanelRound();
        txtGenero = new javax.swing.JLabel();
        panelnput3 = new spotify.simulation.utilidades.PanelRound();
        txtTitulo = new javax.swing.JLabel();
        panelnput4 = new spotify.simulation.utilidades.PanelRound();
        txtDuracion = new javax.swing.JLabel();
        panelBoton1 = new spotify.simulation.utilidades.PanelRound();
        panelPausar = new spotify.simulation.utilidades.ImagePanel();
        btnPausar = new javax.swing.JButton();
        panelBtn2 = new spotify.simulation.utilidades.PanelRound();
        panelMas = new spotify.simulation.utilidades.ImagePanel();
        btnAgregar = new javax.swing.JButton();
        panelBtn4 = new spotify.simulation.utilidades.PanelRound();
        panelBuscar = new spotify.simulation.utilidades.ImagePanel();
        btnBuscar = new javax.swing.JButton();
        panelBtn3 = new spotify.simulation.utilidades.PanelRound();
        panelList = new spotify.simulation.utilidades.ImagePanel();
        btnMyList = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbTypeList = new javax.swing.JComboBox<>();
        txtNombreTabla = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 460));

        javax.swing.GroupLayout panelStereoLayout = new javax.swing.GroupLayout(panelStereo);
        panelStereo.setLayout(panelStereoLayout);
        panelStereoLayout.setHorizontalGroup(
            panelStereoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        panelStereoLayout.setVerticalGroup(
            panelStereoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(panelStereo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 100));

        panelnput1.setRoundBottomLeft(5);

        txtArtista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtArtista.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput1Layout = new javax.swing.GroupLayout(panelnput1);
        panelnput1.setLayout(panelnput1Layout);
        panelnput1Layout.setHorizontalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput1Layout.setVerticalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 190, 30));

        panelnput2.setRoundBottomLeft(5);

        txtGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput2Layout = new javax.swing.GroupLayout(panelnput2);
        panelnput2.setLayout(panelnput2Layout);
        panelnput2Layout.setHorizontalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput2Layout.setVerticalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        panelnput3.setRoundBottomLeft(5);

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput3Layout = new javax.swing.GroupLayout(panelnput3);
        panelnput3.setLayout(panelnput3Layout);
        panelnput3Layout.setHorizontalGroup(
            panelnput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput3Layout.setVerticalGroup(
            panelnput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        panelnput4.setRoundBottomLeft(5);

        txtDuracion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelnput4Layout = new javax.swing.GroupLayout(panelnput4);
        panelnput4.setLayout(panelnput4Layout);
        panelnput4Layout.setHorizontalGroup(
            panelnput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput4Layout.setVerticalGroup(
            panelnput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        javax.swing.GroupLayout panelPausarLayout = new javax.swing.GroupLayout(panelPausar);
        panelPausar.setLayout(panelPausarLayout);
        panelPausarLayout.setHorizontalGroup(
            panelPausarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        panelPausarLayout.setVerticalGroup(
            panelPausarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1Layout = new javax.swing.GroupLayout(panelBoton1);
        panelBoton1.setLayout(panelBoton1Layout);
        panelBoton1Layout.setHorizontalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoton1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelPausar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelBoton1Layout.setVerticalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panelPausar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnPausar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(panelBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 389, -1, 50));

        javax.swing.GroupLayout panelMasLayout = new javax.swing.GroupLayout(panelMas);
        panelMas.setLayout(panelMasLayout);
        panelMasLayout.setHorizontalGroup(
            panelMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        panelMasLayout.setVerticalGroup(
            panelMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtn2Layout = new javax.swing.GroupLayout(panelBtn2);
        panelBtn2.setLayout(panelBtn2Layout);
        panelBtn2Layout.setHorizontalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelBtn2Layout.setVerticalGroup(
            panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(panelBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 389, 55, -1));

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtn4Layout = new javax.swing.GroupLayout(panelBtn4);
        panelBtn4.setLayout(panelBtn4Layout);
        panelBtn4Layout.setHorizontalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn4Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBtn4Layout.setVerticalGroup(
            panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(panelBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBtn4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(panelBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 450, 50, 50));

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        btnMyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtn3Layout = new javax.swing.GroupLayout(panelBtn3);
        panelBtn3.setLayout(panelBtn3Layout);
        panelBtn3Layout.setHorizontalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMyList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panelBtn3Layout.setVerticalGroup(
            panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(panelBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnMyList, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(panelBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 450, -1, 50));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 10, 40, 40));

        cmbTypeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbTypeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 190, 30));

        txtNombreTabla.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtNombreTabla.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtNombreTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 320, 30));

        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 20, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Window ventana = SwingUtilities.getWindowAncestor(this);
        if (ventana != null) {
            ventana.dispose();
        }
        this.detenerAudio();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void reproducirCancion(byte[] audioBytes) {
        try {
            if (clip != null && clip.isOpen()) {
                clip.stop();
                clip.close();
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(audioBytes));
            clip = AudioSystem.getClip();
            clip.open(audioStream);

            AudioPlayer.setClip(clip); 

            clip.start();
            isPlaying = true;
            pausePosition = 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void llenarCombo() {
        DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();

        user = SessionManager.getCurrentUser();

        if (user.getSubscriptionId() == 1) {
            cmbTypeList.setEnabled(true);
        } else {
            cmbTypeList.setEnabled(false);
        }

        modelCombo.addElement("Lista Simple");
        modelCombo.addElement("Lista Doble");
        modelCombo.addElement("Lista Circular");
        modelCombo.addElement("Lista Doblemente Circular");

        cmbTypeList.setModel(modelCombo);
    }

    
    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        objSong = listSong.get(index);

        txtTitulo.setText("Título: " + objSong.getTitle());
        txtGenero.setText("Género: " + mapGeneros.get(objSong.getGenereId()).getGenereName());
        txtArtista.setText("Ártista: " + mapArtistas.get(objSong.getArtistId()).getArtistName());
        BigDecimal duracionDecimal = objSong.getDuration();
        String stringDuracion = String.valueOf(duracionDecimal);
        txtDuracion.setText(stringDuracion + " min");

        bytes = objSong.getFile();
        if (bytes == null || bytes.length == 0) {
            System.out.println("La canción seleccionada no tiene archivo asociado.");
        } else {
            reproducirCancion(bytes);
        }
    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void btnMyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyListActionPerformed
        String[] UserSongTextTable = {"TÍTULO", "ARTISTA", "DURACIÓN", "GENERO"};
        txtNombreTabla.setText("MI LISTA DE FAVORITOS");
        String typeTable = "favoritos";
        fillTable(UserSongTextTable, typeTable);
    }//GEN-LAST:event_btnMyListActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (AudioPlayer.isPaused()) {
            AudioPlayer.resume();
            btnPausar.setText("Pausar");
        } else if (AudioPlayer.isPlaying()) {
            AudioPlayer.pause();
            btnPausar.setText("Reanudar");
        }
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.llenarTablas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int index = tablaSalida.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Debe elejir una canción para agregarla.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        objSong = listSong.get(index);
        boolean userFound = false;
        for (UserSong userSong : listUserSong) {
            if (userSong.getSongId() == objSong.getIdSong() && userSong.getUserId() == user.getId()) {
                userFound = true;
                break;
            }
        }

        if (userFound) {
            JOptionPane.showMessageDialog(null, "Esta canción ya está en tu lista de reproducción.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            userSongController.addUserSong(objSong.getIdSong(), user.getId());
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente a tu lista de reproducción.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.llenarTablas();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SessionManager.setIndexCombo(cmbTypeList.getSelectedIndex());
        System.out.println(SessionManager.getIndexCombo());
    }//GEN-LAST:event_jButton1ActionPerformed

    public void fillTable(String[] textos, String typeTable) {
        listModel = new DefaultTableModel(textos, 0);
        if (typeTable == "buscar") {
            listUserSong = userSongController.getAllUserSongs();
            listSong = songController.getAllSongs();

            for (Song song : listSong) {
                Object[] obj = new Object[4];

                obj[0] = mapArtistas.get(song.getArtistId()).getArtistName();
                obj[1] = mapGeneros.get(song.getGenereId()).getGenereName();
                obj[2] = song.getTitle();
                obj[3] = song.getDuration();

                listModel.addRow(obj);
            }
        } else {
            listFavorite = userSongController.getUserSongsByUserId(user.getId());

            for (UserSong userSong : listFavorite) {
                Object[] obj = new Object[4];

                Song objSong = mapSong.get(userSong.getSongId());
                obj[0] = objSong.getTitle();
                obj[1] = mapArtistas.get(objSong.getArtistId()).getArtistName();
                obj[2] = objSong.getDuration();
                obj[3] = mapGeneros.get(objSong.getGenereId()).getGenereName();

                listModel.addRow(obj);
            }
        }
        tablaSalida.setModel(listModel);
    }

    public void detenerAudio() {
        AudioPlayer.stop();
    }

    private void inicializarMapas() {
        mapGeneros = new HashMap<>();
        for (Genere g : genereController.getAllGeneres()) {
            mapGeneros.put(g.getIdGenere(), g);
        }

        mapArtistas = new HashMap<>();
        for (Artist a : artistController.getAllArtists()) {
            mapArtistas.put(a.getIdArtist(), a);
        }

        mapSong = new HashMap<>();
        for (Song song : listSong) {
            mapSong.put(song.getIdSong(), song);
        }
    }

    public void llenarTablas() {
        String[] findSongsTable = {"ARTISTA", "GENERO", "TÍTULO", "DURACIÓN"};
        String typeTable = "buscar";
        txtNombreTabla.setText("AGREGA A TU LISTA");
        this.fillTable(findSongsTable, typeTable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMyList;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTypeList;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private spotify.simulation.utilidades.PanelRound panelBoton1;
    private spotify.simulation.utilidades.PanelRound panelBtn2;
    private spotify.simulation.utilidades.PanelRound panelBtn3;
    private spotify.simulation.utilidades.PanelRound panelBtn4;
    private spotify.simulation.utilidades.ImagePanel panelBuscar;
    private spotify.simulation.utilidades.ImagePanel panelList;
    private spotify.simulation.utilidades.ImagePanel panelMas;
    private spotify.simulation.utilidades.ImagePanel panelPausar;
    private spotify.simulation.utilidades.ImagePanel panelStereo;
    private spotify.simulation.utilidades.PanelRound panelnput1;
    private spotify.simulation.utilidades.PanelRound panelnput2;
    private spotify.simulation.utilidades.PanelRound panelnput3;
    private spotify.simulation.utilidades.PanelRound panelnput4;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JLabel txtArtista;
    private javax.swing.JLabel txtDuracion;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNombreTabla;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
