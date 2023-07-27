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
    
    // 이메일로 사용자를 찾는 기능
    public boolean findUserByEmail(String email) {
        try {
            String sql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("이메일을입력하세요");
            return rs.next(); // 이메일이 존재하면 true, 없으면 false 반환

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 사용자 비밀번호 업데이트
    public boolean updateUserPassword(String email, String password) {
        try {
            // 비밀번호를 해시화하여 데이터베이스에 저장하는 기능을 구현한 것으로 가정합니다.
            String salt = Database.generateSalt();
            String hashedPassword = Database.hashPassword(password, salt);

            String sql = "UPDATE users SET password = ?, salt = ? WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, hashedPassword);
            pstmt.setString(2, salt);
            pstmt.setString(3, email);

            int rowsAffected = pstmt.executeUpdate();
            pstmt.close();

            return rowsAffected > 0; // 비밀번호 업데이트 성공 시 true, 실패 시 false 반환

        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
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
    public boolean signUp(String id, String password,String email, String tel) {//사용자 입력 Pass
        try {
            String salt = generateSalt();
            String hashedPassword = hashPassword(password, salt);

            String sql = "INSERT INTO users (id, password, salt ,hashedPassword,email,tel) VALUES (?, ?, ?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, password);
            pstmt.setString(3, salt);
            pstmt.setString(4, hashedPassword);
            pstmt.setString(5, email);
            pstmt.setString(6, tel);

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