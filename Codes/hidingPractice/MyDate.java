package hidingPractice;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
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
	
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String isValid() {
		if( day<1 || day>31) {
			return ("유효하지 않은 날짜입니다.");
		}else {
			if(month<1 || month>12) {
				return ("유효하지 않은 날짜입니다.");
			}else {
				return ("유효한 날짜입니다.");
			}
		}
		return ("유효한 날짜입니다.");
	}
	

}
