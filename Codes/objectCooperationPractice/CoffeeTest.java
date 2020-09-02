package objectCooperationPractice;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("±èÁ¹·Á",10000);
		Person lee = new Person("ÀÌÇÇ°ï",50000);
		
		ByulDabang americano = new ByulDabang("¾Æ¸Þ¸®Ä«³ë");
		KongDabang latte = new KongDabang("¶ó¶¼");

		kim.buyCoffee(americano);
		kim.showInfo();
		
		lee.buyCoffee(latte);
		lee.showInfo()
	}

}
