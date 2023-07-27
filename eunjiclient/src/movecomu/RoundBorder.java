package movecomu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

class RoundBorder extends AbstractBorder {
    private final Color borderColor;
    private final int arc;

    public RoundBorder(Color borderColor, int arc) {
        this.borderColor = new Color(0xB9EEFF);
        this.arc = arc;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics g2 = g.create();
        ((java.awt.Graphics2D) g2).setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        ((Graphics2D) g2).draw(new RoundRectangle2D.Double(x+2, y+2, width - 4, height -4, arc, arc));
        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(arc, arc, arc, arc);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = arc;
        return insets;
    }
    
}

