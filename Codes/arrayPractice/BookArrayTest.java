package arrayPractice;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library = new Book[5]; //å�� 5�� ����� �ƴ϶� �迭 �ϳ��� ĭ�� 5�� ����
		
		library[0]=new Book("�¹���","������");
		library[1]=new Book("����� �� ����","������");
		library[2]=new Book("����","�츣�� �켼");
		
		for(int i=0; i<library.length;i++) {
			System.out.println(library[i]);
		}

	}

}
