import java.sql.*;

public class JDBC02 {

    public static void main(String[] args) {
        // Oracle DB 접속하기 -> Oracle용 접속 JDBC Driver(ojdbc6.jar) 필요.
        
        try {
            // 1. 메모리에 로딩..
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // 2. 접속 정보
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            // 연결객체생성(Connection)
            Connection conn = DriverManager.getConnection(URL, user, password);
            if(conn != null) {
                System.out.println("접속 성공");
            }else {
                System.out.println("접속 실패");
            }
            // SQL -> CRUD
            String SQL="insert into mygsm values('gsm', '18', 19)";
            // SQL문장을 전송하는 객체생성(Statement)
            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("입력성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}