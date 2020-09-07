package gsm;
//시작 클래스가 하나 필요함.
public class Start {
	public static void main(String[] args) {
		System.out.print("Hello Java!");
		System.out.println("Hello Java");
		//System.out.println();
		//프로그래밍의 3대 요소: 1. 변수 2. 자료형(Ex. int, float....) 3. 할당(=)
		int a; // 변수 선언 -> 기억공간이 만들어진다.
		a = 10;
		System.out.println("홍길동: " + a);
		// double(8byte)
		float b=(float)34.5; //d 강제 형변환
		System.out.println(b);
		
		char c='A'; //char -> 2byte
		System.out.println(c);
		
		// 아스키코드: 'A'->65, 'a'->97 : 32
		int cc='A'+1; //?
		System.out.println((char)cc); //65
		
		System.out.println((char)('A'+32));
		
		// + : 결합
		System.out.println('1'+'1'); // 11
		int z='1';
		int y='1';
		int v=z-'0'+y-'0'; // 2(x)->'1' : 49+49 = 98
		System.out.println("정훈: " + v); // 98(X)=2
	}
}