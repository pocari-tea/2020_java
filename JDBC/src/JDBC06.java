import java.sql.*;

public class JDBC06 {
	public static void main(String[] args) {
		// update, delete
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            String SQL = "update mygsm set pwd = 'abcd', age = 20 where id = 'gsm'";
            int cnt = st.executeUpdate(SQL);
            if (cnt > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
