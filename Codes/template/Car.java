package template;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//��� Ŭ�������� ����� �ʿ䰡 ���� �޼ҵ��� ���, �߻� Ŭ������ �ƴ� �Ϲ� Ŭ������ �����ϵ�, ���� ������ ���� �����Ѵ�.
	//�ʿ��� Ŭ�������� �������Ƶ� �ϸ� �ȴ�.
	public void washCar() {}

	// �̷��� ������ ������ ����� �ٲ�� �ȵǴ� �޼ҵ���� �������� �� �����ؾ��Ѵ�.
	// �׷������ؼ��� final�� ���̸�ȴ�.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
