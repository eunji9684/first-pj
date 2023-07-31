package swing_d.size;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;

import swing_d.inter.Window_interface_D;

public class Window_D_GraphicsEnvironment{
	
	public static GraphicsEnvironment size_instance = GraphicsEnvironment.getLocalGraphicsEnvironment();		
    public static ArrayList<String[]> size = new ArrayList();
        
    public GraphicsEnvironment 동적인스턴스;
    public GraphicsDevice[] size_screens;
    public GraphicsConfiguration what_config;
    public GraphicsDevice what_device;
    public int 작업표시줄_사이즈;
    
    public void 디바이스정보(){
		동적인스턴스 = GraphicsEnvironment.getLocalGraphicsEnvironment();		
		size_screens = 동적인스턴스.getScreenDevices();		
		what_config = Window_interface_D.diary_frame.getGraphicsConfiguration();
        what_device = what_config.getDevice();
        
    	size.clear();
		for (int i = 0; i < size_screens.length; i++) {
			
			if (i == 0) {
				int b = resize_screen_height;
				double c = size_screens[i].getDefaultConfiguration().getDefaultTransform().getScaleY();
				Double a = size_screens[i].getDefaultConfiguration().getBounds().getHeight();
				작업표시줄_사이즈 = (int)(a - b);
			}
			
			String a[] = ((i + 1)+","+size_screens[i].getDefaultConfiguration().getBounds().getWidth()+","+size_screens[i].getDefaultConfiguration().getBounds().getHeight()+","+size_screens[i].getDefaultConfiguration().getDefaultTransform().getScaleX()+","+size_screens[i].getDefaultConfiguration().getDefaultTransform().getScaleY()).toString().split(",");
			size.add(a);			
		}	
		
	}
	
	public int 화면사이즈_업데이트() {	
		GraphicsConfiguration what_config = Window_interface_D.diary_frame.getGraphicsConfiguration();
        GraphicsDevice what_device = what_config.getDevice();
		for (int i = 0; i < size_screens.length; i++) {
			if (size_screens[i].equals(what_device)) {
			return (i);
			}}
		
		return 0;	
	}
	
	public static int resize_screen_width = (int)(size_instance.getMaximumWindowBounds().width);
	public static int resize_screen_height = (int)(size_instance.getMaximumWindowBounds().height);


}
