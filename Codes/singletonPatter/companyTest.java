package singletonPatter;

public class companyTest {

	public static void main(String[] args) {
		/*Company company = new Company();
		*이건 쓸 수도 없다.*/
	
	
	/*getInstance()는 타입이 Company인 일반 메소드이므로
	*인스턴스를 생성해야만 호출할 수 있다.
	*생성하는 방법은 static을 붙여서 public static Company getInstance()로 만드는 것이다.
	*/

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
	
		System.out.println(company1);
		System.out.println(company2);
}
}