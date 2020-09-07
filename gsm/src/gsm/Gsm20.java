package gsm;

import gsm.poly.*;

public class Gsm20 {

	public static void main(String[] args) {
		// 다형성 -> 부모 클래스를 이용하는 것
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	
	private static void display(Animal ani) {
		ani.eat();
		ani.move();
	}

}
