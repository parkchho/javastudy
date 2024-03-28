package chapter10.interfaceex2;

// 추상클래스 : 상속목정으로 설계. 객체생성 불가능
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substact(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
		
	}

}
