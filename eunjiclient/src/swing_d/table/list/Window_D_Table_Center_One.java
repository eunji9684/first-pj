package swing_d.table.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import swing_d.inter.Window_interface_D;

public class Window_D_Table_Center_One extends JPanel {
	
	public Window_D_Table_Center_One(boolean add){		
		
		setOpaque(false); // 배경을 투명하게 설정
		setLayout(new BorderLayout());
		setBackground(new Color(255,255,255,0));
		
		if(add) {
			JLabel a = new JLabel();
			JLabel b = new JLabel();
			JLabel d = new JLabel();
			
			b.setOpaque(false);
			d.setOpaque(false);
			a.setOpaque(false);
			
			b.setPreferredSize(new Dimension(15,0));
			d.setPreferredSize(new Dimension(0,10));
			a.setPreferredSize(new Dimension(15,0));
			
			add(a, BorderLayout.EAST);
			add(b, BorderLayout.WEST);
			add(d, BorderLayout.SOUTH);	
		}
		
		
		addMouseListener(new MouseAdapter() {
			 public void mousePressed(MouseEvent e) {
				 
					Window_interface_D.dialog_행_열_add.dispose();
		        	Window_interface_D.dialog_text.dispose();
			 }	
			}
		);
		
	}
}
   
