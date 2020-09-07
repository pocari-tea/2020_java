package gsm;


public class Gsm06 {
	public static void main(String[] args) {
		BookDTO book = new BookDTO("자바", "정훈", 24000, 500);
		
		// 책 전체의 데이터를 출력하는 부분	
		// System.out.println(book.getTitle() + " " + book.getName() + " " + book.getPrice() + " " + book.getPage());
		System.out.println(book.toString());
	}
}
