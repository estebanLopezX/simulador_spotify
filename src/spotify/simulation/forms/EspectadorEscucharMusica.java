package spotify.simulation.forms;

import java.awt.Color;
import java.awt.Window;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import spotify.simulation.clases.Artist;
import spotify.simulation.clases.SessionManager;
import spotify.simulation.clases.Song;
import spotify.simulation.clases.User;
import spotify.simulation.clases.UserSong;
import spotify.simulation.controller.ArtistController;
import spotify.simulation.controller.SongController;
import spotify.simulation.controller.UserSongController;
import spotify.simulation.infrastructure.CircularLinkedList;
import spotify.simulation.infrastructure.DoublyCircularLinkedList;
import spotify.simulation.infrastructure.DoublyLinkendList;
import spotify.simulation.infrastructure.SimpleLinkedList;
import spotify.simulation.interfaces.Playlist;
import spotify.simulation.utilidades.ImagePanel;

public class EspectadorEscucharMusica extends javax.swing.JPanel {

    private Playlist<UserSong> playList;
    private Clip clip;
    private boolean isPlaying = false;

    private SongController songController;
    private ArtistController artistController;

    private List<Song> listSong;
    private Map<Integer, Song> mapSong;

    private List<UserSong> listUserSong;
    private UserSongController userSongController;

    private Map<Integer, Artist> mapArtista;
    private List<Artist> listArtist;

    private User user;
    private int indexCombo;

    public EspectadorEscucharMusica(int indexCombo) {
        initComponents();

        if (panelStereo instanceof ImagePanel) {
            ((ImagePanel) panelStereo).setImage("/spotify/simulation/imagenes/stereo.png");
        }
        if (panelPausar instanceof ImagePanel) {
            ((ImagePanel) panelPausar).setImage("/spotify/simulation/imagenes/icon_pausar_despausar.png");
        }
        if (panelAnterior instanceof ImagePanel) {
            ((ImagePanel) panelAnterior).setImage("/spotify/simulation/imagenes/icon_anterior.png");
        }
        if (panelSiguiente instanceof ImagePanel) {
            ((ImagePanel) panelSiguiente).setImage("/spotify/simulation/imagenes/icon_siguiente.png");
        }
        panelnput1.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput1.setBorderColor(Color.WHITE);
        panelnput1.setBorderThickness(2);
        panelnput1.setRoundTopLeft(15);
        panelnput1.setRoundTopRight(15);
        panelnput1.setRoundBottomRight(15);
        panelnput1.setRoundBottomLeft(15);
        panelnput2.setBackground(new java.awt.Color(255, 255, 255, 103));
        panelnput2.setBorderColor(Color.WHITE);
        panelnput2.setBorderThickness(2);
        panelnput2.setRoundTopLeft(15);
        panelnput2.setRoundTopRight(15);
        panelnput2.setRoundBottomRight(15);
        panelnput2.setRoundBottomLeft(15);

        btnSalir.setContentAreaFilled(false);

        // *********
        //Logica
        this.indexCombo = indexCombo;
        user = SessionManager.getCurrentUser();
        songController = new SongController();
        userSongController = new UserSongController();
        artistController = new ArtistController();
        listUserSong = userSongController.getUserSongsByUserId(user.getId());
        listSong = songController.getAllSongs();
        listArtist = artistController.getAllArtists();

        this.fillMaps();
        this.typeList();
        this.playCurrent();
    }

    private void typeList() {
        if (indexCombo % 2 == 0) {
            btnPrevios.setEnabled(false);
        } else {
            btnPrevios.setEnabled(true);
        }
        switch (indexCombo) {
            case 0:
                playList = new SimpleLinkedList<>();
                break;
            case 1:
                playList = new DoublyLinkendList<>();
                break;
            case 2:
                playList = new CircularLinkedList<>();
                break;
            case 3:
                playList = new DoublyCircularLinkedList<>();
                break;
            default:
                throw new AssertionError();
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            for (UserSong userSong : listUserSong) {
                playList.addItem(userSong);
            }
        }

        long endTime = System.nanoTime();
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tiempo transcurrido: " + durationInSeconds + " segundos");
    }

    public void fillMaps() {
        mapSong = new HashMap<>();

        for (Song song : listSong) {
            mapSong.put(song.getIdSong(), song);
        }

        mapArtista = new HashMap<>();

        for (Artist artist : listArtist) {
            mapArtista.put(artist.getIdArtist(), artist);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelStereo = new spotify.simulation.utilidades.ImagePanel();
        panelnput1 = new spotify.simulation.utilidades.PanelRound();
        txtTitulo = new javax.swing.JTextField();
        panelnput2 = new spotify.simulation.utilidades.PanelRound();
        txtArtista = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        panelAnterior = new spotify.simulation.utilidades.ImagePanel();
        btnPrevios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelSiguiente = new spotify.simulation.utilidades.ImagePanel();
        btnNext = new javax.swing.JButton();
        round1 = new spotify.simulation.utilidades.Round();
        panelPausar = new spotify.simulation.utilidades.ImagePanel();
        btnPlayPause = new javax.swing.JButton();
        lblDuracion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(panelStereo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 34, 110, 100));

        panelnput1.setRoundBottomLeft(5);

        javax.swing.GroupLayout panelnput1Layout = new javax.swing.GroupLayout(panelnput1);
        panelnput1.setLayout(panelnput1Layout);
        panelnput1Layout.setHorizontalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput1Layout.setVerticalGroup(
            panelnput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 30));

        panelnput2.setRoundBottomLeft(5);

        javax.swing.GroupLayout panelnput2Layout = new javax.swing.GroupLayout(panelnput2);
        panelnput2.setLayout(panelnput2Layout);
        panelnput2Layout.setHorizontalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnput2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelnput2Layout.setVerticalGroup(
            panelnput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(panelnput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout panelAnteriorLayout = new javax.swing.GroupLayout(panelAnterior);
        panelAnterior.setLayout(panelAnteriorLayout);
        panelAnteriorLayout.setHorizontalGroup(
            panelAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        panelAnteriorLayout.setVerticalGroup(
            panelAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        btnPrevios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnPrevios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(btnPrevios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout panelSiguienteLayout = new javax.swing.GroupLayout(panelSiguiente);
        panelSiguiente.setLayout(panelSiguienteLayout);
        panelSiguienteLayout.setHorizontalGroup(
            panelSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        panelSiguienteLayout.setVerticalGroup(
            panelSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 40, 40));

        round1.setBackground(new java.awt.Color(255, 255, 255));
        round1.setRoundBottomLeft(45);
        round1.setRoundBottomRight(45);
        round1.setRoundTopLeft(45);
        round1.setRoundTopRight(45);

        javax.swing.GroupLayout panelPausarLayout = new javax.swing.GroupLayout(panelPausar);
        panelPausar.setLayout(panelPausarLayout);
        panelPausarLayout.setHorizontalGroup(
            panelPausarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        panelPausarLayout.setVerticalGroup(
            panelPausarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnPlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPauseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round1Layout = new javax.swing.GroupLayout(round1);
        round1.setLayout(round1Layout);
        round1Layout.setHorizontalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        round1Layout.setVerticalGroup(
            round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(round1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(btnPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        add(round1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 40, 40));

        lblDuracion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("DURACION:");
        add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 40, 40));

        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 20, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Window ventana = SwingUtilities.getWindowAncestor(this);
        if (ventana != null) {
            ventana.dispose();
            stopClip();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        stopClip();
        playList.nextItem();
        playCurrent();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviosActionPerformed
        stopClip();
        playList.previousItem();
        playCurrent();
    }//GEN-LAST:event_btnPreviosActionPerformed

    private void stopClip() {
        if (clip != null) {
            clip.stop();
            clip.close();
            isPlaying = false;
            btnPlayPause.setText("Reproducir");
        }
    }

    private void playCurrent() {
        UserSong currentSong = playList.getCurrentItem();
        if (currentSong == null) {
            return;
        }

        Song song = mapSong.get(currentSong.getSongId());
        Artist artist = mapArtista.get(song.getArtistId());

        byte[] audioData = song.getFile();
        txtTitulo.setText(song.getTitle());
        txtArtista.setText(artist.getArtistName());
        lblDuracion.setText("DURACIÓN: " + song.getDuration());

        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(audioData);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(byteArrayInputStream);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            isPlaying = true;
            btnPlayPause.setText("Pausar");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reproduciendo audio: " + ex.getMessage());
        }
    }

    private void btnPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPauseActionPerformed
        if (isPlaying) {
            this.pause();
        }
    }//GEN-LAST:event_btnPlayPauseActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        playList.removeCurrentItem();
        JOptionPane.showMessageDialog(null, "Eliminado Satifactoriamente",
                "Operación Satisfactoria", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pause() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            isPlaying = false;
            btnPlayPause.setText("Reproducir");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPlayPause;
    private javax.swing.JButton btnPrevios;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDuracion;
    private spotify.simulation.utilidades.ImagePanel panelAnterior;
    private spotify.simulation.utilidades.ImagePanel panelPausar;
    private spotify.simulation.utilidades.ImagePanel panelSiguiente;
    private spotify.simulation.utilidades.ImagePanel panelStereo;
    private spotify.simulation.utilidades.PanelRound panelnput1;
    private spotify.simulation.utilidades.PanelRound panelnput2;
    private spotify.simulation.utilidades.Round round1;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
