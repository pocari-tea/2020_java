import java.sql.*;
public class JDBC04 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password="hr";    
            // 1. 연결객체 생성
            Connection conn = DriverManager.getConnection(URL, user, password);
            if(conn!=null) {
                System.out.println("접속성공");
            }else {
                System.out.println("접속실패");
            }
            // 전체레코드를 가지고오기
            // id를 기준으로 내림차순 정렬해서 출력하시오 --->SQL
            String SQL = "select * from mygsm order by id desc";
            // 2. SQL문장전송객체(Ststement)
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            System.out.println("3118_정훈");
            System.out.println("아이디\t패스워드\t나이");
            while(rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                int age = rs.getInt("age");
                System.out.println(id+"\t"+pwd+"\t"+age);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}