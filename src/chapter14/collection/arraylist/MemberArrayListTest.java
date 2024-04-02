package chapter14.collection.arraylist;

import chapter14.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 객체생성 
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHwa);
		
		memberArrayList.showllMember(); // 4개 member객체가 출력
		
		memberArrayList.removeMember(memberHwa.getMemberId()); // 황희찬객체 삭제
		
		memberArrayList.showllMember();
		
	}

}
