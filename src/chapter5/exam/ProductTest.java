package chapter5.exam;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product("TV", 500000);
		
		System.out.println("p1.name의 이름은? " + p1.name);
		System.out.println("p1.price의 값은? " + p1.price);
		
		System.out.println("p2.name의 이름은? " + p2.name);
		System.out.println("p2.price의 값은? " + p2.price);
		
	}

}
