import java.util.List;

import kr.erp.MemDAO;
import kr.erp.MemVO;

public class JDBC12 {

    public static void main(String[] args) {
        // mygsm ���̺��� ��ü����Ʈ ���?
        // for, foreach( : )
        
        MemDAO dao = new MemDAO();
        List<MemVO> list=dao.MemAllList();
        if(list.size() > 0) {
            for(int i=0; i < list.size(); i++) {
                MemVO vo = list.get(i);
                System.out.println(vo.getId()+"\t"+vo.getPwd()+"\t"+vo.getAge());
            }
            System.out.println("---------------------------------------");
            for(MemVO vo : list) {
                System.out.println(vo);
            }
        }else {
            System.out.println("�����Ͱ� ����.");
        }
    }

}