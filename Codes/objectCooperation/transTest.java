package objectCooperation;

public class transTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James",50000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		Subway subGreen=new Subway(500);
		Taxi taxi9=new Taxi("¸ð¹ü");
		
		
		//studentJ.takeBus(bus100);
		//studentJ.takeSub(subGreen);
		studentJ.takeTaxi(taxi9);
		
		studentJ.showInfo();
	}

}
