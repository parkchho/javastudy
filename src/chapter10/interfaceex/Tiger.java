package chapter10.interfaceex;

public class Tiger implements Animal {

	@Override
	public void run() {
		System.out.println("호랑이 달린다.");

	}

	@Override
	public void cry() {
		System.out.println("호랑이가 포효한다.");

	}

}
