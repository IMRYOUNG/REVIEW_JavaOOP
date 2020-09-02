package singletonPatter;

public class Company {

	//�ƹ��͵� ���� �����ڸ� �����. 
	private Company() {}
	
	// �ڱ��ڽ�  ���� �ν��Ͻ��� �����. ��� ���ο��� �� �� �ִ� �������̴�.
	//�� �ý��� ��ü���� �� instance�� ������ ���̴�. 
	private static Company instance = new Company();
	
	//������ instance��  �ܺο��� �����ٰ�����ϱ� ���ؼ� 
	public Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;
	}
}
