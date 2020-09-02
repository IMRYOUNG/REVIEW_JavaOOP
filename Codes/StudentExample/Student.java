//학생을 등록할 때 학생 이름과 학생 번호는 입력받고싶다면 생성자를 다음과 같이 주면된다.
/*|클래스 정의하기
학생이 있습니다.
학생은 학번, 이름, 주소 값을 가집니다.
학생의 정보를 보여줍니다.
학생에 대한 클래스를  구현해보세요
*/

package StudentExample;

public class Student {
	int studentID;
	String studentName;
	String address;
	
	public Student(String name) {
		studentName=name;
	}
	
	public Student(int ID, String name) {
	studentID=ID;
	studentName=name;
	address="주소없음";
}
	/*address는 아무것도 안 넣어줬는데 이럴땐 null값을 넣겠다는거다.
	*만약 딱히 입력받아오지않았는데 특정 값을 넣고싶다면 생성자 안에 address=”주소 없음”; 하면된다.
	*위와 같이 파라미터를 두 개 받아오는 생성자(default 가 아닌 생성자)가 생성되면 java에서는 더 이상 default 생성자는 없어진다. 
	*이 객체를 인스턴스화한 studentLee와 studentKim 객체는 디폴트 생성자로 만든 상태에서 수정을 안했기때문에 오류가 났다.
	*오류를 고치려면 이 클래스에 default 생성자를 추가하거나 studentKim과 studentLee에 파라미터를 넣어주면된다.
	*/
	
	//이렇게 생성자를 같은 이름 다른 파라미터로 사용하는 것을 오버로딩이라한다!
	
	public void showStudentInfo() {
		System.out.println(studentName + ","+studentName+","+address);
	} 
	}


