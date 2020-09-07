package kr.gsm.model;

public class MyUtil {
	// 1 ~ 10까지 총합을 구하여 리턴하는 메서드
	public int toSum() {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	public int toSum(int s, int e) {
		int sum = 0;
		
		for(int i = s; i <= e; i++) {
			sum += i;
		}
		return sum;
	}
}
