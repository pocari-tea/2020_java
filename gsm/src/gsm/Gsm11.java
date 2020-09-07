package gsm;

import gsm.util.MyUtil;
import gsm.util.IntArray;

public class Gsm11 {
	public	static void main(String[] args) {
		// float v = myUtil.hap(34.5f, 67.8f);
		// System.out.println(v);
		// 배열처럼 동작하는 클래스(API) -> IntArray
		// 1. 배열생성하는 동작
		int[] arr = new int[5];
		// 정수 10개를 저장할 수 있는 IntArray 객체를 생성하시오. (두가지 방법으로)
		IntArray a1 = new IntArray();
		IntArray a2 = new IntArray(10);
		// 2. 배열에 데이터를 저장하는 동작
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
	}
}
