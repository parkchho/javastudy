package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// jdk제공.
// 클래스이름 : Class 클래스 사용법.
public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// String.class 의 구성요소를 확인이 가능해진다.
		Class strClass = Class.forName("java.lang.String"); // java.lang.String.class
		
		//String클래스의 생성자정보를 확인
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
			
			System.out.println();
			
			Field[] fields = strClass.getFields();
			
			// String클래스의 필드정보를 확인
			for(Field f : fields) {
				System.out.println(f);
			}
			
			// String클래스의 메서드정보를 확인
			Method[] methods = strClass.getMethods();
			for(Method m : methods) {
				System.out.println(m);
			}
			
		}
	}
}
