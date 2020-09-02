package reference;

public class Student {

	int studentID;
	String studentName;

	/*	String subjectName;
	*String korean;
	*String math;
	*�̷��� �� Ŭ���� �ȿ� �ص� ������, �� ��� ������ ���� �þ�� �� Ŭ������ ���������Ƿ� �����ʴ�.
	*�ذ�å�� �Ʒ��Ͱ���.
	*/
	
	Subject korean; 
	Subject math;
	
	/*���� ������ �������� Subject���� ����, �ݵ�� new�� �Ἥ �ʱ�ȭ�ؾ���.*/
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		
		korean = new Subject();
		math=new Subject();
	}
	
	/*�ٷ� ���� ������ �ʱ�ȭ��� �θ��µ�, ������ �ʱ�ȭ�� �� �ִ°ͱ�����
	 * ���� ���� �����ڸ� ����ϱ����� �� ��ߵ� ���̴�.*/
	
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
		System.out.println(studentName + "�л��� ������"+ total+"�Դϴ�.")
	}
}
