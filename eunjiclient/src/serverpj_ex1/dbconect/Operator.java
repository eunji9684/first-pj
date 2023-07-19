package serverpj_ex1.dbconect;
//main 메소드가 존재하며 각 클래스들을 연결해주는 역할을 한다.
public class Operator {
    Database db = null;
    MainFrame mf = null;

    public static void main(String[] args) {
        Operator opt = new Operator();
        opt.db = new Database(); // Database 클래스 인스턴스 생성
        opt.mf = new MainFrame(opt);
    }

    public boolean signUp(String id, String password) {
        return db.signUp(id, password);
    }

    public boolean loginCheck(String id, String password) {
        return db.loginCheck(id, password);
    }
}