package gsm;


public class Gsm06 {
	public static void main(String[] args) {
		BookDTO book = new BookDTO("�ڹ�", "����", 24000, 500);
		
		// å ��ü�� �����͸� ����ϴ� �κ�	
		// System.out.println(book.getTitle() + " " + book.getName() + " " + book.getPrice() + " " + book.getPage());
		System.out.println(book.toString());
	}
}
