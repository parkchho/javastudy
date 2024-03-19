package chapter2;

public class CharaterEx2 {

	public static void main(String[] args) {
		// 유니코드 값을 가지고 있다.
		char ch1 = '한'; // 54620
		char ch2 = '\uD55C'; // 유니코드값 표현
		char ch3 = 54620;
		
		System.out.println(ch1); // 한
		System.out.println(ch2); // 한
		System.out.println(ch3); // 한
		
	}

}
