package chapter14.collection.hashet;


import java.util.HashSet;
import java.util.Iterator;

import chapter14.collection.Member2;

// HashSet클래스의 데이타로 Member2클래스 사용하기.
public class Member2Hashset {
	
	// 기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복 허용
	private HashSet<Member2> hashSet;
	
	public Member2Hashset() {
		hashSet = new HashSet<Member2>();
	}

	// 데이터 추가 
	public void addMember2(Member2 member) {
		hashSet.add(member); // 객체의 주소값 저장
	}
	
	// 데이터제거
	//Collection요소를 순회하는 Iterator작업
		public boolean removeMember2(int memberId) {
			
			// arrayList 객체가 가지고 있는 데이터를 순차적으로 접근할 수 있는 객체 ir
			Iterator<Member2> ir = hashSet.iterator();
			// ir 객체는 커서라는 포인터를 이용하여 데이터를 참조하는데
			// 처음에 가리키는 위치에 데이타가 존재하면 hasNext()가 true
			// 아니면 false을 반환한다.
			while(ir.hasNext()) {
				Member2 member = ir.next(); // 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 다음위치로 이동.
				int tempId = member.getMemberId();
				if(tempId == memberId) {
					hashSet.remove(member); // 멤버를 삭제
					return true;
				}
			}
			return false;
		}
	
	// 모든데이타 보기
	public void showllMember2() {
		// 4번 반복
		for(Member2 member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
