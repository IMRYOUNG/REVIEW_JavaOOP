package abstractStudy;

public abstract class Computer {

	// �߻�Ŭ������ {};�� �ƴ϶� ;�̴�. �׳� {};�� �ȿ� ������ ���� ���� �߻�޼ҵ�� �ƴ϶���.
	// �߻�޼ҵ�� �ݵ�� �߻�Ŭ���� �ȿ� �־���Ѵ�. �Ϲ� Ŭ���� �ȿ� ������ �ȵȴ�.
	public abstract void display();
	public abstract void typing();
	// �߻�Ŭ������ ����Ŭ�������� �����̵ȴ�.

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
