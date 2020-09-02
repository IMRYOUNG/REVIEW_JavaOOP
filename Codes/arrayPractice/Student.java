package arrayPractice;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //생성자에서 생성하여 사용한다.
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		subjectList=new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		//String 객체와 다르게 내가 생성한 객체는 new해서 사용해야한다.
		Subject subject = new Subject(name, score);
		//생성자로 studentID와 studentName을 받아오니까 이걸 받아올 수 있도록 Subject에 생성자를 생성한다
		
		subjectList.add(subject); //학생이 수강한 과목이 하나씩 추가된다. 학생마다 수강한 과목이 따로따로 관리된다.
	}
	public void showStudentInfo() {
		int total=0;
		
		for(Subject subject:subjectList) { //한 학생의 모든 과목에서 받은 점수의 합을 구한다.
			total+=subject.getScore();
			System.out.println(studentName+"학생의 "+subject.getName()+"과목의 성적은 "+subject.getScore()+"점 입니다.");
		}
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.")
	}
}
