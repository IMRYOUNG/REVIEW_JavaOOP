package interfacePractice;

public interface Calc {

	double PI = 3.14;
	int Error = -99999999;

	int add(int num1, int num2);

	int subststract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() {
		System.out.println("점수 계산기를 구현합니다.");
		myMethod();
	}

	// static 으로 제공해서 인터페이스 타입으로 쓸 수 있게 하는 함수를 만들었다.
	// 자주 쓰는 메서드는 인터페이스에 static 메서드가 제공되고있으면 인스턴스를 생성하지 않고도 쓸 수 있다.
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
