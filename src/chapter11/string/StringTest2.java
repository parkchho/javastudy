package chapter11.string;

// 문자열 데이타끼리 결합을 하면, 새로운 기억장소로 관리가 된다.ㅔ
public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidstr = new String("asdroid");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
		// "javaandroid" 새로운 문자열로 기억장소 새로 생성된다.
		javaStr = javaStr.concat(androidstr);
		
		System.out.println(javaStr); // javaandroid
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
		System.out.println(javaStr.toLowerCase());
		System.out.println(javaStr.toUpperCase());
		
	}

}
