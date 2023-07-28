package movecomu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;



public class Imsipw extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public RoundButton btno;
	
	public Imsipw() {
		 // 한글 인코딩 설정 추가
        System.setProperty("file.encoding", "UTF-8");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		setSize(400, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디 / 비밀번호 찾기");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(32, 25, 304, 61);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(179, 230, 242));
		panel.setBounds(0, 0, 392, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		RoundButton bt1 = new RoundButton("메일받기");
		bt1.setBounds(61, 261, 119, 33);
		bt1.setClickBackgroundColor(new Color(0x009999));
		
		panel.add(bt1);
		
		RoundButton bt2 = new RoundButton("취소");
		bt2.setBounds(206, 261, 119, 33);
		bt2.setClickBackgroundColor(new Color(0x009999));
		panel.add(bt2);
		
		JLabel 결과알림라벨 = new JLabel("");
		결과알림라벨.setHorizontalAlignment(SwingConstants.CENTER);
		결과알림라벨.setFont(new Font("굴림", Font.PLAIN, 12));
		결과알림라벨.setBounds(61, 315, 264, 33);
		panel.add(결과알림라벨);
		
		JLabel lblNewLabel_3 = new JLabel("임시비밀번호를 메일로 발송해드립니다");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(46, 218, 279, 33);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("이름을 입력하세요");
		lblNewLabel_1.setBounds(122, 80, 122, 28);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(132, 118, 109, 21);
		panel.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("이메일을 입력하세요");
		lblNewLabel_1_1.setBounds(122, 149, 122, 28);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 187, 199, 21);
		panel.add(textField_1);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		
		
		
		bt1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String id = textField.getText();
		        String email = textField_1.getText();

		        // 데이터베이스에서 입력된 이름과 이메일이 일치하는 사용자를 찾습니다.
		        boolean userFound = false;
		        String storedEmail = null;
		        try (Connection conn = DatabaseManager.getConnection();
		             PreparedStatement pstmt = conn.prepareStatement("SELECT email FROM users WHERE id = ? ")) {
		            pstmt.setString(1, id);		            
		            //pstmt.setString(2, email);
		            
		            ResultSet rs = pstmt.executeQuery();

		            if (rs.next()) {
		                storedEmail = rs.getString("email");
		                if (storedEmail.equalsIgnoreCase(email)) {
		                    userFound = true;
		                }
		                pstmt.close();
		            }
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        }

		        // 사용자를 찾은 경우에만 임시 비밀번호 생성 및 이메일 전송과 데이터베이스 저장
		        if (userFound) {
		            String temppassword = EmailSender.generateRandomPassword(); // 임시 비밀번호 생성

		            // 이메일 전송
		            EmailSender.sendEmail(email, temppassword);

		            // 데이터베이스에 임시 비밀번호 저장
		            DatabaseManager.saveTemppassword(id , temppassword);

		            결과알림라벨.setText("이메일 전송 성공!"); // 성공했을 경우 메시지 표시
		        } else {
		            결과알림라벨.setText("사용자를 찾을 수 없습니다!"); // 사용자를 찾지 못한 경우 메시지 표시
		        }
		    }
		});
		
		
	
			
		

        // "취소" 버튼(bt2)의 액션 리스너 추가
        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // "취소" 버튼을 누르면 현재 프레임을 종료합니다.
                dispose();
            }
        });

		
		setVisible(true);
	}
	
}
