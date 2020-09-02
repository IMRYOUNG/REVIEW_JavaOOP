package staticPractice_myOwn;

public class CardCompany {
	
	public static int serialNumber=10000;
	
	//2. private static 인스턴스 변수
	private static CardCompany cardNumber;
	
	//3. public static getInstance 메소드 구현
	public static CardCompany getInstance() {
		if(cardNumber==null) {
			cardNumber=new CardCompany();
		}
		return cardNumber;
	}
	
	//1. private 생성자
	private CardCompany() {}

	public Card createCard() {
		serialNumber++;
		Card card= new Card(int serialNumber);
		return card.getCardNumber();
	}


}
