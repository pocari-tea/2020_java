package gsm.poly;

public class Cat extends Animal {
	// 부모의 메서드 재정의
	
	public void night() {
		System.out.println("밤에 눈에 불이 나온다.");
	}
	
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹다");
	}
	 
	@Override
	public void move() {
		System.out.println("고양이들이 무리지어 이동한다");
	}
}
