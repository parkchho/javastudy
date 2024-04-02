package chapter14.collection.linkedlist;

import chapter14.collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		
		MemberLinkedList memberlinkedList = new MemberLinkedList();
		
		// 객체생성 
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		memberlinkedList.addMember(memberSon);
		memberlinkedList.addMember(memberKim);
		memberlinkedList.addMember(memberLee);
		memberlinkedList.addMember(memberHwa);
		
		memberlinkedList.showllMember(); // 4개 member객체가 출력
		
		memberlinkedList.removeMember(memberHwa.getMemberId()); // 황희찬객체 삭제
		
		memberlinkedList.showllMember();
		
	}

}
