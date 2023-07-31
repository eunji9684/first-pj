package swing_d.table.calender;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

	public class CalendarMain extends JPanel implements MouseListener{
		
		public int 행;
		public int 열;
		public int x_location;
		public int y_location;
		public int width;
		public int height;
		public String a;
		public float font_size;
		public String type;
		
		JPanel panel1 = new JPanel();
		CalendarBackground panel2 = new CalendarBackground();
		JPanel panel3 = new JPanel();
		
		JLabel labelBefore = new JLabel("Before");
		JLabel labelAfter = new JLabel("After");
		
		
		public JLabel topLabel = new JLabel("00년" + " " +  "0월");
		
		JLabel[] labels = new JLabel[49];
		String[] dayName = {"일", "월", "화", "수", "목", "금", "토"};
		
		CalendarFunction cf = new CalendarFunction();
		
		
		public CalendarMain() {
			setSize(600, 550);
			setLocation(90, 150);
			setLayout(new BorderLayout());
			setBackground(new Color(142,180,80,255));
			
			init();
			
			panel1.setBackground(new Color(142,180,80,180));
			panel2.setBackground(new Color(142,180,80,180));
			
			add(panel1, BorderLayout.NORTH);
			add(panel2, BorderLayout.CENTER);
			
			start();
		}
		private void init() {
			
			Font font = new Font("Nanum Pen",Font.BOLD,16);
			GridBagLayout gridBagLayout = new GridBagLayout();
			panel1.setLayout(gridBagLayout);
			
			
			
			//폰트 및 텍스트 적용
			labelBefore.setFont(font);
			labelAfter.setFont(font);
			
			topLabel.setFont(new Font("Nanum Pen", Font.BOLD, 20));
			topLabel.setText(cf.getCalText());
			
			//간격 조절 초기화
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.WEST;
			gbc.insets = new Insets(10, 10, 10, 10);//여백
		
			
			//거리조절및 add
			panel1.add(labelBefore, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.insets = new Insets(10, 10, 10, 10);
			panel1.add(labelAfter, gbc);
		
			gbc.gridx = 2;
			gbc.gridy = 0;
			gbc.insets = new Insets(5, 5, 5, 5);
			panel1.add(topLabel, gbc);

			panel2.setLayout(new GridLayout(7, 7, 5, 5));
			
		
			for(int i = 0; i < labels.length; i++) {
				labels[i] = new Label();
				labels[i].setBorder(new EtchedBorder());
				labels[i].setHorizontalAlignment(SwingConstants.CENTER);
				
				panel2. add(labels[i]);
				
				
				
				labels[i].setFont(new Font("Nanum Pen", Font.BOLD, 12));
				if(i < 7) labels[i].setText(dayName[i]);
				
				if(i%7 == 0) labels[i].setForeground(Color.red);
				if(i%7 == 6) labels[i].setForeground(Color.blue);
				
			}
			
			gbc.gridx = 0;
			gbc.gridy = 0;

			
			cf.setLabel(labels);
			cf.calSet();
			
			
			
		}
		private void start() {
			labelAfter.addMouseListener(this);
			labelBefore.addMouseListener(this);
			
		}
		
		
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			int gap = 0;
			if(e.getSource() == labelAfter) {
				gap = 1;
			}else if(e.getSource() == labelBefore){
				gap = -1;
			}
			cf.allInit(gap);
			topLabel.setText(cf.getCalText());
			
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {}
		
		
		
	}


