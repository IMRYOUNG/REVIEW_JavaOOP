package abstractStudy;

public abstract class Computer {

	// 추상클래스는 {};가 아니라 ;이다. 그냥 {};는 안에 내용이 없는 거지 추상메소드는 아니란거.
	// 추상메소드는 반드시 추상클래스 안에 있어야한다. 일반 클래스 안에 있으면 안된다.
	public abstract void display();
	public abstract void typing();
	// 추상클래스는 하위클래스에서 구현이된다.

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
