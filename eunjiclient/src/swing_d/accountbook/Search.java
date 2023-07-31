package swing_d.accountbook;

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
		this.setSize(400,400);
		//setLocationRelativeTo(null); // 창을 화면 중앙에 위치
		this.setVisible(true);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i = 0; i<dtcr.getComponentCount();i++) {
			((TableColumnModel) dtcr).getColumn(i).setCellRenderer(dtcr);
		}
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(65, 27, 268, 56);
		panel_1.setBorder(new LineBorder(new Color(187, 142, 128), 2));
		panel_1.setBackground(new Color(215, 192, 174));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("가계부 정보검색");
		lblNewLabel.setFont(new Font("Nanum Pen", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 10, 166, 36);
		panel_1.add(lblNewLabel);
		
		combo1 = new JComboBox<String>();
		combo1.setMaximumRowCount(10);
		combo1.setModel(new DefaultComboBoxModel<String>(new String[] {"검색할 정보를 선택하세요","1.입금 기록확인","2.출금 기록확인","3.예금 기록확인","4.적금 기록확인","5.위시리스트 금액확인"}));
		
		combo1.setBounds(97, 108, 201, 35);
		add(combo1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new LineBorder(new Color(187, 142, 128)));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(47, 173, 298, 122);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(139, 321, 115, 35);
		add(btnNewButton);
		//table.setRowHeight(20);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = (String) combo1.getSelectedItem();
				String recordText = "";
				
				if (selectedValue.equals("1.수입 기록확인")) {
					// 입금 기록을 가져오는 로직
					recordText = 수입기록(); // 입력된 입금 기록을 가져오는 메소드 호출
				} else if (selectedValue.equals("2.출금 기록확인")) {
					// 출금 기록을 가져오는 로직
					recordText = 출금기록(); // 입력된 출금 기록을 가져오는 메소드 호출
					
				 } else if (selectedValue.equals("3.예금 기록확인")) {
			            // 예금 기록을 가져오는 로직
			            recordText = 예금기록(); // 입력된 예금 기록을 가져오는 메소드 호출
			        } else if (selectedValue.equals("4.적금 기록확인")) {
			            // 적금 기록을 가져오는 로직
			            recordText = 적금기록(); // 입력된 적금 기록을 가져오는 메소드 호출
			        } else if (selectedValue.equals("5.위시리스트 금액확인")) {
			            // 위시리스트를 가져오는 로직
			            recordText = 위시리스트(); // 위시리스트를 가져오는 메소드 호출
				}
				
				lblNewLabel_1.setText(recordText);
			}
		});
		
	}
	
	
	private String 수입기록() {
		// 사용자의 입금 기록을 가져와서 문자열로 반환하는 메소드
		// 여기에서는 임의로 "입금 기록을 가져옵니다."라는 문자열을 반환합니다.
		return "수입 기록을 가져옵니다.";
	}
	
	private String 출금기록() {
		// 사용자의 출금 기록을 가져와서 문자열로 반환하는 메소드
		// 여기에서는 임의로 "출금 기록을 가져옵니다."라는 문자열을 반환합니다.
		return "출금 기록을 가져옵니다.";
	}

    private String 예금기록() {
        // 사용자의 예금 기록을 가져와서 문자열로 반환하는 메소드
        // 여기에서는 임의로 "예금 기록을 가져옵니다."라는 문자열을 반환합니다.
        return "예금 기록을 가져옵니다.";
    }

    private String 적금기록() {
        // 사용자의 적금 기록을 가져와서 문자열로 반환하는 메소드
        // 여기에서는 임의로 "적금 기록을 가져옵니다."라는 문자열을 반환합니다.
        return "적금 기록을 가져옵니다.";
    }

    private String 위시리스트() {
        // 사용자의 위시리스트를 가져와서 문자열로 반환하는 메소드
        // 여기에서는 임의로 "위시리스트를 가져옵니다."라는 문자열을 반환합니다.
        return "위시리스트 금액을 가져옵니다.";
    }
	
}
