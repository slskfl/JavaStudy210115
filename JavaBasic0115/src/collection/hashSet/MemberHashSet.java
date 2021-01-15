package collection.hashSet;

import collection.Member;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet() {
		// TODO Auto-generated constructor stub
		hashSet = new HashSet<Member>();
	}
	//회원을 추가하는 메서드
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		//Iterator를 활용하여 객체를 한번씩 가져옴.
		Iterator<Member> iMember = hashSet.iterator();
		while (iMember.hasNext()) {
			//hashNext를 이용하여 객체의 여부 확인.
			Member member = iMember.next();//회원을 하나씩 가져옴.
			
			int tempId = member.getMemberid();
			if(tempId == memberId) {	//같은 아이디 인 경우
				hashSet.remove(member);	//회원 삭제합니다.
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	//전체 회원을 출력하는 메서드
		public void showAllMembers() {
			
			for(Member member:hashSet) {
				System.out.println(member);
			}
			System.out.println();
			
		}

}
