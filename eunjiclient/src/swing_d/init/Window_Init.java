package swing_d.init;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window_Init {
	
	//테이블 라벨의 사이즈를 지정함
	
	public float font_size = 16.0f;
		
	//사용자 정보 및 관련 아이템을 가져오는 옵션임
	public static ArrayList<JLabel> 팀스페이스_리스트 = new ArrayList();
	public static ArrayList<JLabel> 내스페이스_리스트 = new ArrayList();
	
	//프레임의 헤드를 제거하는 옵션임
	public static boolean Frame_head = true;
	//프레임의 getcontestpanel 투명화 옵션입니다.
	public static Color Frame_backcolor = new Color(0,0,0,0); 
	
	//프레임의 사이즈를 바탕화면과 맞추는 오토사이즈 작업을 실행할지 말지를 결정합니다.
	public boolean mainframe_auto_size = true;
	//리사이저를 보여줄지 말지 정하는 옵션입니다.
	public boolean resize_line_visible = false;
	
	public Color resize_color = new Color(255,255,255,0);
	
	/*최초의 메인 패널에 대한 설정임 해당 패널은 센터로, 좌,우,상,하에는 리사이저가 배치되어 있음*/
	public int main_panel_x = 0;  
	public int main_panel_y = 0; 
	public int main_panel_border_layout_x = 0;
	public int main_panel_border_layout_y = 0;
	public boolean main_panel_border_layout = true;
	public boolean main_panel_border_rownd = true;
	public float main_panel_border_setStroke = 1.0f;
	public int main_panel_width_rownd  = 30;
	public int main_panel_height_rownd = 30;	
	public Color main_set_layout_color = new Color(110,110,255,255);
	public Color main_set_fill_color = new Color(142,192,248,200);	//#8EC0E4
	
	/* 로그인 패널로 리사이저가 배치되어 있지 않음 고정된 화면 요소임*/
	public int main_login_x = 0;  
	public int main_login_y = 0; 
	public int main_size_width = 300;
	public int main_size_height = 500;
	public int main_login_border_layout_x = 0;
	public int main_login_border_layout_y = 0;
	public boolean main_login_border_layout = true;
	public boolean main_login_border_rownd = true;
	public float main_login_border_setStroke = 1.0f;
	public int main_login_width_rownd  = 30;
	public int main_login_height_rownd = 30;	
	public Color main_login_set_layout_color = new Color(120,120,120,255);
	public Color main_login_set_fill_color = new Color(142,192,228,180);	//#8EC0E4
	
	/*메인 패널에 들어간 센터 패널임, 해당 패널은 team, table, message가 포함되어 있음*/
	public int main_panel_center_border_layout_x = 0;
	public int main_panel_center_border_layout_y = 0;
	public int main_panel_center_x = 0;  
	public int main_panel_center_y = 0;
	public boolean main_panel_center_border_layout = true;	
	public boolean main_panel_center_border_rownd = true;
	public float main_panel_center_border_setStroke = 2.0f;
	public int main_panel_center_width_rownd  = 15;
	public int main_panel_center_height_rownd  = 15;
	public Color main_set_center_layout_color = new Color(0,0,0,0);
	public Color main_set_center_fill_color = new Color(255,255,255,0);
	
	/*헤드패널은 그리드 레이아웃임*/
	public int head_panel_height = 25; //헤드의 높이를 정하는 옵션임
	public int head_panel_x = 5;
	public int head_panel_y = 5;
	public boolean head_panel_border_layout = false;
	public boolean head_panel_border_rownd = true;
	public float head_panel_border_setStroke = 1.0f;
	public int head_panel_width_rownd  = 10;
	public int head_panel_height_rownd  = 10;
	public Color head_set_layout_color = new Color(0,0,0,1);
	public Color head_set_fill_color = new Color(120,120,120,20);	
	
	/*헤드 패널에 추가되는 끄기, 숨기기, 사이즈 조절 기능임*/
	public boolean btn_label_circle_layout = true; 
	public boolean btn_label_border_rownd = true;
	
	public Color btn_label_set_layout_color = new Color(255,255,255,255);
	public Color btn_label_set_fill_color = new Color(225,225,225,255);	
	public Color btn_label_set_font_color = new Color(0,0,0,255);	
	public float btn_label_border_setStroke = 1.0f;
	public float btn_label_set_font_size = 16.0f;	
	public int btn_size = 20;
	
	public Color team_label_set_layout_color = new Color(0,0,0,255); // 현재 미사용
	public Color team_label_set_fill_color = new Color(245,245,245,255);	
	public Color team_label_set_fill_color1 = new Color(200,200,200,255); // 음영컬러	
	
	public Color team_label_set_font_color = new Color(0,0,0,255);	
	public float team_label_border_setStroke = 2.0f;
	public float team_label_set_font_size = 18.0f;	
	
	
	/*헤드의 레이아웃 기능임*/
	public GridBagLayout GL_head(GridBagLayout GL) {
		GL.columnWidths = new int[]{5,btn_size +2,btn_size +2,btn_size +2,50,50,btn_size +2 ,btn_size +2 ,btn_size +2 ,5};
		GL.rowHeights = new int[]{head_panel_height-2};
		GL.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.5, 0.0, 0.0, 0.0, 0.0};
		GL.rowWeights = new double[]{Double.MIN_VALUE};
		return GL;
	} 
	
	public int team_panel_x = 5;
	public int team_panel_size_fix = 200;
	public boolean team_panel_border_layout = false;
	public boolean team_panel_border_rownd = true;
	public float team_panel_border_setStroke = 1.0f;
	public int team_panel_width_rownd  = 20;
	public int team_panel_height_rownd  = 20;
	public Color team_set_layout_color = new Color(0,0,0,255);
	public Color team_set_fill_color = new Color(245,245,245,255);

	/*팀의 레이아웃 기능임*/
	public GridBagLayout GL_team(GridBagLayout GL) {
		
		GL.columnWidths = new int[]{33};
		GL.columnWeights = new double[]{1.0};
		
		GL.rowHeights = new int[]{33,33,33,33};
		GL.rowWeights = new double[]{0.0,0.0,0.0,1.0};
		return GL;
	} 
	
	public int user_team_string_x = 0;
	public int user_team_string_y = 5;
	public int user_team_string_width = 198;
	public int user_team_string_height = 45;
	
	public int user_team_space_x = 5;
	public int user_team_space_y = 5;
	public int user_team_space_width = 198;
	public int user_team_space_height = 330;
	
	public boolean 팀스페이스 = false;
	public boolean 내스페이스 = false;

	public int table_panel_x = 5;
	public boolean table_panel_border_layout = false;
	public boolean table_panel_border_rownd = true;
	public float table_panel_border_setStroke = 1.0f;
	public int table_panel_width_rownd  = 20;
	public int table_panel_height_rownd  = 20;
	public Color table_set_layout_color = new Color(0,0,0,255);
	public Color table_set_fill_color = new Color(255,255,255,255);	
	
	/*테이블 안의 리스트 레이아웃 기능임*/
	public GridBagLayout GL_list(GridBagLayout GL) {
		
		GL.columnWidths = new int[]{500,10};
		GL.columnWeights = new double[]{0.0,1.0};
		
		GL.rowHeights = new int[]{40,40,40};
		GL.rowWeights = new double[]{0.0,0.0,1.0};
		return GL;
	} 
	
	public  void listUp(ArrayList<JLabel> label) {
		for (int i = 0; i < label.size(); i++) {
			//Window_interface_D.diary_list.add(list.get(i),GL_label(Window_interface_D.team_GL_list, 0, i, 5, 0, 0, 0));
		}
	}
	
	public  void listadd() {
		//list.add(new Table_list(null,5, 5, 400, 40));
	}
	
	public int message_panel_x = 5;
	public int message_panel_size_fix = 300;
	public boolean message_panel_border_layout = false;
	public boolean message_panel_border_rownd = true;
	public float message_panel_border_setStroke = 1.0f;
	public int message_panel_width_rownd  = 20;
	public int message_panel_height_rownd  = 20;
	public Color message_set_layout_color = new Color(0,0,0,255);
	public Color message_set_fill_color = new Color(245,245,245,255);	
	
	
	
	/*하단은 정리되지 못한 라벨임*/
	public int table_panel_x_margin = message_panel_x + message_panel_x;//team_panel_x + 
	public int other_panel_margin = 0;
	public int other_panel_height = head_panel_height - other_panel_margin;
	public int table_panel_size = team_panel_size_fix + message_panel_size_fix;


	
	public boolean head_move_icon_layout = false;
	public boolean head_move_icon_rownd = true;
	public Color head_move_icon_color = new Color(180,255,255,180);	

	public boolean team_move_icon_layout =true;
	public boolean team_move_icon_rownd = true;
	public Color team_move_icon_fill_color = new Color(120,255,255,210);	
	public Color team_move_icon_layout_color = new Color(0,0,0,180);	
	public float team_move_icon_setStroke = 2.0f;
	
	public boolean message_move_icon_layout = false;
	public boolean message_move_icon_rownd = true;
	public Color message_move_icon_color = new Color(180,255,255,180);	
	public float message_move_icon_setStroke = 2.0f;
	
	public boolean table_move_icon_layout = false;
	public boolean table_move_icon_원그리기 = false;
	public boolean table_move_icon_rownd = true;
	public Color table_move_icon_color = new Color(180,255,255,180);	
	public float table_move_icon_setStroke = 2.0f;
	public int table_move_icon_width_rownd  = 10;
	public int table_move_icon_height_rownd  = 10;

	/*오토 사이즈를 사용하면 아래 사이즈로 정리됩니다.*/
	public boolean panel_auto_resize = false;
	public int main_panel_auto_x = 5;
	public int main_panel_auto_y = 5;
	public int head_panel_auto_y = 5;
	public int head_panel_auto_x = 5;
	public int team_panel_auto_x = 5;
	public int team_panel_auto_y = 5;
	public int message_panel_auto_y = 5;
	public int message_panel_auto_x = 5;
	public int table_panel_auto_x = 5;
	public int table_panel_auto_y = 5;
	
	/*아래는 아직 구상중인 화면사이즈 태그임*/
	public int[] size_option_1= {1920,1080};
	public int[] size_option_2= {1760,990};
	public int[] size_option_3= {1680,1050};
	public int[] size_option_4= {1600,900};
	public int[] size_option_5= {1366,768};
	public int[] size_option_6= {1280,1024};
	public int[] size_option_7= {1280,720};
	public int[] size_option_8= {1128,634};
	public int[] size_option_9= {1024,768};
	public int[] size_option_10= {1024,768};
	
	public GridBagConstraints GL_label(GridBagConstraints label,int grid_x, int grid_y,int insert1,int insert2,int insert3,int insert4) {
		label.insets = new Insets(insert1, insert2, insert3, insert4);
		label.gridx = grid_x;
		label.gridy = grid_y;
		return label;
	}
	
	public boolean hasPanel(Container container, String position) {
        LayoutManager layout = container.getLayout();
        
        if (layout instanceof BorderLayout) {
            BorderLayout borderLayout = (BorderLayout) layout;
            Component component = borderLayout.getLayoutComponent(container, position);
            
            return component != null;
        }
        
            return false;
	}
	
	
	
	public int isPanel(Container container, String position) {
        LayoutManager layout = container.getLayout();
        
        if (layout instanceof BorderLayout) {
            BorderLayout borderLayout = (BorderLayout) layout;
            Component component = borderLayout.getLayoutComponent(container, position);
            
            if (component == null) {return 0;}
            else {component.getWidth();}
            
            return component.getWidth();
        }
    
        
        return 0;	
	}
	
	public int GetPanel(Container container, String position) {
        LayoutManager layout = container.getLayout();
        
        if (layout instanceof BorderLayout) {
            BorderLayout borderLayout = (BorderLayout) layout;
            Component component = borderLayout.getLayoutComponent(container, position);
            
            if (component == null) {return 0;}
            else {component.getLocation().getX();}
            
            return message_panel_x;
        }
    
        
        return 0;	
	}



}
