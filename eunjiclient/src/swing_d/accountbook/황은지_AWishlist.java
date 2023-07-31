package swing_d.accountbook;

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

public class 황은지_AWishlist extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel 내용패널_1_2_1;
	
	
	public  황은지_AWishlist () {
		
		//setSize(100,400);
		setSize(305,408);
		
		내용패널_1_2_1 = new JPanel(); // 생성자에서 내용패널_1_2_1 객체 생성
		//내용패널_1_2_1.setSize(300,400);
		내용패널_1_2_1.setLayout(null);
		내용패널_1_2_1.setBackground(new Color(251, 185, 168));
		내용패널_1_2_1.setBounds(0,0, 305, 408);
		내용패널_1_2_1.setVisible(true);
		setLayout(null);
		add(내용패널_1_2_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("MEMO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(19, 247, 57, 33);
		내용패널_1_2_1.add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(76, 237, 198, 54);
		내용패널_1_2_1.add(textArea);
		
		JLabel lblNewLabel_1_3 = new JLabel("important");
		lblNewLabel_1_3.setBounds(19, 193, 75, 28);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		내용패널_1_2_1.add(lblNewLabel_1_3);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("place");
		lblNewLabel_1_2.setBounds(14, 146, 50, 28);
		내용패널_1_2_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 150, 198, 21);
		textField_2.setColumns(10);
		내용패널_1_2_1.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("price");
		lblNewLabel_1_1.setBounds(8, 111, 57, 25);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		내용패널_1_2_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 113, 198, 21);
		textField_1.setColumns(10);
		내용패널_1_2_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(8, 73, 62, 28);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		내용패널_1_2_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(76, 77, 198, 21);
		textField.setColumns(10);
		내용패널_1_2_1.add(textField);
		
		
		JLabel lblNewLabel = new JLabel("My WishList");
		lblNewLabel.setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 23, 199, 36);
		내용패널_1_2_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(54, 336, 82, 23);
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
	               
	            }
	        });
		내용패널_1_2_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(172, 336, 82, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	            }
		   });
		내용패널_1_2_1.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setAutoscrolls(true);
		comboBox.setBackground(new Color(251, 155, 128));
		comboBox.setForeground(new Color(64, 0, 0));
		comboBox.setFont(new Font("Nanum Pen", Font.PLAIN, 15));
		comboBox.addItem("선택하세요");
		comboBox.addItem("★★★★★");
		comboBox.addItem("★★★");
		comboBox.addItem("★");
		comboBox.setBounds(106, 196, 106, 25);
		내용패널_1_2_1.add(comboBox);
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



}
