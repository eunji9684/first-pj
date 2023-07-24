package hj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calcul extends JPanel implements ActionListener {

	private JPanel displaypanel;
	private JPanel buttonpanel;
	private JPanel debugpanel;
	private JPanel Calc;

	private JTextField display;

	private CalButton[] buttons;
	private CalButton btnplus;
	private CalButton btnminus;
	private CalButton btnproduct;
	private CalButton btnDivide;
	private CalButton btnEqual;
	private CalButton btnCE;

	private JLabel prev;
	private JLabel operator;
	private JLabel flag;

	public Calcul() {
		//this.setSize(300, 400);
		//this.setTitle("comu 계산기");
		this.setBackground(new Color(0x7895CB));
		this.setBounds(20, 20, 354, 380);
		
		this.setLayout(null);

		displaypanel = new JPanel();
		buttonpanel = new JPanel();
		debugpanel = new JPanel();
		Calc = new JPanel();
		
		//buttonpanel.setSize(400,300);

		
		// displays 컴포넌트 만들어 붙이기

		display = new JTextField(11);
		display.setText("0");
		display.setHorizontalAlignment(JTextField.RIGHT);

		display.setBackground(new Color(0xDDE6ED));
		Font font = new Font("Nanum Pen", Font.BOLD, 30);
		display.setFont(font);

		displaypanel.add(display);

		// 버튼패널에 컴포넌트 만들고붙이기

		//Font fontbtn = new Font("Nanum Pen", Font.BOLD, 40);
		


		buttons = new CalButton[10];
		Color textColor = Color.WHITE; // 버튼의 텍스트 색상을 흰색으로 설정

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new CalButton(Integer.toString(i));
			//buttons[i].setFont(fontbtn);
			//buttons[i].setForeground(textColor); // 버튼의 텍스트 색상 설정
			//Dimension buttonSize = new Dimension(20, 20);
			//buttons[i].setPreferredSize(buttonSize); // 버튼 크기 설정
			buttons[i].addActionListener(this);
		}

		btnplus = new CalButton("+");		
		btnminus = new CalButton("-");
		btnproduct = new CalButton("*");
		btnDivide = new CalButton("/");
		btnEqual = new CalButton("=");
		btnCE = new CalButton("CE");

		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		btnproduct.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		buttonpanel.setLayout(new GridLayout(0, 4,2, 2)); // 버튼 패널의 레이아웃을 그리드 레이아웃으로 설정

		buttonpanel.add(buttons[1]);
		buttonpanel.add(buttons[2]);
		buttonpanel.add(buttons[3]);
		buttonpanel.add(btnplus);

		buttonpanel.add(buttons[4]);
		buttonpanel.add(buttons[5]);
		buttonpanel.add(buttons[6]);
		buttonpanel.add(btnminus);

		buttonpanel.add(buttons[7]);
		buttonpanel.add(buttons[8]);
		buttonpanel.add(buttons[9]);
		buttonpanel.add(btnproduct);

		buttonpanel.add(btnCE);
		buttonpanel.add(buttons[0]);
		buttonpanel.add(btnDivide);
		buttonpanel.add(btnEqual);

		// debugPanel에 디버그 메세지 버튼 만들어서 붙이기

		prev = new JLabel(" ");
		operator = new JLabel(" ");
		flag = new JLabel(" ");
		
		
		debugpanel.add(new JLabel("prey"));
		debugpanel.add(prev);

		debugpanel.add(new JLabel("operator"));
		debugpanel.add(operator);

		debugpanel.add(new JLabel("flag"));
		debugpanel.add(flag);
		
		 displaypanel.setBounds(25, 30, 300, 50);
        buttonpanel.setBounds(25, 110, 300, 200);
        debugpanel.setBounds(25, 330, 300, 30);
        
        displaypanel.setBackground(new Color(0xA0BFE0));
        buttonpanel.setBackground(new Color(0x7895CB));
        debugpanel.setBackground(new Color(0xA0BFE0));
		
        this.add(displaypanel);
        this.add(buttonpanel);
        this.add(debugpanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				if (display.getText().equals("0")) {
					display.setText(" " + i);
				} else {
					if (operator.getText().equals(" ")) {
						display.setText(display.getText() + i);

					} else {
						if (flag.getText().equals(" ")) {
							display.setText(" " + i);
							flag.setText("#");

						} else {
							display.setText(display.getText() + i);
						}
					}

				}
			}
		}

		if (e.getSource() == btnEqual) {
			double op1, op2, result;
			op1 = Double.parseDouble(prev.getText());// 문자-> 숫자
			op2 = Double.parseDouble(display.getText());
			
			if(operator.getText().equals("+"))
			{
				result = op1 +op2;
				display.setText(" " + result);
				//display.setText(String.valueOf(result));
			}
			if(operator.getText().equals("-"))
			{
				result = op1 -op2;
				display.setText(" " + result);
			}
			if(operator.getText().equals("*"))
			{
				result = op1 * op2;
				display.setText(" " + result);
			}
			if(operator.getText().equals("/"))
			{
				result = op1 / op2;
				display.setText(" " + result);
			}
			
		}
		if(e.getSource()== btnplus)
		{
			prev.setText(display.getText());
			operator.setText("+");
			flag.setText(" ");
		}
		
		if(e.getSource() == btnminus) {
			prev.setText(display.getText());
			operator.setText("-");
			flag.setText(" ");
		}
		if(e.getSource() == btnproduct) {
			prev.setText(display.getText());
			operator.setText("*");
			flag.setText(" ");
		}
		if(e.getSource() == btnDivide) {
			prev.setText(display.getText());
			operator.setText("/");
			flag.setText(" ");
		}
		if(e.getSource() == btnCE) {
			display.setText("0");
			prev.setText(" ");
			operator.setText(" ");
			flag.setText(" ");
		}
		
		
	}
}
/*class Calcul{
	
//	public static void main(String[] args) {
//		JFrame frame = new JFrame("계산기"); // JFrame 생성
//		frame.setSize(400, 482); // 프레임의 크기 설정
//		frame.getContentPane().setLayout(null);
//		// frame.setBackground(new Color(128, 64, 0)); // 배경색 설정
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 설정
//
//		public Calc calc = new Calc();
//		frame.getContentPane().add(calc);
//
//		frame.setVisible(true); // 프레임 표시
//	}
}*/


