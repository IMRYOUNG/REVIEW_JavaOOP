package templatePractice_Myself;

public class Genesis extends Car {

	@Override
	public void turnOn() {
		System.out.println("Genesis 시동을 켭니다.");
		
	}

	@Override
	public void ride() {
		System.out.println("Genesis 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");
		
	}

}
