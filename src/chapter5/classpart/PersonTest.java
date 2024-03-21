package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		//Person 클래스 사용 - 기억장소가 생성된 의미.
		Person ps1 = new Person();
		
		//ps1객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
//		System.out.println("이름: " + ps1.name);
//		System.out.println("신장(키): " + ps1.height);
//		System.out.println("몸무게: " + ps1.weight);
//		System.out.println("성별: " + ps1.gender);
//		System.out.println("결혼유무: " + ps1.married);
		
		ps1.getPersonInfo();
		
		Person ps2 = new Person();
		ps2.name = "김춘배";
		ps2.height = 170;
		ps2.weight = 66;
		ps2.gender = 'M';
		ps2.married = false;
		
		ps2.getPersonInfo();
		
		Person ps3 = new Person();
		ps3.name = "최남옥";
		ps3.height = 145;
		ps3.weight = 43;
		ps3.gender = 'G';
		ps3.married = true;
		
		Person ps4 = new Person();
		ps4.name = "신영만";
		ps4.height = 175;
		ps4.weight = 70;
		ps4.gender = 'M';
		ps4.married = true;
		
		Person ps5 = new Person();
		ps5.name = "봉미선";
		ps5.height = 163;
		ps5.weight = 58;
		ps5.gender = 'G';
		ps5.married = true;
		
	}

}
