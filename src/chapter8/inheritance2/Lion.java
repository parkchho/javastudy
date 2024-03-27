package chapter8.inheritance2;

public class Lion extends Animal {

	// 메서드 오버라이딩 (재정의)
	@Override
	void run() {
		System.out.println("사자가 무쟈게 달린다.");
	}
	@Override
	void cry() {
		System.out.println("사자가 엉엉운다.");
	}
	
	
	void play() {
		System.out.println("사자가 덩실덩실 사냥한다..");
	}
	void method2() {
		super.run();
	}
}
