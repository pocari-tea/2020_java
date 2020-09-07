import java.util.List;

import kr.erp.MemDAO;
import kr.erp.MemVO;

public class JDBC12 {

    public static void main(String[] args) {
        // mygsm 테이블에서 전체리스트 출력?
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
            System.out.println("데이터가 없다.");
        }
    }

}