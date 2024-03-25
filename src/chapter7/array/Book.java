package chapter7.array;

// 생성자를 하나도 만들지않으면, 컴파일 과정에서 자동생성.
// 클래스배열(객체배열)을 만들기위한 클래스
public class Book {
	
	// 필드
	private String bookName; // 책제목
	private String author; // 저자
	
	
	// 기본생성자 형태. 생성자는 리턴타입을 상요하지 않음.
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// getter/setter메서드 작성
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookname) {
		this.bookName = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 일반 메서드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
	

}
