package template;

public class CarTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		//Car aiCar = new AICar(); 해도 된다.
		aiCar.run();
		System.out.println("=============================");
		Car manualCar = new ManualCar();
		manualCar.run();
		

	}

}
