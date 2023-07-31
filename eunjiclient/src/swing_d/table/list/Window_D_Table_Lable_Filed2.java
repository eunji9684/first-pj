package swing_d.table.list;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Lable_Filed2 extends JLabel {

	public int 행;
	public int 열;
	public int x_location;
	public int y_location;
	public int width;
	public int height;
	public String a;
	public float font_size;
	public String type = "String";
	int round= 10; 
	
	public Window_D_Table_Lable_Filed2(int x_location, int y_location, String a){
		
		
		setFont(Window_Font_Install.font.deriveFont(16.0f));
		setForeground(Color.black);
		setText(a);
		setOpaque(false);
		setBorder(new EmptyBorder(0,15,0,15));
		setHorizontalAlignment(SwingConstants.CENTER);
		setLocation(x_location,y_location);
		setSize(260,30);
		setPreferredSize(new Dimension(260,30));
		
		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
	          	
                if (SwingUtilities.isLeftMouseButton(e)) { 
                	Window_interface_D.열_생성_데이터수정.dispose();
            
                	Window_interface_D.text_filed2.열 = 열;
                	Window_interface_D.text_filed2.행 = 행;
                	Window_interface_D.text_filed2.x = x_location;
                	Window_interface_D.text_filed2.y = y_location;
                	Window_interface_D.text_filed2.width = width;
                	Window_interface_D.text_filed2.height = height;
                	Window_interface_D.text_filed2.데이터 = a;
                	Window_interface_D.text_filed2.type = type;
                	
                	Window_D_Table_Center_Text_Dialog3 A = Window_interface_D.열_생성_데이터수정;
                	
                	A.setLocation((int)(getLocationOnScreen().getX()) ,(int)(getLocationOnScreen().getY()-4));
                	
                	A.setVisible(true);    
                	
                }
               
                else if (SwingUtilities.isRightMouseButton(e)) {
                	
                	Window_interface_D.열_생성_데이터수정.dispose();
                }
            }
		});
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(1.0f));
        
        graphics2d.setColor(Color.white);

        graphics2d.fillRoundRect(
        		0,
        		0, 
        		getWidth() -1,
        		getHeight() -1,
        		round,
        		round
        );
        
    	graphics2d.setColor(new Color(0,0,0,255));
        	
    	graphics2d.drawLine(
        		getWidth()-10,
        		getHeight()-4, 
        		0+14,
        		getHeight()-4
        );

        graphics2d.dispose();
        super.paintComponent(g); 
    }
    
}
