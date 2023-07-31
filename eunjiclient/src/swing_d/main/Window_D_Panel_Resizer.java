package swing_d.main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import swing_d.inter.Window_interface_D;

public class Window_D_Panel_Resizer extends JPanel {

	Color color;
	int cursor;
	
	public Window_D_Panel_Resizer(Runnable run, Color color, int cursor, int x, int y, int width, int height){
	
		/*사이즈를 조절하는 기능을 가진 동서남북의 패널입니다.*/
		this.cursor = cursor;
		this.color = color;
		
		setSize(width,height);
		setPreferredSize(new Dimension(width, height));
		setLocation(x, y);		
		setLayout(null);
		setOpaque(false); 
		
		/*생성자를 호출 할 때 객체에 등록하는 마우스 이벤트입니다. */
		addMouseListener(new MouseAdapter() {
		    public void mousePressed(MouseEvent e) {
		    	
		    	Window_interface_D.resize[0] = Window_interface_D.main_panel.getWidth();
		    	Window_interface_D.resize[1] = Window_interface_D.main_panel.getHeight();
		    	
		    }
		    public void mouseEntered(MouseEvent e) {setCursor(Cursor.getPredefinedCursor(cursor));}
		    public void mouseExited(MouseEvent e)  {setCursor(Cursor.getDefaultCursor());}
		    public void mouseReleased(MouseEvent e) {Window_interface_D.resize_relayout_();}
		    
		});

		addMouseMotionListener(new MouseAdapter() {
		    public void mouseDragged(MouseEvent e) {
		    	
		    	Window_interface_D.resize[2] = e.getPoint().x;
		    	Window_interface_D.resize[3] = e.getPoint().y;

		    	run.run();

		    }
		    
		    public void mouseReleased(MouseEvent e) {Window_interface_D.resize_relayout_();}
		});
		
	}
		

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2d = (Graphics2D) g.create();
        
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        
        if(Window_interface_D.option.resize_line_visible) {
        
        	graphics2d.setColor(this.color); // 패널의 배경색 설정
        	
        	graphics2d.drawRect(x, y, width, height);
        
        	graphics2d.setColor(this.color);
        
        	graphics2d.fillRect(x, y, width, height);
		}
        graphics2d.dispose();
    }    

}

