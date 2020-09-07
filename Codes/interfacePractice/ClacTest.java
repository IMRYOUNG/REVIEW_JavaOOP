package interfacePractice;

public class ClacTest {
	public static void main(String[] args) {

		// CompleteCalc는 Calculator가 상속받고 Calc를 구현되어있다고 한다.
		/*
		 * Calc calc =new CompleteCalc();해도 된다. 이 경우. 인스턴스의 타입이 CompleteCalc라고해도 타입이
		 * Calc이기때문에 calc가 사용할 수 있는 메서드는 인터페이스의 메서드 밖에 없다. 이 경우, showInfo()는
		 * CompleteCalc의 것이기 떄문에 사용할 수 없다.
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
		// 인터페이스 변수가 아니라 인터페이스 타입으로 가져다 쓴다.
		int sum = Calc.total(arr);
		System.out.println(sum);
		//즉 이렇게 static으로 선언해 두면 17행부터 있는 주석과 상관없이 바로 가져다가 쓸 수 있다.
	}

}
