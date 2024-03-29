package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class personClass = Class.forName("chapter11.classex.Person");
		
		//Person클래스의 생성자정보 출력
		Constructor[] per1 = personClass.getConstructors();
		
		for(Constructor p : per1) {
			System.out.println(p);
			
			System.out.println();
		}
		// Person클래스의 필드정보 출력
		Field[] f1 = personClass.getFields();
		for(Field f : f1) {
			System.out.println(f);
		}
		// Person클래스의 메서드정보 출력
		Method[] m1 = personClass.getMethods();
		for(Method m : m1) {
			System.out.println(m);
		}
	}

}
