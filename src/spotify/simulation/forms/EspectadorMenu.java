package spotify.simulation.forms;

import spotify.simulation.utilidades.AudioPlayer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import spotify.simulation.clases.SessionManager;
import spotify.simulation.clases.UserSong;
import spotify.simulation.infrastructure.SimpleLinkedList;
import spotify.simulation.interfaces.Playlist;
import spotify.simulation.utilidades.FondoEspectador;
import spotify.simulation.utilidades.FondoPanel;
import spotify.simulation.utilidades.ImagePanel;

public class EspectadorMenu extends javax.swing.JFrame {

    private static javax.swing.JFrame ventanaEspectador = null;
    private javax.swing.JFrame ventanaAgregarMusica = null;
    private javax.swing.JFrame ventanaMusica = null;

    private Clip clip;

    public EspectadorMenu() {

        FondoEspectador fondo = new FondoEspectador();
        this.setContentPane(fondo); //Para llamar al fondo

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        panelcons.setBackground(new Color(144, 105, 103, 200));
        panelcons.setBorderColor(Color.WHITE);
        panelcons.setBorderThickness(3);
        panelcons.setRoundTopLeft(40);
        panelcons.setRoundTopRight(40);
        panelcons.setRoundBottomRight(40);
        panelcons.setRoundBottomLeft(40);

        btnUser.setContentAreaFilled(false);
        btnUser.setBorderPainted(false);
        btnUser.setFocusPainted(false);
        btnMusica.setContentAreaFilled(false);
        btnMusica.setBorderPainted(false);
        btnMusica.setFocusPainted(false);
        btnAudio.setContentAreaFilled(false);
        btnAudio.setBorderPainted(false);
        btnAudio.setFocusPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);

        if (panelUser instanceof ImagePanel) {
            ((ImagePanel) panelUser).setImage("/spotify/simulation/imagenes/icon_usuario.png");
        }
        if (panelMusica instanceof ImagePanel) {
            ((ImagePanel) panelMusica).setImage("/spotify/simulation/imagenes/musica_ingles.png");
        }
        if (panelAudio instanceof ImagePanel) {
            ((ImagePanel) panelAudio).setImage("/spotify/simulation/imagenes/icon_volumen.png");
        }
        if (panelAgregar instanceof ImagePanel) {
            ((ImagePanel) panelAgregar).setImage("/spotify/simulation/imagenes/icon_agregar.png");
        }
        if (panelSalir instanceof ImagePanel) {
            ((ImagePanel) panelSalir).setImage("/spotify/simulation/imagenes/icon_salir.png");
        }

        round2.setBackground(new Color(144, 105, 103, 50));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcons = new spotify.simulation.utilidades.PanelRound();
        round3 = new spotify.simulation.utilidades.Round();
        panelSalir = new spotify.simulation.utilidades.ImagePanel();
        btnSalir = new javax.swing.JButton();
        round4 = new spotify.simulation.utilidades.Round();
        panelAudio = new spotify.simulation.utilidades.ImagePanel();
        btnAudio = new javax.swing.JButton();
        round2 = new spotify.simulation.utilidades.Round();
        round6 = new spotify.simulation.utilidades.Round();
        panelAgregar = new spotify.simulation.utilidades.ImagePanel();
        btnAgregar = new javax.swing.JButton();
        round7 = new spotify.simulation.utilidades.Round();
        panelMusica = new spotify.simulation.utilidades.ImagePanel();
        btnMusica = new javax.swing.JButton();
        round5 = new spotify.simulation.utilidades.Round();
        panelUser = new spotify.simulation.utilidades.ImagePanel();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelcons.setBackground(new java.awt.Color(0, 102, 102));
        panelcons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        panelcons.setRoundBottomLeft(60);
        panelcons.setRoundBottomRight(60);
        panelcons.setRoundTopLeft(60);
        panelcons.setRoundTopRight(60);

        round3.setBackground(new java.awt.Color(255, 255, 255));
        round3.setRoundBottomLeft(50);
        round3.setRoundBottomRight(50);
        round3.setRoundTopLeft(50);
        round3.setRoundTopRight(50);

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText(".");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout round3Layout = new javax.swing.GroupLayout(round3);
        round3.setLayout(round3Layout);
        round3Layout.setHorizontalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        round3Layout.setVerticalGroup(
            round3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        round4.setBackground(new java.awt.Color(255, 255, 255));
        round4.setRoundBottomLeft(50);
        round4.setRoundBottomRight(50);
        round4.setRoundTopLeft(50);
        round4.setRoundTopRight(50);

        btnAudio.setForeground(new java.awt.Color(255, 255, 255));
        btnAudio.setText(".");
        btnAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAudioLayout = new javax.swing.GroupLayout(panelAudio);
        panelAudio.setLayout(panelAudioLayout);
        panelAudioLayout.setHorizontalGroup(
            panelAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAudioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAudioLayout.setVerticalGroup(
            panelAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAudio, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout round4Layout = new javax.swing.GroupLayout(round4);
        round4.setLayout(round4Layout);
        round4Layout.setHorizontalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        round4Layout.setVerticalGroup(
            round4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, round4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        round2.setRoundBottomLeft(50);
        round2.setRoundBottomRight(50);
        round2.setRoundTopLeft(50);
        round2.setRoundTopRight(50);

        javax.swing.GroupLayout round2Layout = new javax.swing.GroupLayout(round2);
        round2.setLayout(round2Layout);
        round2Layout.setHorizontalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        round2Layout.setVerticalGroup(
            round2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        round6.setBackground(new java.awt.Color(255, 255, 255));
        round6.setRoundBottomLeft(50);
        round6.setRoundBottomRight(50);
        round6.setRoundTopLeft(50);
        round6.setRoundTopRight(50);

        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText(".");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout round6Layout = new javax.swing.GroupLayout(round6);
        round6.setLayout(round6Layout);
        round6Layout.setHorizontalGroup(
            round6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        round6Layout.setVerticalGroup(
            round6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        round7.setBackground(new java.awt.Color(255, 255, 255));
        round7.setRoundBottomLeft(50);
        round7.setRoundBottomRight(50);
        round7.setRoundTopLeft(50);
        round7.setRoundTopRight(50);

        javax.swing.GroupLayout panelMusicaLayout = new javax.swing.GroupLayout(panelMusica);
        panelMusica.setLayout(panelMusicaLayout);
        panelMusicaLayout.setHorizontalGroup(
            panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        panelMusicaLayout.setVerticalGroup(
            panelMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        btnMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMusica.setText(".");
        btnMusica.setBorder(null);
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round7Layout = new javax.swing.GroupLayout(round7);
        round7.setLayout(round7Layout);
        round7Layout.setHorizontalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(round7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round7Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        round7Layout.setVerticalGroup(
            round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, round7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(round7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round7Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        round5.setBackground(new java.awt.Color(255, 255, 255));
        round5.setRoundBottomLeft(50);
        round5.setRoundBottomRight(50);
        round5.setRoundTopLeft(50);
        round5.setRoundTopRight(50);

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setText(".");
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout round5Layout = new javax.swing.GroupLayout(round5);
        round5.setLayout(round5Layout);
        round5Layout.setHorizontalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, round5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        round5Layout.setVerticalGroup(
            round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, round5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(round5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(round5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelconsLayout = new javax.swing.GroupLayout(panelcons);
        panelcons.setLayout(panelconsLayout);
        panelconsLayout.setHorizontalGroup(
            panelconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(round6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(round2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelconsLayout.createSequentialGroup()
                                .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelconsLayout.setVerticalGroup(
            panelconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelconsLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(round5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(round7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(round2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(round6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(round4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(round3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 748, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panelcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        if (ventanaEspectador == null || !ventanaEspectador.isDisplayable()) {
            ventanaEspectador = new javax.swing.JFrame("Inicio del Espectador");
            ventanaEspectador.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            ventanaEspectador.setSize(650, 520);
            ventanaEspectador.setUndecorated(true);
            ventanaEspectador.setShape(new RoundRectangle2D.Double(0, 0, ventanaEspectador.getWidth(), ventanaEspectador.getHeight(), 50, 50));
            ventanaEspectador.setBackground(new Color(0, 0, 0, 0));

            JPanel panelConBorde = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(new Color(144, 105, 103, 200));
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();
                    super.paintComponent(g);
                }

                @Override
                public Insets getInsets() {
                    return new Insets(5, 5, 5, 5);
                }
            };
            panelConBorde.setOpaque(false);
            panelConBorde.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 5, true));

            EspectadorInicio panel = new EspectadorInicio();
            panel.setOpaque(false);
            panelConBorde.add(panel, BorderLayout.CENTER);

            ventanaEspectador.setContentPane(panelConBorde);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - ventanaEspectador.getWidth()) / 2 + 25;
            int y = (screenSize.height - ventanaEspectador.getHeight()) / 2 - 25;
            ventanaEspectador.setLocation(x, y);

            ventanaEspectador.setVisible(true);
        } else {
            ventanaEspectador.toFront(); // Llevar la ventana al frente si ya existe
        }


    }//GEN-LAST:event_btnUserActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        if (ventanaMusica == null || !ventanaMusica.isDisplayable()) {
            ventanaMusica = new javax.swing.JFrame("Inicio del Espectador");
            ventanaMusica.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            ventanaMusica.setSize(250, 350);
            ventanaMusica.setUndecorated(true);
            ventanaMusica.setShape(new RoundRectangle2D.Double(0, 0, ventanaMusica.getWidth(), ventanaMusica.getHeight(), 50, 50));
            ventanaMusica.setBackground(new Color(0, 0, 0, 0));

            JPanel panelConBorde = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(new Color(144, 105, 103, 200));
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();
                    super.paintComponent(g);
                }

                @Override
                public Insets getInsets() {
                    return new Insets(5, 5, 5, 5);
                }
            };
            panelConBorde.setOpaque(false);
            panelConBorde.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 5, true));
            
            int indexCombo = SessionManager.getIndexCombo();
            EspectadorEscucharMusica panel = new EspectadorEscucharMusica(indexCombo);
            
            panel.setOpaque(false);
            panelConBorde.add(panel, BorderLayout.CENTER);

            ventanaMusica.setContentPane(panelConBorde);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - ventanaMusica.getWidth()) / 2 + 25;
            int y = (screenSize.height - ventanaMusica.getHeight()) / 2 - 25;
            ventanaMusica.setLocation(x, y);

            ventanaMusica.setVisible(true);
        } else {
            ventanaMusica.toFront();
        }

    }//GEN-LAST:event_btnMusicaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (SessionManager.isLoggedIn()) {
            SessionManager.login(null);
            SessionManager.logout();
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        } else {
            System.out.println("no logueado");
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    public int dateComboIndex(int combo){
        return combo;
    }
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (ventanaAgregarMusica == null || !ventanaAgregarMusica.isShowing()) {
            ventanaAgregarMusica = new javax.swing.JFrame("Inicio del Espectador");
            ventanaAgregarMusica.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            ventanaAgregarMusica.setSize(650, 520);
            ventanaAgregarMusica.setUndecorated(true);
            ventanaAgregarMusica.setShape(new RoundRectangle2D.Double(0, 0, ventanaAgregarMusica.getWidth(), ventanaAgregarMusica.getHeight(), 50, 50));
            ventanaAgregarMusica.setBackground(new Color(0, 0, 0, 0));

            JPanel panelConBorde = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(new Color(144, 105, 103, 200)); // rojo translúcido
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();
                    super.paintComponent(g);
                }

                @Override
                public Insets getInsets() {
                    return new Insets(5, 5, 5, 5);
                }
            };

            panelConBorde.setOpaque(false);
            panelConBorde.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 5, true));

            // Crea el panel y guarda referencia para el listener
            EspectadorAgregarMusica panel = new EspectadorAgregarMusica();
        
            panel.setOpaque(false);

            panelConBorde.add(panel, BorderLayout.CENTER);
            ventanaAgregarMusica.setContentPane(panelConBorde);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - ventanaAgregarMusica.getWidth()) / 2 + 25;
            int y = (screenSize.height - ventanaAgregarMusica.getHeight()) / 2 - 25;
            ventanaAgregarMusica.setLocation(x, y);

            // Listener para detener audio al cerrar ventana
            ventanaAgregarMusica.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    if (panel != null) {
                        panel.detenerAudio();
                    }
                }

                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    ventanaAgregarMusica = null;
                }
            });

            ventanaAgregarMusica.setVisible(true);

        } else {
            ventanaAgregarMusica.toFront();
            ventanaAgregarMusica.repaint();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioActionPerformed
        if (AudioPlayer.isMuted()) {
            System.out.println("Audio está muteado. Procediendo a desmutear...");
            AudioPlayer.unmute();
        } else {
            System.out.println("Audio está activo. Procediendo a mutear...");
            AudioPlayer.mute();
        }
    }//GEN-LAST:event_btnAudioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAudio;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUser;
    private spotify.simulation.utilidades.ImagePanel panelAgregar;
    private spotify.simulation.utilidades.ImagePanel panelAudio;
    private spotify.simulation.utilidades.ImagePanel panelMusica;
    private spotify.simulation.utilidades.ImagePanel panelSalir;
    private spotify.simulation.utilidades.ImagePanel panelUser;
    private spotify.simulation.utilidades.PanelRound panelcons;
    private spotify.simulation.utilidades.Round round2;
    private spotify.simulation.utilidades.Round round3;
    private spotify.simulation.utilidades.Round round4;
    private spotify.simulation.utilidades.Round round5;
    private spotify.simulation.utilidades.Round round6;
    private spotify.simulation.utilidades.Round round7;
    // End of variables declaration//GEN-END:variables
}
