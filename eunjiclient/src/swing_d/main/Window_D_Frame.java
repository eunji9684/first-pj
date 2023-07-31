package swing_d.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

import swing_d.inter.Window_interface_D;

public class Window_D_Frame extends JFrame{

	public Window_D_Frame(){
		
		setUndecorated(swing_d.init.Window_Init.Frame_head);
		setBackground(new Color(255,255,255,255));
	}

}
