package gsm;

import gsm.util.MovieArray;
import gsm.util.MovieVO;

public class Gsm14 {

    public static void main(String[] args) {
        // 영화 3편을 MovieArray 클래스에 저장하고 출력하시오
        // new MV_Array
        MovieArray mv = new MovieArray();
        
        MovieVO mv1 = new MovieVO("너의 이름은", "정상현", 11111, 1);
        MovieVO mv2 = new MovieVO("너의 췌장을 먹고싶어", "시가 하루키", 22222, 2);
        MovieVO mv3 = new MovieVO("겨울왕국", "엘사", 33333, 3);
        
        mv.add(mv1);
        mv.add(mv2);
        mv.add(mv3);

        for (int j = 0; j < mv.size(); j++) {
            System.out.println(mv.get(j));
        }
    }

}