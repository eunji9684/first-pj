package kang;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GyazoImageLoader {
	
	
    public static ImageIcon loadGyazoImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            Image image = ImageIO.read(url);

            // 이미지를 화면에 보여주는 Swing 창 생성
            JFrame frame = new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(image.getWidth(null), image.getHeight(null));

            ImageIcon imageIcon = new ImageIcon(image);
            return imageIcon;
    
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    public static void loadGyazoImageTest(String imageUrl) {
    	try {
    		URL url = new URL(imageUrl);
    		Image image = ImageIO.read(url);
    		
    		// 이미지를 화면에 보여주는 Swing 창 생성
    		JFrame frame = new JFrame();
    		frame.setLayout(new FlowLayout());
    		frame.setSize(image.getWidth(null), image.getHeight(null));
    		
    		// 이미지를 JLabel로 감싸서 화면에 표시
    		JLabel label = new JLabel(new ImageIcon(image));
    		frame.add(label);
    		frame.setVisible(true);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    */
    
}
