package gsm;

import gsm.util.Cat;
import gsm.util.Dog;

public class Gsm16 {
	public static void main(String[] args) {
		Dog d = new Dog("港港捞", 3);
		// d.name = "港港捞";
		// d.age = 3;
		System.out.println(d);
		
		Cat c = new Cat("具克捞", 2);
		System.out.println(c);
	}
}
