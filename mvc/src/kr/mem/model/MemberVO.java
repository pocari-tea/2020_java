package kr.mem.model;
//È¸¿ø -> MemberVO
public class MemberVO {
	private int num;
	private int bun;
	private String name;
	private String phone;
	private String email;
	private String addr;
	private MemberVO () { }
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", bun=" + bun + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", addr=" + addr + "]";
	}
	
}
