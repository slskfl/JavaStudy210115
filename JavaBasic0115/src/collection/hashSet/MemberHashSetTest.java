package collection.hashSet;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet mhs = new MemberHashSet();
		
		Member memberA = new Member(1001,"���̾�");
		Member memberB = new Member(1002,"����");
		Member memberC = new Member(1003,"����ġ");
		
		//ȸ���� �߰��մϴ�.
		mhs.addMember(memberA);
		mhs.addMember(memberB);
		mhs.addMember(memberC);
		
		//��ü ȸ���� ����մϴ�.
		mhs.showAllMembers();
		
		//����ȸ���� ����
		mhs.removeMember(memberB.getMemberid());
		mhs.showAllMembers();
		
		//���̵� �ߺ��� ȸ���� �߰��մϴ�.
		Member memberD = new Member(1003, "��");
		mhs.addMember(memberD);
		mhs.showAllMembers();
	}

}
