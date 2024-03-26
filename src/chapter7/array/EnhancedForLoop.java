package chapter7.array;

// 향산된 for문과 배열
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		// 문자열배열
		String[] strArray = {"인공러닝", "머신러닝", "딥러닝"};
		
		//전통적인 for
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		//향산된 for
		for(String ai : strArray) {
			System.out.println(ai);
		}
	}

}
