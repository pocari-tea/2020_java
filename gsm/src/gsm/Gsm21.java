package gsm;

import gsm.poly.*;
public class Gsm21 {

    public static void main(String[] args) {
        // ������ Ȱ�� 2
        // Dog, Cat�� �迭�� �����ϰ� Dog, Cat�� eat(), move() �޼��带 ���۽�Ű�ÿ�.
        Animal[] ani = new Animal[2];
        
        ani[0] = new Dog();
        ani[1] = new Cat();
        
        for(int i=0; i < ani.length; i++) {
            ani[i].eat();
            ani[i].move();
            if(ani[i] instanceof Cat) {
                ((Cat)ani[i]).night();
            }
        }
    }

}