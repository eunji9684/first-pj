package swing_d.table.list;

import java.awt.BasicStroke;
import java.awt.Color;
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

public class Window_D_Table_Lable_Filed3 extends JLabel {

	public int width;
	public int height;
	int round= 10; 
	
	public Window_D_Table_Lable_Filed3(int x_location, int y_location, int width, int height, String a){
		
		this.width = width;
		this.height = height;
		
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(Window_Font_Install.font.deriveFont(15.0f));
		setForeground(Color.black);	
		setText(a);
		setOpaque(false);
		setBorder(new EmptyBorder(0,15,0,15));
		setLocation(x_location,y_location);
		setSize(width,height);
		
		
			addMouseListener(new MouseAdapter() {
		    
				public void mouseClicked(MouseEvent e) {
					Window_interface_D.열_생성_타입지정.dispose();
					Window_interface_D.열_생성_타입지정_클릭.setText(getText());
					Window_interface_D.열_생성_타입지정_클릭.type = getText();
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
        
        graphics2d.dispose();
        super.paintComponent(g); 
    }
    
}
