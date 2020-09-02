package arrayPractice_myOwn;

import java.util.ArrayList;

public class Student {
	String studentName;
	ArrayList<Book> arr;
	String bookName;
	
	public Student(String studentName) {
		this.studentName = studentName;
		arr = new ArrayList<Book>();
	}

	public void addBook(String bookName) {
		Book book = new Book(bookName);
		arr.add(book);
	}
	
	String total=" ";
	
	public void showStudentInfo() {
		for (Book read : arr) {
			total+=read.getBook()+" "; //.get처리 안해주면 read의 주소가 나옴
		}
		System.out.println(studentName + " 학생이 읽은 책은 : " + total + "입니다.");
	}

}
