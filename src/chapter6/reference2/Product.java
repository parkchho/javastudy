package chapter6.reference2;

public class Product {

	String name;
	int price;
	
	
	// 생성자를 여러개 정의를 가능하게 하는 문법의 이름은 메서드 오버 로딩(method overroading)
	// 동일한 생성자를 중복정의하는 문법 : 매개변수의 개수와 데이타타입을 다르게 해야한다.
	// 기본생성자.
	Product() {}
	
	//매개변수가 있는 생성자
	Product (String name, int price) {
		this.name = name;
		this.price = price;
	}
}
