package string;

public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("Java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		//위의 방법은 주소를 확인할 때, hashCode()의 방법은 쓸 수 없다. String에서 hashCode는 이미 override했기때문
		//이전에 만들었던 java 객체의 hashCode값을 구하는 .identityHashCode를 써서 concat 전과 후의 hashCode값을 비교해보면
		
		System.out.println(System.identityHashCode(java));
		//두 개의 값이 다르다는 것을 알 수 있다. 즉 두 문자열을 연결했을 떄, 새로 생기는 문자열은 새로운 메모리에 저장된다.
	}

}
