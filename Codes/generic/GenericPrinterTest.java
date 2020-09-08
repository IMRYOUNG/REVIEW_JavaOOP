package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		/*이렇게 사용할 때는 T 자리에 타입을 넣어준다.
		*<>연산자를 사용할 때, 인스턴스화한 객체를 빈<>로 냅두면, 알아서 앞쪽 클래스 타입을 보고 유추해서 같은 클래스 이름으로 대입한다.
		*즉 여기선new GenericPrinter<>가 new GenericPrinter<Powder>와 같다는 것*/
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		/*1. 제너릭 타입을 생성한다. <Powder>
		*2. new해서 객체를 만든다.
		*3. set함수를 사용하여 material을 가져온다.
		*4. powderPrinter에대한 .toString()을 부른다.*/
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		//1. 사용될 수 없는 재료는 GenericPrinter의 재료로 사용하지 않기 위해서,(==T대신에 사용될 자료형ㅇ르 제한하기위해서)
		//2. Material 클래스를 하나 생성하여 GenericPrinter 클래스의 <T>를 <T extends Material>한다.
		//즉, Material 클래스에서 상속받은 재료들만 GenericPrinter의 재료로 사용할 수 있게 하는것이다.
		//3. Material로써 사용할 Powder와 Plastic만 클래스이름 뒤에 extends Material 한다.
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
 