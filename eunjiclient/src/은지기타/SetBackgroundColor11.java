package 은지기타;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class SetBackgroundColor11 extends JFrame implements AdjustmentListener {
	
	JPanel west = new JPanel(new GridLayout(4, 2));
	JPanel center = new JPanel(new GridLayout(4, 0));
	JPanel south = new JPanel();
	
	 JPanel transparentPanel = new JPanel() {
	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            // 캔버스 배경색 그리기
	            g.setColor(new Color(redScrollBar_value, greenScrollBar_value, blueScrollBar_value, alphaScrollBar_value));
	            g.fillRect(0, 0, getWidth(), getHeight());
	        }
	    };

	

	// 스크롤 생성시 방향, 초기값
	JScrollBar redScrollBar = new JScrollBar(0, 45, 0, 0, 255);
	JScrollBar greenScrollBar = new JScrollBar(0, 34, 0, 0, 255);
	JScrollBar blueScrollBar = new JScrollBar(0, 86, 0, 0, 255);
	JScrollBar alphaScrollBar = new JScrollBar(0, 255, 0, 0, 255);

	JTextField red = new JTextField();
	JTextField green = new JTextField();
	JTextField blue = new JTextField();
	JTextField alpha = new JTextField();
	

	int redScrollBar_value = redScrollBar.getValue();
	int greenScrollBar_value = greenScrollBar.getValue();
	int blueScrollBar_value = blueScrollBar.getValue();
	int alphaScrollBar_value = alphaScrollBar.getValue();

	Canvas can = new Canvas();

	public SetBackgroundColor11() {
		super("SetBackgroundColor");
		red.setText("" + redScrollBar_value);
		green.setText("" + greenScrollBar_value);
		blue.setText("" + blueScrollBar_value);
		alpha.setText("" + alphaScrollBar_value);
		
		west.add(new Label("RED"));
		west.add(red);
		west.add(new Label("GREEN"));
		west.add(green);
		west.add(new Label("BLUE"));
		west.add(blue);
		west.add(new Label("alpha"));
		west.add(alpha);
		
		center.add(redScrollBar);
		center.add(greenScrollBar);
		center.add(blueScrollBar);
		center.add(alphaScrollBar);
		
	    // 캔버스 설정
	    //can.setSize(100, 100);
	    //updateCanvasBackground();
	    //can.setVisible(true);

		
	    // 캔버스 위에 투명한 패널 배치
	    transparentPanel.setOpaque(false);
	    transparentPanel.setPreferredSize(new Dimension(100, 100));
	    south.add(transparentPanel);
		south.add(can);

		// 메인 프레임 넣어주기
		getContentPane().add(west, "West");
		getContentPane().add(center, "Center");
		getContentPane().add(south, "South");

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		redScrollBar.addAdjustmentListener(this);
		greenScrollBar.addAdjustmentListener(this);
		blueScrollBar.addAdjustmentListener(this);
		alphaScrollBar.addAdjustmentListener(this);
		
		
		   // 새로운 라벨 생성
        JLabel lblLabel = new JLabel("label");
        lblLabel.setForeground(Color.BLUE);

        south.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 20));

       
        south.add(lblLabel);

	}

	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == redScrollBar) {
			red.setText(Integer.toString(e.getValue()));
			redScrollBar_value = e.getValue();
		} else if (e.getSource() == greenScrollBar) {
			green.setText(Integer.toString(e.getValue()));
			greenScrollBar_value = e.getValue();
		} else if (e.getSource() == blueScrollBar) {
			blue.setText(Integer.toString(e.getValue()));
			blueScrollBar_value = e.getValue();
		} else if(e.getSource() == alphaScrollBar) {
			alpha.setText(Integer.toString(e.getValue()));
			alphaScrollBar_value = e.getValue();
		}
		
		updateCanvasBackground();
		 // 캔버스 색 업데이트
        transparentPanel.repaint();
	}

	private void updateCanvasBackground() {
		can.setBackground(new Color(redScrollBar_value, greenScrollBar_value, blueScrollBar_value, alphaScrollBar_value));
	}

	public static void main(String[] args) {
		new SetBackgroundColor11();
	}

}
