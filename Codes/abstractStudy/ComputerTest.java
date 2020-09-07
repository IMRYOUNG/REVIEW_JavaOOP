package abstractStudy;

public class ComputerTest {

	public static void main(String[] args) {
		/*Computer computer = new Computer(); 이거 안됨!
		*computer.display();해서 구현될 메소드가 없기 떄문이다.
		 */
		
		Computer computer = new Desktop();
		//이 위에껀 되는 이유가 상속에서 상위클래스의 타입의 변수에 하위클래스의 인스턴스가 생성되어 대입될 수 있기떄문이다.
		//그래서 상위 클래스 타입으로 하위 클래스들을 생성하여 많이 핸들링한다.
		computer.display();
		computer.turnOff();
		
		//NoteBook myNote = new MyNoteBook(); 처럼 Computer 타입이 아닌 NoteBook 타입으로 선언해도 된다.
	}

}
