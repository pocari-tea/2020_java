import java.util.Scanner;

import kr.erp.MemDAO;
import kr.erp.MemVO;

public class JDBC11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID:");
		String id = scan.next();
		
		System.out.print("PWD:");
		String pwd = scan.next();
		
		System.out.print("AGE:");
		int age = Integer.parseInt(scan.next()); // "21" -> 21
		
		MemVO vo = new MemVO(id, pwd, age);
		MemDAO dao = new MemDAO();
		int cnt = dao.MemInsert(vo);
		if (cnt > 0) {
			System.out.println("입력 성공");
		}else {
			System.out.println("입력 실패");
		}
	}
}
