package arrayPractice;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library = new Book[5]; //책이 5권 생긴게 아니라 배열 하나에 칸이 5개 생김
		
		library[0]=new Book("태백산맥","조정래");
		library[1]=new Book("동백꽃 필 무렵","김유정");
		library[2]=new Book("모비딕","헤르만 헤세");
		
		for(int i=0; i<library.length;i++) {
			System.out.println(library[i]);
		}

	}

}
