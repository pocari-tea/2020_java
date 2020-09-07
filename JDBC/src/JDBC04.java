import java.sql.*;
public class JDBC04 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password="hr";    
            // 1. ���ᰴü ����
            Connection conn = DriverManager.getConnection(URL, user, password);
            if(conn!=null) {
                System.out.println("���Ӽ���");
            }else {
                System.out.println("���ӽ���");
            }
            // ��ü���ڵ带 ���������
            // id�� �������� �������� �����ؼ� ����Ͻÿ� --->SQL
            String SQL = "select * from mygsm order by id desc";
            // 2. SQL�������۰�ü(Ststement)
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            System.out.println("3118_����");
            System.out.println("���̵�\t�н�����\t����");
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