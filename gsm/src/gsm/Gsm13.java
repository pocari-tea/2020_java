package gsm;

import gsm.util.floatArray;

public class Gsm13 {

    public static void main(String[] args) {
        // FloatArray ��ü�� ����� 5���� �Ǽ� �����͸� �����ϰ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
        // ����ϴ� �ڵ带 �ۼ��Ͻÿ�
        // FloatArray Ŭ������ ����� (add, get, size)
        // 3112.0f, 34.5f ~
        floatArray f1 = new floatArray();
        
        f1.add(3118.0f);
        f1.add(1.1f);
        f1.add(2.2f);
        f1.add(3.3f);
        f1.add(4.4f);

        for (int j = 0; j < f1.size(); j++) {
            System.out.print(f1.get(j) + "\t");
        }
    }

}