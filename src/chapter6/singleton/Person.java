package chapter6.singleton;

// 싱글톤 패턴디자인으로 설계하라
public class Person {
	
	private static Person per1 = new Person();
	
	private Person() {}
	
	public static Person getPer1() {
		if(per1 == null) {
			per1 = new Person();
		}
		return per1;
	}
	
	public static void main(String[] args) {
		
		Person p1 = Person.getPer1();
		Person p2 = Person.getPer1();
		
		System.out.println(p1 == p2);
	}
	
}
