package comu;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	
	public class Comu extends JFrame {

		private static final long serialVersionUID = 1L;



		public Comu() {

			setLayout(null);

			JPanel jp = new JPanel();

			Icon ic = new ImageIcon("src/img/코무니코1.png");

			JLabel lbl = new JLabel(ic);

			jp.setBounds(0, 200, 300, 300);

			



			jp.add(lbl);



			// 패널추가

			add(jp);

			// 기본설정

			setTitle("코무움직이기");

			setBounds(100, 100, 1000, 1000);

			setVisible(true);

			setDefaultCloseOperation(EXIT_ON_CLOSE);



			String[] imgs = { "src/img/코무니코1.png","src/img/코무니코2.png","src/img/코무니코3.png","src/img/코무니코4.png"};



			int idx = 0;

			int pos = 5;

			while (true) {

				idx = idx + 1;

				try {



					Thread.sleep(1000);

					Icon icon1 = new ImageIcon("src/img/" + imgs[idx % imgs.length]);

					lbl.setIcon(icon1);

					int x = jp.getX();

					int y = jp.getY();

					System.out.println(y);

					if(x<5) {

					pos=-5;

					}else if (x>450) {

						pos = 5;

					}

					jp.setLocation(x+pos , y);

				} catch (InterruptedException e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

				}



			}



		}

		public static void main(String[] args) {
			new Comu();
		}

	}


	

		
	
	

