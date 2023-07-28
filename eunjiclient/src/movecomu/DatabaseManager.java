package movecomu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DatabaseManager {
    // 마리아DB 연결 정보
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/test"; // 데이터베이스 URL
    private static final String DB_USER = "tint"; // 데이터베이스 사용자명
    private static final String DB_PASSWORD = "46119684"; // 데이터베이스 비밀번호

    // 데이터베이스 연결 메서드
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // 임시 비밀번호를 데이터베이스에 저장하는 메서드
    public static void saveTemppassword(String id, String temppassword) {
       String sql= "UPDATE `test`.`users` SET `temppassword`='" +  temppassword + "' WHERE  `id`='" +  id +"';";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, temppassword);
            pstmt.executeUpdate();
            System.out.println("임시 비밀번호 저장 성공");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 데이터베이스 연결 관리를 위한 생성자 메서드
    public DatabaseManager() {
        try {
            // JDBC Driver 등록
            Class.forName("org.mariadb.jdbc.Driver");

            // 연결하기
            Connection con = getConnection();

            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}