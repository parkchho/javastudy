package chapter3.operator;

// 관계연산자 : >, <, ==, >=, <=, != 
// 논리연산자 :&&(논리곱), ||(논리합), !(부정)
public class OperationEx3 {

	// && 논리 and연산자
	// 2개의 입력조건이 true일때만 결과가 true가 된다.
	// 1개라도 입력조건이 false일때는 결과가 false가 된다.
	// 좌측이 false이면, 우측의 코드는 실행이 안된다.
	
	// || 논리 or연산자
	// 1개의 입력조건이 true일때만 결과가 true가 된다.
	// 2개 입력조건이 false일때는 결과가 flase이 된다.
	// 좌측의 코드가 true이면, 우측의 코드는 true or false 든 상관없이 결과가 true가 된다. 우측코드는 실행되지 않는다.(규칙)
	
	// 코드가 실행될려면 main() 메서드 안에 작성되어야 한다.
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = (num1 = num1 + 10) < 10 && (i = i + 2) < 10;

		// 위의코드가 어떻게 동작이 되는지를 이해하기위하여 변수의 값을 출력한다.
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 우측코드가 실행이 되면 i변수값은 4가 되지만, 실행이 되지않는 규칙때문에 i변수값은 2로 된다.
		
		System.out.println("==========");
		
		value = (num1 = num1 + 10) > 10 || (i = i + 2) < 10;
		System.out.println(value); // true
		System.out.println(num1); // 20
		System.out.println(i); // 우측코드가 실행이 되면 i변수값은 4가 되지만, 실행이 되지않는 규칙때문에 i변수값은 2로 된다.
	}

}
