package swing_d.accountbook;

import javax.swing.event.MouseInputListener;

public class MouseEx implements MouseInputListener {

    private 황은지_AWishlist wishs; // Declare wishs as a member variable of the class

    public MouseEx(황은지_AWishlist wishs) {
        this.wishs = wishs; // Initialize wishs through constructor injection
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        wishs.setVisible(true); // Make wishs visible instead of wish1
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
    }
}