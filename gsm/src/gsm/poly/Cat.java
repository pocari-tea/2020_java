package gsm.poly;

public class Cat extends Animal {
	// �θ��� �޼��� ������
	
	public void night() {
		System.out.println("�㿡 ���� ���� ���´�.");
	}
	
	@Override
	public void eat() {
		System.out.println("�����ó�� �Դ�");
	}
	 
	@Override
	public void move() {
		System.out.println("����̵��� �������� �̵��Ѵ�");
	}
}
