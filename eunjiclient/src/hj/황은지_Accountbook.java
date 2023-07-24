package hj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

public class 황은지_Accountbook extends JPanel{
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private Labela la1_4;
	
	public 황은지_Accountbook() {
	
		
		setLayout(null);
		this.setSize(1439,967);
		this.setLocation(10, 10);
		this.setVisible(true);
		this.setBackground(new Color(0xF5EFE7));
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
	
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(0xF7E9D7));
		panel_3.setBounds(12, 238, 1415, 691);
		add(panel_3);
		panel_3.setLayout(null);
		
		
		Calcul cal = new Calcul();
		cal.setSize(339, 380);
		cal.setLocation(12, 203);
		panel_3.add(cal);
		
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(635, 33, 320, 56);
		scrollPane.setBackground(new Color(221, 174, 174));
		panel_3.add(scrollPane);
		
		table_3 = new JTable();
		table_3.setRowHeight(22);
		table_3.setBackground(new Color(251, 244, 244));
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"수입", "지출", "합계"
			}
		));
		
		scrollPane.setViewportView(table_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(180, 163, 165));
		scrollPane_1.setBounds(304, 37, 200, 56);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_3.add(scrollPane_1);
		
		table_4 = new JTable();
		table_4.setRowHeight(20);
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"저축/투자", "대출"
			}
		));
		
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        table_4.setDefaultRenderer(Object.class, centerRenderer);
		
		scrollPane_1.setViewportView(table_4);
		
		
		//라벨버튼 추가
		Labela la1 = new Labela("금액숨기기",10,10,224,540);
		la1.setBounds(528, 33, 80, 26);
		la1.setFont(new Font("Nanum Pen", Font.BOLD, 14));

		panel_3.add(la1);
		
		Labela la1_1 = new Labela("금액보이기",528,63,80,26);
		la1_1.setFont(new Font("Nanum Pen", Font.BOLD, 15));
		
		panel_3.add(la1_1);
		
		Labela la1_2 = new Labela("금액숨기기",988,30,80,26);
		la1_2.setFont(new Font("Nanum Pen", Font.BOLD, 14));
		la1_2.setBounds(988, 30, 80, 26);
		panel_3.add(la1_2);
		
		Labela la1_3 = new Labela("금액보이기",988,63,80,26);
		la1_3.setFont(new Font("Nanum Pen", Font.BOLD, 14));
		la1_3.setBounds(988, 63, 80, 26);
		panel_3.add(la1_3);
		
		Search search = new Search();
		search.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 64, 64), new Color(255, 255, 255), new Color(255, 255, 255), null));
		search.setBackground(new Color(235, 216, 195));
		search.setSize(311, 298);
		search.setLocation(1097, 30);
		panel_3.add(search);
		
		/*
		la1_2_1.addMouseListener(new MouseAdapter() {
		
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Search search = new Search();
				search.setVisible(true);
				
			}
		});
		*/
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 33, 265, 132);
		panel_2.setBackground(new Color(239, 218, 209));
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 242, 120);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(239, 218, 209));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(0, 10, 242, 50);
		lblNewLabel_1.setBackground(new Color(0xFEFCF3));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBounds(0, 60, 242, 50);
		lblNewLabel_1_1.setBackground(new Color(0xFEFCF3));
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(25, 28, 1389, 60);
		add(panel_8);
		panel_8.setBackground(new Color(0xD7C0AE));
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("검색");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(1055, 10, 219, 40);
		lblNewLabel_2.setFont(new Font("Nanum Pen", Font.LAYOUT_RIGHT_TO_LEFT,15 ));
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(103, 93, 80)));
		//lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panel_8.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		
		panel_6.setBounds(25, 96, 1389, 121);
		add(panel_6);
		panel_6.setBackground(new Color(235, 216, 195));
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED));
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Account Book");
		lblNewLabel_6.setBounds(437, 33, 363, 65);
		panel_6.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Nanum Pen", Font.BOLD, 50));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("(코무니코)  MY 가계부");
		lblNewLabel.setBounds(869, 63, 220, 48);
		panel_6.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Nanum Pen", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		Labela la1_4 = new Labela("위시리스트 추가하기",1129,33,130,65);
		la1_4.setLocation(1071, 33);
		panel_6.add(la1_4);
		la1_4.setBackground(new Color(0xD7C0AE));
		la1_4.setFont(new Font("Nanum Pen",Font.BOLD,18));
		la1_4.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		MouseEx wish = new MouseEx();
		la1_4.addMouseListener(wish);
		
		JLabel lblNewLabel_3 = new JLabel("");
		//lblNewLabel_3.setIcon(new ImageIcon(황은지_Accountbook.class.getResource("/img/코무1.png")));
		
		lblNewLabel_3.setBounds(799, 21, 82, 90);
		panel_6.add(lblNewLabel_3);
		
		Labela la1_4_1 = new Labela("위시리스트 보기",1296,33,130,65);
		la1_4_1.setLocation(1227, 33);
		la1_4_1.setBackground(new Color(0xD7C0AE));
		la1_4_1.setFont(new Font("Nanum Pen", Font.BOLD, 18));
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
		panel_6.add(la1_4_1);
		
		
		
		  // "위시리스트 보기" 버튼에 대한 ActionListener 추가
		
	}/*
	public static void main(String[] args) {
		
		황은지_Accountbook aa = new 황은지_Accountbook();	
	
		JFrame a = new JFrame();
		a.setSize(2000,2000);
		a.getContentPane().add(aa);
		a.setVisible(true);
	}
	*/
}