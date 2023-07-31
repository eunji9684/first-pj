package swing_d.table.calender;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarBackground extends JPanel{
	
	private Image backgroundImage;
	
	
	public CalendarBackground() {
		Dimension size = new Dimension(500, 500);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
	
	
	
	}	
}
