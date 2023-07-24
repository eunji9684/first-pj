package serverpj_ex1.dbconect.jung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DIary_DAO {
	Connection conn =  null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	
	public void conn() {
		try {
			Class.forName("org.jdbc.driver.Driver");
			
			String url = "jdbc:mariadb://localhost:3306/diary_user";
            String id =  "tint";
            String pw  =  "46119684";
					
          conn = DriverManager.getConnection(  url,id,pw); 
          

		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		
	   }catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}
	
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public int insert(String id,String password,String name) throws SQLException {
	conn();
		
		String sql = "insert into member (id,password,name)"
				+  " values(?,?,?)";
		try {
			 	psmt = conn.prepareStatement(sql);
			    psmt.setString(1, id);
			    psmt.setString(2, password);
			    psmt.setString(3, name);
			    cnt = psmt.executeUpdate();
			    
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	
}
}