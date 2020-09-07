package object;

class Student {
	int studentNum;
	String studentName;

	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj); �̷��� �����Ǵ� ������ ==ó�� �ּҸ� ���϶�� �ǹ���. �̰� �������ؾߵ�
		/*.equls(Object obj)�� ����, .�տ� �����ִ� ��ü�� ObjectŸ������ �޴� ��ü�� �񱳵Ǵ� ���̴�.
		*ObjectŸ���� ��� Ŭ������ �ֻ��� Ŭ�����̹Ƿ� �ٿ�ĳ���� ����ߵ�
		*/
		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(this.studentNum==std.studentNum)
				return true;
			else
				return false;
		}
		return false;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		/*String str1= new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);//�޸𸮰� �������� ���Ѵ�.
		System.out.println(str1.equals(str2));//������ �������� ���Ѵ�.*/
		
		Student Lee= new Student(100,"�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100,"�̼���");
		
		System.out.println(Lee==Lee2);
		System.out.println(Lee.equals(Shin));
	}

}