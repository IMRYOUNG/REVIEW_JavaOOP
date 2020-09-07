package object;

class Book implements Cloneable{
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	@Override
	public String toString() {
		return author+","+title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지", "박경리");
		System.out.println(book);

		String str = new String("토지");
		System.out.println(str); // 이건 주소가 안나오고 String이 나오는 이유는 String 클래스가 알아서 toString() 메소드를 불러줬기 떄문이다.

		Book book2=(Book)book.clone();
		System.out.println(book2); /*이렇게만하면 에러가 뜬다. 따라서 복제해오는 클래스인 Book클래스를
		class Book implements Cloneable 해야한다.*/
	}

}
