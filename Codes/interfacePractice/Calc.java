package interfacePractice;

public interface Calc {

	double PI = 3.14;
	int Error = -99999999;

	int add(int num1, int num2);

	int subststract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();
	}

	// static ���� �����ؼ� �������̽� Ÿ������ �� �� �ְ� �ϴ� �Լ��� �������.
	// ���� ���� �޼���� �������̽��� static �޼��尡 �����ǰ������� �ν��Ͻ��� �������� �ʰ� �� �� �ִ�.
	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}

		return total;
	}

	private void myMethod() {
		System.out.println("private method");
	}

	private static void mystaticMethod() {
		System.out.println("private static method");
	}

}
