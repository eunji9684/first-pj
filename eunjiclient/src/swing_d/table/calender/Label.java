package swing_d.table.calender;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import swing_d.inter.Window_interface_D;

public class Label extends JLabel {
	
	public String 년;
	public String 월;
	public String 일;
	
	public Label(){
		
		addMouseListener(new MouseAdapter() {
		
		    public void mouseClicked(MouseEvent e) {
		    	Window_interface_D.달력생성.dispose();
		    	
		    	String a[] = Window_interface_D.달력패널.topLabel.getText().split(",");
		    	if(a[1].length() == 1 && getText().length() == 1 ) {
		    		
		    		try {
						
		    			Integer.parseInt(getText());
		    			Window_interface_D.지정수정(Window_interface_D.달력패널.행, Window_interface_D.달력패널.열, Window_interface_D.달력패널.x_location, Window_interface_D.달력패널.y_location, Window_interface_D.달력패널.width, Window_interface_D.달력패널.height, a[0] + "-0"+ a[1] +"-0"+ getText(), Window_interface_D.달력패널.type);
	
					    
					} catch (Exception e2)  {
					
					}
		    		
				    		
		    	}
		    	else if (a[1].length() == 1){
		    		
		    		try {
						
		    			Integer.parseInt(getText());
		    			Window_interface_D.지정수정(Window_interface_D.달력패널.행, Window_interface_D.달력패널.열, Window_interface_D.달력패널.x_location, Window_interface_D.달력패널.y_location, Window_interface_D.달력패널.width, Window_interface_D.달력패널.height, a[0] + "-0"+ a[1] +"-"+ getText(), Window_interface_D.달력패널.type);
		    		
					    
					} catch (Exception e2)  {
					
					}
		    		
		    		
		    	}
		    	
		    	else if (getText().length() == 1){
		    		
		    		try {
						
		    			Integer.parseInt(getText());
		    			Window_interface_D.지정수정(Window_interface_D.달력패널.행, Window_interface_D.달력패널.열, Window_interface_D.달력패널.x_location, Window_interface_D.달력패널.y_location, Window_interface_D.달력패널.width, Window_interface_D.달력패널.height, a[0] + "-"+ a[1] +"-0"+ getText(), Window_interface_D.달력패널.type);
			    		
			    	
					} catch (Exception e2)  {
					
					}
				    
		    	}
		    	
		    	else {
		    		try {
						
		    			Integer.parseInt(getText());
		    			Window_interface_D.지정수정(Window_interface_D.달력패널.행, Window_interface_D.달력패널.열, Window_interface_D.달력패널.x_location, Window_interface_D.달력패널.y_location, Window_interface_D.달력패널.width, Window_interface_D.달력패널.height,a[0] + "-"+ a[1] +"-"+ getText(), Window_interface_D.달력패널.type);
			   
					} catch (Exception e2)  {
					
					}
		    		
		    	}
		    	
		    	
		    	
		    }
		
		});
		
	}
}
