package StudentExample;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("이순신");
		//studentLee.studentName="이순신";
		studentLee.address="서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100,"김유신");
		//studentKim.studentName="김유신";
		//studentKim.address="경주";
		
		studentKim.showStudentInfo();
	}

}

/*클래스를 구현한다는건 메소드를 메소드를 사용하라는 말이다.
 * 메소드를 사용하려면 사용하려는 대상인 "객체"가 있어야 한다. 여기선 studentLee
 * 객체에 속성을 설정하는 방식과 함수를 사용하는 방식은 모두 객체.속성명 객체.함수명 으로 방법이 똑같다.
 */

/*콘솔 창이 사라져도 당황말고 Window >> Show View >> Console을 선택하자*/