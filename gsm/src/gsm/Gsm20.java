package gsm;

import gsm.poly.*;

public class Gsm20 {

	public static void main(String[] args) {
		// ������ -> �θ� Ŭ������ �̿��ϴ� ��
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
