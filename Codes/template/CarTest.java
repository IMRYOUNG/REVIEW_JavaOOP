package template;

public class CarTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		//Car aiCar = new AICar(); �ص� �ȴ�.
		aiCar.run();
		System.out.println("=============================");
		Car manualCar = new ManualCar();
		manualCar.run();
		

	}

}
