/*참조 자료형 직접 만들어 사용하기
 * 학생 클래스(Student)에 있는 과목 이름, 과목 성적 속성을 
 * 과목 클래스(Subject)로 분리하고
 * Subject참조 자료형 멤버변수를 Student에 정의하여 사용함
*/

package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee= new Student(100, "이순신");
		studentLee.setKoreanSubject("국어", 65);
		
		studentLee.setMathSubject("수학",96);
		
		
		Student studentKim=new Student(101, "김유신");
		studentKim.setKoreanSubject("국어", 90);
		studentKim.setMathSubject("수학",100);
		
		studentLee.showStudentScore();

	}

}
