package gsm;

public class Gsm08 {
	// �޼��� = �Ӹ�(���� = ������Ÿ��) + ��(�ٵ� = ������)
	public static void main(String[] arg) {
		// �޼��� => ����(���� ����)
		// �޼��带 ȣ��(call -> �θ���)
		int v = total(1, 10); // parameter passing(�μ� ���� ���) -> Call By Value
		System.out.println(v);
		// 1 ~ 100������ ���� = ?
		
	}
	// �Ű� ������ 2���� ������ �޾� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	// �޼���� �ᱹ ������
	public static int total(int a, int b) {
		int value = a + b; // value -> ���� ��
		return value;
	}
	// �Ű������� 2���� ������ �޾� �� ������ ������ ���Ͽ� / �����ϴ� �޼��带 �����Ͻÿ�(twoHap)
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
