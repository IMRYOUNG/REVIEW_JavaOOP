package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("Java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		builder.append("android");
		System.out.println(System.identityHashCode(builder)); //StringBuilder로 만든 문자열은 문자열을 붙이기 전이랑 붙인 후에 똑같은 주소를 갖는다.
		
		java=builder.toString();
		System.out.println(java);
	}

}
