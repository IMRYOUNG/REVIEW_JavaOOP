//�л��� ����� �� �л� �̸��� �л� ��ȣ�� �Է¹ް�ʹٸ� �����ڸ� ������ ���� �ָ�ȴ�.
/*|Ŭ���� �����ϱ�
�л��� �ֽ��ϴ�.
�л��� �й�, �̸�, �ּ� ���� �����ϴ�.
�л��� ������ �����ݴϴ�.
�л��� ���� Ŭ������  �����غ�����
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
	address="�ּҾ���";
}
	/*address�� �ƹ��͵� �� �־���µ� �̷��� null���� �ְڴٴ°Ŵ�.
	*���� ���� �Է¹޾ƿ����ʾҴµ� Ư�� ���� �ְ�ʹٸ� ������ �ȿ� address=���ּ� ������; �ϸ�ȴ�.
	*���� ���� �Ķ���͸� �� �� �޾ƿ��� ������(default �� �ƴ� ������)�� �����Ǹ� java������ �� �̻� default �����ڴ� ��������. 
	*�� ��ü�� �ν��Ͻ�ȭ�� studentLee�� studentKim ��ü�� ����Ʈ �����ڷ� ���� ���¿��� ������ ���߱⶧���� ������ ����.
	*������ ��ġ���� �� Ŭ������ default �����ڸ� �߰��ϰų� studentKim�� studentLee�� �Ķ���͸� �־��ָ�ȴ�.
	*/
	
	//�̷��� �����ڸ� ���� �̸� �ٸ� �Ķ���ͷ� ����ϴ� ���� �����ε��̶��Ѵ�!
	
	public void showStudentInfo() {
		System.out.println(studentName + ","+studentName+","+address);
	} 
	}


