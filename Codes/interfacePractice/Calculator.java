package interfacePractice;

public abstract class Calculator implements Calc {// Ŭ���� ����� extends �������̽� ����� implements

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int subststract(int num1, int num2) {
		return num1-num2;
	}

}
