package swing_d.accountbook;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	
	 private String name;
	    private String price;
	    private String place;
	    private String important;
	    private String memo;


	public Labela(String text, int x , int y , int width, int height) {
		
		//setFont(new Font("Nanum Pen", Font.BOLD, 14));
		//setBackground(new Color(0xD7C0AE));
		setBounds(x, y, width, height);
		
		
		setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(new BorderLayout(10, 0));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridLayout(4, 1, 10, 10));
		setText(text);
		//setBounds(189, 25, 80, 35);
		setOpaque(true);
		setBackground(new Color(0xD7C0AE));
		setBorder(new BevelBorder(BevelBorder.RAISED));
		//setVisible(true);
		
		
		
	}
	
	public Labela(String text, int r, int g, int b, String name, String price, String place, String important, String memo) {
		super(text);
		this.name = name;
		this.price = price;
		this.place = place;
		this.important = important;
		this.memo = memo;
		
		setBackground(new Color(0xD7C0AE));
		setFont(new Font("Nanum Pen", Font.BOLD, 18));
		setVisible(true);
		setOpaque(true);
		
		// 클릭 이벤트 리스너 추가
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// InfoFrame 클래스 호출하여 정보 보여주기
				new InfoFrame(Labela.this.name, Labela.this.price, Labela.this.place, Labela.this.important, Labela.this.memo);
			}
		});
	}
	
	}


