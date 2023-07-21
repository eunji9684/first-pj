package serverpj_ex1.dbconect.jung;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBEXAM1 {
	private Connection conn;
	public DBEXAM1() {
		try {
			Class.forName("org.jdbc.driver.Driver");
			
			conn = DriverManager.getConnection(   
					"jdbc:mariadb://localhost:3306/test",
                    "tint",
                    "46119684");
					
			System.out.println("연결에 성공했습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
