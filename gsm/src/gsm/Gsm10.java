package gsm;

import gsm.util.MyUtil;

public class Gsm10 {
	public static void main(String[] args) {
		int v = MyUtil.hap(10, 20);
		float vv = MyUtil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		
		// �ݵ�� ������ �޼���� public���� �ؾ��Ѵ�? X
		// MyUtil my = new MyUtil();
		// System sys = new System();
		// Math m = new Math(); X
		int a = 20;
		int b = 30;
		// a, b �� �� �ִ밪�� ���Ͽ� ����ϼ���. (��, MathŬ������ max() �Լ��� �̿�)
		int max = Math.max(a, b);
		
		System.out.println(max);
		
	}
}
