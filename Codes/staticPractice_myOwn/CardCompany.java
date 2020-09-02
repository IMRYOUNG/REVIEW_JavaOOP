package staticPractice_myOwn;

public class CardCompany {
	
	public static int serialNumber=10000;
	
	//2. private static �ν��Ͻ� ����
	private static CardCompany cardNumber;
	
	//3. public static getInstance �޼ҵ� ����
	public static CardCompany getInstance() {
		if(cardNumber==null) {
			cardNumber=new CardCompany();
		}
		return cardNumber;
	}
	
	//1. private ������
	private CardCompany() {}

	public Card createCard() {
		serialNumber++;
		Card card= new Card(int serialNumber);
		return card.getCardNumber();
	}


}
