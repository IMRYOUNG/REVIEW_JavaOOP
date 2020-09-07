package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �ɾ�ϴ�.");
		}
	}


class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ɾ�ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �۴��۴� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		//�Ʒ��� �ν��Ͻ�ȭ�ϴ°� ��ĳ�����̶��Ѵ�.
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
	
		
		//2.�̷��� ������ �� �ִ� ���� ��ü�� �������� ������� ��,
		//AnimalTest test = new AnimalTest();
		//test.moveAnimal(hAnimal);
		//test.moveAnimal(tAnimal);
		//test.moveAnimal(eAnimal);
		
		/*�ٿ�ĳ���� �ּ�*/
		/*Human, Tiger, Eagle�� ��� Animal Ÿ������ �����ϰ�ʹٸ� ArrayList�� Ÿ���� Animal�� �ϸ�ȴ�.*/
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		/*AnimalTestŸ���� ��ü�� �����
		 * instanceof�� �̿��ؼ� Ÿ���� �����ϴ� �޼ҵ带 ����Ѵ�.*/
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*�̷����ϸ� ��Animal�� move�� �ƴ� �� �ν��Ͻ��� move�� ȣ��ȴ�.*/
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
	//1. moveAnimal�̶�� AimalTest Ŭ������ �޼ҵ带 �������.
	//public void moveAnimal( animal) { �Ű������� Ÿ������ �� �� �ִ� ����
	
	//3.�Ű������� Ÿ���� Animal�� �ȴ�.
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
