package string;

public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("Java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		//���� ����� �ּҸ� Ȯ���� ��, hashCode()�� ����� �� �� ����. String���� hashCode�� �̹� override�߱⶧��
		//������ ������� java ��ü�� hashCode���� ���ϴ� .identityHashCode�� �Ἥ concat ���� ���� hashCode���� ���غ���
		
		System.out.println(System.identityHashCode(java));
		//�� ���� ���� �ٸ��ٴ� ���� �� �� �ִ�. �� �� ���ڿ��� �������� ��, ���� ����� ���ڿ��� ���ο� �޸𸮿� ����ȴ�.
	}

}
