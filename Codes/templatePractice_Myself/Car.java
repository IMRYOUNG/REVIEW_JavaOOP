package templatePractice_Myself;

public abstract class Car {
	public abstract void turnOn();

	public abstract void ride();

	public abstract void stop();

	public abstract void turnOff();

	public void run() {
		turnOn();
		ride();
		stop();
		turnOff();
	}
}
