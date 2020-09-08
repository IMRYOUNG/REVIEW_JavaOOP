package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);//[이순신, 김유신, 강감찬, 이순신]
		//즉 ArrayList 방식은 입력순서와 중복을 모두 반영하지만,
		
		

		HashSet<String> set2 = new HashSet<String>();
		set2.add("이순신");
		set2.add("김유신");
		set2.add("강감찬");
		set2.add("이순신");
		
		System.out.println(set2);//[김유신, 강감찬, 이순신]
		//HashSet방식은 입력 순서와 중복 둘 다 반영하지 않는다.
		
		//[김유신, 강감찬, 이순신]이 아니라 하나씩 쭉 돌아가면서 쓸 수 있는 방식은 Iterator 방식이다.
		//Iterator 함수는 모든 콜렉션에대해 부를  수 있다.
		Iterator<String> ir =set.iterator(); //Iterator뒤에 <String>을 붙여서 순회할 요소를 정의할 수 있다.
		while(ir.hasNext()) {//다음 엘리먼트(요소)가 있는지 확인하고
			String str = ir.next(); //다음 요소를 가져온다. <String> 해뒀기떄문에 ir.next()의 반환값은 String 타입이다.
			System.out.println(str);
		}

	}

}
