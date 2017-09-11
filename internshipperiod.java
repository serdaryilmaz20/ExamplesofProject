package management;


public class internshipperiod {
	private String type;
	private int week;
	
	
	public internshipperiod(String type, int week) {
		this.type = type;
		this.week = week;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}

}
