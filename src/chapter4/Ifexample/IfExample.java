package chapter4.Ifexample;

// 단일 if문 : 조건식이 1개일 때 사용
public class IfExample {

	public static void main(String[] args) {
		
		boolean isMarried = true;
		
		if(isMarried) {
			System.out.println("기혼입니다.");
		}
		
		boolean isEven;
		int num = 10;
		
		// 해석: (num % 2 == 0) 코드가 true면 true가 대입되고 아니면 false가 대입된다.
		isEven = (num % 2 == 0) ? true : false;
		
		System.out.println(isEven);
		
	}

}
