package arrayPractice;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // 책이 5권 생긴게 아니라 배열 하나에 칸이 5개 생김
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("동백꽃 필 무렵", "김유정");
		library[2] = new Book("모비딕", "헤르만 헤세");
		library[3] = new Book("태백산맥", "조정래");
		library[4] = new Book("동백꽃 필 무렵", "김유정");
		

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) { //copyLibrary라는 객체를 다 돌며 가져온 결과를 book에 저장하겠다는 향상된 for문
			book.showBookInfo();
		}*/
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("----------------");
		
		for(Book book : library) {
			book.showBookInfo();
		}
	}
	
}