import java.sql.*;

public class JDBC02 {

    public static void main(String[] args) {
        // Oracle DB �����ϱ� -> Oracle�� ���� JDBC Driver(ojdbc6.jar) �ʿ�.
        
        try {
            // 1. �޸𸮿� �ε�..
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // 2. ���� ����
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            // ���ᰴü����(Connection)
            Connection conn = DriverManager.getConnection(URL, user, password);
            if(conn != null) {
                System.out.println("���� ����");
            }else {
                System.out.println("���� ����");
            }
            // SQL -> CRUD
            String SQL="insert into mygsm values('gsm', '18', 19)";
            // SQL������ �����ϴ� ��ü����(Statement)
            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("�Է¼���");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}