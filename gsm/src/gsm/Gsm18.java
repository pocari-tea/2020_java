package gsm;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class Gsm18 {
    public static void main(String[] args) {
        //upcasting(업캐스팅) = 자동형변환
        Animal c = new Cat();
        c.eat();
        c.move();
        //c.night();
        //downcasting(다운캐스팅=강제형변환)
        Cat cc = (Cat)c;
        //Animal을 이용해서 Dog의 eat(), move() 구동
        Animal ani = new Dog();
        // 컴파일 시점에선 Animal의 eat(), move()
        // 실행 시점에선 Dog의 eat(), move()
        // 동적바인딩(Override) VS 정적바인딩(Overloading)
        ani.eat();
        ani.move();
    }
}