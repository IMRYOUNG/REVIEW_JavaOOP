package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("A");
		myList.add("B");
		myList.add("C");

		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);

		// get은 index로 가져올 수 있지만 set은 가져올 수 없다.
		// set은 Collection인터페이스이긴하지만 중복을 허용하지 않는 Collection interface이다. 즉 순서에 기반하지 않는다.
		// get은 순서에 기반한다.
		for (int i = 0; i < myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}

	}

}
