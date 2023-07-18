package swing_d;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Point;
import java.awt.Rectangle;

public class 황은지_AWishlist extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	public 황은지_AWishlist() {
		
		setSize(500,450);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLocation(new Point(2, 0));
		panel.setLayout(null);
		panel.setBackground(new Color(251, 185, 168));
		panel.setBounds(12, 10, this.getWidth(), this.getHeight());
		getContentPane().add(panel);
	
		
		JPanel 내용패널_1_2_1 = new JPanel();
		내용패널_1_2_1.setLayout(null);
		내용패널_1_2_1.setBackground(new Color(251, 185, 168));
		내용패널_1_2_1.setBounds(34, 259, 410, 74);
		panel.add(내용패널_1_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("MEMO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 10, 57, 54);
		내용패널_1_2_1.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(81, 10, 317, 54);
		내용패널_1_2_1.add(textArea);
		
		JLabel lblNewLabel_1_3 = new JLabel("important");
		lblNewLabel_1_3.setBounds(78, 221, 75, 28);
		panel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("place");
		lblNewLabel_1_2.setBounds(78, 183, 75, 28);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 187, 233, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("price");
		lblNewLabel_1_1.setBounds(78, 153, 75, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 156, 233, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(78, 123, 75, 28);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(165, 125, 233, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel 목표일 = new JLabel("목표일");
		목표일.setBounds(59, 81, 57, 20);
		panel.add(목표일);
		목표일.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("(목표일 체크하면 날짜표시)칸");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(128, 80, 182, 23);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setBackground(new Color(253, 219, 210));
		
		JLabel lblNewLabel_2 = new JLabel("달력체크박스");
		lblNewLabel_2.setFont(new Font("Nanum Pen", Font.ITALIC, 17));
		lblNewLabel_2.setBackground(new Color(249, 138, 111));
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.RAISED));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(322, 76, 82, 30);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel lblNewLabel = new JLabel("My WishList");
		lblNewLabel.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(128, 24, 233, 36);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(151, 343, 82, 23);
		btnNewButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    FileWriter writer = new FileWriter("wishlist.txt", true);
	                    // 여기에 원하는 작업 수행
	                    writer.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	                dispose(); // 창 닫기
	            }
	        });
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(245, 343, 82, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                dispose(); // 창 닫기
	            }
		   });
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setAutoscrolls(true);
		comboBox.setBackground(new Color(251, 155, 128));
		comboBox.setForeground(new Color(64, 0, 0));
		comboBox.setFont(new Font("Nanum Pen", Font.PLAIN, 15));
		comboBox.addItem("선택하세요");
		comboBox.addItem("★★★★★");
		comboBox.addItem("★★★");
		comboBox.addItem("★");
		comboBox.setBounds(204, 223, 106, 25);
		panel.add(comboBox);
		this.setVisible(true);
	
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String name = textField.getText(); // 이름 입력값 가져오기
		        String price = textField_1.getText(); // 가격 입력값 가져오기
		        String place = textField_2.getText(); // 장소 입력값 가져오기
		        String memo = textArea.getText(); // 메모 입력값 가져오기
		        String selected = (String) comboBox.getSelectedItem();
		        
		
		        
		        try {
		        	
		        	FileWriter writer = new FileWriter("wishlist.txt", true);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    
		            //FileWriter writer = new FileWriter("wishlist.txt", true);
		            writer.write("Name: " + name + "\n");
		            writer.write("Price: " + price + "\n");
		            writer.write("Place: " + place + "\n");
		            writer.write("important: " +selected + "\n");
		            writer.write("Memo: " + memo + "\n");
		            writer.write("============================\n");
		            writer.close();
		            System.out.println("입력값이 파일에 저장되었습니다.");
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
	
		        
		    }
		});

	
	}
	
public static void main(String[] args) {
	new 황은지_AWishlist().setVisible(true);
	

}
}
