/*static �� singleton pattern
 * ī�� ȸ�簡 �ֽ��ϴ�. ī��ȸ��� ������ ��ü�̰�, �� ȸ�翡���� ī�带 �߱��ϸ�
 * �׻� ������ȣ�� �ڵ����� �����˴ϴ�.
 * 10001���� �����Ͽ� ī�尡 ������ ������ 10002, 10003������ ���� �˴ϴ�.
 * CardCompnayTest�ڵ尡 ���� �ǵ��� Card Ŭ������ CardCompany Ŭ������ �����ϼ���.*/

package staticPractice_myOwn;

import singletonPatter.Company;

public class CardCompany {
	
	static int singletonNum=10001;
	
	//�ƹ��͵� ���� �����ڸ� �����. 
	private CardCompany() {}
	
	// �ڱ��ڽ�  ���� �ν��Ͻ��� �����. ��� ���ο��� �� �� �ִ� �������̴�.
	//�� �ý��� ��ü���� �� instance�� ������ ���̴�. 
	private static CardCompany instance = new CardCompany();
	
	//������ instance��  �ܺο��� �����ٰ�����ϱ� ���ؼ� 
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
