package swing_d.table.list;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_Table_Text_Filed extends JTextField {

	public int 행		= 0;
	public int 열		= 0;
	public int x		= 0;
	public int y		= 0;
	public int width 	= 0;
	public int height 	= 0;
	public String 데이터 = "";
	public String type;
	int round = 10;
	
	public Window_D_Table_Text_Filed(){
		
		setFont(Window_Font_Install.font.deriveFont(14.0f));
		setSize(width,30);
		setOpaque(false);
		setBorder(new EmptyBorder(0,15,0,15)); //위(top), 왼쪽(left), 아래(bottom), 오른쪽(right) 여백을 나타냅니다.
		setForeground(Color.black);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					Window_interface_D.데이터수정();
					Window_interface_D.dialog_text.dispose();
					setText("");
				}
			}
		});	
	} // constructor Window_D_Table_Text_Filed end//

	
	@Override
    protected void paintComponent(Graphics g) {
		 
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(1.0f));
        
        
        graphics2d.setColor(new Color(250,250,250,200));
        
        graphics2d.fillRoundRect(
        		0,
        		0, 
        		getWidth() -1,
        		getHeight() -1,
        		round,
        		round
        );
        
        graphics2d.setColor(new Color(142,192,248,200));
        
        
        graphics2d.drawRoundRect(
        		0,
        		0, 
        		getWidth() -1,
        		getHeight() -1,
        		round,
        		round
        );
        
        
        super.paintComponent(g);
        graphics2d.dispose();
  
    }
	
	
}
