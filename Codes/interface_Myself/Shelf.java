package interface_Myself;

import java.util.ArrayList;

public class Shelf {
	// potected�� �ٸ� �޼ҵ忡�� ��ӹ޾Ƽ� ����ؾ��ϹǷ� get set �޼ҵ带 �������Ѵ�.
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
