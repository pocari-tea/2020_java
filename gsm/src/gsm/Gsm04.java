package gsm;

public class Gsm04 {

	public static void main(String[] args) {
		int b_num = 3118;
		int b_ban = 1;
		float kor = 87.3f;
		float eng = 78.6f;
		
		SungJuck sj;
		sj=new SungJuck();
		sj.b_num=b_num;
		sj.b_ban=b_ban;
		sj.kor=kor;
		sj.eng=eng;
		System.out.println(sj.b_num);
		System.out.println(sj.b_ban);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
	}
}
