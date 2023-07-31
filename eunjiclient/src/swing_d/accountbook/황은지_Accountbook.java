package swing_d.accountbook;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import swing_d.inter.Window_interface_D;
import javax.swing.JTextField;

public class 황은지_Accountbook extends JPanel{
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	public static JTable  table_4;
	private Labela la1_4;
	public Calcul cal; 
	private JTextField textField;
	
	public 황은지_Accountbook() {
	
		
		setLayout(null);
		this.setSize(1439,956);
		this.setLocation(10, 10);
		this.setVisible(true);
		this.setBackground(new Color(0xF5EFE7));
	
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(0xF7E9D7));
		panel_3.setBounds(50, 216, 1348, 691);
		add(panel_3);
		panel_3.setLayout(null);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(180, 163, 165));
		scrollPane_1.setBounds(44, 33, 646, 77);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_3.add(scrollPane_1);
		
		table_4 = new JTable();
		table_4.setRowHeight(30);
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"수입", "지출", "예금", "적금", "위시리스트"
			}
			  // 수입과 지출 계산 및 테이블 업데이트

			
		));
		
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        table_4.setDefaultRenderer(Object.class, centerRenderer);
		
		scrollPane_1.setViewportView(table_4);
		
		Labela la1_2 = new Labela("금액숨기기",988,30,80,26);
		la1_2.setFont(new Font("Nanum Pen", Font.BOLD, 20));
		la1_2.setBounds(737, 25, 110, 41);
		panel_3.add(la1_2);
		
		Labela la1_3 = new Labela("금액보이기",988,63,80,26);
		la1_3.setFont(new Font("Nanum Pen", Font.BOLD, 20));
		la1_3.setBounds(737, 80, 110, 41);
		panel_3.add(la1_3);
		
		황은지_AWishlist wishs = new 황은지_AWishlist();
		wishs.setSize(305, 408);
		wishs.setLocation(943, 152);
		panel_3.add(wishs);
		wishs.setLayout(null);
		wishs.setVisible(true);
		
	
		Search search = new Search();
		search.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 64, 64), new Color(255, 255, 255), new Color(255, 255, 255), null));
		search.setBackground(new Color(235, 216, 195));
		search.setSize(400, 408);
		search.setLocation(459, 152);
		panel_3.add(search);
		
	
		cal = new Calcul();
		cal.setSize(357, 408);
		cal.setLocation(46, 152);
		panel_3.add(cal);
		cal.setVisible(true); // Calcul 클래스를 보이도록 설정
		
		Labela la1_4_1 = new Labela("위시리스트 보기", 215, 192, 174, "이름", "가격", "장소", "중요도", "메모");
		la1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		la1_4_1.setBounds(1118, 45, 130, 65);
		panel_3.add(la1_4_1);
		la1_4_1.setBackground(new Color(0xD7C0AE));
		la1_4_1.setFont(new Font("Nanum Pen", Font.BOLD, 18));
		la1_4_1.setBorder(new BevelBorder(BevelBorder.RAISED));

		Labela la1_4_2 = new Labela("위시리스트 추가하기",1129,33,130,65);
		la1_4_2.setBounds(943, 44, 130, 65);
		panel_3.add(la1_4_2);
		la1_4_2.setBackground(new Color(0xD7C0AE));
		la1_4_2.setFont(new Font("Nanum Pen",Font.BOLD,18));
		la1_4_2.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		/*
		la1_4_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        try {
		            BufferedReader reader = new BufferedReader(new FileReader("wishlist.txt"));
		            String line;

		            while ((line = reader.readLine()) != null) {
		                System.out.println(line); // 각 줄을 출력하거나 원하는 처리를 수행할 수 있습니다.
		            }

		            reader.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		*/
		


		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, -1, 1427, 60);
		add(panel_8);
		panel_8.setBackground(new Color(0xD7C0AE));
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("  검색");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(1123, 10, 171, 40);
		lblNewLabel_2.setFont(new Font("Nanum Pen", Font.LAYOUT_RIGHT_TO_LEFT,15 ));
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(103, 93, 80)));
		//lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panel_8.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(1164, 20, 116, 21);
		panel_8.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		
		panel_6.setBounds(0, 69, 1427, 121);
		add(panel_6);
		panel_6.setBackground(new Color(235, 216, 195));
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED));
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Account Book");
		lblNewLabel_6.setBounds(437, 33, 363, 65);
		panel_6.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Nanum Pen", Font.BOLD, 55));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("(코무니코)  MY 가계부");
		lblNewLabel.setBounds(1091, 63, 220, 48);
		panel_6.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Nanum Pen", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//MouseEx wish = new MouseEx();
		//la1_4.addMouseListener(wish);
		
		JLabel lblNewLabel_3 = new JLabel("");
		//lblNewLabel_3.setIcon(new ImageIcon(황은지_Accountbook.class.getResource("/img/코무1.png")));
		
		lblNewLabel_3.setBounds(799, 21, 82, 90);
		panel_6.add(lblNewLabel_3);
		
		
		
		//Window_interface_D.리스트_업로드();
		
	}
}