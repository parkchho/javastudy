package chapter8.inheritance;

public class VIPCustomer extends Customer {
	
	// 상속
	
	// 추가
	private int agentID; // 담달 상담원ID
	double saleRatio; // 할인률
	
	// 생성자
	public VIPCustomer() {
		
		// 상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		// 자신
		saleRatio = 0.1;
		System.err.println("VIPCustomer() 생성자 호출");
		
	}
	
	// 매개변수가 있는 생성자
	// super : 상속관계에서 부모(상위)클래스를 가리키는 의미.
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// 부모의 매개변수가 있는 생성자 호출
		super(customerID,customerName);
		
		//부모상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		//자신
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");	
	}
	
	// 부모클래스 메서드이름만 사용하고 내용은 변경해서 작업하고자 할떄
	//메서드재정의(overriding)
	
	@Override
	public int calcPrice(int price) {
		System.out.println("VIPCustomer.calcPrice");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		
	}
	
	// private int agentID; getter메서드
	public int getAgentID() {
		return agentID;
	}
	
}
