package gsm;
//���� Ŭ������ �ϳ� �ʿ���.
public class Start {
	public static void main(String[] args) {
		System.out.print("Hello Java!");
		System.out.println("Hello Java");
		//System.out.println();
		//���α׷����� 3�� ���: 1. ���� 2. �ڷ���(Ex. int, float....) 3. �Ҵ�(=)
		int a; // ���� ���� -> �������� ���������.
		a = 10;
		System.out.println("ȫ�浿: " + a);
		// double(8byte)
		float b=(float)34.5; //d ���� ����ȯ
		System.out.println(b);
		
		char c='A'; //char -> 2byte
		System.out.println(c);
		
		// �ƽ�Ű�ڵ�: 'A'->65, 'a'->97 : 32
		int cc='A'+1; //?
		System.out.println((char)cc); //65
		
		System.out.println((char)('A'+32));
		
		// + : ����
		System.out.println('1'+'1'); // 11
		int z='1';
		int y='1';
		int v=z-'0'+y-'0'; // 2(x)->'1' : 49+49 = 98
		System.out.println("����: " + v); // 98(X)=2
	}
}