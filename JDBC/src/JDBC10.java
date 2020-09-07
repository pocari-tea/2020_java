import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC10 {
	public static void main(String[] args) {
		String id = "3118java";
		String pwd = "java3118";
		int age = 18;
		// mygsm table에서 id가  bit인 회원의 pwd를 java3118로, age를 18로 수정하시오.
		// 수정 성공, 수정 실패
        String SQL = "update mygsm set pwd=?, age=? where id=?";// 불완전 SQL
        String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user="hr";
        String password="hr";
            // ---------------------------------------------------------
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, pwd);
            ps.setInt(2, age);
            ps.setString(3, id);       
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
