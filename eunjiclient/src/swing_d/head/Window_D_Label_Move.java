package swing_d.head;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;

public class Window_D_Label_Move extends JLabel {

	int width;
	int height;
	String a;
	
	public Window_D_Label_Move(Runnable run,String a,int width,int height){
				
		this.a = a;
		this.width = width;
		this.height = height;
		
		setOpaque(false);
		setPreferredSize(new Dimension(width,height));
		setHorizontalAlignment(SwingConstants.CENTER);
		
		addMouseListener(new MouseAdapter() {
		    public void mousePressed(MouseEvent e) {run.run();}
		    public void mouseEntered(MouseEvent e) {setCursor(Cursor.getPredefinedCursor(12));}
		    public void mouseExited(MouseEvent e)  {setCursor(Cursor.getDefaultCursor());}
		    public void mouseReleased(MouseEvent e) {}
		    
		});

		};

		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D graphics2d = (Graphics2D) g;

	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setStroke(new BasicStroke(1.0f));
	        
	        int radius = Math.min(getWidth()-2, getHeight()-2) / 2; 
	        
	        graphics2d.setColor(new Color(120,120,255,90));
	        graphics2d.fillOval(this.width / 2 - radius, this.height / 2 - radius, radius * 2, radius* 2);
	        
	        graphics2d.setColor(Color.white);
		    graphics2d.drawOval(this.width / 2 - radius , this.height / 2 - radius, radius * 2, radius * 2);
	        
	        graphics2d.setColor(Color.black);  // 폰트컬러 수정 위치 조정 필요
	        graphics2d.setFont(Window_Font_Install.font.deriveFont(16.0f)); //폰트사이즈 위치 조정 필요
	        
            FontMetrics fontmet = graphics2d.getFontMetrics();
            int t_Width = fontmet.stringWidth(a);
            int t_Height = fontmet.getHeight();

            int x = (getWidth() - t_Width) / 2;
            int y = (getHeight() - t_Height) / 2 + fontmet.getAscent();
	        
	        graphics2d.drawString(a, x, y);
	        graphics2d.dispose();
	    }
		
	};
	
