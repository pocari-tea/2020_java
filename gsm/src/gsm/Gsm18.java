package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class Gsm18 {
    public static void main(String[] args) {
        //upcasting(��ĳ����) = �ڵ�����ȯ
        Animal c = new Cat();
        c.eat();
        c.move();
        //c.night();
        //downcasting(�ٿ�ĳ����=��������ȯ)
        Cat cc = (Cat)c;
        //Animal�� �̿��ؼ� Dog�� eat(), move() ����
        Animal ani = new Dog();
        // ������ �������� Animal�� eat(), move()
        // ���� �������� Dog�� eat(), move()
        // �������ε�(Override) VS �������ε�(Overloading)
        ani.eat();
        ani.move();
    }
}