package gsm;

public class Gsm02 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int[] b = {4, 3, 2, 1, 5}; // {} 초기화블럭
		// 배열원소에서 짝수만 출력? % -> 논리적인 사고력
		for(int i=0;i<b.length;i++) {
	         if(b[i]%2==0) {
	            System.out.println(b[i]);
	         }//_if
	      }//_for
		// 짝수의 합과 홀수의 합의 차이가?
		int even=0;
		int odd=0;
		for(int v: b) {
			if(v%2==0){
				even+=v;
			}else {
				odd+=v;
			}
		}//_for_
		System.out.println(even-odd);
	}

}
