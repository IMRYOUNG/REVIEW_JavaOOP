//학생이 생성될때마다 ID를 새로 부여한다.

package staticPractice;

public class Student {
	
	//기준이 되는 값은 모든 인스턴스가 하나의 메모리를 갖도록 만들어줘야한다.
	public static int serialNum=1000;
	//serialNum이 그 역할을 한다.
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
		serialNum++;
		/*serialNum은 같은 메모리를 바라보기때문에 이걸 그대로 학번으로 쓸 경우
		*학번이 모두 같은 번호가 될 수 있다.
		*따라서!! serialNum++을  studentID러 쓰면된다!
		*/
		studentID=serialNum;
		//이러면 매번 증가되는 serialNum이 학번이 된다.
	}
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		address="주소 없음";
		serialNum++;
		studentID=serialNum;
	}


	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}


}
