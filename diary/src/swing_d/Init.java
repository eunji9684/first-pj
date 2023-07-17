package swing_d;

import java.awt.Color;

public class Init {
	
	public int head_panel_height = 60;
	public int other_panel_margin = 5;
	public int other_panel_height = head_panel_height - other_panel_margin;
	public int other_border_layout_width = 0;
	public int other_border_layout_height = 0;
	
	public int head_panel_size_fix = 200;
	public int message_panel_size_fix = 150;
	public int table_panel_size = head_panel_size_fix + message_panel_size_fix;
	
	public boolean resize_line_visible = false;
	public boolean mainframe_auto_size = true;
	
	public boolean main_panel_border_layout = true;
	public boolean main_panel_border_rownd = true;
	public float main_panel_border_setStroke = 2.0f;
	public int main_panel_width_rownd  = 10;
	public int main_panel_height_rownd  = 10;	
	public Color main_set_layout_color = new Color(120,180,180,255);
	public Color main_set_fill_color = new Color(120,180,180,255);	
	
	public boolean main_panel_center_border_layout = false;
	public boolean main_panel_center_border_rownd = true;
	public float main_panel_center_border_setStroke = 1.0f;
	public int main_panel_center_width_rownd  = 10;
	public int main_panel_center_height_rownd  = 10;	
	public Color main_set_center_layout_color = new Color(0,0,0,255);
	public Color main_set_center_fill_color = new Color(80,180,180,180);	
	
	public boolean head_panel_border_layout = false;
	public boolean head_panel_border_rownd = true;
	public float head_panel_border_setStroke = 1.0f;
	public int head_panel_width_rownd  = 10;
	public int head_panel_height_rownd  = 10;
	public Color head_set_layout_color = new Color(0,0,0,255);
	public Color head_set_fill_color = new Color(255,255,255,255);	
	
	public boolean team_panel_border_layout = false;
	public boolean team_panel_border_rownd = true;
	public float team_panel_border_setStroke = 1.0f;
	public int team_panel_width_rownd  = 10;
	public int team_panel_height_rownd  = 10;
	public Color team_set_layout_color = new Color(0,0,0,255);
	public Color team_set_fill_color = new Color(255,255,255,255);	
	
	public boolean message_panel_border_layout = false;
	public boolean message_panel_border_rownd = true;
	public float message_panel_border_setStroke = 1.0f;
	public int message_panel_width_rownd  = 10;
	public int message_panel_height_rownd  = 10;
	public Color message_set_layout_color = new Color(0,0,0,255);
	public Color message_set_fill_color = new Color(255,255,255,255);	
	
	public boolean table_panel_border_layout = false;
	public boolean table_panel_border_rownd = true;
	public float table_panel_border_setStroke = 1.0f;
	public int table_panel_width_rownd  = 10;
	public int table_panel_height_rownd  = 10;
	public Color table_set_layout_color = new Color(0,0,0,255);
	public Color table_set_fill_color = new Color(255,255,255,255);	
	
	public boolean btn_label_circle_layout = false;  //버튼옆에 테두리를 그릴지 말지
	public boolean btn_label_border_rownd = true;    //원으로 그릴지 사각형으로 그릴지
	public float btn_label_border_setStroke = 1.0f;
	public Color btn_label_set_layout_color = new Color(0,0,0,255);
	public Color btn_label_set_fill_color = new Color(255,255,255,255);	
	public Color btn_label_set_font_color = new Color(0,0,0,255);	
	public float btn_label_set_font_size = 24f;	
	
	public boolean panel_auto_resize = false;
	public int main_panel_auto_x = 6;
	public int main_panel_auto_y = 6;
	public int head_panel_auto_y = 6;
	public int head_panel_auto_x = 6;
	public int team_panel_auto_x = 6;
	public int team_panel_auto_y = 6;
	public int message_panel_auto_y = 6;
	public int message_panel_auto_x = 6;
	public int table_panel_auto_x = 6;
	public int table_panel_auto_y = 6;
	
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

}
