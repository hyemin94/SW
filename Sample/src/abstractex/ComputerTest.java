package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//상위클래스의 변수로 하위클래스의 인스터스 적용 가능
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		// 항상 상위클래스를 내포하고 있다.
		NoteBook myNote = new MyNoteBook();
	}

}
