import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC09 {
	public static void main(String[] args) {
		String id = "3118java";
		String pwd = "java3118";
		int age = 20;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            // 변수에는 "+변수+"
            String SQL = "insert into mygsm values(?, ?, ?)";// 불완전 SQL
            // 불완전한 SQL문장을 전송할 수 있는 개체
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, id);
            ps.setString(2, pwd);
            ps.setInt(3, age);
            
            int cnt = ps.executeUpdate();
            if (cnt > 0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력  실패");
			}
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
