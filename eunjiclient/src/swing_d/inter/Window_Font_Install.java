package swing_d.inter;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class Window_Font_Install {

	public static Font font = font_install();
	
	public Window_Font_Install(){
		
		font = font_install();
	}
	
	public static Font font_install(){
		
		try {
			
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("src/font/omu.ttf"));
			
			GraphicsEnvironment fo = GraphicsEnvironment.getLocalGraphicsEnvironment();
            fo.registerFont(font);
		
            return font;
		}  
		catch (Exception e) {System.out.println(e.getMessage());}
		
			return null;
	};
	
}
