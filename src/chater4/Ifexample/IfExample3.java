package chater4.Ifexample;

// 다중if문 : 조건식이 여려개 일 경우
public class IfExample3 {

	public static void main(String[] args) {
		
		int age = 9; // 나이
		int charge; // 입장료
		
		if(age >= 0 && age < 8) { // 0세이상이고, 8세 미만
			charge = 1000;
			System.out.println("미 취학 아동입미다.");
		}else if(age >=8 && age< 14) { // 8세이상이고, 14세 미만
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age >=14 && age< 20) { // 14세이상이고, 20세 미만
			charge = 25000;
			System.out.println("중,고등학생 입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}