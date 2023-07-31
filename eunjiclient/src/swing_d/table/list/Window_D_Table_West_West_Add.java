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
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_West_West_Add extends JPanel{
	
	public Window_D_Table_West_West_Add(){		
		setBorder(new EmptyBorder(0,15,0,15));
		setOpaque(false);
		setLayout(null);
		//setPreferredSize(new Dimension(width,height));
		setBackground(new Color(0,0,0,255));
	}
}
   
