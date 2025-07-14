package spotify.simulation.utilidades;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

public class PanelRound extends JPanel {

    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    private Color borderColor = Color.BLACK;
    private int borderThickness = 0;

    public PanelRound() {
        setOpaque(false);
    }

    // Getters y setters
    public void setRoundTopLeft(int round) { roundTopLeft = round; repaint(); }
    public void setRoundTopRight(int round) { roundTopRight = round; repaint(); }
    public void setRoundBottomLeft(int round) { roundBottomLeft = round; repaint(); }
    public void setRoundBottomRight(int round) { roundBottomRight = round; repaint(); }

    public void setBorderColor(Color color) { borderColor = color; repaint(); }
    public void setBorderThickness(int thickness) { borderThickness = thickness; repaint(); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ¡IMPORTANTE! Pinta hijos como botones correctamente

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        Shape roundShape = createRoundedShape(width, height);

        // Pintar fondo
        g2.setColor(getBackground());
        g2.fill(roundShape);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        if (borderThickness > 0) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(borderThickness));
            g2.setColor(borderColor);

            int width = getWidth();
            int height = getHeight();

            Shape borderShape = createRoundedShape(width - borderThickness, height - borderThickness);
            g2.translate(borderThickness / 2.0, borderThickness / 2.0); // Evitar que el borde se pinte fuera
            g2.draw(borderShape);
            g2.dispose();
        }
    }

    private Shape createRoundedShape(int width, int height) {
        float arcTL = roundTopLeft;
        float arcTR = roundTopRight;
        float arcBR = roundBottomRight;
        float arcBL = roundBottomLeft;

        // Usa un GeneralPath para esquinas independientes
        Path2D.Float path = new Path2D.Float();
        path.moveTo(arcTL, 0);
        path.lineTo(width - arcTR, 0);
        path.quadTo(width, 0, width, arcTR);
        path.lineTo(width, height - arcBR);
        path.quadTo(width, height, width - arcBR, height);
        path.lineTo(arcBL, height);
        path.quadTo(0, height, 0, height - arcBL);
        path.lineTo(0, arcTL);
        path.quadTo(0, 0, arcTL, 0);
        path.closePath();

        return path;
    }
}
