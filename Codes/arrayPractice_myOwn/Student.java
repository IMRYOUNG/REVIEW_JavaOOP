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
			total+=read.getBook()+" "; //.getó�� �����ָ� read�� �ּҰ� ����
		}
		System.out.println(studentName + " �л��� ���� å�� : " + total + "�Դϴ�.");
	}

}
