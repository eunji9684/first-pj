package hj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class 수입입력 extends JPanel{
	private JTable table;
	private JLabel lblNewLabel_1;
	
	public 수입입력() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(128, 64, 0), new Color(128, 64, 64), null));
		setBackground(new Color(235, 216, 195));
		this.setSize(312,298);
		//setLocationRelativeTo(null); // 창을 화면 중앙에 위치
		this.setVisible(true);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i = 0; i<dtcr.getComponentCount();i++) {
			((TableColumnModel) dtcr).getColumn(i).setCellRenderer(dtcr);
		}
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 22, 192, 56);
		panel_1.setBorder(new LineBorder(new Color(187, 142, 128), 2));
		panel_1.setBackground(new Color(215, 192, 174));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("가계부 정보검색");
		lblNewLabel.setFont(new Font("Nanum Pen", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 166, 36);
		panel_1.add(lblNewLabel);
		
		RoundButton button1 = new RoundButton("확인");
		button1.setForeground(new Color(128, 64, 64));
		button1.setText("확인");
		button1.setBounds(39, 252, 97, 23);
		add(button1);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.setBounds(169, 252, 97, 23);
		add(btnNewButton_1);
		//table.setRowHeight(20);
		
				

	}
	

	public static void main(String[] args) {
		new 수입입력().setVisible(true);
	}
}
