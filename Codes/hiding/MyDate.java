package hiding;

public class MyDate {
	/*������ private���� �ְ� get��¼�� set��¼���� �̿��ؼ� ������ �����ϴ� ���� ���������̶��Ѵ�.*/
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		this.day=day;
		/*this.���� ǥ�õǴ� ���� setDay���� �Ķ���ͷ� �޴� �����̰�, =day;�� day�� �Ķ���ͷ� �Ѿ���� day�̴�.*/
	}
	
	public int getDay() {
		return day;
	}
	
	/*��ó�� ������ getDay() setDay()�� �Է��ؼ� �����ڸ� ���� ������, 
	*Source >> Generate Getters and Setters���� Generate�ϸ� �ȴ�.  */
	
	/*public void showDate() {
		System.out.println("��¥��"+year+"�� "+month+"��"+day+"�� �Դϴ�.");
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
	
	//��ȿ���� ���� ��¥�� ���, "��ȿ���� ���� ��¥�Դϴ�."�� ����Ϸ���
	private boolean isValid;
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid=false;
		}else
			this.month=month;
		
	}
	
	public void showDate() {
		if(isValid) { /*���������� isValid=true�� �����ߴ�. �����Ǵ� isValid�� �Ķ���ͷ� �־��µ� �� ���� else�� ����Ǿ���.
							*MyDateTestŬ�������� date.setMonth(8);��� month���� �־���.
							*�� �κп��� MyDateŬ������ .setMonth�Լ��� ȣ���Ͽ� ����� 8�̶��  �ް�,
							*.showDate�� ȣ���� �κп����� �Ķ���ͷ� if()���� �Ķ���͸� �޾� �˻��Ͽ� ������ �κ��� ���Ѵ�.	*/
			System.out.println("��¥��"+year+"�� "+month+"��"+day+"�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		}
	}
	
}
