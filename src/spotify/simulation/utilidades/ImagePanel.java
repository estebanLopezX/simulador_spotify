package spotify.simulation.utilidades;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel() {
        setOpaque(false);
    }

    public void setImage(String imagePath) {
        // Cargar imagen desde recursos del proyecto
        java.net.URL imgURL = getClass().getResource(imagePath);
        if (imgURL != null) {
            image = new ImageIcon(imgURL).getImage();
        } else {
            System.err.println("No se encontró la imagen: " + imagePath);
        }
        repaint();
    }

    public void setImage(ImageIcon icon) {
        if (icon != null) {
            image = icon.getImage();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        super.paintComponent(g);
    }
}
