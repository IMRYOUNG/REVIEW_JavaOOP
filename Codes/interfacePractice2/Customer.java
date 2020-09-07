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

	// Buy의 order()와 Sell의 order()처럼 함수의 이름이 같은 경우, 둘 중 어느 하나는 오버라이드해줘야됨
	@Override
	public void order() {
		System.out.println("Customer order");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
