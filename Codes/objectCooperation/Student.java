package objectCooperation;

public class Student {
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	//°´Ã¼ Çù¾÷ ½ÃÀÛ
	public void takeBus(Bus bus) { //°´Ã¼¸¦ ¹Þ°í
		bus.take(10000); //°´Ã¼ÀÇ ¸Þ¼­µå°¡ È£ÃâµÈ´Ù.
		this.money-=10000;
	}
	
	public void takeSub(Subway sub) {
		sub.take(200);
		this.money-=200;
	}
	
	public void taketaxi(Taxi taxi) {
		taxi.take(50000);
		this.money-=50000;
	}
	//°´Ã¼ Çù¾÷ ³¡
	

	public void showInfo() {
		if(money<0) {
			System.out.println("µ·ÀÌ ¾ø½À´Ï´Ù.");
		}else {
		System.out.println(name+"´ÔÀÇ ³²Àº µ·Àº "+money+"ÀÔ´Ï´Ù.");
	}}
	
	
}
