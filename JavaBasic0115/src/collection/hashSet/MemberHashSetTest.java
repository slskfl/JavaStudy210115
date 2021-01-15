package collection.hashSet;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet mhs = new MemberHashSet();
		
		Member memberA = new Member(1001,"라이언");
		Member memberB = new Member(1002,"무지");
		Member memberC = new Member(1003,"어피치");
		
		//회원을 추가합니다.
		mhs.addMember(memberA);
		mhs.addMember(memberB);
		mhs.addMember(memberC);
		
		//전체 회원을 출력합니다.
		mhs.showAllMembers();
		
		//무지회원을 삭제
		mhs.removeMember(memberB.getMemberid());
		mhs.showAllMembers();
		
		//아이디가 중복된 회원을 추가합니다.
		Member memberD = new Member(1003, "콘");
		mhs.addMember(memberD);
		mhs.showAllMembers();
	}

}
