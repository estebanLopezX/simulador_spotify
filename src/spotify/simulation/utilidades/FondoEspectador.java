package spotify.simulation.utilidades;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class FondoEspectador extends javax.swing.JPanel {

    
    public FondoEspectador() {
        initComponents();
    }

        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        java.net.URL imgURL = getClass().getResource("/spotify/simulation/imagenes/santoto_stereo_azul.png");

        Image imagen = new ImageIcon(imgURL).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
    }

    @Override
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(900, 650);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
