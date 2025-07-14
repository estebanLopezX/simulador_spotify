package spotify.simulation.forms;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import models.Genere;
import spotify.simulation.clases.Artist;
import spotify.simulation.clases.Song;
import spotify.simulation.controller.ArtistController;
import spotify.simulation.controller.GenereController;
import spotify.simulation.controller.SongController;
import spotify.simulation.utilidades.ImagePanel;

public class ManageSongs extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel modelCmbGenero = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelcmbArtist = new DefaultComboBoxModel();
    private List<Genere> listGenere;
    private List<Artist> listArtist;
    private List<Song> listSongs;
    private GenereController genereController;
    private ArtistController artistController;
    private SongController songController;
    private Genere objGenere;
    private Artist objArtist;
    private Song objSong;

    private byte[] fileChoose;
    private File archivoSeleccionado;

    private Map<Integer, Genere> mapGeneros;
    private Map<Integer, Artist> mapArtistas;

    public ManageSongs() {
        initComponents();

        //*****************************
        // Quitar bordes (incluso los invisibles o decorativos del LookAndFeel)
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        //**********************
        //Diseño
        panelSongs.setBackground(new java.awt.Color(0, 66, 123, 200));
        panelSongs.setBorderColor(Color.WHITE);
        panelSongs.setBorderThickness(3);
        panelSongs.setRoundTopLeft(50);
        panelSongs.setRoundTopRight(50);
        panelSongs.setRoundBottomRight(50);
        panelSongs.setRoundBottomLeft(50);

        if (panelLogo2 instanceof ImagePanel) {
            ((ImagePanel) panelLogo2).setImage("/spotify/simulation/imagenes/logo.png");
        }

        //*******************
        //Logica
        cmbGenero.setModel(modelCmbGenero);
        cmbArtista.setModel(modelcmbArtist);
        genereController = new GenereController();
        artistController = new ArtistController();
        songController = new SongController();
        listGenere = genereController.getAllGeneres();
        listArtist = artistController.getAllArtists();
        objGenere = new Genere();
        objArtist = new Artist();
        objSong = new Song();
        this.llenarCombo();
        this.inicializarMapas();
        this.llenarTabla();

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

    }

    public void llenarCombo() {
        int tamano = listGenere.size();

        modelCmbGenero.addElement("Seleccione un Genero");
        for (int i = 0; i < tamano; i++) {
            modelCmbGenero.addElement(listGenere.get(i).getGenereName());
        }

        modelcmbArtist.addElement("Seleccione un Artista");
        int tamanoArtist = listArtist.size();

        for (int i = 0; i < tamanoArtist; i++) {
            modelcmbArtist.addElement(listArtist.get(i).getArtistName());
        }
    }

    public void llenarTabla() {
        listSongs = songController.getAllSongs();

        String[] textos = {"TÍTULO", "DURACIÓN", "GÉNERO", "ÁRTISTA"};
        DefaultTableModel tablaModel = new DefaultTableModel(textos, 0);

        for (Song song : listSongs) {
            Object[] obj = new Object[4];

            obj[0] = song.getTitle();
            obj[1] = String.format("%.2f", song.getDuration());

            Genere genere = mapGeneros.get(song.getGenereId());
            Artist artista = mapArtistas.get(song.getArtistId());

            obj[2] = (genere != null) ? genere.getGenereName() : "Desconocido";
            obj[3] = (artista != null) ? artista.getArtistName() : "Desconocido";

            tablaModel.addRow(obj);
        }

        tablaSalida.setModel(tablaModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSongs = new spotify.simulation.utilidades.PanelRound();
        round3 = new spotify.simulation.utilidades.Round();
        panelLogo2 = new spotify.simulation.utilidades.ImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        round7 = new spotify.simulation.utilidades.Round();
        txtTitulo = new javax.swing.JTextField();
        round8 = new spotify.simulation.utilidades.Round();
        txtDuracion = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFileChoose = new javax.swing.JButton();
        cmbGenero = new javax.swing.JComboBox<>();
        cmbArtista = new javax.swing.JComboBox<>();

        panelSongs.setBackground(new java.awt.Color(0, 102, 102));

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
        jLabel2.setText("CANCIONES");

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

        txtTitulo.setBorder(null);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round7Layout = new javax.swing.GroupLayout(round7);
        round7.setLayout(round7Layout);
        round7Layout.setHorizontalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        round7Layout.setVerticalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        round8.setBackground(new java.awt.Color(255, 255, 255));
        round8.setForeground(new java.awt.Color(255, 255, 255));
        round8.setRoundBottomLeft(30);
        round8.setRoundBottomRight(30);
        round8.setRoundTopLeft(30);
        round8.setRoundTopRight(30);

        txtDuracion.setBorder(null);

        javax.swing.GroupLayout round8Layout = new javax.swing.GroupLayout(round8);
        round8.setLayout(round8Layout);
        round8Layout.setHorizontalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        round8Layout.setVerticalGroup(
            round8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ARCHIVO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ARTISTA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENERO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DURACIÓN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TITULO");

        btnFileChoose.setText("FILE CHOOSE");
        btnFileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooseActionPerformed(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSongsLayout = new javax.swing.GroupLayout(panelSongs);
        panelSongs.setLayout(panelSongsLayout);
        panelSongsLayout.setHorizontalGroup(
            panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSongsLayout.createSequentialGroup()
                .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel2))
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5))
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSongsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(14, 14, 14))
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel4))
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbArtista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(round8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(round7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFileChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel7))
                            .addGroup(panelSongsLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        panelSongsLayout.setVerticalGroup(
            panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSongsLayout.createSequentialGroup()
                .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSongsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(panelSongsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCerrar)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(round8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFileChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(panelSongs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSongs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaSalida.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelSongs, "Por favor, seleccione una canción de la lista.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        objSong = listSongs.get(filaSeleccionada);

        if (filaSeleccionada >= 0 && filaSeleccionada < listSongs.size()) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Confirma que desea eliminar esta canción?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                songController.deleteSong(objSong.getIdSong());
                JOptionPane.showMessageDialog(null, "La canción fue eliminada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                this.llenarTabla();
                listSongs = songController.getAllSongs();

                // Limpiar campos del formulario
                txtDuracion.setText("");
                txtTitulo.setText("");
                cmbArtista.setSelectedIndex(0);
                cmbGenero.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una canción válida para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (objSong == null) {
            JOptionPane.showMessageDialog(panelSongs, "Seleccione una canción de la tabla para poder actualizarla.", "Selección requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int indiceGenero = cmbGenero.getSelectedIndex() - 1;
        int indiceArtista = cmbArtista.getSelectedIndex() - 1;

        if (indiceGenero < 0 || indiceGenero >= listGenere.size() || indiceArtista < 0 || indiceArtista >= listArtist.size()) {
            JOptionPane.showMessageDialog(panelSongs, "Seleccione un género y un artista válidos.", "Selección inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        objGenere = listGenere.get(indiceGenero);
        objArtist = listArtist.get(indiceArtista);

        String tituloCancion = txtTitulo.getText();
        String duracionTexto = txtDuracion.getText();

        if (tituloCancion == null || duracionTexto == null || tituloCancion.trim().isEmpty() || duracionTexto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(panelSongs, "Todos los campos deben estar completos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            BigDecimal duracionNumerica = new BigDecimal(duracionTexto);

            // Se usa el archivo original almacenado en la canción
            byte[] archivoOriginal = objSong.getFile();

            songController.updateSong(
                    objSong.getIdSong(),
                    objGenere.getIdGenere(),
                    objArtist.getIdArtist(),
                    tituloCancion,
                    duracionNumerica,
                    archivoOriginal
            );

            JOptionPane.showMessageDialog(panelSongs, "La canción fue actualizada correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.llenarTabla();

            // Limpiar formulario
            txtTitulo.setText("");
            txtDuracion.setText("");
            cmbArtista.setSelectedIndex(0);
            cmbGenero.setSelectedIndex(0);
            fileChoose = null;
            objSong = null;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelSongs, "La duración ingresada no es válida. Debe ser un número.", "Duración inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnFileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileChooseActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de audio WAV", "wav");
        fileChooser.setFileFilter(filter);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivoSeleccionado = fileChooser.getSelectedFile();

            try {
                fileChoose = Files.readAllBytes(archivoSeleccionado.toPath());

                JOptionPane.showMessageDialog(this, "Archivo cargado: " + archivoSeleccionado.getName(),
                        "Carga exitosa", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selección cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFileChooseActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int indiceGenero = cmbGenero.getSelectedIndex() - 1;
        int indiceArtista = cmbArtista.getSelectedIndex() - 1;

        if (indiceGenero < 0 || indiceGenero >= listGenere.size() || indiceArtista < 0 || indiceArtista >= listArtist.size()) {
            JOptionPane.showMessageDialog(panelSongs, "Seleccione un género y un artista válidos.", "Selección inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        objGenere = listGenere.get(indiceGenero);
        objArtist = listArtist.get(indiceArtista);

        String tituloCancion = txtTitulo.getText();
        String duracionTexto = txtDuracion.getText();

        if (objGenere != null && objArtist != null && tituloCancion != null && duracionTexto != null && fileChoose != null) {
            if (!tituloCancion.trim().isEmpty() && !duracionTexto.trim().isEmpty()) {
                try {
                    BigDecimal duracionNumerica = new BigDecimal(duracionTexto);

                    songController.addSong(
                            objGenere.getIdGenere(),
                            objArtist.getIdArtist(),
                            tituloCancion,
                            duracionNumerica,
                            fileChoose
                    );

                    JOptionPane.showMessageDialog(panelSongs, "La canción ha sido registrada con éxito.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTabla();

                    // Limpiar campos
                    txtDuracion.setText("");
                    txtTitulo.setText("");
                    cmbArtista.setSelectedIndex(0);
                    cmbGenero.setSelectedIndex(0);
                    fileChoose = null;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panelSongs, "La duración ingresada no es válida. Use un valor numérico.", "Duración inválida", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(panelSongs, "Por favor, complete todos los campos obligatorios.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panelSongs, "Debe completar todos los campos antes de guardar la canción.", "Faltan datos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tablaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidaMouseClicked
        int index = tablaSalida.getSelectedRow();

        objSong = listSongs.get(index);
        objGenere = mapGeneros.get(objSong.getGenereId());
        objArtist = mapArtistas.get(objSong.getArtistId());

        txtTitulo.setText(objSong.getTitle());
        try {
            String duracion = String.valueOf(objSong.getDuration());
            txtDuracion.setText(duracion);
        } catch (Exception e) {
            System.out.println("Error de parseo big" + e);
        }

        int indexGenero = 0;
        for (int i = 0; i < listGenere.size(); i++) {
            if (listGenere.get(i).getIdGenere() == objGenere.getIdGenere()) {
                indexGenero = i + 1;
                break;
            }
        }

        int indexArtist = 0;
        for (int i = 0; i < listArtist.size(); i++) {
            if (listArtist.get(i).getIdArtist() == objArtist.getIdArtist()) {
                indexArtist = i + 1;
                break;
            }
        }

        cmbGenero.setSelectedIndex(indexGenero);
        cmbArtista.setSelectedIndex(indexArtist);

    }//GEN-LAST:event_tablaSalidaMouseClicked

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFileChoose;
    private javax.swing.JComboBox<String> cmbArtista;
    private javax.swing.JComboBox<String> cmbGenero;
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
    private spotify.simulation.utilidades.PanelRound panelSongs;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round7;
    private spotify.simulation.utilidades.Round round8;
    private javax.swing.JTable tablaSalida;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
