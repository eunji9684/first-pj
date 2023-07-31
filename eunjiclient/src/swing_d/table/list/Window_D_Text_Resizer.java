package swing_d.table.list;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Text_Resizer extends JPanel {

	int width_2;
	int height_2;
	int cursor;
	boolean draw = false;
	
	public int 행		= 0;
	public int 열		= 0;
	public int x		= 0;
	public int y		= 0;
	public int width 	= 0;
	public int height 	= 0;
	public String 데이터 = "";
	public String type;
	
	
	public Window_D_Text_Resizer(Runnable run, int cursor, int x, int y, int width, int height){
		this.cursor = cursor;
		this.width_2 = width;
		this.height_2 = height;
		setBackground(new Color(50,50,255,80));
		setLocation(x,y);
		setSize(width,height);
		resize();
	}
	
	
	public void resize() {
		
		addMouseListener(new MouseAdapter() {
		    
		    public void mouseEntered(MouseEvent e) {
		    	setCursor(Cursor.getPredefinedCursor(cursor));
		    	draw = true;
		    }
		    public void mouseExited(MouseEvent e)  {
		    	
		    	setCursor(Cursor.getDefaultCursor());
		    	draw = false;
		    }
		    public void mouseReleased(MouseEvent e) {
		    	
		    	Window_interface_D.좌표조정();
		    	
		    	Window_interface_D.리스트_업로드();
		    }
		});

		addMouseMotionListener(new MouseAdapter() {
		    public void mouseDragged(MouseEvent e) {
		    	
		    	Window_interface_D.사이즈수정(열,width + e.getPoint().x);

		    }
		});
	}
		

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g.create();
        
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if(draw) {graphics2d.drawRect(0, 0, width_2-10, height_2-10);}
        
        graphics2d.dispose();
    }    

}

