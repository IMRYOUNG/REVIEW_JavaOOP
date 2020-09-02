package arrayPractice;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // å�� 5�� ����� �ƴ϶� �迭 �ϳ��� ĭ�� 5�� ����
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("�¹���", "������");
		library[1] = new Book("����� �� ����", "������");
		library[2] = new Book("����", "�츣�� �켼");
		library[3] = new Book("�¹���", "������");
		library[4] = new Book("����� �� ����", "������");
		

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) { //copyLibrary��� ��ü�� �� ���� ������ ����� book�� �����ϰڴٴ� ���� for��
			book.showBookInfo();
		}*/
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("----------------");
		
		for(Book book : library) {
			book.showBookInfo();
		}
	}
	
}