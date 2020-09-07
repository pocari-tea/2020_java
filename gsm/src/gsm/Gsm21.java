package gsm;

import gsm.poly.*;
public class Gsm21 {

    public static void main(String[] args) {
        // 다형성 활용 2
        // Dog, Cat을 배열에 저장하고 Dog, Cat의 eat(), move() 메서드를 동작시키시오.
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