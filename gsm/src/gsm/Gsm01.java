package gsm;

public class Gsm01 {

	public static void main(String[] args) {
		// 변수 : 데이터를 1개만 저장 가능
		// 정수 3개를 저장할 변수를 선언하시오.
		int a = 10;
		int b = 20;
		int c = 30;
		//hap(a, b, c);
		//3개의 정수를 담아서 이동하는 바구니가 필요?
		// arr -> 객체(변수)
		int[] arr = new int[3];
		System.out.println(arr.length);
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		hap(arr);
	}
	//메서드를 정의
//	public static void hap(int a, int b, int c) {
//		int sum=a+b+c;
//		System.out.println(sum);
//	}
	
	public static void hap(int[] arr) {
		// 배열의 총합을 구하여 출력하는 코드를 작성
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("정훈: " + sum);
	}

}
