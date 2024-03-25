package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		// JVM이 main()메서드를 호출하면서, 프로그램이 실행될 때, Student클래스의 static필드와 메서드를 이용하여,
		// static area에 메모리를 단 1번만 생성. 공유의 목적
		
		Student stu1 = new Student();// 스택영역: 힙영역에 생선된 주소를 저장. 힘영역: 실제데이타를 저장
		// stu1.studentName ="손흥민";
		stu1.setStudentName("손흥민");
		// static메서드는 클래서명.메서드명() 호출해야 한다. 객체.메서드명()으로 호출은 되나, 사용하지 말것.
		System.out.println(Student.getSerialNum()); // 1
		
		Student stu2 = new Student(); // 스택영역과 힙영역에 메모리 생성
		stu2.setStudentName("김민재");
		System.out.println(Student.getSerialNum()); // 2
		
	}

}
