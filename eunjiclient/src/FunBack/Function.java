package FunBack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Function {

	ImageIcon funIcon1 = new ImageIcon("src/img/backg.png");
	ImageIcon funIcon2 = new ImageIcon("src/img/backg2.png");
	Image funimg1 = funIcon1.getImage();
	Image funimg2 = funIcon2.getImage();

	  List<ImageInfo> imageList = new ArrayList<>();
	  
	  

	// 1번째이미지
	int func1X = 0;

	// 2번쨰 이미지
	int func2X = funimg2.getWidth(null);

	private JFrame frame;

	class MyPanel extends JPanel {
		public MyPanel() {
			setFocusable(true);
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {

						func1X--;
						func2X--;

						if (func1X < -(funimg1.getWidth(null))) {
							func1X = funimg1.getWidth(null) - 2;

						}
						if (func2X < -(funimg2.getWidth(null))) {
							func2X = funimg2.getWidth(null) - 2;

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
			super.paintComponent(g);// 캔버스 비워주는 메서드
			g.drawImage(funimg1, func1X, -1, this);// 배경그리기
			g.drawImage(funimg2, func2X, 0, this);// 배경그리기
			
			  // 이미지 리스트에 있는 이미지들 그리기
            for (ImageInfo imageInfo : imageList) {
                Image img = new ImageIcon(imageInfo.getImageName()).getImage();
                g.drawImage(img, imageInfo.getX(), imageInfo.getY(), this);
            }
            
            Font font = new Font("Nanum Pen", Font.BOLD, 70);
            g.setColor(new Color(0x8f4646));
            g.setFont(font);
            g.drawString("Function First Project", 250, 250);
            Font font1 = new Font("Nanum Pen", Font.BOLD, 70);
            g.setFont(font1);
            g.setColor(new Color(0xcd5c5c));
            g.drawString("Diary Program Making", 550, 400);
            

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
		frame.setSize(1500, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new MyPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// 이미지 파일 이름을 리스트에 추가
		imageList.add(new ImageInfo("src/img/구름1.png", 100, 450));
		imageList.add(new ImageInfo("src/img/구름2.png", 400, 530));
		imageList.add(new ImageInfo("src/img/구름3.png", 700, 550));
		imageList.add(new ImageInfo("src/img/구름4.png", 1000, 500));
	}

}
