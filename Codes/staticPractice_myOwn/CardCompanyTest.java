package staticPractice_myOwn;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance(); //싱글톤 패턴
		
		Card myCard = company.createCard(); //메서드에서 Card 생성
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());//10001출력
		System.out.println(myCard.getCardNumber());//10001출력

	}

}
