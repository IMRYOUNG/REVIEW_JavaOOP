package singletonPatter;

public class companyTest {

	public static void main(String[] args) {
		/*Company company = new Company();
		*�̰� �� ���� ����.*/
	
	
	/*getInstance()�� Ÿ���� Company�� �Ϲ� �޼ҵ��̹Ƿ�
	*�ν��Ͻ��� �����ؾ߸� ȣ���� �� �ִ�.
	*�����ϴ� ����� static�� �ٿ��� public static Company getInstance()�� ����� ���̴�.
	*/

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
	
		System.out.println(company1);
		System.out.println(company2);
}
}