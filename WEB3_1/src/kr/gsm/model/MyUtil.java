package kr.gsm.model;

public class MyUtil {
	// 1 ~ 10���� ������ ���Ͽ� �����ϴ� �޼���
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
