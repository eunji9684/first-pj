package swing_d.table.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_West_Add extends JPanel{
	
	public Window_D_Table_West_Add(int width, int height){		
		
		setPreferredSize(new Dimension(width,height));
		setOpaque(false);
		setBackground(new Color(0,0,0,0));
		
	}
}
   
