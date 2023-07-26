package serverpj_ex1.dbconect;

// 수정된 MainFrame 클래스

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {
	// Panel
	JPanel basePanel = new JPanel(new BorderLayout());
	JPanel centerPanel = new JPanel();
	JPanel westPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel southPanel = new JPanel();

	// Label
	JLabel idL = new JLabel("아이디");
	JLabel pwL = new JLabel("비밀번호");
	JLabel EmailL = new JLabel("email");
	JLabel telL = new JLabel("전화번호");

	// TextField
	public JTextField id = new JTextField();
	JPasswordField pw = new JPasswordField();
	public JTextField email = new JTextField();
	public JTextField tel = new JTextField();
	
	

	// Button
	JButton loginBtn = new JButton("로그인");
	JButton joinBtn = new JButton("회원가입");
	JButton exitBtn = new JButton("프로그램 종료");

	Operator o = null;
	//private JTextField textField;
	//private JTextField textField_1;

	MainFrame(Operator _o) {
		o = _o;

		setTitle("로그인");

		// panel 크기 작업
		centerPanel.setPreferredSize(new Dimension(260, 80));
		westPanel.setBounds(0, 0, 210, 182);
		westPanel.setPreferredSize(new Dimension(210, 75));
		eastPanel.setBounds(209, 0, 167, 182);
		eastPanel.setPreferredSize(new Dimension(90, 75));
		southPanel.setPreferredSize(new Dimension(290, 40));
		idL.setBounds(7, 5, 50, 30);

		// Label 크기 작업
		idL.setPreferredSize(new Dimension(50, 30));
		pwL.setBounds(7, 40, 50, 30);
		pwL.setPreferredSize(new Dimension(50, 30));
		id.setBounds(62, 5, 140, 30);

		// TextField 크기 작업
		id.setPreferredSize(new Dimension(140, 30));
		pw.setBounds(62, 40, 140, 30);
		pw.setPreferredSize(new Dimension(140, 30));
		loginBtn.setBounds(46, 24, 92, 45);

		// Button 크기 작업
		loginBtn.setPreferredSize(new Dimension(75, 63));
		exitBtn.setPreferredSize(new Dimension(135, 25));

		// Panel 추가 작업
		setContentPane(basePanel); // panel을 기본 컨테이너로 설정

		basePanel.add(centerPanel, BorderLayout.CENTER);
		basePanel.add(southPanel, BorderLayout.SOUTH);
		centerPanel.setLayout(null);
		centerPanel.add(westPanel);
		centerPanel.add(eastPanel);
		southPanel.setLayout(new FlowLayout());
		westPanel.setLayout(null);

		// westPanel 컴포넌트
		westPanel.add(idL);
		westPanel.add(id);
		westPanel.add(pwL);
		westPanel.add(pw);
		
		
		EmailL.setHorizontalAlignment(SwingConstants.CENTER);
		EmailL.setPreferredSize(new Dimension(50, 30));
		EmailL.setBounds(7, 80, 50, 30);
		westPanel.add(EmailL);
		
		
		telL.setPreferredSize(new Dimension(50, 30));
		telL.setHorizontalAlignment(SwingConstants.CENTER);
		telL.setBounds(7, 120, 50, 30);
		westPanel.add(telL);
		email.setPreferredSize(new Dimension(140, 30));
		email.setBounds(62, 80, 140, 30);
		
		westPanel.add(email);
		tel.setPreferredSize(new Dimension(140, 30));
		tel.setBounds(62, 125, 140, 30);
		
		westPanel.add(tel);
		
		


		// Button 이벤트 리스너 추가
		ButtonListener bl = new ButtonListener();
		
		loginBtn.addActionListener(bl);
		exitBtn.addActionListener(bl);
		
		// eastPanel 컴포넌트
		eastPanel.add(loginBtn);
		joinBtn.setBounds(46, 99, 92, 45);
		eastPanel.add(joinBtn);
		joinBtn.setPreferredSize(new Dimension(135, 25));
		joinBtn.addActionListener(bl);

		// southPanel 컴포넌트
		southPanel.add(exitBtn);


		setSize(392, 261);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Button 이벤트 리스너
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();

			// TextField에 입력된 아이디와 비밀번호를 변수에 초기화
			String uid = id.getText();
			String upass = pw.getText();
			String uemail = email.getText();
			String utel = tel.getText();
			
			//for (int i = 0; i < pw.getPassword().length; i++) {
				//upass = upass + pw.getPassword()[i];
			//}

			// 게임종료 버튼 이벤트
			if (b.getText().equals("프로그램 종료")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

	        // 회원가입 버튼 이벤트
	        else if (b.getText().equals("회원가입")) {
	            if (uid.equals("") || upass.equals("")) {
	                JOptionPane.showMessageDialog(null, "아이디와 비밀번호 모두 입력해주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
	                System.out.println("회원가입 실패 > 회원정보 미입력");
	            } else {
	                boolean success = o.signUp(uid, upass,uemail,utel);
	                if (success) {
	                    JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
	                    System.out.println("회원가입 성공");
	                    
	                    email.setText("");
	                    tel.setText("");
	                } else {
	                    JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
	                    System.out.println("회원가입 실패 > 중복된 아이디");
	                }
	            }
	        }

			 // 로그인 버튼 이벤트
	        else if (b.getText().equals("로그인")) {
	            if (uid.equals("") || upass.equals("")) {
	                JOptionPane.showMessageDialog(null, "아이디와 비밀번호 모두 입력해주세요", "로그인 실패", JOptionPane.ERROR_MESSAGE);
	                System.out.println("로그인 실패 > 로그인 정보 미입력");
	            } else {
	                // Operator 클래스의 loginCheck 메서드를 사용하여 로그인 정보를 확인합니다.
	                boolean success = o.loginCheck(uid, upass);
	                if (success) {
	                    System.out.println("로그인 성공");
	                    JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
	                } else {
	                    System.out.println("로그인 실패 > 로그인 정보 불일치");
	                    JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다.");
					}
				}
			}
		}
	}
}
