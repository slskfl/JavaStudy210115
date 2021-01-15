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
	//ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//ȸ���� �����ϴ� �޼���
	public boolean removeMember(int memberId) {
		//Iterator�� Ȱ���Ͽ� ��ü�� �ѹ��� ������.
		Iterator<Member> iMember = hashSet.iterator();
		while (iMember.hasNext()) {
			//hashNext�� �̿��Ͽ� ��ü�� ���� Ȯ��.
			Member member = iMember.next();//ȸ���� �ϳ��� ������.
			
			int tempId = member.getMemberid();
			if(tempId == memberId) {	//���� ���̵� �� ���
				hashSet.remove(member);	//ȸ�� �����մϴ�.
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	//��ü ȸ���� ����ϴ� �޼���
		public void showAllMembers() {
			
			for(Member member:hashSet) {
				System.out.println(member);
			}
			System.out.println();
			
		}

}
