package hiding;

public class MyDate {
	/*변수를 private으로 주고 get어쩌구 set어쩌구를 이용해서 변수에 접근하는 것을 정보은닉이라한다.*/
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		this.day=day;
		/*this.으로 표시되는 것은 setDay에서 파라미터로 받는 변수이고, =day;의 day는 파라미터로 넘어오는 day이다.*/
	}
	
	public int getDay() {
		return day;
	}
	
	/*위처럼 일일히 getDay() setDay()를 입력해서 생성자를 만들어도 되지만, 
	*Source >> Generate Getters and Setters에서 Generate하면 된다.  */
	
	/*public void showDate() {
		System.out.println("날짜는"+year+"년 "+month+"월"+day+"일 입니다.");
	}*/

	public int getMonth() {
		return month;
	}

	/*public void setMonth(int month) {
		this.month = month;
	}*/

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//유효하지 않은 날짜인 경우, "유효하지 않은 날짜입니다."를 출력하려면
	private boolean isValid;
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid=false;
		}else
			this.month=month;
		
	}
	
	public void showDate() {
		if(isValid) { /*실험적으로 isValid=true를 대입했다. 원강의는 isValid만 파라미터로 주었는데 그 때는 else가 실행되었다.
							*MyDateTest클래스에서 date.setMonth(8);라고 month값을 주었다.
							*이 부분에서 MyDate클래스의 .setMonth함수를 호출하여 결과를 8이라고  받고,
							*.showDate를 호출한 부분에서는 파라미터로 if()안의 파라미터를 받아 검사하여 실행할 부분을 정한다.	*/
			System.out.println("날짜는"+year+"년 "+month+"월"+day+"일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
	
}
