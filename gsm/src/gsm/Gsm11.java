package gsm;

import gsm.util.MyUtil;
import gsm.util.IntArray;

public class Gsm11 {
	public	static void main(String[] args) {
		// float v = myUtil.hap(34.5f, 67.8f);
		// System.out.println(v);
		// �迭ó�� �����ϴ� Ŭ����(API) -> IntArray
		// 1. �迭�����ϴ� ����
		int[] arr = new int[5];
		// ���� 10���� ������ �� �ִ� IntArray ��ü�� �����Ͻÿ�. (�ΰ��� �������)
		IntArray a1 = new IntArray();
		IntArray a2 = new IntArray(10);
		// 2. �迭�� �����͸� �����ϴ� ����
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
	}
}
