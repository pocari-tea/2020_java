package gsm;

public class Gsm02 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int[] b = {4, 3, 2, 1, 5}; // {} �ʱ�ȭ��
		// �迭���ҿ��� ¦���� ���? % -> ������ ����
		for(int i=0;i<b.length;i++) {
	         if(b[i]%2==0) {
	            System.out.println(b[i]);
	         }//_if
	      }//_for
		// ¦���� �հ� Ȧ���� ���� ���̰�?
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
