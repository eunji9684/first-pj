package kang;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class IconPanel2 extends JPanel{
	
	Window_D_Table_Label_img2 mij;
	
	public IconPanel2(Window_D_Table_Label_img2 mij) {
		
		int x = 0;
		int y = 0;
		int gridWidth = 3; //한 줄에 표시할 아이콘 개수
		

		this.mij = mij;
		
		setLayout(new GridLayout(0, gridWidth, 10, 10)); // rows, cols, hgap, vgap
		
		setSize(300, 300);

		ArrayList<String> allImageUrls = GyazoImageFetcher.fetchAndExtractGyazoImages(GyazoImageFetcher.gyazoAccessToken);
		
		Iterator it = allImageUrls.iterator();
        
        while(it.hasNext()) {
        	ImageIcon originalImageIcon = GyazoImageLoader.loadGyazoImage((String)it.next());
        	ImageIcon resizedImageIcon = ImageIconResizer.resizeII(originalImageIcon);
			
			JLabel jLabel = new JLabel(resizedImageIcon);
			
			jLabel.addMouseListener(new IconJlabelListener(jLabel, mij));
			
			
			this.add(jLabel);
        }

	}
	
}
