package abstractStudy;

public class ComputerTest {

	public static void main(String[] args) {
		/*Computer computer = new Computer(); �̰� �ȵ�!
		*computer.display();�ؼ� ������ �޼ҵ尡 ���� �����̴�.
		 */
		
		Computer computer = new Desktop();
		//�� ������ �Ǵ� ������ ��ӿ��� ����Ŭ������ Ÿ���� ������ ����Ŭ������ �ν��Ͻ��� �����Ǿ� ���Ե� �� �ֱ⋚���̴�.
		//�׷��� ���� Ŭ���� Ÿ������ ���� Ŭ�������� �����Ͽ� ���� �ڵ鸵�Ѵ�.
		computer.display();
		computer.turnOff();
		
		//NoteBook myNote = new MyNoteBook(); ó�� Computer Ÿ���� �ƴ� NoteBook Ÿ������ �����ص� �ȴ�.
	}

}
