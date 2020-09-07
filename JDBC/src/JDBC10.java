import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC10 {
	public static void main(String[] args) {
		String id = "3118java";
		String pwd = "java3118";
		int age = 18;
		// mygsm table���� id��  bit�� ȸ���� pwd�� java3118��, age�� 18�� �����Ͻÿ�.
		// ���� ����, ���� ����
        String SQL = "update mygsm set pwd=?, age=? where id=?";// �ҿ��� SQL
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
				System.out.println("�Է� ����");
			}else {
				System.out.println("�Է�  ����");
			}
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
