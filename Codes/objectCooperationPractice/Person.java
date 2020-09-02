package objectCooperationPractice;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name=name;
		this.money=money;
	}

	public void buyCoffee(ByulDabang byul) {
		byul.buy(1);
		this.money-=4000;
		
	}
	
	public void buyCoffee(KongDabang kong) {
		kong.buy(1);
		this.money-=4500;
	}
	


}
