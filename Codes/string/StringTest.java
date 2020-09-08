package string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2); //두 객체의 주소가 다르기 때문에 false가 나온다.
		
		
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4); //얘네는 서로 다른 두 객체가 아닌 힙메모리의 상수공간 하나에 저장되어 있기 때문에 같은 객체임. 따라서 true 나온다.
		
		
	}

}
