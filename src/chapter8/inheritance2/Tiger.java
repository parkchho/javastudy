package chapter8.inheritance2;

public class Tiger extends Animal {

	@Override
	void run() {
		System.out.println("호랑이가 마구달린다.");
	}

	@Override
	void cry() {
		System.out.println("호랑이가 포효해버린다.");
	}

	
}
