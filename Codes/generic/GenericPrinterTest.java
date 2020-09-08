package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		/*�̷��� ����� ���� T �ڸ��� Ÿ���� �־��ش�.
		*<>�����ڸ� ����� ��, �ν��Ͻ�ȭ�� ��ü�� ��<>�� ���θ�, �˾Ƽ� ���� Ŭ���� Ÿ���� ���� �����ؼ� ���� Ŭ���� �̸����� �����Ѵ�.
		*�� ���⼱new GenericPrinter<>�� new GenericPrinter<Powder>�� ���ٴ� ��*/
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		/*1. ���ʸ� Ÿ���� �����Ѵ�. <Powder>
		*2. new�ؼ� ��ü�� �����.
		*3. set�Լ��� ����Ͽ� material�� �����´�.
		*4. powderPrinter������ .toString()�� �θ���.*/
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		//1. ���� �� ���� ���� GenericPrinter�� ���� ������� �ʱ� ���ؼ�,(==T��ſ� ���� �ڷ������� �����ϱ����ؼ�)
		//2. Material Ŭ������ �ϳ� �����Ͽ� GenericPrinter Ŭ������ <T>�� <T extends Material>�Ѵ�.
		//��, Material Ŭ�������� ��ӹ��� ���鸸 GenericPrinter�� ���� ����� �� �ְ� �ϴ°��̴�.
		//3. Material�ν� ����� Powder�� Plastic�� Ŭ�����̸� �ڿ� extends Material �Ѵ�.
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
 