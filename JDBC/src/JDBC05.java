import java.sql.*;
import java.util.ArrayList;

import kr.erp.MemVO;
public class JDBC05 {

    public static void main(String[] args) throws SQLException {
        ArrayList<MemVO> list = new ArrayList<MemVO>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            // 나이가 15~20사이의 데이터만 출력
            String SQL = "select * from mygsm where age >= 15 and age <= 20";
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                int age = rs.getInt("age");
                //System.out.println(id+"\t"+pwd+"\t"+age);
                //묶어주고 -> 담기
                MemVO vo = new MemVO(id, pwd, age);
                list.add(vo);
            }
            memAllprint(list);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void memAllprint(ArrayList<MemVO> list) {
        for(MemVO vo : list) {
            System.out.println(vo);
        }
    }

}