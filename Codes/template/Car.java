package template;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//모든 클래스에서 사용할 필요가 없는 메소드의 경우, 추상 클래스가 아닌 일반 클래스로 선언하되, 안의 내용이 없게 선언한다.
	//필요한 클래스에서 오버리아드 하면 된다.
	public void washCar() {}

	// 이렇게 내부의 순서가 절대로 바뀌면 안되는 메소드들은 재정의할 수 없게해야한다.
	// 그렇기위해서는 final을 붙이면된다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
