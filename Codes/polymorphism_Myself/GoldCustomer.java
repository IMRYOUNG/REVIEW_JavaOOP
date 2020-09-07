/*제품을 살 때는 항상 10%를 할인해 줍니다.
 * 보너스 포인트는 2%를 적립해 줍니다.
 * 담당 전문 상담원은 없습니다.*/

package polymorphism_Myself;

public class GoldCustomer extends Customer {

	double salesRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}

}
