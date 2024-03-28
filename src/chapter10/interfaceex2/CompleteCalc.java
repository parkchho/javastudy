package chapter10.interfaceex2;

// 구현클래스 -> 객체생성
public class CompleteCalc extends Calculator {

	// 구현되지 않은 추상메서드를 2개 상속받은 상태
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	// 디폴트 재정의
	@Override
	public void description() {
		
	}
}
