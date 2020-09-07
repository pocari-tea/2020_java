import java.sql.*;

public class JDBC03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			// 1. ���� ��ü ����
			Connection conn = DriverManager.getConnection(URL, user, password);
            
			// ����SQL=>id�� gsm�� ȸ���� ��й�ȣ
            String SQL ="update mygsm SET pwd='1004',age=15 where id='gsm'";
			
			// 2. SQL ���� ���� ��ü(Ststement)
            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
			// ���� -> ���� ����_�й�_�̸�
            System.out.println("���� ���� 3118 ����");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
