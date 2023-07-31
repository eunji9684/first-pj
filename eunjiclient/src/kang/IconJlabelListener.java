package kang;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconJlabelListener extends MouseAdapter{
	
	
	private Window_D_Table_Label_img2 mij;
	private JLabel jlabel;
	private ImageIcon imageIcon;
	
	
	public IconJlabelListener(JLabel jLabel, Window_D_Table_Label_img2 mij) {
		this.mij = mij;
		this.jlabel = jLabel;
		this.imageIcon = (ImageIcon) jLabel.getIcon();
	}
	
	
	
	public void changeMainIcon() {
		this.mij.setIcon(this.imageIcon);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		changeMainIcon();
		mij.repaint();

	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		this.jlabel.setOpaque(true);
		this.jlabel.setBackground(Color.LIGHT_GRAY);
		
		// 마우스 포인터 모양을 HAND_CURSOR로 변경
        this.jlabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		this.jlabel.setOpaque(false);
		this.jlabel.setBackground(Color.white);
		
		// 마우스 포인터 모양을 기본 커서로 변경
        this.jlabel.setCursor(Cursor.getDefaultCursor());
	}
	
	
	
	
	
}
