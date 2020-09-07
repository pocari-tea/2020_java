import java.sql.*;

public class JDBC03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			// 1. 연결 객체 생성
			Connection conn = DriverManager.getConnection(URL, user, password);
            
			// 수정SQL=>id가 gsm인 회원의 비밀번호
            String SQL ="update mygsm SET pwd='1004',age=15 where id='gsm'";
			
			// 2. SQL 문장 전송 객체(Ststement)
            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
			// 성공 -> 수정 성공_학번_이름
            System.out.println("수정 성공 3118 정훈");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
