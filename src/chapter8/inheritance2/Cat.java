package chapter8.inheritance2;

public class Cat extends Animal {

	//run() 메서드 내용응을 내 클래스의 용도에 맞게 새롭게 구성
	// 상속관계에서 부모클래스의 메서드명 그래도 사용하여, 내용을 재구성하는 작업 - overding
	
	@Override
	void run() {
		// super.run(); 부모클래스 내용 호출 -> Animal
		// 새로운 작업
		System.out.println("고양이가 달린다.");
	}

	@Override // @이름 : Annotation
	void cry() {
		// 새로운 작업
		System.out.println("고양이가 야옹야옹한다.");
	}
	void method1() {
		super.run();
	}
	
}
