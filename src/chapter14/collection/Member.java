package chapter14.collection;

public class Member /*extends Object*/ { 

	private int memberId;
	private String memberName;
	
	// 매개변수가 있는 생성자
	public Member(int memberId, String memberName) {
		super(); // 생략해도 컴파일 과정에서 자동생성. Object클래스의 기본생성자 호출
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// getter or setter메서드
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String MemberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[memberId =" + memberId + ", memberNaem=" + memberName + ", memberId";
	}

	
	
	
}
