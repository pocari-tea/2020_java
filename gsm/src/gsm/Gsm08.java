package gsm;

public class Gsm08 {
	// 메서드 = 머리(원형 = 프로토타입) + 몸(바디 = 구현부)
	public static void main(String[] arg) {
		// 메서드 => 동작(행위 정보)
		// 메서드를 호출(call -> 부른다)
		int v = total(1, 10); // parameter passing(인수 전달 기법) -> Call By Value
		System.out.println(v);
		// 1 ~ 100까지의 총합 = ?
		
	}
	// 매개 변수로 2개의 정수를 받아 총합을 구하여 리턴하는 메서드를 정의하시오.
	// 메서드는 결국 변수다
	public static int total(int a, int b) {
		int value = a + b; // value -> 만들어낸 값
		return value;
	}
	// 매개변수로 2개의 정수를 받아 두 사이의 총합을 구하여 / 리턴하는 메서드를 정의하시오(twoHap)
	public static int twoHap(int a, int b) {
		int value = 0;
		if (a > b) {
			for (int i = a; i < b; i++) {
				value += i;
			}
		}
		else {
			for (int i = b; i < a; i++) {
				value += i;
			}
		}
		return value;
	}
}
