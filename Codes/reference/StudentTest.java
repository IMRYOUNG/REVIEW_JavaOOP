/*���� �ڷ��� ���� ����� ����ϱ�
 * �л� Ŭ����(Student)�� �ִ� ���� �̸�, ���� ���� �Ӽ��� 
 * ���� Ŭ����(Subject)�� �и��ϰ�
 * Subject���� �ڷ��� ��������� Student�� �����Ͽ� �����
*/

package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee= new Student(100, "�̼���");
		studentLee.setKoreanSubject("����", 65);
		
		studentLee.setMathSubject("����",96);
		
		
		Student studentKim=new Student(101, "������");
		studentKim.setKoreanSubject("����", 90);
		studentKim.setMathSubject("����",100);
		
		studentLee.showStudentScore();

	}

}
