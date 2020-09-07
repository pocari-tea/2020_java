package gsm;

//책 -> 제목, 지은이, 가격, 페이지
public class BookDTO {
	// 1. 정보은닉
	private String title;
	private String name;
	private int price;
	private int page;
	// 2. 디폴트 생성자 메서드를 명시적으로 만들 것
	public BookDTO() { }
	public BookDTO(String title, String name, int price, int page) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.page = page;
	}
	// 생성자 overloading
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return page;
	}
	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", name=" + name + ", price=" + price + ", page=" + page + "]";
	}	
}
