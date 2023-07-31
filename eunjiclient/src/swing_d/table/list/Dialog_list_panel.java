package swing_d.table.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Dialog_list_panel extends JPanel {

    int radius = 10; 
	
	public Dialog_list_panel(){
		setLayout(new FlowLayout());
		setBackground(new Color(0,0,0,1));
		setOpaque(false);
		
		add(Window_interface_D.행추가하기);
		add(Window_interface_D.행삭제하기);
		add(Window_interface_D.열추가하기);
		add(Window_interface_D.열삭제하기);
		validate();
	};
	
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g;

        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        graphics2d.setColor(new Color(142,192,248,180));
        graphics2d.fillRoundRect(0,0, getWidth() -1 ,getHeight() -1, radius, radius);
        Window_interface_D.행추가하기.repaint();
        Window_interface_D.열추가하기.repaint();
        Window_interface_D.행삭제하기.repaint();
        Window_interface_D.열삭제하기.repaint();
        
        graphics2d.dispose();
	}
}
	
