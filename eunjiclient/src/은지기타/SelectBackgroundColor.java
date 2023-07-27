package 은지기타;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class SelectBackgroundColor extends JFrame implements AdjustmentListener, KeyListener {
	JTextField red = new JTextField();
	JTextField green = new JTextField();
	JTextField blue = new JTextField();
	JTextField alpha = new JTextField();

	JLabel redLabel = new JLabel("RED");
	JLabel greenLabel = new JLabel("GREEN");
	JLabel blueLabel = new JLabel("BLUE");
	JLabel alphaLabel = new JLabel("ALPHA");

	JScrollBar redScrollBar = new JScrollBar(0, 45, 0, 0, 255);
	JScrollBar greenScrollBar = new JScrollBar(0, 34, 0, 0, 255);
	JScrollBar blueScrollBar = new JScrollBar(0, 86, 0, 0, 255);
	JScrollBar alphaScrollBar = new JScrollBar(0, 255, 0, 0, 255);

	int redScrollBar_value = redScrollBar.getValue();
	int greenScrollBar_value = greenScrollBar.getValue();
	int blueScrollBar_value = blueScrollBar.getValue();
	int alphaScrollBar_value = alphaScrollBar.getValue();

	JPanel vwPanel = new JPanel();

	JLabel buttonLabel = new JLabel("\uC801\uC6A9");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectBackgroundColor frame = new SelectBackgroundColor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectBackgroundColor() {

		super("SelectBackgroundColor");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 400, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 위치 조정

		// Label
		redLabel.setBounds(0, 0, 45, 35);
		contentPane.add(redLabel);
		greenLabel.setBounds(0, 36, 45, 35);
		contentPane.add(greenLabel);
		blueLabel.setBounds(0, 72, 45, 35);
		contentPane.add(blueLabel);
		alphaLabel.setBounds(0, 108, 45, 35);
		contentPane.add(alphaLabel);

		// TextField
		red.setBounds(46, 0, 45, 35);
		green.setBounds(46, 36, 45, 35);
		blue.setBounds(46, 72, 45, 35);
		alpha.setBounds(46, 108, 45, 35);

		red.setColumns(3);
		green.setColumns(3);
		blue.setColumns(3);
		alpha.setColumns(3);

		contentPane.add(red);
		contentPane.add(green);
		contentPane.add(blue);
		contentPane.add(alpha);

		// ScrollBar
		redScrollBar.setBounds(113, 0, 248, 35);
		contentPane.add(redScrollBar);
		greenScrollBar.setBounds(113, 36, 248, 35);
		contentPane.add(greenScrollBar);
		blueScrollBar.setBounds(113, 72, 248, 35);
		contentPane.add(blueScrollBar);
		alphaScrollBar.setBounds(113, 108, 248, 35);
		contentPane.add(alphaScrollBar);

		vwPanel.setBounds(150, 172, 100, 79);
		contentPane.add(vwPanel);
		vwPanel.setLayout(null);
		vwPanel.setVisible(true);

		buttonLabel.setBounds(315, 231, 57, 30);
		contentPane.add(buttonLabel);

		// 위치 조정 끝

		// 이벤트 등록
		redScrollBar.addAdjustmentListener(this);
		greenScrollBar.addAdjustmentListener(this);
		blueScrollBar.addAdjustmentListener(this);
		alphaScrollBar.addAdjustmentListener(this);

		red.addKeyListener(this);
		green.addKeyListener(this);
		blue.addKeyListener(this);
		alpha.addKeyListener(this);

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
		} else if (e.getSource() == alphaScrollBar) {
			alpha.setText(Integer.toString(e.getValue()));
			alphaScrollBar_value = e.getValue();
		}
		vwPanel.setBackground(
				new Color(redScrollBar_value, greenScrollBar_value, blueScrollBar_value, alphaScrollBar_value));
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == red) {
			updateScrollBarValue(red, redScrollBar);
		} else if (e.getSource() == green) {
			updateScrollBarValue(green, greenScrollBar);
		} else if (e.getSource() == blue) {
			updateScrollBarValue(blue, blueScrollBar);
		} else if (e.getSource() == alpha) {
			updateScrollBarValue(alpha, alphaScrollBar);
		}

	}

	private void updateScrollBarValue(JTextField textField, JScrollBar scrollBar) {

		String text = textField.getText().trim();
		if (!text.isEmpty()) {
			try {
				int value = Integer.parseInt(textField.getText());
				if (value >= 0 && value <= 255) {
					scrollBar.setValue(value);
				} else {
					textField.setText(Integer.toString(scrollBar.getValue()));
				}
			} catch (NumberFormatException ex) {
				//textField.setText(Integer.toString(scrollBar.getValue()));
				
			}
		}

	}

}
