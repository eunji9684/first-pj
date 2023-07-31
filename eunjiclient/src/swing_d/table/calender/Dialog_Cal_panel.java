package swing_d.table.calender;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dialog_Cal_panel extends JPanel {

    int radius = 10; 
	public Dialog_Cal_panel(){
		
		setLayout(null);
		setBackground(new Color(0,0,0,1));
		setOpaque(false);
		
	}
	
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g;

        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graphics2d.setColor(new Color(142,192,248,180));
        graphics2d.fillRoundRect(0,0, getWidth() -1 ,getHeight() -1, radius, radius);
        
        graphics2d.dispose();
	}
}
	
