package serverpj_ex1.dbconect.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			//JDBC Driver 등록
			Class.forName("org.mariadb.jdbc.Driver");
			
			//연결하기
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/",
					"tint",
					"46119684"
					
					);
			
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					//연결끊기
					con.close();
					System.out.println("연결끊기");
				} catch (SQLException e2) {
				
				}
			}
		}
	}
}
