package chapter14.collection.hashet;

import chapter14.collection.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		Member2Hashset memberHashSet = new Member2Hashset();
		
		// 객체생성 
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberHashSet.addMember2(memberSon);
		memberHashSet.addMember2(memberKim);
		memberHashSet.addMember2(memberLee);
		memberHashSet.addMember2(memberHwa);
		
		memberHashSet.showllMember2(); // 4개 member객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberHashSet.addMember2(memberLee2);
				
		memberHashSet.showllMember2(); // 5개 member객체가 출력
		
	}

}
