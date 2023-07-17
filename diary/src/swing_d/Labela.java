package swing_d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Labela extends JLabel{
	String text;
	private Labela la1_4_1;
	
	public Labela(String text) {
		setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(new BorderLayout(10, 0));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(4, 1, 10, 10));
		setText(text);
		//setBounds(189, 25, 80, 35);
		setOpaque(true);
		setBackground(new Color(255,241,241,255));
		setBorder(new BevelBorder(BevelBorder.RAISED));
		//setVisible(true);
		
	}
	}


