package chapter14.generics2;

public class Plastic extends Material {

	public void doprinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		
		return "재료는 Plastic 입니다.";
	}
	
}
