package gsm;

import gsm.util.MovieArray;
import gsm.util.MovieVO;

public class Gsm14 {

    public static void main(String[] args) {
        // ��ȭ 3���� MovieArray Ŭ������ �����ϰ� ����Ͻÿ�
        // new MV_Array
        MovieArray mv = new MovieArray();
        
        MovieVO mv1 = new MovieVO("���� �̸���", "������", 11111, 1);
        MovieVO mv2 = new MovieVO("���� ������ �԰�;�", "�ð� �Ϸ�Ű", 22222, 2);
        MovieVO mv3 = new MovieVO("�ܿ�ձ�", "����", 33333, 3);
        
        mv.add(mv1);
        mv.add(mv2);
        mv.add(mv3);

        for (int j = 0; j < mv.size(); j++) {
            System.out.println(mv.get(j));
        }
    }

}