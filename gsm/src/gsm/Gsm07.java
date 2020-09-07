package gsm;

public class Gsm07 {
	
	public static void main(String[] args) {
		// 책 2권을 메모리에 저장하고 출력하시오.
		BookDTO[] book = new BookDTO[3];
		for (int i = 0; i < book.length; i++) {
			book[i] = new BookDTO();
		}
		
		book[0].setTitle("Title 1");
		book[0].setName("정훈");
		book[0].setPrice(10000);
		book[0].setPage(100);
		
		book[1].setTitle("Title 2");
		book[1].setName("정훈");
		book[1].setPrice(20000);
		book[1].setPage(200);
		
		book[2].setTitle("Title 3");
		book[2].setName("정훈");
		book[2].setPrice(310000);
		book[2].setPage(300);
		
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].toString());
		}
	}

}
