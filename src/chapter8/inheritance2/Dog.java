package chapter8.inheritance2;

public class Dog extends Animal {

	@Override
	void run() {
		System.out.println("강아지가 달려버린다.");
	}

	@Override
	void cry() {
		System.out.println("강아지가 울부짓는다.");
	}

	
	
}
