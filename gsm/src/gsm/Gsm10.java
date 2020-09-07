package gsm;

import gsm.util.MyUtil;

public class Gsm10 {
	public static void main(String[] args) {
		int v = MyUtil.hap(10, 20);
		float vv = MyUtil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		
		// 반드시 생성자 메서드는 public으로 해야한다? X
		// MyUtil my = new MyUtil();
		// System sys = new System();
		// Math m = new Math(); X
		int a = 20;
		int b = 30;
		// a, b 수 중 최대값을 구하여 출력하세요. (단, Math클래스의 max() 함수를 이용)
		int max = Math.max(a, b);
		
		System.out.println(max);
		
	}
}
