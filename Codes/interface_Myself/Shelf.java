package interface_Myself;

import java.util.ArrayList;

public class Shelf {
	// potected는 다른 메소드에서 상속받아서 사용해야하므로 get set 메소드를 만들어야한다.
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf=new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
}
