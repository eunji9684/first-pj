package serverpj_ex1.dbconect;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;
import java.util.Random;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    // 사용자가 입력한 이메일로만 이메일을 전송하는 메서드
    public static void sendEmail(String userEmail, String tempPassword) {
        // Gmail 계정 정보
        final String username = "dmswlwnsgk@gmail.com"; // Gmail 이메일 주소
        final String emailPassword = "alrcvgmdqorbryqc"; // Gmail 앱 비밀번호

        // 이메일 전송을 위한 프로퍼티 설정
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Gmail의 경우
        props.put("mail.smtp.port", "587");

        // 세션 생성
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, emailPassword);
            }
        });

        try {
            // 이메일 메시지 작성
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
            message.setSubject("임시 비밀번호"); // 이메일 제목
            message.setText("임시 비밀번호: " + tempPassword); // 임시 비밀번호 내용

            // 이메일 전송
            Transport.send(message);

            System.out.println("이메일이 성공적으로 전송되었습니다.");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("이메일 전송에 실패하였습니다.");
        }
    }

    public static void main(String[] args) {
        // 사용자가 입력한 이메일
        String userEmail = "dmswlwnsgk@gmail.com";

        // 임시 비밀번호 생성
        String tempPassword = generateRandomPassword();

        // 이메일로 임시 비밀번호 전송
        sendEmail(userEmail, tempPassword);
    }

    // 임시 비밀번호 생성
    static String generateRandomPassword() {
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * allowedChars.length());
            sb.append(allowedChars.charAt(index));
        }

        return sb.toString();
    }
}
