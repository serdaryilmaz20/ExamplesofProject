package management;


public class Calender {
	private int day;
	private int month;
	private int year;
	
	public Calender(String date) {
		
		String [] dater=date.split("/");
		this.day =Integer.parseInt(dater[0]);
		this.month = Integer.parseInt(dater[1]);;
		this.year = Integer.parseInt(dater[2]);;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
