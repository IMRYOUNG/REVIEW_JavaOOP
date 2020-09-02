package arrayPractice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();//ArrayList안에 어떤 타입을 쓸 것인지를 알려주는 <>를 제너릭이라고한다.
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size();i++) {//array는 .length를 사용했었는데 ArrayList는 .size()를 쓴다.
			/*.size()는 엘리먼트가 들어간 갯수만을 반환하고
			 * .lenght는 리스트 전체 생성된 길이를 반환한다. */
			String str=list.get(i);
			System.out.println(str);
		}
		
	}

}
