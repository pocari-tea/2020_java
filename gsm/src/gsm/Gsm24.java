package gsm;

import gsm.poly.*;

public class Gsm24 {

	public static void main(String[] args) {
		// 다형성 -> 상속, upcasting, override, 동적바인딩
		Animal ani = new Cat();
		System.out.println("3118정훈");
		ani.eat();
		ani.move();

	}

}
