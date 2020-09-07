package gsm.poly;

public abstract class Animal { // 불완전한 클래스
	public abstract void eat(); // 추상 메서드
	
	public abstract void move();
	public void play() {
		System.out.println("집에서 함께 생활한다.");
	}
}
