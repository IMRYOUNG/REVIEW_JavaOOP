package interfacePractice;

public abstract class Calculator implements Calc {// 클래스 상속은 extends 인터페이스 상속은 implements

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int subststract(int num1, int num2) {
		return num1-num2;
	}

}
