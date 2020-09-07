package kr.gsm.model;

public class MapVO {
	private String name;
	private String phone;
	private String companyName;
	private double latitude;
	private double longitude;
	public MapVO() { }
	public MapVO(String name, String phone, String companyName, double
	latitude, double longitude) {
		super();
		this.name = name;
		this.phone = phone;
		this.companyName = companyName;
		this.latitude = latitude;
		this.longitude = longitude;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "MapVO [name=" + name + ", phone=" + phone + ",companyName=" + companyName + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}