package objectCooperationPractice;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("������",10000);
		Person lee = new Person("���ǰ�",50000);
		
		ByulDabang americano = new ByulDabang("�Ƹ޸�ī��");
		KongDabang latte = new KongDabang("��");

		kim.buyCoffee(americano);
		kim.showInfo();
		
		lee.buyCoffee(latte);
		lee.showInfo()
	}

}
