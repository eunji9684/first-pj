package kang;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconResizer {

	static int newWidth = 50;
	static int newHeight = 50;
	
	public static ImageIcon resizeII(ImageIcon originalImageIcon) {

		 // 원하는 크기로 이미지를 조절합니다.
        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        
		return resizedImageIcon;
	}
	public static ImageIcon resizeII(ImageIcon originalImageIcon, int newWidth, int newHeight) {
		// 원하는 크기로 이미지를 조절합니다.
		Image originalImage = originalImageIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
		ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
		
		return resizedImageIcon;
	}
	
	
	
	
	
	
	
	
	/*
    public static void main(String[] args) {
        // 이미지 파일의 경로나 URL을 입력하세요.
    	ImageChooserExample ice = new ImageChooserExample();
        String imagePath = ice.getSelectedImgPath(); // 이미지 파일의 경로를 입력하거나
        // String imageURL = "https://example.com/image.jpg"; // 인터넷 상의 이미지 URL을 사용할 수도 있습니다.

        // ImageIcon 객체를 생성하여 이미지를 로드합니다.
        ImageIcon originalImageIcon = new ImageIcon(imagePath);
        
        // 원하는 크기로 이미지를 조절합니다.
        int newWidth = 100;
        int newHeight = 100;
        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        // 크기를 조절한 이미지로 ImageIcon을 다시 생성합니다.
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);

        // JLabel을 생성하고 크기를 조절한 ImageIcon을 JLabel에 설정하여 이미지를 표시합니다.
        JLabel label = new JLabel(resizedImageIcon);

        // 이미지가 들어있는 JLabel을 JFrame에 추가합니다.
        JFrame frame = new JFrame();
        frame.setSize(newWidth, newHeight); // 프레임 크기 설정
        frame.add(label); // 이미지가 있는 JLabel을 프레임에 추가
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // 프레임을 보여줍니다.
    }
    */
    
}
