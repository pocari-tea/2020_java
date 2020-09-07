package gsm;

import gsm.poly.*;

public class Gsm22 {
	public static void main(String[] args) {
		// A a = new A();
		// a.ptr();
		// AŬ������ ��ü�� upcasting���� �����ؼ� ptr() ���۽�Ű�ÿ�.
		
		Object obj = new A();
		((A)obj).ptr();
		
		obj = new B();
		((B)obj).ptr();
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}
	// display() �޼��带 �̿��ؼ� A, B Ŭ������ ptr()�� ����Ͻÿ�.
	private static void display(Object obj) {
		if (obj instanceof A) {
			((A)obj).ptr();
		}
		else {
			((B)obj).ptr();
		}
	}
}
