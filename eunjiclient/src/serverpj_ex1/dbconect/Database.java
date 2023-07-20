package serverpj_ex1.dbconect;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class Database {
	
	//데이터 베이스와의 연결을 관리하는 Connection객체 선언하기
    private  Connection con;
    
    //database 생성자 메서드로 객체가 생성될 때 데이터 베이스에 연결된다.
    public Database() {
        try {
            // JDBC Driver 등록
            Class.forName("org.mariadb.jdbc.Driver");

            // 연결하기
            con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/test",
                    "tint",
                    "46119684"
            );

            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 임의의 솔트를 생성하는 메서드
    static String generateSalt() {
    	//솔트를 포함한 비밀번호를 생성
        SecureRandom random = new SecureRandom();
        
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    // BCrypt 해시를 생성하는 메서드
    static String hashPassword(String password, String salt) throws NoSuchAlgorithmException {
        String passwordWithSalt = password + salt;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(passwordWithSalt.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hashedBytes);
    }

    // 회원가입 기능
    public boolean signUp(String id, String password) {//사용자 입력 Pass
        try {
            String salt = generateSalt();
            String hashedPassword = hashPassword(password, salt);

            String sql = "INSERT INTO users (id, password, salt ,hashedPassword) VALUES (?, ?, ?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, password);
            pstmt.setString(3, salt);
            pstmt.setString(4, hashedPassword);

            int rowsAffected = pstmt.executeUpdate();
            pstmt.close();

            if (rowsAffected > 0) {
                System.out.println("회원가입 성공");
                return true;
            } else {
                System.out.println("회원가입 실패");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("회원가입 실패 > " + e.toString());
            return false;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("회원가입 실패 > " + e.toString());
            return false;
        }
    }

 // 로그인 정보 확인
    public boolean loginCheck(String id, String password) {
        try {
            String sql = "SELECT hashedpassword, salt FROM users WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String storedHashedPassword = rs.getString("hashedPassword");
                String salt = rs.getString("salt");
                String hashedPassword = hashPassword(password, salt);

                if (storedHashedPassword.equals(hashedPassword)) {
                    System.out.println("로그인 성공");
                    return true;
                } else {
                    System.out.println("로그인 실패 > 로그인 정보 불일치");
                    return false;
                }
            } else {
                System.out.println("로그인 실패 > 아이디가 존재하지 않습니다.");
                return false;
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println("로그인 실패 > " + e.toString());
            return false;
        } catch (SQLException e) {
            System.out.println("로그인 실패 > " + e.toString());
            return false;
        }
    }
}