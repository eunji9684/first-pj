package swing_d.table.list;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import swing_d.inter.Window_Font_Install;
import swing_d.inter.Window_interface_D;
import swing_d.table.calender.Window_D_Table_Center_Calender_Dialog;

public class Window_D_Table_Lable_Filed extends JLabel {

	public int 행;
	public int 열;
	public int x_location;
	public int y_location;
	public int width;
	public int height;
	public String a;
	public float font_size;
	public String type;
	
	int round= 10; 
	Window_D_Text_Resizer aaa;
	
	public Window_D_Table_Lable_Filed(int 행, int 열, int x_location, int y_location, int width, int height, String a, float font_size, String type){
		
		this.type = type;
		this.행 = 행;
		this.열 = 열;
		this.font_size = font_size;
		this.width = width -10;
		this.height = height -10;
		this.x_location = x_location;
		this.y_location = y_location;
		this.a = a;
		
		if(type == "int") {
			setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		if(type == "Select") {
			setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		if(type == "담당자") {
			setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		if(type == "Date") {
			setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		if(행 == 0) {
			setHorizontalAlignment(SwingConstants.CENTER);
			setFont(Window_Font_Install.font.deriveFont(font_size +1));
			setForeground(Color.black);
			setBorder(new EmptyBorder(0,30,0,45));
		}
		else {
			setFont(Window_Font_Install.font.deriveFont(font_size));
			setForeground(Color.gray);
			setBorder(new EmptyBorder(0,30,0,30));
		}
		
		setText(a);
		setOpaque(false);
		setBorder(new EmptyBorder(0,30,0,45));
		setLocation(x_location,y_location);
		setSize(width,height);
		
		if(행 == 0) {
			
			aaa = new Window_D_Text_Resizer(null, 11, width -4, 0, 4, 26);
		
			aaa.열 = 열;
			aaa.행 = 행;
			aaa.x = x_location;
			aaa.y = y_location;
			aaa.width = width;
			aaa.height = height;
			aaa.데이터 = a;
			aaa.type = type;
			
			add(aaa);
		}
		
		addMouseListener(new MouseAdapter() {
		    
			public void mouseClicked(MouseEvent e) {
	          	
                if (SwingUtilities.isLeftMouseButton(e)) { 

            		Window_interface_D.디스포지();
                	
                	if (type == "Select" && 행 == 0) {

                		Window_interface_D.디스포지();
                
                    	Window_interface_D.text_filed.열 = 열;
                    	Window_interface_D.text_filed.행 = 행;
                    	Window_interface_D.text_filed.x = x_location;
                    	Window_interface_D.text_filed.y = y_location;
                    	Window_interface_D.text_filed.width = width;
                    	Window_interface_D.text_filed.height = height;
                    	Window_interface_D.text_filed.데이터 = a;
                    	Window_interface_D.text_filed.type = type;
                    	
                    	Window_D_Table_Center_Text_Dialog A = Window_interface_D.dialog_text;
                    	
                    	A.setSize(width -15, 30);
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()+10) ,(int)(getLocationOnScreen().getY()-4));
                    	
                    	A.setVisible(true); 
                		
                	}
                	else if(type == "담당자" && 행 == 0) {

                		Window_interface_D.디스포지();
                
                    	Window_interface_D.text_filed.열 = 열;
                    	Window_interface_D.text_filed.행 = 행;
                    	Window_interface_D.text_filed.x = x_location;
                    	Window_interface_D.text_filed.y = y_location;
                    	Window_interface_D.text_filed.width = width;
                    	Window_interface_D.text_filed.height = height;
                    	Window_interface_D.text_filed.데이터 = a;
                    	Window_interface_D.text_filed.type = type;
                    	
                    	Window_D_Table_Center_Text_Dialog A = Window_interface_D.dialog_text;
                    	
                    	A.setSize(width -15, 30);
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()+10) ,(int)(getLocationOnScreen().getY()-4));
                    	
                    	A.setVisible(true); 
                		
                	}
                	else if(type == "Date" && 행 == 0) {

                		Window_interface_D.디스포지();
                
                    	Window_interface_D.text_filed.열 = 열;
                    	Window_interface_D.text_filed.행 = 행;
                    	Window_interface_D.text_filed.x = x_location;
                    	Window_interface_D.text_filed.y = y_location;
                    	Window_interface_D.text_filed.width = width;
                    	Window_interface_D.text_filed.height = height;
                    	Window_interface_D.text_filed.데이터 = a;
                    	Window_interface_D.text_filed.type = type;
                    	
                    	Window_D_Table_Center_Text_Dialog A = Window_interface_D.dialog_text;
                    	
                    	A.setSize(width -15, 30);
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()+10) ,(int)(getLocationOnScreen().getY()-4));
                    	
                    	A.setVisible(true); 
                		
                	}
                	
                	else if(type == "Select") {

                		Window_interface_D.디스포지();
                		
                    	Window_interface_D.분류선택.행 = 행;
                    	Window_interface_D.분류선택.열 = 열;
                    	Window_interface_D.분류선택.x_location = x_location;
                    	Window_interface_D.분류선택.y_location = y_location;
                    	Window_interface_D.분류선택.width = width;
                    	Window_interface_D.분류선택.height = height;
                    	Window_interface_D.분류선택.a = a;
                    	Window_interface_D.분류선택.type = type;
                    	
                		Window_D_Table_Center_Text_Dialog5 A = Window_interface_D.분류선택;
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()) ,(int)(getLocationOnScreen().getY()));
                    	
                    	A.setVisible(true);
                	}
                	else if(type == "담당자") {
                		Window_interface_D.디스포지();
                    
                		Window_interface_D.담당자선택.행 = 행;
                    	Window_interface_D.담당자선택.열 = 열;
                    	Window_interface_D.담당자선택.x_location = x_location;
                    	Window_interface_D.담당자선택.y_location = y_location;
                    	Window_interface_D.담당자선택.width = width;
                    	Window_interface_D.담당자선택.height = height;
                    	Window_interface_D.담당자선택.a = a;
                    	Window_interface_D.담당자선택.type = type;
                    	
                		Window_D_Table_Center_Text_Dialog6 A = Window_interface_D.담당자선택;
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()) ,(int)(getLocationOnScreen().getY()));
                    	
                    	A.setVisible(true);
                    	
                	}
                	else if(type == "Date") {

                		Window_interface_D.디스포지();

                    	Window_interface_D.달력패널.행 = 행;
                    	Window_interface_D.달력패널.열 = 열;
                    	Window_interface_D.달력패널.x_location = x_location;
                    	Window_interface_D.달력패널.y_location = y_location;
                    	Window_interface_D.달력패널.width = width;
                    	Window_interface_D.달력패널.height = height;
                    	Window_interface_D.달력패널.a = a;
                    	Window_interface_D.달력패널.type = type;
              
                		Window_D_Table_Center_Calender_Dialog A = Window_interface_D.달력생성;
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()) ,(int)(getLocationOnScreen().getY()));
                    	
                    	A.setVisible(true);    
                		
                		
                	}
                	else {
                
                		Window_interface_D.디스포지();
                		
                    	Window_interface_D.text_filed.열 = 열;
                    	Window_interface_D.text_filed.행 = 행;
                    	Window_interface_D.text_filed.x = x_location;
                    	Window_interface_D.text_filed.y = y_location;
                    	Window_interface_D.text_filed.width = width;
                    	Window_interface_D.text_filed.height = height;
                    	Window_interface_D.text_filed.데이터 = a;
                    	Window_interface_D.text_filed.type = type;
                    	
                    	Window_D_Table_Center_Text_Dialog A = Window_interface_D.dialog_text;
                    	
                    	A.setSize(width -15, 30);
                    	
                    	A.setLocation((int)(getLocationOnScreen().getX()+10) ,(int)(getLocationOnScreen().getY()-4));
                    	
                    	A.setVisible(true);    
                	}
                	    }
               
                else if (SwingUtilities.isRightMouseButton(e)) {
                	

            		Window_interface_D.디스포지();
                	
                	if(행 == 0) {
                		

                		Window_interface_D.디스포지();
              
                    	Window_D_Table_Center_Text_Dialog2 A = Window_interface_D.dialog_행_열_add;
                   
                    	A.setLocation((int)(e.getXOnScreen()) ,(int)(e.getYOnScreen()));
                    	
                    	A.setVisible(true); 
                    	
              
                	}
                	else if(열 == 0) {
                		

                		Window_interface_D.디스포지();
              
                    	Window_interface_D.열삭제하기.행_label = 행;
                    	Window_interface_D.열삭제하기.열_label = 열;
                    	Window_interface_D.열삭제하기.x_location_label = x_location;
                    	Window_interface_D.열삭제하기.y_location_label = y_location;
                    	Window_interface_D.열삭제하기.width_label = width;
                    	Window_interface_D.열삭제하기.height_label = height;
                    	Window_interface_D.열삭제하기.a_label = a;
                      	Window_interface_D.열삭제하기.font_size_label = font_size;
                    	Window_interface_D.열삭제하기.type_label = type;
                    	
                    	Window_interface_D.행삭제하기.행_label = 행;
                    	Window_interface_D.행삭제하기.열_label = 열;
                    	Window_interface_D.행삭제하기.x_location_label = x_location;
                    	Window_interface_D.행삭제하기.y_location_label = y_location;
                    	Window_interface_D.행삭제하기.width_label = width;
                    	Window_interface_D.행삭제하기.height_label = height;
                    	Window_interface_D.행삭제하기.a_label = a;
                      	Window_interface_D.행삭제하기.font_size_label = font_size;
                    	Window_interface_D.행삭제하기.type_label = type;
              
                    	Window_D_Table_Center_Text_Dialog2 A = Window_interface_D.dialog_행_열_add;
                   
                    	A.setLocation((int)(e.getXOnScreen()) ,(int)(e.getYOnScreen()));
                    	
                    	A.setVisible(true); 
                    	

              
                	}
                	
                }
            }
		});
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g.create();
         
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setStroke(new BasicStroke(1.0f));
        
        graphics2d.setColor(Color.white);

        graphics2d.fillRect(
        		0,
        		0, 
        		getWidth() -1,
        		getHeight() -1       	
        );
        
        graphics2d.setColor(new Color(50,50,180,60));
        if(행 == 0) {
        	graphics2d.setColor(new Color(0,0,0,60));
        	
        	graphics2d.drawLine(
            		getWidth()-10,
            		getHeight()-4, 
            		0+14,
            		getHeight()-4

            );
        }
        else if(열 == 0) {
        	graphics2d.setColor(new Color(0,0,0,60));
        	
        	graphics2d.drawLine(
            		getWidth()-10,
            		getHeight()-4, 
            		0+14,
            		getHeight()-4

            );
        	
        	
        }
        else {
        
        	graphics2d.drawLine(
            		getWidth()-10,
            		getHeight()-4, 
            		0+14,
            		getHeight()-4

            );
        	
        }
        if(행 == 0 ) {
        	graphics2d.setFont(Window_Font_Install.font.deriveFont(12.0f));
        	if (type == "int") {
        		graphics2d.drawString(type,width-15, height);	
                		
        	}
        	else {
        		
        		graphics2d.drawString(type,width-30, height);	
                
        	}
        }
        graphics2d.dispose();
        super.paintComponent(g); 
    }
    
}
