package abstractStudy;
//�� Ŭ������ Computer Ŭ������ ���� Ŭ�����̴�. 
//���� �� Ŭ������ ����Ŭ������ ��ӹ��� ������ ���ٸ� �߻�Ŭ������ �Ǿ���Ѵ�. ������ ��ӹ��� ���, �Ϲ� Ŭ������ �ȴ�.
//����Ŭ������ ��� �߻�޼ҵ带 ��ӹ������� �Ϲ� Ŭ������ �ǰ�, �ϳ��� ��ӹ��� ���� ��� �߻�Ŭ������ �ȴ�.
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
