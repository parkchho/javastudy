package chapter2;

public class Typelnference {

	public static void main(String[] args) {
		// java 10문법에서 지원.
		// 자료형 추론
		
		var i = 10; // int i = 10;
		var j = 10.0; // double j = 10.0;
		var str = "hello"; // String str = "hello" 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
	}

}
