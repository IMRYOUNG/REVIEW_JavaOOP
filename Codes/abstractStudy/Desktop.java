package abstractStudy;
//이 클래스는 Computer 클래스의 하위 클래스이다. 
//만일 이 클래스가 상위클래스를 상속받을 생각이 없다면 추상클래스가 되어야한다. 하지만 상속받은 경우, 일반 클래스가 된다.
//상위클래스의 모든 추상메소드를 상속받을때만 일반 클래스가 되고, 하나라도 상속받지 않을 경우 추상클래스가 된다.
public class Desktop extends Computer {
	
	@Override
	public void display() {
		System.out.println("Desktop display");
		
	}

	@Override
	public void typing() {
		System.out.println("Typing display");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turnoff the desktop");
	}

}
