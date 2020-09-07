package gsm;

//å -> ����, ������, ����, ������
public class BookDTO {
	// 1. ��������
	private String title;
	private String name;
	private int price;
	private int page;
	// 2. ����Ʈ ������ �޼��带 ��������� ���� ��
	public BookDTO() { }
	public BookDTO(String title, String name, int price, int page) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.page = page;
	}
	// ������ overloading
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
