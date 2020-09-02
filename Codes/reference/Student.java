package reference;

public class Student {

	int studentID;
	String studentName;

	/*	String subjectName;
	*String korean;
	*String math;
	*이렇게 한 클래스 안에 해도 되지만, 이 경우 과목의 수가 늘어났을 때 클래스가 복잡해지므로 좋지않다.
	*해결책은 아래와같다.
	*/
	
	Subject korean; 
	Subject math;
	
	/*내가 생성한 생성자인 Subject같은 경우는, 반드시 new를 써서 초기화해야함.*/
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		
		korean = new Subject();
		math=new Subject();
	}
	
	/*바로 위를 생성자 초기화라고 부르는데, 생성자 초기화를 해 주는것까지가
	 * 내가 만든 생성자를 사용하기위해 해 줘야될 일이다.*/
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName=name;
		korean.score=score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName=name;
		math.score=score;
	}
	
	public void showStudentScore() {
		int total=korean.score+math.score;
		System.out.println(studentName + "학생의 점수는"+ total+"입니다.")
	}
}
