package movecomu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class IconMovement {
	private JFrame frame;
	private JPanel panel;
	private JLabel iconLabel;
	private Timer timer;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private Comudia comu;
	public QuoteEx quote;
	
	public IconMovement() {

		frame = new JFrame();
		frame.setSize(1500, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(226, 248, 248));
		panel.setLocation(0, 0);
		panel.setSize(1500, 961);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		ImageIcon icon = new ImageIcon(getClass().getResource("/img/코무니코1.png")); // Replace with the actual image file
																					// path

		quote = new QuoteEx();
		quote.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 40));
		quote.setHorizontalAlignment(SwingConstants.LEFT);

		quote.setBounds(101, 686, 1329, 152);
		//panel.add(quote);

		frame.setVisible(true);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(206, 235, 251));
		panel_1.setLayout(null);
		panel_1.setBounds(804, 323, 319, 300);
		panel.add(panel_1);

		RoundButton 회원가입 = new RoundButton("회원가입");
		회원가입.setBounds(12, 224, 88, 42);
		panel_1.add(회원가입);

		lblNewLabel = new JLabel("  아이디 : ");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Nanum Pen", Font.PLAIN, 26));

		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(243, 233, 233));
		lblNewLabel.setBounds(36, 52, 244, 42);
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(255, 128, 192)));
		textField.setBounds(114, 62, 150, 26);
		panel_1.add(textField);
		textField.setColumns(10);

		lblNewLabel_1 = new JLabel(" 패스워드 : ");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Nanum Pen", Font.PLAIN, 24));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(243, 233, 233));
		lblNewLabel_1.setBounds(36, 126, 244, 42);
		panel_1.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setSelectionColor(new Color(255, 128, 192));
		passwordField.setBounds(119, 136, 150, 26);
		panel_1.add(passwordField);

		RoundButton rndbtnLogin = new RoundButton("회원가입");
		rndbtnLogin.setText("LogIN");
		rndbtnLogin.setBounds(112, 224, 88, 42);
		panel_1.add(rndbtnLogin);

		RoundButton 취소 = new RoundButton("취소");

		취소.setBounds(212, 224, 88, 42);
		panel_1.add(취소);

		iconLabel = new JLabel();
		iconLabel.setBounds(0, 300, 300, 300);
		panel.add(iconLabel);
		iconLabel.setIcon(icon);

		comu = new Comudia();
		comu.setBackground(new Color(226, 248, 251));
		comu.setBounds(804, 105, 319, 208);
		panel.add(comu);

		frame.setVisible(true);

		int duration = 1500; // 이동 시간 (밀리초)
		int moveDistance = 200; // 이동 거리
		int speed = 2; // 이동 속도
		int x = 0; // 아이콘의 초기 x 위치
		int y = 300; // 아이콘의 초기 y 위치

		timer = new Timer(10, new ActionListener() {
			private long startTime = -1;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (startTime == -1) {
					startTime = System.currentTimeMillis();
				} else {
					long elapsedTime = System.currentTimeMillis() - startTime;

					if (elapsedTime >= duration) {
						timer.stop();
						return;
					}

					int currentX = (int) (speed * moveDistance * (elapsedTime / (double) duration)); // 현재 이동 거리 계산
					int x = currentX; // 현재 이동 거리를 x 위치로 설정

					iconLabel.setLocation(x, y);
					frame.repaint();
				}
			}
		});
	}

	public void startAnimation() {
		timer.start();
	}

	public static void main(String[] args) {
		IconMovement iconMovement = new IconMovement();
		iconMovement.startAnimation();
	}
}
