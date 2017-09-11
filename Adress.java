package management;


public class Adress {
	 private String street;
	 private int no;
	 private String town;
	 private String city;
	 
	 public Adress (String street,int no,String town,String city)
	 {
		 this.street=street;
		 this.no=no;
		 this.town=town;
		 this.city=city;
		 
	 }
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
