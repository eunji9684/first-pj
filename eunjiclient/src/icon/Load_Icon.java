package icon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Load_Icon {

	public List<ImageIcon> iconsList = new ArrayList<>();
	public File folder;
	public Load_Icon() {
		
		folder = new File("src/icon");

		if (folder.isDirectory()) {
	        File[] files = folder.listFiles();
	        if (files != null) {
	            for (File file : files) {
	            	if(file.getName() == null) {
	            		System.out.println("null");
	            	}
	            	else {
	            		
	            		if(file.getName().split("\\.")[1].equals("png")){
	            			iconsList.add(new ImageIcon(file.getPath()));
	            		}; 
	            	}
	            }
	        }
	    } 
		else {System.out.println("지정된 경로 폴더가 아닌듯...");}

	}
}
