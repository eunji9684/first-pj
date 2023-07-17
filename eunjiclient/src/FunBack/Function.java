package FunBack;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Function {
	
	ImageIcon funIcon1 = new ImageIcon("src/imgss/backg.png");
	ImageIcon funIcon2 = new ImageIcon("src/imgss/backg2.png");
	Image funimg1 = funIcon1.getImage();
	Image funimg2 = funIcon2.getImage();
	
	//1번째이미지
	int func1X = 0;
	
	//2번쨰 이미지
	int func2X = funimg2.getWidth(null);

	private JFrame frame;
	class MyPanel extends JPanel{
		public MyPanel() {
			setFocusable(true);
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					while(true) {
						
				
						
						func1X--;
						func2X--;
						
						if (func1X < - (funimg1.getWidth(null))) {
							func1X = funimg1.getWidth(null)-2;
							
						}
						if (func2X < - (funimg2.getWidth(null))) {
							func2X = funimg2.getWidth(null)-2;
							
						}
						
						repaint();
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
			
		}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);//캔버스 비워주는 메서드
			g.drawImage(funimg1, func1X,-1,this);//배경그리기
			g.drawImage(funimg2, func2X,0,this);//배경그리기
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function window = new Function();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Function() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1500,1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new MyPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}

}
