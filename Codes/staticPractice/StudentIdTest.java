package staticPractice;

public class StudentIdTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		System.out.println(studentLee.serialNum);
		Student studentKim = new Student("Kim");

		System.out.println(studentKim.serialNum);
		System.out.println(studentLee.serialNum);
	
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		/*아래 두줄처럼 나올 수 있는 이유는, Student 클래스에서 serialNum은 계속 증가되는숫자이고,
		*
		*/
	}
}
