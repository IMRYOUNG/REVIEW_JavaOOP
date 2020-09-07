package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;

		int priceLee = customerLee.calcPrice(100000);
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원입니다.");

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원입니다.");

		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "입니다.");
		// 여기서 호출된 메서드는 VIPCustomer의 메소드이다.
		//customerNo.하면 Customer 클래스의 함수와 파라미터가 보이기는 하지만, 실제로 불러오는것은 하위클래스인 VIPCustomer의 것이다.

	}

}