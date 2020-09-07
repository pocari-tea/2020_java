package gsm;

import gsm.poly.*;

public class Gsm22 {
	public static void main(String[] args) {
		// A a = new A();
		// a.ptr();
		// A클래스의 객체를 upcasting으로 생성해서 ptr() 동작시키시오.
		
		Object obj = new A();
		((A)obj).ptr();
		
		obj = new B();
		((B)obj).ptr();
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}
	// display() 메서드를 이용해서 A, B 클래스의 ptr()을 출력하시오.
	private static void display(Object obj) {
		if (obj instanceof A) {
			((A)obj).ptr();
		}
		else {
			((B)obj).ptr();
		}
	}
}
