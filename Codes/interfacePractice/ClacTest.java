package interfacePractice;

public class ClacTest {
	public static void main(String[] args) {

		// CompleteCalc�� Calculator�� ��ӹް� Calc�� �����Ǿ��ִٰ� �Ѵ�.
		/*
		 * Calc calc =new CompleteCalc();�ص� �ȴ�. �� ���. �ν��Ͻ��� Ÿ���� CompleteCalc����ص� Ÿ����
		 * Calc�̱⶧���� calc�� ����� �� �ִ� �޼���� �������̽��� �޼��� �ۿ� ����. �� ���, showInfo()��
		 * CompleteCalc�� ���̱� ������ ����� �� ����.
		 */
		
		
		
		
		
		/*CompleteCalc calc = new CompleteCalc();

		int n1 = 10;
		int n2 = 2;

		System.out.println(calc.add(n1, n2));
		System.out.println(calc.subststract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.showInfo();

		calc.description();*/

		int[] arr = { 1, 2, 3, 4, 5 };
		// �������̽� ������ �ƴ϶� �������̽� Ÿ������ ������ ����.
		int sum = Calc.total(arr);
		System.out.println(sum);
		//�� �̷��� static���� ������ �θ� 17����� �ִ� �ּ��� ������� �ٷ� �����ٰ� �� �� �ִ�.
	}

}
