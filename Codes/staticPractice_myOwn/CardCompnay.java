/*static 과 singleton pattern
 * 카드 회사가 있습니다. 카드회사는 유일한 객체이고, 이 회사에서는 카드를 발급하면
 * 항상 고유번호가 자동으로 생성됩니다.
 * 10001부터 시작하여 카드가 생성될 때마다 10002, 10003식으로 증가 됩니다.
 * CardCompnayTest코드가 수행 되도록 Card 클래스와 CardCompany 클래스를 구현하세요.*/

package staticPractice_myOwn;

import singletonPatter.Company;

public class CardCompany {
	
	static int singletonNum=10001;
	
	//아무것도 없는 생성자를 만든다. 
	private CardCompany() {}
	
	// 자기자신  변수 인스턴스를 만든다. 얘는 내부에서 쓸 수 있는 생성자이다.
	//이 시스템 전체에서 이 instance가 유일한 것이다. 
	private static CardCompany instance = new CardCompany();
	
	//유일한 instance를  외부에서 가져다가사용하기 위해서 
	//public CardCompany getInstance() {
	public static CardCompany getInstance() {
		if(instance==null) {
			instance=new CardCompany();
		}
		return instance;
	}

	public Card createCard() {
		
	}

}
