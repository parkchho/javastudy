package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		// 정수형 데이타타입 : byte(1), short(2), int(4), long(8)
		// 킄기를 이용하여 기억장소를 생성한다.
		// 예로 byte 는 1바이트로 기억장소를 생성한다.
		// byte는 8bit로 구성되어있다.
		// bit는 0, 1 2진수값을 저장하도록 설계되어 있다.
		
		short sVa1 = 10;
		byte bVa1 = 20;
		
		System.out.println(sVa1 + bVa1);
		
		// long 데이타를 저장할 경우에는 숫자데이타 끝부분에 알파벳 L or l 을 붙인다.(규칙)
		long lVa1 = 12345678900L;
		
	}

}
