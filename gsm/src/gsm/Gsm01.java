package gsm;

public class Gsm01 {

	public static void main(String[] args) {
		// ���� : �����͸� 1���� ���� ����
		// ���� 3���� ������ ������ �����Ͻÿ�.
		int a = 10;
		int b = 20;
		int c = 30;
		//hap(a, b, c);
		//3���� ������ ��Ƽ� �̵��ϴ� �ٱ��ϰ� �ʿ�?
		// arr -> ��ü(����)
		int[] arr = new int[3];
		System.out.println(arr.length);
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		hap(arr);
	}
	//�޼��带 ����
//	public static void hap(int a, int b, int c) {
//		int sum=a+b+c;
//		System.out.println(sum);
//	}
	
	public static void hap(int[] arr) {
		// �迭�� ������ ���Ͽ� ����ϴ� �ڵ带 �ۼ�
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("����: " + sum);
	}

}
