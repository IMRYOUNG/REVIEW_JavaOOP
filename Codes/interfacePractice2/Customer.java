package interfacePractice2;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell");

	}

	@Override
	public void buy() {
		System.out.println("Customer buy");

	}

	// Buy�� order()�� Sell�� order()ó�� �Լ��� �̸��� ���� ���, �� �� ��� �ϳ��� �������̵�����ߵ�
	@Override
	public void order() {
		System.out.println("Customer order");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
