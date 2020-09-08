package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("Java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		builder.append("android");
		System.out.println(System.identityHashCode(builder)); //StringBuilder�� ���� ���ڿ��� ���ڿ��� ���̱� ���̶� ���� �Ŀ� �Ȱ��� �ּҸ� ���´�.
		
		java=builder.toString();
		System.out.println(java);
	}

}
