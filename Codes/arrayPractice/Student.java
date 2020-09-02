package arrayPractice;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //�����ڿ��� �����Ͽ� ����Ѵ�.
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		subjectList=new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		//String ��ü�� �ٸ��� ���� ������ ��ü�� new�ؼ� ����ؾ��Ѵ�.
		Subject subject = new Subject(name, score);
		//�����ڷ� studentID�� studentName�� �޾ƿ��ϱ� �̰� �޾ƿ� �� �ֵ��� Subject�� �����ڸ� �����Ѵ�
		
		subjectList.add(subject); //�л��� ������ ������ �ϳ��� �߰��ȴ�. �л����� ������ ������ ���ε��� �����ȴ�.
	}
	public void showStudentInfo() {
		int total=0;
		
		for(Subject subject:subjectList) { //�� �л��� ��� ���񿡼� ���� ������ ���� ���Ѵ�.
			total+=subject.getScore();
			System.out.println(studentName+"�л��� "+subject.getName()+"������ ������ "+subject.getScore()+"�� �Դϴ�.");
		}
		System.out.println(studentName+"�л��� ������ "+total+"�� �Դϴ�.")
	}
}
