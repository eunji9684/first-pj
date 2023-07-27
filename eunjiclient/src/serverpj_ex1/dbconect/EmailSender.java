package serverpj_ex1.dbconect;

import java.security.Security;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    // Gmail 계정 정보
    private static final String GMAIL_USERNAME = "dmswlwnsgk@gmail.com"; // Gmail 이메일 주소
    private static final String GMAIL_PASSWORD = "sjfzdjicxthsqlvv"; // Gmail 앱 비밀번호

    // 사용자가 입력한 이메일로만 이메일을 전송하는 메서드
    public static void sendEmail(String userEmail, String tempPassword) {
        // 이메일 전송을 위한 프로퍼티 설정
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        //props.put("mail.smtps.ssl.protocols","TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 587);

        // 세션 생성
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(GMAIL_USERNAME, GMAIL_PASSWORD);
            }
        });

        try {
            // 이메일 메시지 작성
        	 // Java 기본 보안 프로퍼티 설정
            Security.setProperty("jdk.tls.disabledAlgorithms", "");
            Security.setProperty("jdk.certpath.disabledAlgorithms", "");
            // SSL/TLS 프로토콜 사용
            props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            // 이메일 전송
        	
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(GMAIL_USERNAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
            message.setSubject("임시 비밀번호"); // 이메일 제목
            message.setText("임시 비밀번호: " + tempPassword + "입니다"); // 임시 비밀번호 내용

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
        String userEmail = "wjdtjrdntjr@naver.com";

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