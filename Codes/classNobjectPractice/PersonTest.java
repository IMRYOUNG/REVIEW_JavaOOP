package classNobjectPractice;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.age=40;
		person.name="James";
		person.marriage=true;
		person.babies=3;
		
		System.out.println("���� :"+person.age);
		System.out.println("�̸� : "+person.name);
		System.out.println("��ȥ���� : "+person.marriage);
		System.out.println("�ڳ� �� : "+person.babies);
	}

}
