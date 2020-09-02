package objectCooperation;

public class Student {
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	//��ü ���� ����
	public void takeBus(Bus bus) { //��ü�� �ް�
		bus.take(10000); //��ü�� �޼��尡 ȣ��ȴ�.
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
	//��ü ���� ��
	

	public void showInfo() {
		if(money<0) {
			System.out.println("���� �����ϴ�.");
		}else {
		System.out.println(name+"���� ���� ���� "+money+"�Դϴ�.");
	}}
	
	
}
