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
		//return super.equals(obj); 이렇게 제공되는 원형은 ==처럼 주소를 비교하라는 의미임. 이걸 재정의해야됨
		/*.equls(Object obj)를 통해, .앞에 적어주는 객체와 Object타입으로 받는 객체가 비교되는 것이다.
		*Object타입은 모든 클래스의 최상위 클래스이므로 다운캐스팅 해줘야됨
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
		
		System.out.println(str1==str2);//메모리가 같은지를 비교한다.
		System.out.println(str1.equals(str2));//내용이 같은지를 비교한다.*/
		
		Student Lee= new Student(100,"이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100,"이순신");
		
		System.out.println(Lee==Lee2);
		System.out.println(Lee.equals(Shin));
	}

}