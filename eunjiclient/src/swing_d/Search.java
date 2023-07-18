package swing_d;

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

public class Search extends JPanel{
	private JTable table;
	private JComboBox<String> combo1;
	private JLabel lblNewLabel_1;
	
	public Search() {
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
		
		combo1 = new JComboBox<String>();
		combo1.setMaximumRowCount(10);
		combo1.setModel(new DefaultComboBoxModel<String>(new String[] {"검색할 정보를 선택하세요","1.입금 기록확인","2.출금 기록확인"}));
		
		combo1.setBounds(70, 88, 176, 28);
		add(combo1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new LineBorder(new Color(187, 142, 128)));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(24, 133, 263, 113);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(105, 265, 97, 23);
		add(btnNewButton);
		//table.setRowHeight(20);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = (String) combo1.getSelectedItem();
				String recordText = "";
				
				if (selectedValue.equals("1.입금 기록확인")) {
					// 입금 기록을 가져오는 로직
					recordText = getDepositRecords(); // 입력된 입금 기록을 가져오는 메소드 호출
				} else if (selectedValue.equals("2.출금 기록확인")) {
					// 출금 기록을 가져오는 로직
					recordText = getWithdrawalRecords(); // 입력된 출금 기록을 가져오는 메소드 호출
				}
				
				lblNewLabel_1.setText(recordText);
			}
		});
		
	}
	
	
	private String getDepositRecords() {
		// 사용자의 입금 기록을 가져와서 문자열로 반환하는 메소드
		// 여기에서는 임의로 "입금 기록을 가져옵니다."라는 문자열을 반환합니다.
		return "입금 기록을 가져옵니다.";
	}
	
	private String getWithdrawalRecords() {
		// 사용자의 출금 기록을 가져와서 문자열로 반환하는 메소드
		// 여기에서는 임의로 "출금 기록을 가져옵니다."라는 문자열을 반환합니다.
		return "출금 기록을 가져옵니다.";
	}
	public static void main(String[] args) {
		new Search().setVisible(true);
	}
}
