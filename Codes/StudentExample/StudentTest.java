package StudentExample;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("�̼���");
		//studentLee.studentName="�̼���";
		studentLee.address="����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100,"������");
		//studentKim.studentName="������";
		//studentKim.address="����";
		
		studentKim.showStudentInfo();
	}

}

/*Ŭ������ �����Ѵٴ°� �޼ҵ带 �޼ҵ带 ����϶�� ���̴�.
 * �޼ҵ带 ����Ϸ��� ����Ϸ��� ����� "��ü"�� �־�� �Ѵ�. ���⼱ studentLee
 * ��ü�� �Ӽ��� �����ϴ� ��İ� �Լ��� ����ϴ� ����� ��� ��ü.�Ӽ��� ��ü.�Լ��� ���� ����� �Ȱ���.
 */

/*�ܼ� â�� ������� ��Ȳ���� Window >> Show View >> Console�� ��������*/