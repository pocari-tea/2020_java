package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class Gsm19 {

    public static void main(String[] args) {
        // Animal Ŭ������ Dog, Cat�� ��� ����� ���۽�Ű�ÿ�.
        Animal ani1 = new Dog();
        ani1.eat();
        ani1.move();
        
        Animal ani2 = new Cat();
        ani2.eat();
        ani2.move();
        Cat cc = (Cat)ani2;
        cc.night();
    }

}