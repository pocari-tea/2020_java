package gsm;

import gsm.util.MyUtil;
import gsm.util.IntArray;

public class Gsm12 {
	public static void main(String[] args) {
        // IntArray에 정수 7개를 저장하고 전체를 출력하시오.
        // 첫번째 숫자는 학생번호를 저장하고 6개는 마음대로...
        IntArray a1 = new IntArray(7);
        
        a1.add(3118);
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        for (int j = 0; j < a1.size(); j++) {
            System.out.println(a1.get(j));
        }
    }
}
