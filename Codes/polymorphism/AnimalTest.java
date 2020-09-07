package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걸어갑니다.");
		}
	}


class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 걸어갑니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 퍼덕퍼덕 날아갑니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		//아래에 인스턴스화하는걸 업캐스팅이라한다.
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
	
		
		//2.이렇게 생성될 수 있는 하위 객체의 종류들을 고려했을 때,
		//AnimalTest test = new AnimalTest();
		//test.moveAnimal(hAnimal);
		//test.moveAnimal(tAnimal);
		//test.moveAnimal(eAnimal);
		
		/*다운캐스팅 주석*/
		/*Human, Tiger, Eagle을 모두 Animal 타입으로 유지하고싶다면 ArrayList의 타입을 Animal로 하면된다.*/
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		/*AnimalTest타입의 객체를 만들고
		 * instanceof를 이용해서 타입을 검토하는 메소드를 사용한다.*/
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*이렇게하면 각Animal의 move가 아닌 각 인스턴스의 move가 호출된다.*/
		/*for(Animal animal : animalList) {
			animal.move();
		}*/
		
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	//1. moveAnimal이라는 AimalTest 클래스의 메소드를 만들었다.
	//public void moveAnimal( animal) { 매개변수에 타입으로 들어갈 수 있는 것은
	
	//3.매개변수의 타입은 Animal이 된다.
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
