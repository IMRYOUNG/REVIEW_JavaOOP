//�л��� �����ɶ����� ID�� ���� �ο��Ѵ�.

package staticPractice;

public class Student {
	
	//������ �Ǵ� ���� ��� �ν��Ͻ��� �ϳ��� �޸𸮸� ������ ���������Ѵ�.
	public static int serialNum=1000;
	//serialNum�� �� ������ �Ѵ�.
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName=name;
		serialNum++;
		/*serialNum�� ���� �޸𸮸� �ٶ󺸱⶧���� �̰� �״�� �й����� �� ���
		*�й��� ��� ���� ��ȣ�� �� �� �ִ�.
		*����!! serialNum++��  studentID�� ����ȴ�!
		*/
		studentID=serialNum;
		//�̷��� �Ź� �����Ǵ� serialNum�� �й��� �ȴ�.
	}
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		address="�ּ� ����";
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
